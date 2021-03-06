package com.adogo.ad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import com.adogo.advertiser.entity.adpost.old.AdPostHead;


@Component
@Qualifier("adPostHeadDaoJdbcImpl")
public class AdPostHeadDaoJdbcImpl implements AdPostHeadDao{
	
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
	public List<AdPostHead> findAll() {
		final String TABLE = "AD_POST";
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("global_id, ");
		sbf.append("user_id, ");
		sbf.append("advertiser_id, ");
		sbf.append("adpost_id, ");
		sbf.append("lang_no, ");
		sbf.append("post_cover_url, ");
		sbf.append("post_title, ");
		sbf.append("post_author, ");
		sbf.append("post_category, ");
		sbf.append("post_tags, ");
		sbf.append("view_num, ");
		sbf.append("short_desc, ");
		sbf.append("create_date, ");
		sbf.append("post_date ");
		sbf.append(" FROM "+TABLE);
		String sql = sbf.toString();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		return jdbc.query(sql,paramSource,new AdPostHeadRowMapper());
	}

	@Override
	public AdPostHead findById(long globalId) {
		final String TABLE = "AD_POST";
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("global_id, ");
		sbf.append("user_id, ");
		sbf.append("adpost_id, ");
		sbf.append("media_cover_url, ");
		sbf.append("post_title, ");
		sbf.append("post_author, ");
		sbf.append("post_category, ");
		sbf.append("create_datetime, ");
		sbf.append("post_datetime, ");
		sbf.append("lang_no, ");
		sbf.append("tags, ");
		sbf.append("view_num, ");
		sbf.append("short_desc ");
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE 1=1 ");
		sbf.append(" AND global_id =:global_id ");
		
		String sql = sbf.toString();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("global_id", globalId);
		AdPostHead x = null;
		try{
			x = jdbc.queryForObject(sql, paramSource, new AdPostHeadRowMapper());
		}catch(EmptyResultDataAccessException ex){
			x = null;
		}
		return x;
	}

	@Override
	public AdPostHead findByAdPostId(long adPostId) {
		final String TABLE = "AD_POST";
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("SELECT ");
		sbf.append("global_id, ");
		sbf.append("user_id, ");
		sbf.append("adpost_id, ");
		sbf.append("media_cover_url, ");
		sbf.append("post_title, ");
		sbf.append("post_author, ");
		sbf.append("post_category, ");
		sbf.append("create_datetime, ");
		sbf.append("post_datetime, ");
		sbf.append("lang_no, ");
		sbf.append("tags, ");
		sbf.append("view_num, ");
		sbf.append("short_desc ");
		sbf.append(" FROM "+TABLE);
		sbf.append(" WHERE 1=1 ");
		sbf.append(" AND adpost_id =:adpost_id ");
		
		String sql = sbf.toString();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("adpost_id", adPostId);
		AdPostHead x = null;
		try{
			x = jdbc.queryForObject(sql, paramSource, new AdPostHeadRowMapper());
		}catch(EmptyResultDataAccessException ex){
			x = null;
		}
		return x;
	}

	@Override
	public Long findTotalCount() {
		String sql = "select count(*) from AD_POST";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		Long count = 0L;
		try{
			count = jdbc.queryForObject(sql, paramSource, Long.class);
		}catch(EmptyResultDataAccessException ex){
			count = 0L;
		}
		return count;
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
	
	@Override
	public long create(AdPostHead adPost) {
		final String TABLE = "AD_POST";
				
		StringBuffer sbf = new StringBuffer();
		sbf.append("insert into "+TABLE);
		sbf.append("(user_id,adpost_id,media_cover_url,post_title,post_author,post_category,create_datetime,post_datetime,lang_no,tags,short_desc) ");
		sbf.append("values(:user_id,:adpost_id,:media_cover_url,:post_title,:post_author,:post_category,:create_datetime,:post_datetime,:lang_no,:tags,:short_desc)");
		String sql = sbf.toString();
		
		final Date createDate 			= new Date();
		final Date postDate 	= createDate;
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		//paramSource.addValue("global_id", adPost.getGlobalId());
		paramSource.addValue("user_id", adPost.getUserId());
		paramSource.addValue("adpost_id", adPost.getAdPostId());
		paramSource.addValue("media_cover_url", adPost.getMediaCoverUrl());
		paramSource.addValue("post_title",adPost.getPostTitle());
		paramSource.addValue("post_author",adPost.getPostAuthor());
		paramSource.addValue("post_category",adPost.getPostCategory());
		paramSource.addValue("create_datetime",new java.sql.Timestamp(createDate.getTime()));
		paramSource.addValue("post_datetime",new java.sql.Timestamp(postDate.getTime()));
		paramSource.addValue("lang_no",adPost.getLangNo());
		paramSource.addValue("tags",adPost.getTags());
		paramSource.addValue("short_desc",adPost.getShortDesc());
		
		KeyHolder keyholder = new GeneratedKeyHolder();
		jdbc.update(sql, paramSource, keyholder);
		return (long)keyholder.getKey();
	}

	@Override
	public int update(AdPostHead adPost) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private static class AdPostHeadRowMapper implements RowMapper<AdPostHead>{
		public AdPostHead mapRow(ResultSet rs, int rowNumber) throws SQLException {
			AdPostHead x = new AdPostHead();
			x.setGlobalId(rs.getLong("global_id"));
			x.setUserId(rs.getLong("user_id"));
			x.setAdPostId(rs.getLong("adpost_id"));
			x.setMediaCoverUrl(rs.getString("media_cover_url"));
			x.setPostTitle(rs.getString("post_title"));
			x.setPostAuthor(rs.getString("post_author"));
			x.setPostCategory(rs.getInt("post_category"));
			
			Timestamp cd = rs.getTimestamp("create_datetime");
			if (cd != null) {	x.setCreateDatetime(new Date(cd.getTime())); }
			
			Timestamp pd = rs.getTimestamp("post_datetime");
			if (pd != null) {	x.setPostDatetime(new Date(pd.getTime()));	}
			
			x.setLangNo(rs.getInt("lang_no"));
			x.setTags(rs.getString("tags"));
			x.setViewNum(rs.getInt("view_num"));
			x.setShortDesc(rs.getString("short_desc"));
			
            return x;
		}		
	}
}

