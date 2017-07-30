package com.adogo.ad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.adogo.ad.entity.AdPost;


@Component
@Qualifier("adPostDaoJdbcImpl")
public class AdPostDaoJdbcImpl implements AdPostDao{
	
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
	public AdPost findById(long globalId) {
		String sql = "select * from AD_POST where global_id =:global_id";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("global_id", globalId);
		AdPost x = null;
		try{
			x = jdbc.queryForObject(sql, paramSource, new AdPostRowMapper());
		}catch(EmptyResultDataAccessException ex){
			x = null;
		}
		return x;
	}

	@Override
	public int saveTags(String adpostId, String tags) {
		String sql = "UPDATE AD_POST "
	               + "SET tags = :tags "
				   + "WHERE 1=1 "
				   + "AND adpost_id = :adpostId";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("adpostId", adpostId);
		paramSource.addValue("tags", tags);
		return jdbc.update(sql,paramSource);
		
	}
	
	private static class AdPostRowMapper implements RowMapper<AdPost>{
		public AdPost mapRow(ResultSet rs, int rowNumber) throws SQLException {
			AdPost x = new AdPost();
			x.setGlobal_id(rs.getLong("global_id"));
			x.setUser_id(rs.getLong("user_id"));
			x.setAdpost_id(rs.getString("adpost_id"));
			x.setMedia_cover_url(rs.getString("media_cover_url"));
			x.setPost_title(rs.getString("post_title"));
			x.setPost_author(rs.getString("post_author"));
			
			Timestamp cd = rs.getTimestamp("create_datetime");
			if (cd != null) {
				x.setCreate_datetime(new Date(cd.getTime()));
			}
			
			Timestamp pd = rs.getTimestamp("post_datetime");
			if (pd != null) {
				x.setPost_datetime(new Date(pd.getTime()));			
			}
			
			
			x.setLang_no(rs.getInt("lang_no"));
			x.setTags(rs.getString("tags"));
			
            return x;
		}		
	}
}
