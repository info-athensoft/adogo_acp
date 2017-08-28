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

import com.adogo.ad.entity.AdPostAudio;
import com.adogo.ad.entity.AdPostCoverImage;
import com.adogo.ad.entity.AdPostGalleryImage;
import com.adogo.ad.entity.AdPostSlideImage;
import com.adogo.ad.entity.AdPostText;
import com.adogo.ad.entity.AdPostVideo;

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
		
		final Date createDate 	= new Date();
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

	@Override
	public long create(AdPostText tContent) {
		final String TABLE = "AD_POST_TEXT";
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("insert into "+TABLE);
		sbf.append("(user_id,adpost_id,media_cover_url,media_type,long_desc,create_datetime,update_datetime,lang_no) ");
		sbf.append("values(:user_id,:adpost_id,:media_cover_url,:media_type,:long_desc,:create_datetime,:update_datetime,:lang_no)");
		String sql = sbf.toString();
		
		final Date createDate 	= new Date();
		final Date updateDate 	= createDate;
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		//paramSource.addValue("global_id", adPost.getGlobalId());
		paramSource.addValue("user_id", tContent.getUserId());
		paramSource.addValue("adpost_id", tContent.getAdPostId());
		paramSource.addValue("media_cover_url", tContent.getMediaCoverUrl());
		paramSource.addValue("media_type",tContent.getMediaType());
		//paramSource.addValue("media_index",tContent.getMediaIndex());
		//paramSource.addValue("is_primary",tContent.getIsPrimary());
		paramSource.addValue("long_desc",tContent.getLongDesc());
		paramSource.addValue("create_datetime",new java.sql.Timestamp(createDate.getTime()));
		paramSource.addValue("update_datetime",new java.sql.Timestamp(updateDate.getTime()));
		paramSource.addValue("lang_no",tContent.getLangNo());
		
		KeyHolder keyholder = new GeneratedKeyHolder();
		jdbc.update(sql, paramSource, keyholder);
		return (long)keyholder.getKey();
	}

	@Override
	public long create(AdPostVideo vContent) {
		final String TABLE = "AD_POST_MEDIA";
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("insert into "+TABLE);
		sbf.append("(user_id,adpost_id,media_cover_url,media_title,media_url,media_type,media_index,is_primary,media_desc,create_datetime,update_datetime,lang_no) ");
		sbf.append("values(:user_id,:adpost_id,:media_cover_url,:media_title,:media_url,:media_type,:media_index,:is_primary,:media_desc,:create_datetime,:update_datetime,:lang_no)");
		String sql = sbf.toString();
		
		final Date createDate 	= new Date();
		final Date updateDate 	= createDate;
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		//paramSource.addValue("global_id", adPost.getGlobalId());
		paramSource.addValue("user_id", vContent.getUserId());
		paramSource.addValue("adpost_id", vContent.getAdPostId());
		paramSource.addValue("media_cover_url", vContent.getMediaCoverUrl());
		paramSource.addValue("media_title",vContent.getMediaTitle());
		paramSource.addValue("media_url",vContent.getMediaUrl());
		paramSource.addValue("media_type",vContent.getMediaType());
		paramSource.addValue("media_index",vContent.getMediaIndex());
		paramSource.addValue("is_primary",vContent.getIsPrimary());
		paramSource.addValue("media_desc",vContent.getMediaDesc());
		paramSource.addValue("create_datetime",new java.sql.Timestamp(createDate.getTime()));
		paramSource.addValue("update_datetime",new java.sql.Timestamp(updateDate.getTime()));
		paramSource.addValue("lang_no",vContent.getLangNo());
		
		KeyHolder keyholder = new GeneratedKeyHolder();
		jdbc.update(sql, paramSource, keyholder);
		return (long)keyholder.getKey();
	}

	@Override
	public long create(AdPostAudio aContent) {
		final String TABLE = "AD_POST_MEDIA";
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("insert into "+TABLE);
		sbf.append("(user_id,adpost_id,media_cover_url,media_title,media_url,media_type,media_index,is_primary,media_desc,create_datetime,update_datetime,lang_no) ");
		sbf.append("values(:user_id,:adpost_id,:media_cover_url,:media_title,:media_url,:media_type,:media_index,:is_primary,:media_desc,:create_datetime,:update_datetime,:lang_no)");
		String sql = sbf.toString();
		
		final Date createDate 	= new Date();
		final Date updateDate 	= createDate;
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		//paramSource.addValue("global_id", adPost.getGlobalId());
		paramSource.addValue("user_id", aContent.getUserId());
		paramSource.addValue("adpost_id", aContent.getAdPostId());
		paramSource.addValue("media_cover_url", aContent.getMediaCoverUrl());
		paramSource.addValue("media_title",aContent.getMediaTitle());
		paramSource.addValue("media_url",aContent.getMediaUrl());
		paramSource.addValue("media_type",aContent.getMediaType());
		paramSource.addValue("media_index",aContent.getMediaIndex());
		paramSource.addValue("is_primary",aContent.getIsPrimary());
		paramSource.addValue("media_desc",aContent.getMediaDesc());
		paramSource.addValue("create_datetime",new java.sql.Timestamp(createDate.getTime()));
		paramSource.addValue("update_datetime",new java.sql.Timestamp(updateDate.getTime()));
		paramSource.addValue("lang_no",aContent.getLangNo());
		
		KeyHolder keyholder = new GeneratedKeyHolder();
		jdbc.update(sql, paramSource, keyholder);
		return (long)keyholder.getKey();
	}

	@Override
	public long create(AdPostSlideImage adPost) {
		final String TABLE = "AD_POST_IMG2";
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("insert into "+TABLE);
		sbf.append("(user_id,adpost_id,media_cover_url,media_title,media_url,media_type,media_index,is_primary,media_desc,create_datetime,update_datetime,lang_no) ");
		sbf.append("values(:user_id,:adpost_id,:media_cover_url,:media_title,:media_url,:media_type,:media_index,:is_primary,:media_desc,:create_datetime,:update_datetime,:lang_no)");
		String sql = sbf.toString();
		
		final Date createDate 	= new Date();
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
	
	@Override
	public long create(AdPostGalleryImage adPost) {
		final String TABLE = "AD_POST_IMG2";
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("insert into "+TABLE);
		sbf.append("(user_id,adpost_id,media_cover_url,media_title,media_url,media_type,media_index,is_primary,media_desc,create_datetime,update_datetime,lang_no) ");
		sbf.append("values(:user_id,:adpost_id,:media_cover_url,:media_title,:media_url,:media_type,:media_index,:is_primary,:media_desc,:create_datetime,:update_datetime,:lang_no)");
		String sql = sbf.toString();
		
		final Date createDate 	= new Date();
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
