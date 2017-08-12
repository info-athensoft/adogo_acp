package com.adogo.ad.entity;

import java.util.Date;

public class AdPostHead {
	protected Long globalId;
	protected Long userId;
	protected String adPostId;
	protected String mediaCoverUrl;
	protected String postTitle;
	protected String postAuthor;
	protected Date createDatetime;
	protected Date postDatetime;
	protected Integer langNo;
	protected String tags;
	
	
	public Long getGlobalId() {
		return globalId;
	}
	public void setGlobalId(Long globalId) {
		this.globalId = globalId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
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
	public Integer getLangNo() {
		return langNo;
	}
	public void setLangNo(Integer langNo) {
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
