package com.adogo.ad.entity;

import java.util.Date;

public class AdPost {
	private long global_id;
	private long user_id;
	private String adpost_id;
	private String media_cover_url;
	private String post_title;
	private String post_author;
	private Date create_datetime;
	private Date post_datetime;
	private int lang_no;
	private String tags;
	
	
	public long getGlobal_id() {
		return global_id;
	}

	public void setGlobal_id(long global_id) {
		this.global_id = global_id;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getAdpost_id() {
		return adpost_id;
	}



	public void setAdpost_id(String adpost_id) {
		this.adpost_id = adpost_id;
	}



	public String getMedia_cover_url() {
		return media_cover_url;
	}



	public void setMedia_cover_url(String media_cover_url) {
		this.media_cover_url = media_cover_url;
	}



	public String getPost_title() {
		return post_title;
	}



	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}



	public String getPost_author() {
		return post_author;
	}



	public void setPost_author(String post_author) {
		this.post_author = post_author;
	}



	public Date getCreate_datetime() {
		return create_datetime;
	}



	public void setCreate_datetime(Date create_datetime) {
		this.create_datetime = create_datetime;
	}



	public Date getPost_datetime() {
		return post_datetime;
	}



	public void setPost_datetime(Date post_datetime) {
		this.post_datetime = post_datetime;
	}



	public int getLang_no() {
		return lang_no;
	}



	public void setLang_no(int lang_no) {
		this.lang_no = lang_no;
	}



	public String getTags() {
		return tags;
	}



	public void setTags(String tags) {
		this.tags = tags;
	}



	@Override
	public String toString() {
		return "AdPost [global_id=" + global_id + ", user_id=" + user_id + ", adpost_id=" + adpost_id
				+ ", media_cover_url=" + media_cover_url + ", post_title=" + post_title + ", post_author=" + post_author
				+ ", create_datetime=" + create_datetime + ", post_datetime=" + post_datetime + ", lang_no=" + lang_no
				+ ", tags=" + tags + "]";
	}



}
