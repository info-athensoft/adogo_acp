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
import org.springframework.stereotype.Component;

import com.adogo.advertiser.entity.BusinessProfile;

@Component
@Qualifier("businessProfileDaoJdbcImpl")
public class BusinessProfileDaoJdbcImpl implements BusinessProfileDao{
	
	private final static Logger logger = Logger.getLogger(BusinessProfileDaoJdbcImpl.class);
	
	private final String TABLE = "BIZ_PROFILE";
	
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
	public List<BusinessProfile> getBusinessProfileByUserId(long userId) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("global_id, ");
		sbf.append("user_id, ");
		sbf.append("advertiser_id, ");
		sbf.append("biz_id, ");
		sbf.append("biz_no, ");
		sbf.append("biz_name, ");
		sbf.append("biz_name2, ");
		sbf.append("legal_form_no, ");
		sbf.append("industry_code, ");
		sbf.append("media_desc, ");
//		sbf.append("establish_date, ");
//		sbf.append("create_date, ");
		sbf.append("biz_type, ");
		sbf.append("biz_owner, ");
		sbf.append("biz_status ");
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE 1=1 ");
		sbf.append(" AND user_id =:user_id ");
		String sql = sbf.toString();
		logger.info(sql);
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("user_id", userId);
		return jdbc.query(sql,paramSource,new BusinessProfileRowMapper());
	}

	//TODO
	@Override
	public List<BusinessProfile> getBusinessProfileByAdvertiserId(long advertiserId) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("global_id, ");
		sbf.append("user_id, ");
		sbf.append("advertiser_id, ");
		sbf.append("biz_id, ");
		sbf.append("biz_no, ");
		sbf.append("biz_name, ");
		sbf.append("biz_name2, ");
		sbf.append("legal_form_no, ");
		sbf.append("industry_code, ");
		sbf.append("establish_date, ");
		sbf.append("create_date, ");
		sbf.append("biz_type, ");
		sbf.append("biz_owner, ");
		sbf.append("biz_status ");
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE 1=1 ");
		sbf.append(" AND advertiser_id =:advertiser_id ");
		String sql = sbf.toString();
		logger.info(sql);
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("advertiser_id", advertiserId);
		return jdbc.query(sql,paramSource,new BusinessProfileRowMapper());
	}

	@Override
	public BusinessProfile getBusinessProfileByBizId(long bizId) {
		String sql = "SELECT * "
				   + "FROM " + TABLE + " "
				   + "WHERE 1=1 "
				   + "AND biz_id = :biz_id";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_id", bizId);
		return jdbc.queryForObject(sql,paramSource,new BusinessProfileRowMapper());
	}
	
	@Override
	public BusinessProfile getBusinessProfileByBizNo(String bizNo) {
		String sql = "SELECT * "
				   + "FROM business_profile "
				   + "WHERE 1=1 "
				   + "AND biz_no = :biz_no";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_no", bizNo);
		return jdbc.queryForObject(sql,paramSource,new BusinessProfileRowMapper());
	}
	
	@Override
	public int create(BusinessProfile x) {
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("INSERT INTO "+TABLE+"(");
		sbf.append("biz_id,");
		sbf.append("biz_name,");
		sbf.append("biz_no,");
		sbf.append("biz_owner,");
		sbf.append("industry_code,");
		sbf.append("legal_form_no,");
		sbf.append("create_date,");
		sbf.append("biz_status) ");
		sbf.append("VALUES(");
		sbf.append(":biz_id,");
		sbf.append(":biz_name,");
		sbf.append(":biz_no,");
		sbf.append(":biz_owner,");
		sbf.append(":industry_code,");
		sbf.append(":legal_form_no,");
		sbf.append(":create_date,");
		sbf.append(":biz_status)");
		String sql = sbf.toString();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_id", x.getBizId());
		paramSource.addValue("biz_name", x.getBizName());
		paramSource.addValue("biz_no", x.getBizNo());
		paramSource.addValue("biz_owner", x.getBizOwner());
		paramSource.addValue("industry_code", x.getIndustryCode());
		paramSource.addValue("legal_form_no", x.getLegalFormNo());
		paramSource.addValue("create_date", x.getCreateDate());
		paramSource.addValue("biz_status", x.getBizStatus());
		
		return jdbc.update(sql,paramSource);
	}
	
	@Override
	public int update(BusinessProfile bp) {
		String sql = "UPDATE " + TABLE
	               + " SET biz_name = :biz_name, "
	               + "biz_owner = :biz_owner, "
	               + "legal_form_no = :legal_form_no, "
	               + "industry_code = :industry_code, "
	               + "biz_type = :biz_type "
				   + "WHERE 1=1 "
				   + "AND biz_no = :biz_no";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_no", bp.getBizNo());
		paramSource.addValue("biz_name", bp.getBizName());
		paramSource.addValue("biz_owner", bp.getBizOwner());
		paramSource.addValue("legal_form_no", bp.getLegalFormNo());
		paramSource.addValue("industry_code", bp.getIndustryCode());
		paramSource.addValue("biz_type", bp.getBizType());
		return jdbc.update(sql,paramSource);
	}
	
	private static class BusinessProfileRowMapper implements RowMapper<BusinessProfile>{
		public BusinessProfile mapRow(ResultSet rs, int rowNumber) throws SQLException {
			BusinessProfile x = new BusinessProfile();
			x.setGlobalId(rs.getLong("global_id"));
			x.setUserId(rs.getLong("user_id"));
			x.setAdvertiserId(rs.getLong("advertiser_id"));
			x.setBizId(rs.getLong("biz_id"));
			x.setBizNo(rs.getString("biz_no"));
			x.setBizName(rs.getString("biz_name"));
			x.setBizName2(rs.getString("biz_name2"));
			x.setLegalFormNo(rs.getInt("legal_form_no"));
			x.setIndustryCode(rs.getString("industry_code"));
			x.setBizType(rs.getInt("biz_type"));
			x.setBizOwner(rs.getString("biz_owner"));			
			x.setBizStatus(rs.getInt("biz_status"));
			
			Timestamp ed = rs.getTimestamp("establish_date");
			if (ed != null) {	x.setEstablishDate(new Date(ed.getTime())); }
			
			Timestamp cd = rs.getTimestamp("create_date");
			if (cd != null) {	x.setCreateDate(new Date(cd.getTime())); }
			
	        return x;
		}		
	}

}
