package com.adogo.ad.dao;

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

import com.adogo.ad.entity.AdPostGalleryImage;

@Component
@Qualifier("adPostGalleryImageDaoJdbcImpl")
public class AdPostGalleryImageDaoJdbcImpl implements AdPostGalleryImageDao {
	
	private NamedParameterJdbcTemplate jdbc;
	/**
	 * inject DataSource object
	 * @param dataSource
	 */
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	private final static Logger logger = Logger.getLogger(AdPostGalleryImageDaoJdbcImpl.class);

	@Override
	public List<AdPostGalleryImage> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdPostGalleryImage> findByAdPostId(String adPostId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdPostGalleryImage> findByAdPostId(Long adPostId) {
		final String TABLE = "AD_POST_IMG2";
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("global_id, ");
		sbf.append("user_id, ");
		sbf.append("adpost_id, ");
		sbf.append("media_cover_url, ");
		sbf.append("media_title, ");
		sbf.append("media_url, ");
		sbf.append("media_type, ");
		sbf.append("media_index, ");
		sbf.append("is_primary, ");
		sbf.append("media_desc, ");
//		sbf.append("create_datetime, ");
//		sbf.append("update_datetime, ");
		sbf.append("lang_no, ");
		sbf.append("sort_no ");
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE 1=1 ");
		sbf.append("AND adpost_id =:adpost_id ");
		String sql = sbf.toString();
		logger.info("sql="+sql);
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("adpost_id", adPostId);
		return jdbc.query(sql,paramSource,new AdPostGalleryImageRowMapper());
	}

	@Override
	public AdPostGalleryImage findPrimary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long findTotalCount() {
		// TODO Auto-generated method stub
		return null;
	}

	private static class AdPostGalleryImageRowMapper implements RowMapper<AdPostGalleryImage>{
		public AdPostGalleryImage mapRow(ResultSet rs, int rowNumber) throws SQLException {
			
			AdPostGalleryImage x = new AdPostGalleryImage();
			x.setGlobalId(rs.getLong("global_id"));
			x.setUserId(rs.getLong("user_id"));
			x.setAdPostId(rs.getLong("adpost_id"));
			x.setMediaCoverUrl(rs.getString("media_cover_url"));
			x.setMediaTitle(rs.getString("media_title"));
			x.setMediaUrl(rs.getString("media_url"));
			x.setMediaType(rs.getInt("media_type"));
			x.setMediaIndex(rs.getInt("media_index"));
			x.setIsPrimary(rs.getBoolean("is_primary"));
			x.setMediaDesc(rs.getString("media_desc"));
			x.setLangNo(rs.getInt("lang_no"));
			x.setSortNo(rs.getInt("sort_no"));
			
            return x;
		}		
	}
	
}
