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

import com.adogo.advertiser.business.entity.BusinessAddress;
import com.athensoft.util.sql.Query;


@Component
@Qualifier("businessAddressDaoJdbcImpl")
public class BusinessAddressDaoJdbcImpl implements BusinessAddressDao {
	
	private final static Logger logger = Logger.getLogger(BusinessAddressDaoJdbcImpl.class);
	
	private static final String TABLE = "BIZ_ADDR";
	
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
	public List<BusinessAddress> findByBizId(long bizId) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("global_id, ");
		sbf.append("advertiser_id, ");
		sbf.append("biz_id, ");
		sbf.append("booth_id, ");
		sbf.append("lang_no, ");
		sbf.append("loc_type, ");
		sbf.append("loc_name, ");
		sbf.append("loc_country, ");
		sbf.append("loc_country_no, ");
		sbf.append("loc_prov, ");
		sbf.append("loc_prov_shortname, ");
		sbf.append("loc_prov_no, ");
		sbf.append("loc_area, ");
		sbf.append("loc_area_no, ");
		sbf.append("loc_city, ");
		sbf.append("loc_city_no, ");
		sbf.append("loc_distriction, ");
		sbf.append("loc_distriction_no, ");
		sbf.append("street_no, ");
		sbf.append("street_type, ");
		sbf.append("street_name, ");
		sbf.append("port_type, ");
		sbf.append("port_no, ");
		sbf.append("addr_line1, ");
		sbf.append("addr_line2, ");
		sbf.append("postal_code, ");
		sbf.append("loc_status, ");
		sbf.append("loc_comment ");
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE 1=1 ");
		sbf.append(" AND biz_id =:biz_id ");
		String sql = sbf.toString();
		logger.info(sql);
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_id", bizId);
		return jdbc.query(sql,paramSource,new BusinessAddressRowMapper());
	}

	@Override
	public List<BusinessAddress> findByQuery(Query query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int create(BusinessAddress ba) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("INSERT INTO ").append(TABLE).append(" (");
		sbf.append("biz_id,");
		sbf.append("street_no,");
		sbf.append("street_type,");
		sbf.append("street_name,");
		sbf.append("port_type,");
		sbf.append("port_no,");
		sbf.append("loc_city,");
		sbf.append("loc_prov,");
		sbf.append("postal_code,");
		sbf.append("loc_type");
		sbf.append(")");
		sbf.append(" VALUES(");
		sbf.append(":biz_id,");
		sbf.append(":street_no,");
		sbf.append(":street_type,");
		sbf.append(":street_name,");
		sbf.append(":port_type,");
		sbf.append(":port_no,");
		sbf.append(":loc_city,");
		sbf.append(":loc_prov,");
		sbf.append(":postal_code,");
		sbf.append(":loc_type");
		sbf.append(")");
		
		String sql = sbf.toString();
		logger.info(sql);
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("street_no", ba.getStreetNo());
		paramSource.addValue("street_type",ba.getStreetType());
		paramSource.addValue("street_name",ba.getStreetName());
		paramSource.addValue("port_type",ba.getPortType());
		paramSource.addValue("port_no",ba.getPortNo());
		paramSource.addValue("loc_city",ba.getCityName());
		paramSource.addValue("loc_prov",ba.getProvName());
		paramSource.addValue("postal_code",ba.getPostalCode());
		
		paramSource.addValue("biz_id", ba.getBizId());
		paramSource.addValue("loc_type", ba.getLocationType());
		return jdbc.update(sql,paramSource);
	}

	@Override
	public int update(BusinessAddress ba) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("UPDATE ").append(TABLE).append(" SET ");
		sbf.append("street_no=:street_no,");
		sbf.append("street_type=:street_type,");
		sbf.append("street_name=:street_name,");
		sbf.append("port_type=:port_type,");
		sbf.append("port_no=:port_no,");
		sbf.append("loc_city=:loc_city,");
		sbf.append("loc_prov=:loc_prov");
		sbf.append(" WHERE 1=1");
		sbf.append(" AND biz_id=:biz_id");
		sbf.append(" AND loc_type=:loc_type");
		
		String sql = sbf.toString();
		logger.info(sql);
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("street_no", ba.getStreetNo());
		paramSource.addValue("street_type",ba.getStreetType());
		paramSource.addValue("street_name",ba.getStreetName());
		paramSource.addValue("port_type",ba.getPortType());
		paramSource.addValue("port_no",ba.getPortNo());
		paramSource.addValue("loc_city",ba.getCityName());
		paramSource.addValue("loc_prov",ba.getProvName());
		
		paramSource.addValue("biz_id", ba.getBizId());
		paramSource.addValue("loc_type", ba.getLocationType());
		return jdbc.update(sql,paramSource);
	}
	
	private static class BusinessAddressRowMapper implements RowMapper<BusinessAddress>{
		public BusinessAddress mapRow(ResultSet rs, int rowNumber) throws SQLException {
			BusinessAddress x = new BusinessAddress();
			x.setGlobalId(rs.getLong("global_id"));
			x.setAdvertiserId(rs.getLong("advertiser_id"));
			x.setBizId(rs.getLong("biz_id"));
			x.setBoothId(rs.getLong("booth_id"));
			x.setLangNo(rs.getInt("lang_no"));
			
			x.setStreetNo(rs.getString("street_no"));
			x.setStreetType(rs.getString("street_type"));
			x.setStreetName(rs.getString("street_name"));
			x.setPortType(rs.getString("port_type"));
			x.setPortNo(rs.getString("port_no"));
			x.setCityName(rs.getString("loc_city"));
			x.setProvName(rs.getString("loc_prov"));
			x.setPostalCode(rs.getString("postal_code"));
			x.setCountryName(rs.getString("loc_country"));
			
			x.setLocationType(rs.getInt("loc_type"));
			
	        return x;
		}		
	}

}
