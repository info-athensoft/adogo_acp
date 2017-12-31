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
import com.adogo.advertiser.entity.BusinessStatus;

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
		sbf.append("biz_type, ");
		sbf.append("biz_owner, ");
		sbf.append("establish_date, ");
		sbf.append("create_date, ");
		sbf.append("biz_phone, ");
		sbf.append("biz_fax, ");
		sbf.append("biz_email, ");
		sbf.append("biz_website, ");
		sbf.append("biz_status, ");
		sbf.append("biz_desc ");
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
		sbf.append("biz_type, ");
		sbf.append("biz_owner, ");
		sbf.append("establish_date, ");
		sbf.append("create_date, ");
		sbf.append("modify_date, ");
		sbf.append("biz_phone, ");
		sbf.append("biz_fax, ");
		sbf.append("biz_email, ");
		sbf.append("biz_website, ");
		sbf.append("biz_status, ");
		sbf.append("biz_desc ");
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE 1=1 ");
		sbf.append(" AND advertiser_id =:advertiser_id ");
		sbf.append(" ORDER BY biz_status, modify_date DESC ");
		String sql = sbf.toString();
		logger.info(sql);
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("advertiser_id", advertiserId);
		return jdbc.query(sql,paramSource,new BusinessProfileRowMapper());
	}

	@Override
	public List<BusinessProfile> getBusinessProfileByAdvertiserId(long advertiserId, int bizStatus) {
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
		sbf.append("biz_type, ");
		sbf.append("biz_owner, ");
		sbf.append("establish_date, ");
		sbf.append("create_date, ");
		sbf.append("biz_phone, ");
		sbf.append("biz_fax, ");
		sbf.append("biz_email, ");
		sbf.append("biz_website, ");
		sbf.append("biz_status, ");
		sbf.append("biz_desc ");
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE 1=1 ");
		sbf.append(" AND advertiser_id =:advertiser_id ");
		sbf.append(" AND biz_status =:biz_status ");	
		String sql = sbf.toString();
		logger.info(sql);
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("advertiser_id", advertiserId);
		paramSource.addValue("biz_status", bizStatus);
		return jdbc.query(sql,paramSource,new BusinessProfileRowMapper());
	}

	@Override
	public BusinessProfile getBusinessProfileByBizId(long bizId) {
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
		sbf.append("biz_type, ");
		sbf.append("biz_owner, ");
		sbf.append("establish_date, ");
		sbf.append("create_date, ");
		sbf.append("biz_phone, ");
		sbf.append("biz_fax, ");
		sbf.append("biz_email, ");
		sbf.append("biz_website, ");
		sbf.append("biz_status, ");
		sbf.append("biz_desc ");
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE 1=1 ");
		sbf.append(" AND biz_id =:biz_id ");
		
		String sql = sbf.toString();
		logger.info(sql);
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_id", bizId);
		return jdbc.queryForObject(sql,paramSource,new BusinessProfileRowMapper());
	}
	
	@Override
	public BusinessProfile getBusinessProfileByBizNo(String bizNo) {
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
		sbf.append("biz_type, ");
		sbf.append("biz_owner, ");
		sbf.append("establish_date, ");
		sbf.append("create_date, ");
		sbf.append("biz_phone, ");
		sbf.append("biz_fax, ");
		sbf.append("biz_email, ");
		sbf.append("biz_website, ");
		sbf.append("biz_status, ");
		sbf.append("biz_desc ");
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE 1=1 ");
		sbf.append(" AND biz_no =:biz_no ");
		String sql = sbf.toString();
		logger.info(sql);
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_no", bizNo);
		return jdbc.queryForObject(sql,paramSource,new BusinessProfileRowMapper());
	}
	
	@Override
	public int create(BusinessProfile x) {
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("INSERT INTO "+TABLE+"(");
		sbf.append("user_id,");
		sbf.append("advertiser_id,");
		sbf.append("biz_id,");
		sbf.append("biz_no,");
		sbf.append("biz_name,");
		sbf.append("biz_name2,");
		sbf.append("legal_form_no,");
		sbf.append("industry_code,");
		sbf.append("biz_owner,");
		sbf.append("biz_type,");
		sbf.append("establish_date,");
		sbf.append("create_date,");
		sbf.append("modify_date,");
		sbf.append("biz_phone,");
		sbf.append("biz_fax,");
		sbf.append("biz_email,");
		sbf.append("biz_website,");		
		sbf.append("biz_desc,");
		sbf.append("biz_status) ");
		sbf.append("VALUES(");
		sbf.append(":user_id,");
		sbf.append(":advertiser_id,");
		sbf.append(":biz_id,");
		sbf.append(":biz_no,");
		sbf.append(":biz_name,");
		sbf.append(":biz_name2,");
		sbf.append(":legal_form_no,");
		sbf.append(":industry_code,");
		sbf.append(":biz_owner,");
		sbf.append(":biz_type,");
		sbf.append(":establish_date,");
		sbf.append(":create_date,");
		sbf.append(":modify_date,");
		sbf.append(":biz_phone,");
		sbf.append(":biz_fax,");
		sbf.append(":biz_email,");
		sbf.append(":biz_website,");		
		sbf.append(":biz_desc,");
		sbf.append(":biz_status)");
		String sql = sbf.toString();
		
		System.out.println(sql);
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("user_id", x.getUserId());
		paramSource.addValue("advertiser_id", x.getAdvertiserId());
		paramSource.addValue("biz_id", x.getBizId());
		paramSource.addValue("biz_no", x.getBizNo());
		paramSource.addValue("biz_name", x.getBizName());
		paramSource.addValue("biz_name2", x.getBizName2());
		paramSource.addValue("legal_form_no", x.getLegalFormNo());
		paramSource.addValue("industry_code", x.getIndustryCode());
		paramSource.addValue("biz_owner", x.getBizOwner());
		paramSource.addValue("biz_type", x.getBizType());
		paramSource.addValue("establish_date", x.getEstablishDate());
		paramSource.addValue("create_date", x.getCreateDate());
		paramSource.addValue("modify_date", x.getModifyDate());
		paramSource.addValue("biz_phone", x.getBizPhone());
		paramSource.addValue("biz_fax", x.getBizFax());
		paramSource.addValue("biz_email", x.getBizEmail());
		paramSource.addValue("biz_website", x.getBizWebsite());
		paramSource.addValue("biz_desc", x.getBizDesc());
		paramSource.addValue("biz_status", x.getBizStatus());
		
		return jdbc.update(sql,paramSource);
	}
	
	//TODO
	/* (non-Javadoc)
	 * 
	 * reviewed by Athens on 2017-12-21
	 * 
	 * @see com.adogo.advertiser.dao.BusinessProfileDao#update(com.adogo.advertiser.entity.BusinessProfile)
	 * 
	 * @author sfz
	 */
	@Override
	public int update(BusinessProfile bp) {
		
		StringBuffer sbf = new StringBuffer();
		
		sbf.append("UPDATE " + TABLE+" SET ");
		sbf.append(" biz_name = :biz_name,");
		sbf.append(" biz_owner = :biz_owner,");
		sbf.append(" legal_form_no = :legal_form_no,");
		sbf.append(" industry_code = :industry_code,");
		sbf.append(" biz_desc = :biz_desc,");
		sbf.append(" biz_type = :biz_type,");
		sbf.append(" biz_phone = :biz_phone,");
		sbf.append(" biz_fax = :biz_fax,");
		sbf.append(" biz_email = :biz_email,");
		sbf.append(" modify_date = :modify_date,");
		sbf.append(" biz_status = :biz_status,");
		sbf.append(" biz_website = :biz_website");
		sbf.append(" WHERE 1=1 ");
		sbf.append(" AND biz_id = :biz_id");
		
		String sql = sbf.toString();
		logger.info(sql);
		logger.info(bp.toString());
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_id", bp.getBizId());
		paramSource.addValue("biz_name", bp.getBizName());
		paramSource.addValue("biz_owner", bp.getBizOwner());
		paramSource.addValue("legal_form_no", bp.getLegalFormNo());
		paramSource.addValue("industry_code", bp.getIndustryCode());
		paramSource.addValue("biz_desc", bp.getBizDesc());
		paramSource.addValue("biz_type", bp.getBizType());
		paramSource.addValue("biz_phone",bp.getBizPhone());
		paramSource.addValue("biz_fax", bp.getBizFax());
		paramSource.addValue("biz_email", bp.getBizEmail());
		paramSource.addValue("biz_website", bp.getBizWebsite());
		paramSource.addValue("modify_date", bp.getModifyDate());
		paramSource.addValue("biz_status", bp.getBizStatus());
		return jdbc.update(sql,paramSource);
	}
	
	@Override
	public int updateStatus(BusinessProfile bp){
		StringBuffer sbf = new StringBuffer();
		
		sbf.append("UPDATE " + TABLE+" SET ");
		sbf.append(" modify_date = :modify_date,");
		sbf.append(" biz_status = :biz_status");
		sbf.append(" WHERE 1=1 ");
		sbf.append(" AND biz_id = :biz_id");
		
		String sql = sbf.toString();
		logger.info(sql);
		logger.info(bp.toString());
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_id", bp.getBizId());
		paramSource.addValue("biz_status", bp.getBizStatus());
		paramSource.addValue("modify_date", bp.getModifyDate());
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
			x.setBizPhone(rs.getString("biz_phone"));
			x.setBizFax(rs.getString("biz_fax"));
			x.setBizEmail(rs.getString("biz_email"));
			x.setBizWebsite(rs.getString("biz_website"));
			x.setBizDesc(rs.getString("biz_desc"));
			x.setBizStatus(rs.getInt("biz_status"));
			Timestamp ed = rs.getTimestamp("establish_date");
			if (ed != null) {	x.setEstablishDate(new Date(ed.getTime())); }
			Timestamp cd = rs.getTimestamp("create_date");
			if (cd != null) {	x.setCreateDate(new Date(cd.getTime())); }
			Timestamp md = rs.getTimestamp("create_date");
			if (md != null) {	x.setModifyDate(new Date(md.getTime())); }
	        return x;
		}		
	}
}
