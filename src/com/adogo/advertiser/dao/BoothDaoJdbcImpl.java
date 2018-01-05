package com.adogo.advertiser.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.adogo.advertiser.booth.entity.Booth;

@Repository
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
		sbf.append("booth_name, ");
		sbf.append("booth_img, ");
		sbf.append("category_no, ");
		sbf.append("visit_num, ");
		sbf.append("follower_num, ");
		sbf.append("like_num, ");
		sbf.append("booth_score, ");
		sbf.append("biz_desc, ");
		sbf.append("create_date, ");
		sbf.append("modify_date, ");
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
		sbf.append("booth_name, ");
		sbf.append("booth_img, ");
		sbf.append("category_no, ");
		sbf.append("biz_desc, ");
		sbf.append("visit_num, ");
		sbf.append("follower_num, ");
		sbf.append("like_num, ");
		sbf.append("booth_score, ");
		sbf.append("create_date, ");
		sbf.append("modify_date, ");
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
		sbf.append("booth_name, ");
		sbf.append("booth_img, ");
		sbf.append("category_no, ");
		sbf.append("biz_desc, ");
		sbf.append("visit_num, ");
		sbf.append("follower_num, ");
		sbf.append("like_num, ");
		sbf.append("booth_score, ");
		sbf.append("create_date, ");
		sbf.append("modify_date, ");
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
		sbf.append("booth_img, ");
		sbf.append("booth_id, ");
		sbf.append("booth_name, ");
		sbf.append("category_no, ");
		sbf.append("biz_desc, ");
		sbf.append("visit_num, ");
		sbf.append("follower_num, ");
		sbf.append("like_num, ");
		sbf.append("booth_score, ");
		sbf.append("create_date, ");
		sbf.append("modify_date, ");
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
	public int create(Booth x) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("INSERT INTO ").append(TABLE).append("(");
		sbf.append("user_id,");
		sbf.append("advertiser_id,");
		sbf.append("biz_id,");
		sbf.append("lang_no,");
		sbf.append("booth_id,");
		sbf.append("biz_name,");
		sbf.append("category_no,");
		sbf.append("biz_desc,");
		sbf.append("booth_name,");
		sbf.append("booth_img, ");
		sbf.append("visit_num,");
		sbf.append("follower_num,");
		sbf.append("like_num,");
		sbf.append("booth_score,");
		sbf.append("create_date,");
		sbf.append("modify_date,");
		sbf.append("booth_status) ");
		
		sbf.append("VALUES(");
		sbf.append(":user_id,");
		sbf.append(":advertiser_id,");
		sbf.append(":biz_id,");
		sbf.append(":lang_no,");
		sbf.append(":booth_id,");
		sbf.append(":biz_name,");
		sbf.append(":category_no,");
		sbf.append(":biz_desc,");
		sbf.append(":booth_name,");
		sbf.append(":booth_img,");
		sbf.append(":visit_num,");
		sbf.append(":follower_num,");
		sbf.append(":like_num,");
		sbf.append(":booth_score,");
		sbf.append(":create_date,");
		sbf.append(":modify_date,");
		sbf.append(":booth_status) ");
		String sql = sbf.toString();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("user_id", x.getUserId());
		paramSource.addValue("advertiser_id", x.getAdvertiserId());
		paramSource.addValue("biz_id", x.getBizId());
		paramSource.addValue("lang_no", x.getLangNo());
		paramSource.addValue("booth_id", x.getBoothId());
		paramSource.addValue("biz_name", x.getBizName());
		paramSource.addValue("booth_img", x.getBoothImg());
		paramSource.addValue("biz_desc", x.getBizDesc());
		paramSource.addValue("booth_name", x.getBoothName());
		paramSource.addValue("category_no", x.getCategoryNo());
		paramSource.addValue("visit_num", x.getVisitNum());
		paramSource.addValue("follower_num", x.getFollowerNum());
		paramSource.addValue("like_num", x.getLikeNum());
		paramSource.addValue("booth_score", x.getBoothScore());
		paramSource.addValue("create_date", x.getCreateDate());
		paramSource.addValue("modify_date", x.getModifyDate());
		paramSource.addValue("booth_status", x.getBoothStatus());
		
		logger.info(sql);
		
		return jdbc.update(sql,paramSource);
	}

	@Override
	public int update(Booth x) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static class BoothRowMapper implements RowMapper<Booth>{
		public Booth mapRow(ResultSet rs, int rowNumber) throws SQLException {
			Booth x = new Booth();
			x.setGlobalId(rs.getLong("global_id"));
			x.setUserId(rs.getLong("user_id"));
			x.setAdvertiserId(rs.getLong("advertiser_id"));
			x.setBizId(rs.getLong("biz_id"));
			x.setLangNo(rs.getInt("lang_no"));
			x.setBoothId(rs.getLong("booth_id"));
			x.setBizName(rs.getString("biz_name"));
			x.setBoothImg(rs.getString("booth_img"));
			x.setBoothName(rs.getString("booth_name"));
			x.setCategoryNo(rs.getInt("category_no"));
			x.setVisitNum(rs.getInt("visit_num"));
			x.setFollowerNum(rs.getInt("follower_num"));
			x.setLikeNum(rs.getInt("like_num"));
			x.setBoothScore(rs.getInt("booth_score"));
			x.setBizDesc(rs.getString("biz_desc"));
			x.setBoothStatus(rs.getInt("booth_status"));
			
			Timestamp cd = rs.getTimestamp("create_date");
			if (cd != null) {	x.setCreateDate(new Date(cd.getTime())); }
			Timestamp md = rs.getTimestamp("modify_date");
			if (md != null) {	x.setModifyDate(new Date(md.getTime())); }
			
	        return x;
		}		
	}

}
