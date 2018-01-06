package com.adogo.ad.dao;

import java.util.Date;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import com.adogo.advertiser.entity.adpost.AdPostAudio;
import com.adogo.advertiser.entity.adpost.AdPostCoverImage;
import com.adogo.advertiser.entity.adpost.AdPostGalleryImage;
import com.adogo.advertiser.entity.adpost.AdPostSlideImage;
import com.adogo.advertiser.entity.adpost.AdPostText;
import com.adogo.advertiser.entity.adpost.AdPostVideo;

@Component
@Qualifier("adPostDaoJdbcImpl")
public class AdPostDaoJdbcImpl implements AdPostDao {
	
private NamedParameterJdbcTemplate jdbc;
private static final Logger logger = Logger.getLogger(AdPostDaoJdbcImpl.class);
	
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
		logger.info("entering... AdPostDaoJdbcImpl/AdPostCoverImage");
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
		logger.info("exiting... AdPostDaoJdbcImpl/AdPostCoverImage");
		return (long)keyholder.getKey();
	}

	@Override
	public long create(AdPostText tContent) {
		logger.info("entering... AdPostDaoJdbcImpl/create:AdPostText");
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
		logger.info("keyholder.getKey()="+keyholder.getKey());
		logger.info("exiting... AdPostDaoJdbcImpl/AdPostText");
		return (long)keyholder.getKey();
	}

	@Override
	public long create(AdPostVideo vContent) {
		logger.info("entering... AdPostDaoJdbcImpl/AdPostVideo");
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
		logger.info("entering... AdPostDaoJdbcImpl/AdPostAudio");
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
		logger.info("entering... AdPostDaoJdbcImpl/AdPostSlideImage");
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
		logger.info("entering... AdPostDaoJdbcImpl/AdPostGalleryImage");
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
