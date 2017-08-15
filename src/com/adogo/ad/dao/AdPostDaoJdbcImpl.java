package com.adogo.ad.dao;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import com.adogo.ad.entity.AdPostCoverImage;

@Component
@Qualifier("adPostDaoJdbcImpl")
public class AdPostDaoJdbcImpl implements AdPostDao {
	
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
	public long create(AdPostCoverImage adPost) {
		final String TABLE = "AD_POST_IMG";
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("insert into "+TABLE);
		sbf.append("(user_id,adpost_id,media_cover_url,media_title,media_url,media_type,media_index,is_primary,media_desc,create_datetime,update_datetime,lang_no) ");
		sbf.append("values(:user_id,:adpost_id,:media_cover_url,:media_title,:media_url,:media_type,:media_index,:is_primary,:media_desc,:create_datetime,:update_datetime,:lang_no)");
		String sql = sbf.toString();
		
		final Date createDate 			= new Date();
		final Date updateDate 	= createDate;
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		//paramSource.addValue("global_id", adPost.getGlobalId());
		paramSource.addValue("user_id", adPost.getUserId());
		paramSource.addValue("adpost_id", adPost.getAdPostId());
		paramSource.addValue("media_cover_url", adPost.getMediaCoverUrl());
		paramSource.addValue("media_title",adPost.getMediaTitle());
		paramSource.addValue("media_url",adPost.getMediaUrl());
		paramSource.addValue("media_type",adPost.getMediaType());
		paramSource.addValue("media_index",adPost.getMediaIndex());
		paramSource.addValue("is_primary",adPost.getIsPrimary());
		paramSource.addValue("media_desc",adPost.getMediaDesc());
		paramSource.addValue("create_datetime",new java.sql.Timestamp(createDate.getTime()));
		paramSource.addValue("update_datetime",new java.sql.Timestamp(updateDate.getTime()));
		paramSource.addValue("lang_no",adPost.getLangNo());
		
		KeyHolder keyholder = new GeneratedKeyHolder();
		jdbc.update(sql, paramSource, keyholder);
		return (long)keyholder.getKey();
	}
	
	

}
