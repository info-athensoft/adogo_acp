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
		sbf.append("lang_no, ");
		sbf.append("biz_name, ");
		sbf.append("booth_id, ");
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
	
	@Override
	public List<Booth> findBoothByAdvertiserId(long advertiserId) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("global_id, ");
		sbf.append("user_id, ");
		sbf.append("advertiser_id, ");
		sbf.append("biz_id, ");
		sbf.append("lang_no, ");
		sbf.append("biz_name, ");
		sbf.append("booth_id, ");
		sbf.append("biz_desc, ");
		sbf.append("booth_status ");
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE 1=1 ");
		sbf.append(" AND advertiser_id =:advertiser_id ");
		String sql = sbf.toString();
		logger.info(sql);
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("advertiser_id", advertiserId);
		return jdbc.query(sql,paramSource,new BoothRowMapper());
	}
	
	@Override
	public List<Booth> findBoothByUserId(long userId) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("global_id, ");
		sbf.append("user_id, ");
		sbf.append("advertiser_id, ");
		sbf.append("biz_id, ");
		sbf.append("lang_no, ");
		sbf.append("biz_name, ");
		sbf.append("booth_id, ");
		sbf.append("biz_desc, ");
		sbf.append("booth_status ");
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE 1=1 ");
		sbf.append(" AND user_id =:user_id ");
		String sql = sbf.toString();
		logger.info(sql);
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("user_id", userId);
		return jdbc.query(sql,paramSource,new BoothRowMapper());
	}

	@Override
	public Booth findBoothByBoothId(long boothId) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("global_id, ");
		sbf.append("user_id, ");
		sbf.append("advertiser_id, ");
		sbf.append("biz_id, ");
		sbf.append("lang_no, ");
		sbf.append("biz_name, ");
		sbf.append("booth_id, ");
		sbf.append("biz_desc, ");
		sbf.append("booth_status ");
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE 1=1 ");
		sbf.append(" AND booth_id =:booth_id ");
		String sql = sbf.toString();
		logger.info(sql);
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("booth_id", boothId);
		return jdbc.queryForObject(sql,paramSource,new BoothRowMapper());
	}

	@Override
	public int update(Booth x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int create(Booth x) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("INSERT INTO "+TABLE+"(");
		sbf.append("user_id,");
		sbf.append("advertiser_id,");
		sbf.append("biz_id,");
		sbf.append("lang_no,");
		sbf.append("booth_id,");
		sbf.append("biz_name,");
		sbf.append("biz_desc,");
		sbf.append("booth_name,");
		sbf.append("visit_num,");
		sbf.append("follower_num,");
		sbf.append("like_num,");
		sbf.append("booth_score,");
		sbf.append("create_date,");
		sbf.append("booth_status) ");
		sbf.append("VALUES(");
		sbf.append(":user_id,");
		sbf.append(":advertiser_id,");
		sbf.append(":biz_id,");
		sbf.append(":lang_no,");
		sbf.append(":booth_id,");
		sbf.append(":biz_name,");
		sbf.append(":biz_desc,");
		sbf.append(":booth_name,");
		sbf.append(":visit_num,");
		sbf.append(":follower_num,");
		sbf.append(":like_num,");
		sbf.append(":booth_score,");
		sbf.append(":create_date,");
		sbf.append(":booth_status) ");
		String sql = sbf.toString();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("user_id", x.getUserId());
		paramSource.addValue("advertiser_id", x.getAdvertiserId());
		paramSource.addValue("biz_id", x.getBizId());
		paramSource.addValue("lang_no", x.getLangNo());
		paramSource.addValue("booth_id", x.getBizId());
		paramSource.addValue("biz_name", x.getBizName());
		paramSource.addValue("biz_desc", x.getBizDesc());
		paramSource.addValue("booth_name", x.getBoothName());
		paramSource.addValue("visit_num", x.getVisitNum());
		paramSource.addValue("follower_num", x.getFollowerNum());
		paramSource.addValue("like_num", x.getLikeNum());
		paramSource.addValue("booth_score", x.getBoothScore());
		paramSource.addValue("create_date", x.getCreateDate());
		paramSource.addValue("booth_status", x.getBoothStatus());
		
		return jdbc.update(sql,paramSource);
	}

	private static class BoothRowMapper implements RowMapper<Booth>{
		public Booth mapRow(ResultSet rs, int rowNumber) throws SQLException {
			Booth x = new Booth();
			x.setGlobalId(rs.getLong("global_id"));
			x.setUserId(rs.getLong("user_id"));
			x.setAdvertiserId(rs.getLong("advertiser_id"));
			x.setBizId(rs.getLong("biz_id"));
			x.setBoothId(rs.getLong("booth_id"));
			x.setLangNo(rs.getInt("lang_no"));
			x.setBizName(rs.getString("biz_name"));
			x.setBizDesc(rs.getString("biz_desc"));
			x.setBoothStatus(rs.getInt("booth_status"));
	        return x;
		}		
	}

}
