package com.adogo.advertiser.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import javax.sql.DataSource;

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
	public BusinessProfile getBusinessProfileByBizId(long bizId) {
		String sql = "SELECT * "
				   + "FROM business_profile "
				   + "WHERE 1=1 "
				   + "AND biz_id = :biz_id";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_id", bizId);
		return jdbc.queryForObject(sql,paramSource,new BusinessProfileRowMapper());
	}
	
	@Override
	public BusinessProfile getBusinessProfileByBizNo(long bizNo) {
		String sql = "SELECT * "
				   + "FROM business_profile "
				   + "WHERE 1=1 "
				   + "AND biz_no = :biz_no";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_no", bizNo);
		return jdbc.queryForObject(sql,paramSource,new BusinessProfileRowMapper());
	}
	
	//NOT FINISHED TODO
	@Override
	public int create(BusinessProfile bp) {
		String sql = "INSERT INTO business_profile "
	               + "SET biz_owner = :biz_owner "
				   + "WHERE 1=1 "
				   + "AND biz_no = :biz_no";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_no", bp.getBizNo());
		paramSource.addValue("biz_owner", bp.getBizOwner());
		return jdbc.update(sql,paramSource);
	}
	
	@Override
	public int update(BusinessProfile bp) {
		String sql = "UPDATE business_profile "
	               + "SET biz_owner = :biz_owner "
				   + "WHERE 1=1 "
				   + "AND biz_no = :biz_no";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_no", bp.getBizNo());
		paramSource.addValue("biz_owner", bp.getBizOwner());
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
			x.setIndustryNo(rs.getString("industry_no"));
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
