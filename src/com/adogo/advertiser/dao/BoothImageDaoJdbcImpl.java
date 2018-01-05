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
import org.springframework.stereotype.Repository;

import com.adogo.advertiser.booth.entity.BoothImage;

@Repository
@Qualifier("boothImageDaoJdbcImpl")
public class BoothImageDaoJdbcImpl implements BoothImageDao {
	
	private final static Logger logger = Logger.getLogger(BoothImageDaoJdbcImpl.class);
	
	private final String TABLE = "BOOTH_IMG";
	
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
	public List<BoothImage> findByBoothId(long boothId) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("global_id, ");
		sbf.append("user_id, ");
		sbf.append("advertiser_id, ");
		sbf.append("biz_id, ");
		sbf.append("lang_no, ");
		sbf.append("booth_id, ");
		sbf.append("media_url, ");
		sbf.append("media_type, ");
		sbf.append("sort_no, ");
		sbf.append("is_primary ");
		
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE 1=1 ");
		sbf.append(" AND booth_id =:booth_id ");
		String sql = sbf.toString();
		logger.info(sql);
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("booth_id", boothId);
		return jdbc.query(sql,paramSource,new BoothImageRowMapper());
	}
	
	@Override
	public List<BoothImage> findByBoothId(long boothId, int mediaType) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("global_id, ");
		sbf.append("user_id, ");
		sbf.append("advertiser_id, ");
		sbf.append("biz_id, ");
		sbf.append("lang_no, ");
		sbf.append("booth_id, ");
		sbf.append("media_url, ");
		sbf.append("media_type, ");
		sbf.append("sort_no, ");
		sbf.append("is_primary ");
		
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE 1=1 ");
		sbf.append(" AND booth_id =:booth_id ");
		sbf.append(" AND media_type =:media_type ");
		String sql = sbf.toString();
		logger.info(sql);
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("booth_id", boothId);
		paramSource.addValue("media_type", mediaType);
		return jdbc.query(sql,paramSource,new BoothImageRowMapper());
	}

	@Override
	public int create(BoothImage x) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("INSERT INTO ").append(TABLE).append("(");
		sbf.append("user_id,");
		sbf.append("advertiser_id,");
		sbf.append("biz_id,");
		sbf.append("lang_no,");
		sbf.append("booth_id,");
		sbf.append("media_url,");
		sbf.append("media_type ");
		sbf.append(") ");
		
		sbf.append(" VALUES(");
		sbf.append(":user_id,");
		sbf.append(":advertiser_id,");
		sbf.append(":biz_id,");
		sbf.append(":lang_no,");
		sbf.append(":booth_id,");
		sbf.append(":media_url,");
		sbf.append(":media_type");
		sbf.append(")");
		String sql = sbf.toString();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("user_id", x.getUserId());
		paramSource.addValue("advertiser_id", x.getAdvertiserId());
		paramSource.addValue("biz_id", x.getBizId());
		paramSource.addValue("lang_no", x.getLangNo());
		paramSource.addValue("booth_id", x.getBoothId());
		paramSource.addValue("media_url", x.getMediaUrl());
		paramSource.addValue("media_type", x.getMediaType());
		
		logger.info(sql);
		
		return jdbc.update(sql,paramSource);
	}

	@Override
	public int update(BoothImage boothImage) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static class BoothImageRowMapper implements RowMapper<BoothImage>{

		@Override
		public BoothImage mapRow(ResultSet rs, int rowNumber) throws SQLException {
			BoothImage x = new BoothImage();
			x.setUserId(rs.getLong("user_id"));
			x.setAdvertiserId(rs.getLong("advertiser_id"));
			x.setBizId(rs.getLong("biz_id"));
			x.setLangNo(rs.getInt("lang_no"));
			x.setBoothId(rs.getLong("booth_id"));
			x.setMediaUrl(rs.getString("media_url"));
			x.setMediaType(rs.getInt("media_type"));
			
			return x;
		}
		
	}

}
