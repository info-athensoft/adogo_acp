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

import com.adogo.advertiser.entity.BusinessAddress;
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
		sbf.append("street_no");
		sbf.append("street_type");
		sbf.append("street_name");
		sbf.append("port_type");
		sbf.append("port_no");
		sbf.append("addr_line1");
		sbf.append("addr_line2");
		sbf.append("loc_status");
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
	public int create(BusinessAddress addr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BusinessAddress addr) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private static class BusinessAddressRowMapper implements RowMapper<BusinessAddress>{
		public BusinessAddress mapRow(ResultSet rs, int rowNumber) throws SQLException {
			BusinessAddress x = new BusinessAddress();
			x.setGlobalId(rs.getLong("global_id"));
			x.setAdvertiserId(rs.getLong("advertiser_id"));
			x.setBizId(rs.getLong("biz_id"));
			x.setBoothId(rs.getLong("booth_id"));
			x.setLangNo(rs.getInt("lang_no"));
			
	        return x;
		}		
	}

}
