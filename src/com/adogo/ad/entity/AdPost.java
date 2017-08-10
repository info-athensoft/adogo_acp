package com.adogo.ad.entity;

import java.util.Date;

public class AdPost {
	private long globalId;
	private long userId;
	private String adPostId;
	private String mediaCoverUrl;
	private String postTitle;
	private String postAuthor;
	private Date createDatetime;
	private Date postDatetime;
	private int langNo;
	private String tags;
	
	
	public long getGlobalId() {
		return globalId;
	}
	public void setGlobalId(long globalId) {
		this.globalId = globalId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getAdPostId() {
		return adPostId;
	}
	public void setAdPostId(String adPostId) {
		this.adPostId = adPostId;
	}
	public String getMediaCoverUrl() {
		return mediaCoverUrl;
	}
	public void setMediaCoverUrl(String mediaCoverUrl) {
		this.mediaCoverUrl = mediaCoverUrl;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostAuthor() {
		return postAuthor;
	}
	public void setPostAuthor(String postAuthor) {
		this.postAuthor = postAuthor;
	}
	public Date getCreateDatetime() {
		return createDatetime;
	}
	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}
	public Date getPostDatetime() {
		return postDatetime;
	}
	public void setPostDatetime(Date postDatetime) {
		this.postDatetime = postDatetime;
	}
	public int getLangNo() {
		return langNo;
	}
	public void setLangNo(int langNo) {
		this.langNo = langNo;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	
	@Override
	public String toString() {
		return "AdPost [globalId=" + globalId + ", userId=" + userId + ", adPostId=" + adPostId + ", mediaCoverUrl="
				+ mediaCoverUrl + ", postTitle=" + postTitle + ", postAuthor=" + postAuthor + ", createDatetime="
				+ createDatetime + ", postDatetime=" + postDatetime + ", langNo=" + langNo + ", tags=" + tags + "]";
	}

}
