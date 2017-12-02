package com.adogo.advertiser.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.adogo.advertiser.entity.Booth;

@Component
@Qualifier("boothDaoJdbcImpl")
public class BoothDaoJdbcImpl implements BoothDao {

	private final static Logger logger = Logger.getLogger(BoothDaoJdbcImpl.class);
	
	private final String TABLE = "BOOTHS";
	
	private NamedParameterJdbcTemplate jdbc;

	/**
	 * inject DataSource object
	 * @param dataSource
	 */
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	@Override
	public List<Booth> findBoothByBizId(long bizId) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("global_id, ");
		sbf.append("user_id, ");
		sbf.append("advertiser_id, ");
		sbf.append("biz_id, ");
		sbf.append("biz_name, ");
		sbf.append("lang_no, ");
		sbf.append("biz_desc, ");
		sbf.append("booth_status ");
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE 1=1 ");
		sbf.append(" AND biz_id =:biz_id ");
		String sql = sbf.toString();
		logger.info(sql);
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_id", bizId);
		return jdbc.query(sql,paramSource,new BoothRowMapper());
	}
	
	private static class BoothRowMapper implements RowMapper<Booth>{
		public Booth mapRow(ResultSet rs, int rowNumber) throws SQLException {
			Booth x = new Booth();
			x.setGlobalId(rs.getLong("global_id"));
			x.setUserId(rs.getLong("user_id"));
			x.setAdvertiserId(rs.getLong("advertiser_id"));
			x.setBizId(rs.getLong("biz_id"));
			x.setLangNo(rs.getInt("lang_no"));
			x.setBizName(rs.getString("biz_name"));
			x.setBizDesc(rs.getString("biz_desc"));
			x.setBoothStatus(rs.getInt("booth_status"));
            return x;
		}		
	}

}
