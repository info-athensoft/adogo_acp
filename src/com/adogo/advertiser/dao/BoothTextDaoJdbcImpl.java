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
import org.springframework.stereotype.Repository;

import com.adogo.advertiser.booth.entity.BoothText;

@Repository
@Qualifier("boothTextDaoJdbcImpl")
public class BoothTextDaoJdbcImpl implements BoothTextDao {
	private final static Logger logger = Logger.getLogger(BoothTextDaoJdbcImpl.class);
	
	private final String TABLE = "BOOTH_TEXT";

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
	public List<BoothText> findByBoothId(long boothId) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("global_id, ");
		sbf.append("user_id, ");
		sbf.append("advertiser_id, ");
		sbf.append("biz_id, ");
		sbf.append("lang_no, ");
		sbf.append("booth_id, ");
		sbf.append("text_title, ");
		sbf.append("text_content, ");
		sbf.append("sort_no ");
		
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE 1=1 ");
		sbf.append(" AND booth_id =:booth_id ");
		String sql = sbf.toString();
		logger.info(sql);
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("booth_id", boothId);
		return jdbc.query(sql,paramSource,new BoothTextRowMapper());
	}

	@Override
	public int create(BoothText x) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("INSERT INTO ").append(TABLE).append("(");
		sbf.append("user_id,");
		sbf.append("advertiser_id,");
		sbf.append("biz_id,");
		sbf.append("lang_no,");
		sbf.append("booth_id,");
		sbf.append("text_title,");
		sbf.append("text_content, ");
		sbf.append("sort_no ");
		sbf.append(") ");
		
		sbf.append(" VALUES(");
		sbf.append(":user_id,");
		sbf.append(":advertiser_id,");
		sbf.append(":biz_id,");
		sbf.append(":lang_no,");
		sbf.append(":booth_id,");
		sbf.append(":text_title,");
		sbf.append(":text_content,");
		sbf.append(":sort_no ");
		sbf.append(")");
		String sql = sbf.toString();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("user_id", x.getUserId());
		paramSource.addValue("advertiser_id", x.getAdvertiserId());
		paramSource.addValue("biz_id", x.getBizId());
		paramSource.addValue("lang_no", x.getLangNo());
		paramSource.addValue("booth_id", x.getBoothId());
		paramSource.addValue("text_title", x.getTextTitle());
		paramSource.addValue("text_content", x.getTextContent());
		paramSource.addValue("sort_no", x.getSortNo());
		
		
		logger.info(sql);
		
		return jdbc.update(sql,paramSource);
	}

	@Override
	public int update(BoothText boothText) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private static class BoothTextRowMapper implements RowMapper<BoothText>{
		@Override
		public BoothText mapRow(ResultSet rs, int rowNumber) throws SQLException {
			BoothText x = new BoothText();
			x.setUserId(rs.getLong("user_id"));
			x.setAdvertiserId(rs.getLong("advertiser_id"));
			x.setBizId(rs.getLong("biz_id"));
			x.setLangNo(rs.getInt("lang_no"));
			x.setBoothId(rs.getLong("booth_id"));
			x.setTextTitle(rs.getString("text_title"));
			x.setTextContent(rs.getString("text_content"));
			x.setSortNo(rs.getInt("sort_no"));
			
			return x;
		}
		
	}

}
