package com.adogo.ad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.adogo.ad.entity.AdTag;
import com.adogo.ad.entity.BusinessHours;

@Component
@Qualifier("adTagDaoJdbcImpl")
public class BusinessHoursDaoJdbcImpl implements BusinessHoursDao{
	
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
	public BusinessHours findBusinessHoursByBusinessId(Long businessId) {
		System.out.println("entering -- BusinessHoursDaoImpl/findBusinessHoursByBusinessId ");
		String sql = "select * from test_bussiness_hours where business_id =:businessId";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("businessId", businessId);
		BusinessHours x = null;
		try{
			x = jdbc.queryForObject(sql, paramSource, new BusinessHoursRowMapper());
		}catch(EmptyResultDataAccessException ex){
			x = null;
		}
		return x;
	}


	@Override
	public int persistBusinessHours(BusinessHours businessHours) {
		//System.out.println("entering -- AdTagDaoImpl/updateTag ");
		Long businessId = businessHours.getBusinessId();
		BusinessHours foundBH = this.findBusinessHoursByBusinessId(businessId);
		if (foundBH == null) {
			return (int) this.create(businessHours);
		}
		else {
			return this.update(businessHours);
		}
	}
	
	private int create(BusinessHours businessHours) {

		final String TABLE = "test_bussiness_hours";
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("insert into "+TABLE);
		sbf.append("(business_id,day1_start_time,day1_end_time,day2_start_time,day2_end_time,day3_start_time,day3_end_time,day4_start_time,day4_end_time");
		sbf.append(",day5_start_time,day5_end_time,day6_start_time,day6_end_time,day7_start_time,day7_end_time,comment) ");
		sbf.append("values (:business_id,:day1_start_time,:day1_end_time,:day2_start_time,:day2_end_time,:day3_start_time,:day3_end_time,:day4_start_time,:day4_end_time");
		sbf.append(",:day5_start_time,:day5_end_time,:day6_start_time,:day6_end_time,:day7_start_time,:day7_end_time,:comment)");
		String sql = sbf.toString();

		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("business_id", businessHours.getBusinessId());
		
		paramSource.addValue("day1_start_time", businessHours.getDay1StartTime());	
		paramSource.addValue("day1_end_time", businessHours.getDay1EndTime());

		paramSource.addValue("day2_start_time", businessHours.getDay2StartTime());	
		paramSource.addValue("day2_end_time", businessHours.getDay2EndTime());

		paramSource.addValue("day3_start_time", businessHours.getDay3StartTime());	
		paramSource.addValue("day3_end_time", businessHours.getDay3EndTime());

		paramSource.addValue("day4_start_time", businessHours.getDay4StartTime());	
		paramSource.addValue("day4_end_time", businessHours.getDay4EndTime());

		paramSource.addValue("day5_start_time", businessHours.getDay5StartTime());	
		paramSource.addValue("day5_end_time", businessHours.getDay5EndTime());

		paramSource.addValue("day6_start_time", businessHours.getDay6StartTime());	
		paramSource.addValue("day6_end_time", businessHours.getDay6EndTime());

		paramSource.addValue("day7_start_time", businessHours.getDay7StartTime());	
		paramSource.addValue("day7_end_time", businessHours.getDay7EndTime());

		paramSource.addValue("comment", businessHours.getComment());	
		
		//KeyHolder keyholder = new GeneratedKeyHolder();
		//jdbc.update(sql, paramSource, keyholder);
		//return (long)keyholder.getKey();
		return jdbc.update(sql, paramSource);
	}

	private int update(BusinessHours businessHours) {
		
		final String TABLE = "test_bussiness_hours";
		
		String sql  = "UPDATE " + TABLE
	                + " SET day1_start_time = :day1_start_time,"
	                + "day1_end_time = :day1_end_time,"
	               
					+ "day2_start_time = :day2_start_time,"
					+ "day2_end_time = :day2_end_time,"
					
					+ "day3_start_time = :day3_start_time,"
					+ "day3_end_time = :day3_end_time,"
					
					+ "day4_start_time = :day4_start_time,"
					+ "day4_end_time = :day4_end_time,"
					
					+ "day5_start_time = :day5_start_time,"
					+ "day5_end_time = :day5_end_time,"
					
					+ "day6_start_time = :day6_start_time,"
					+ "day6_end_time = :day6_end_time,"
					
					+ "day7_start_time = :day7_start_time,"
					+ "day7_end_time = :day7_end_time,"
					
					+ "comment = :comment "
				   
	                + "WHERE 1=1 "
				    + "AND business_id = :business_id";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("business_id", businessHours.getBusinessId());
		
		paramSource.addValue("day1_start_time", businessHours.getDay1StartTime());	
		paramSource.addValue("day1_end_time", businessHours.getDay1EndTime());

		paramSource.addValue("day2_start_time", businessHours.getDay2StartTime());	
		paramSource.addValue("day2_end_time", businessHours.getDay2EndTime());

		paramSource.addValue("day3_start_time", businessHours.getDay3StartTime());	
		paramSource.addValue("day3_end_time", businessHours.getDay3EndTime());

		paramSource.addValue("day4_start_time", businessHours.getDay4StartTime());	
		paramSource.addValue("day4_end_time", businessHours.getDay4EndTime());

		paramSource.addValue("day5_start_time", businessHours.getDay5StartTime());	
		paramSource.addValue("day5_end_time", businessHours.getDay5EndTime());

		paramSource.addValue("day6_start_time", businessHours.getDay6StartTime());	
		paramSource.addValue("day6_end_time", businessHours.getDay6EndTime());

		paramSource.addValue("day7_start_time", businessHours.getDay7StartTime());	
		paramSource.addValue("day7_end_time", businessHours.getDay7EndTime());

		paramSource.addValue("comment", businessHours.getComment());
		return jdbc.update(sql,paramSource);
		
	}
	
	private static class BusinessHoursRowMapper implements RowMapper<BusinessHours>{
		public BusinessHours mapRow(ResultSet rs, int rowNumber) throws SQLException {
			
			BusinessHours x = new BusinessHours();
			x.setUid(rs.getLong("uid"));
			x.setBusinessId(rs.getLong("business_id"));
			
			x.setDay1StartTime(rs.getString("day1_start_time"));
			x.setDay1EndTime(rs.getString("day1_end_time"));
			
			x.setDay2StartTime(rs.getString("day2_start_time"));
			x.setDay2EndTime(rs.getString("day2_end_time"));
			
			x.setDay3StartTime(rs.getString("day3_start_time"));
			x.setDay3EndTime(rs.getString("day3_end_time"));
			
			x.setDay4StartTime(rs.getString("day4_start_time"));
			x.setDay4EndTime(rs.getString("day4_end_time"));
			
			x.setDay5StartTime(rs.getString("day5_start_time"));
			x.setDay5EndTime(rs.getString("day5_end_time"));
			
			x.setDay6StartTime(rs.getString("day6_start_time"));
			x.setDay6EndTime(rs.getString("day6_end_time"));
			
			x.setDay7StartTime(rs.getString("day7_start_time"));
			x.setDay7EndTime(rs.getString("day7_end_time"));
			
			x.setComment(rs.getString("comment"));
			
            return x;
		}		
	}
	
}