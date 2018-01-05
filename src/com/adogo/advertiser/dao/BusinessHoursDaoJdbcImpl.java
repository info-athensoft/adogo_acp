package com.adogo.advertiser.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.adogo.advertiser.business.entity.BusinessHours;

@Component
@Qualifier("businessHoursDaoJdbcImpl")
public class BusinessHoursDaoJdbcImpl implements BusinessHoursDao{
	
	private static final Logger logger = Logger.getLogger(BusinessHoursDaoJdbcImpl.class);
	
	private final String TABLE = "BIZ_HOURS";
	
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
	public BusinessHours findBusinessHoursByBusinessId(Long bizId) {
		
		StringBuffer sbf = new StringBuffer(); 
		sbf.append("SELECT * FROM ").append(TABLE);
		sbf.append(" WHERE biz_id =:biz_id ");
		
		String sql = sbf.toString();
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_id", bizId);
		BusinessHours x = null;
		try{
			x = jdbc.queryForObject(sql, paramSource, new BusinessHoursRowMapper());
		}catch(EmptyResultDataAccessException ex){
			x = null;
		}
		return x;
	}


	public int create(BusinessHours businessHours) {

		StringBuffer sbf = new StringBuffer();
		sbf.append("INSERT INTO ").append(TABLE).append("(");
		sbf.append("user_id,");
		sbf.append("advertiser_id,");
		sbf.append("biz_id,");
		sbf.append("lang_no,");
		sbf.append("booth_id,");
		sbf.append("day1_start_time,day1_end_time,");
		sbf.append("day2_start_time,day2_end_time,");
		sbf.append("day3_start_time,day3_end_time,");
		sbf.append("day4_start_time,day4_end_time,");
		sbf.append("day5_start_time,day5_end_time,");
		sbf.append("day6_start_time,day6_end_time,");
		sbf.append("day7_start_time,day7_end_time,");
		sbf.append("comment");
		sbf.append(" ) ");
		sbf.append("VALUES (");
		sbf.append(":user_id,");
		sbf.append(":advertiser_id,");
		sbf.append(":biz_id,");
		sbf.append(":lang_no,");
		sbf.append(":booth_id,");
		sbf.append(":day1_start_time,:day1_end_time,");
		sbf.append(":day2_start_time,:day2_end_time,");
		sbf.append(":day3_start_time,:day3_end_time,");
		sbf.append(":day4_start_time,:day4_end_time,");
		sbf.append(":day5_start_time,:day5_end_time,");
		sbf.append(":day6_start_time,:day6_end_time,");
		sbf.append(":day7_start_time,:day7_end_time,");
		sbf.append(":comment");
		sbf.append(" ) ");
		String sql = sbf.toString();
		
		logger.info(sql);

		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("user_id", businessHours.getUserId());
		paramSource.addValue("biz_id", businessHours.getBizId());
		paramSource.addValue("lang_no", businessHours.getLangNo());
		paramSource.addValue("advertiser_id", businessHours.getAdvertiserId());
		paramSource.addValue("booth_id", businessHours.getBoothId());
		
		
		
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

	public int update(BusinessHours businessHours) {
		StringBuffer sbf = new StringBuffer();
		
		sbf.append("UPDATE ").append(TABLE).append("SET ");
		sbf.append( "day1_start_time = :day1_start_time,");
		sbf.append("day1_end_time = :day1_end_time,");
           
		sbf.append("day2_start_time = :day2_start_time,");
		sbf.append("day2_end_time = :day2_end_time,");
					
		sbf.append("day3_start_time = :day3_start_time,");
		sbf.append("day3_end_time = :day3_end_time,");
		
		sbf.append("day4_start_time = :day4_start_time,");
		sbf.append("day4_end_time = :day4_end_time,");
		
		sbf.append("day5_start_time = :day5_start_time,");
		sbf.append("day5_end_time = :day5_end_time,");
		
		sbf.append("day6_start_time = :day6_start_time,");
		sbf.append("day6_end_time = :day6_end_time,");
		
		sbf.append("day7_start_time = :day7_start_time,");
		sbf.append("day7_end_time = :day7_end_time,");
		
		sbf.append("comment = :comment ");
		   
		sbf.append(" WHERE 1=1 ");
//		sbf.append(" AND biz_id = :biz_id");
		sbf.append(" AND booth_id = :booth_id");
		
		String sql = sbf.toString();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
//		paramSource.addValue("biz_id", businessHours.getBizId());
		paramSource.addValue("booth_id", businessHours.getBoothId());
		
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
	
	@Override
	public int persistBusinessHours(BusinessHours businessHours) {
		Long bizId = businessHours.getBizId();
		BusinessHours bh = this.findBusinessHoursByBusinessId(bizId);
		if (bh == null) {
			return this.create(businessHours);
		}
		else {
			return this.update(businessHours);
		}
	}

	private static class BusinessHoursRowMapper implements RowMapper<BusinessHours>{
		public BusinessHours mapRow(ResultSet rs, int rowNumber) throws SQLException {
			
			BusinessHours x = new BusinessHours();
			x.setGlobalId(rs.getLong("globla_id"));
			x.setUserId(rs.getLong("user_id"));
			x.setAdvertiserId(rs.getLong("advertiser_id"));
			x.setBizId(rs.getLong("biz_id"));
			x.setLangNo(rs.getInt("lang_no"));
			x.setBoothId(rs.getLong("booth_id"));
			
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
