package com.adogo.ad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.adogo.ad.entity.BusinessProfile;

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
	public BusinessProfile getBusinessProfileByBizId(int biz_id) {
		String sql = "SELECT * "
				   + "FROM business_profile "
				   + "WHERE 1=1 "
				   + "AND biz_id = :biz_id";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_id", biz_id);
		return jdbc.queryForObject(sql,paramSource,new BusinessProfileRowMapper());
	}
	
	@Override
	public BusinessProfile getBusinessProfileByBizNo(int biz_no) {
		String sql = "SELECT * "
				   + "FROM business_profile "
				   + "WHERE 1=1 "
				   + "AND biz_no = :biz_no";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_no", biz_no);
		return jdbc.queryForObject(sql,paramSource,new BusinessProfileRowMapper());
	}
	
	@Override
	public int update(BusinessProfile bp) {
		String sql = "UPDATE business_profile "
	               + "SET cp_firstname = :cp_firstname "
				   + "WHERE 1=1 "
				   + "AND biz_no = :biz_no";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_no", bp.getBiz_no());
		paramSource.addValue("cp_firstname", bp.getCp_firstname());
		return jdbc.update(sql,paramSource);
	}
	
	private static class BusinessProfileRowMapper implements RowMapper<BusinessProfile>{
		public BusinessProfile mapRow(ResultSet rs, int rowNumber) throws SQLException {
			BusinessProfile x = new BusinessProfile();
			x.setBiz_id(rs.getInt("biz_id"));
			x.setBiz_no(rs.getInt("biz_no"));
			x.setCp_firstname(rs.getString("cp_firstname"));
			x.setCp_lastname(rs.getString("cp_lastname"));
			x.setCp_nickname(rs.getString("cp_nickname"));
			x.setCp_title(rs.getInt("cp_title"));
			x.setCp_showtype(rs.getInt("cp_title"));
			
			x.setBiz_offer(rs.getString("biz_offer"));
			x.setBiz_competency(rs.getString("biz_competency"));
			
			x.setLoc_country(rs.getString("loc_country"));
			x.setLoc_prov(rs.getString("loc_prov"));
			x.setLoc_area(rs.getString("loc_area"));
			x.setLoc_city(rs.getString("loc_city"));
			x.setLoc_distriction(rs.getString("loc_distriction"));
			x.setLoc_addr_line1(rs.getString("loc_addr_line1"));
			x.setLoc_addr_line2(rs.getString("loc_addr_line2"));
			x.setLoc_postalcode(rs.getString("loc_postalcode"));
			x.setLoc_name(rs.getString("loc_name"));
			x.setLoc_desc(rs.getString("loc_desc"));
			
			x.setBiz_tel1(rs.getString("biz_tel1"));
			x.setBiz_tel2(rs.getString("biz_tel2"));
			x.setBiz_cell1(rs.getString("biz_cell1"));
			x.setBiz_fax1(rs.getString("biz_fax1"));
			x.setBiz_email1(rs.getString("biz_email1"));
			x.setBiz_email2(rs.getString("biz_email2"));
            return x;
		}		
	}

}
