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
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;

import com.adogo.advertiser.entity.BusinessOnlinePresence;

@Component
@Qualifier("businessOnlinePresenceDaoJdbcImpl")
public class BusinessOnlinePresenceDaoJdbcImpl implements BusinessOnlinePresenceDao {

	private final static Logger logger = Logger.getLogger(BusinessOnlinePresenceDaoJdbcImpl.class);
	
	private static final String TABLE = "BIZ_ONLINEPRESENCE";
	
	private NamedParameterJdbcTemplate jdbc;

	/**
	 * inject DataSource object
	 * @param dataSource
	 */
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public List<BusinessOnlinePresence> findByBizId(long bizId){
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("global_id,");
		sbf.append("user_id,");
		sbf.append("advertiser_id,");
		sbf.append("biz_id,");
		sbf.append("presence_no,");
		sbf.append("presence_name,");
		sbf.append("presence_url,");
		sbf.append("presence_status");
		sbf.append(" FROM ").append(TABLE);
		sbf.append(" WHERE 1=1");
		sbf.append(" AND biz_id=:biz_id");
		
		String sql = sbf.toString();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("biz_id", bizId);
		return jdbc.query(sql,paramSource,new BusinessOnlinePresenceRowMapper());
	}
	
	@Override
	public int[] createInBatch(final List<BusinessOnlinePresence> listBOP) {
		//WARNING: when creating batch, the placeholder name must be the same as the property name defined in the entity class
		StringBuffer sbf = new StringBuffer();
		sbf.append("INSERT INTO ").append(TABLE).append("(");
		sbf.append("user_id,");
		sbf.append("advertiser_id,");
		sbf.append("biz_id,");
		sbf.append("presence_no,");
		sbf.append("presence_url,");
		sbf.append("presence_status");
		sbf.append(") VALUES (");
		sbf.append(":userId,");
		sbf.append(":advertiserId,");
		sbf.append(":bizId,");
		sbf.append(":presenceNo,");
		sbf.append(":presenceURL,");
		sbf.append(":presenceStatus");
		sbf.append(")");
		
		String sql = sbf.toString();
		logger.info(sql);		
		
//		String sql = "insert into "+TABLE+" (user_id, advertiser_id, biz_id, presence_no, presence_url) " +
//		        "values (:userId, :advertiserId, :bizId, :presenceNo, :presenceURL)";
		
		SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(listBOP.toArray());
		int[] updateCounts = jdbc.batchUpdate(sql, batch);
		return updateCounts;
	}
	
	@Override
	public int[] updateInBatch(final List<BusinessOnlinePresence> listBOP) {
		//WARNING: when creating batch, the placeholder name must be the same as the property name defined in the entity class
		StringBuffer sbf = new StringBuffer();
		sbf.append("UPDATE ").append(TABLE).append(" SET ");
		sbf.append("user_id=:userId,");
		sbf.append("advertiser_id=:advertiserId,");
		sbf.append("presence_url=:presenceURL,");
		sbf.append("presence_status=:presenceStatus");
		sbf.append(" WHERE 1=1");
		sbf.append(" AND biz_id=:bizId ");
		sbf.append(" AND presence_no=:presenceNo");
		
		String sql = sbf.toString();
		logger.info(sql);		
		
		SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(listBOP.toArray());
		int[] updateCounts = jdbc.batchUpdate(sql, batch);
		return updateCounts;
	}
	
	private static class BusinessOnlinePresenceRowMapper implements RowMapper<BusinessOnlinePresence>{
		public BusinessOnlinePresence mapRow(ResultSet rs, int rowNumber) throws SQLException {
			BusinessOnlinePresence x = new BusinessOnlinePresence();
			x.setGlobalId(rs.getLong("global_id"));
			x.setUserId(rs.getLong("user_id"));
			x.setAdvertiserId(rs.getLong("advertiser_id"));
			x.setBizId(rs.getLong("biz_id"));
			x.setPresenceNo(rs.getInt("presence_no"));
			x.setPresenceURL(rs.getString("presence_url"));
	        return x;
		}		
	}

}
