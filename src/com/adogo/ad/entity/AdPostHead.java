package com.adogo.ad.entity;

import java.util.Date;

public class AdPostHead {
	protected Long globalId;
	protected Long userId;
	protected Long adPostId;
	protected String mediaCoverUrl;
	protected String postTitle;
	protected String postAuthor;
	protected Integer postCategory;
	protected Date createDatetime;
	protected Date postDatetime;
	protected Integer langNo;
	protected String tags;
	protected Integer viewNum;
	protected String shortDesc;
	
	
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
	public Long getAdPostId() {
		return adPostId;
	}
	public void setAdPostId(Long adPostId) {
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
	
	public Integer getPostCategory() {
		return postCategory;
	}
	public void setPostCategory(Integer postCategory) {
		this.postCategory = postCategory;
	}
	@Override
	public String toString() {
		return "AdPost [globalId=" + globalId + ", userId=" + userId + ", adPostId=" + adPostId + ", mediaCoverUrl="
				+ mediaCoverUrl + ", postTitle=" + postTitle + ", postAuthor=" + postAuthor + ", createDatetime="
				+ createDatetime + ", postDatetime=" + postDatetime + ", langNo=" + langNo + ", tags=" + tags + "]";
	}
	public Integer getViewNum() {
		return viewNum;
	}
	public void setViewNum(Integer viewNum) {
		this.viewNum = viewNum;
	}
	public String getShortDesc() {
		return shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

}
