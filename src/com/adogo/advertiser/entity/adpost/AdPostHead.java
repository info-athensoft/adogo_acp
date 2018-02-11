package com.adogo.advertiser.entity.adpost;

import java.util.Date;

public class AdPostHead {
	private Long 	globalId;
	private Long 	userId;
	private Long 	advertiserId;
	private Long 	adPostId;
	private Integer langNo;
	private String 	postCoverUrl;
	private String 	postTitle;
	private String 	postAuthor;
	private Integer postCategory;
	private String 	postTags;
	private Integer viewNum;
	private String 	shortDesc;
	private Date 	createDate;
	private Date 	postDate;
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
	public Long getAdvertiserId() {
		return advertiserId;
	}
	public void setAdvertiserId(Long advertiserId) {
		this.advertiserId = advertiserId;
	}
	public Long getAdPostId() {
		return adPostId;
	}
	public void setAdPostId(Long adPostId) {
		this.adPostId = adPostId;
	}
	public Integer getLangNo() {
		return langNo;
	}
	public void setLangNo(Integer langNo) {
		this.langNo = langNo;
	}
	public String getPostCoverUrl() {
		return postCoverUrl;
	}
	public void setPostCoverUrl(String postCoverUrl) {
		this.postCoverUrl = postCoverUrl;
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
	public Integer getPostCategory() {
		return postCategory;
	}
	public void setPostCategory(Integer postCategory) {
		this.postCategory = postCategory;
	}
	public String getPostTags() {
		return postTags;
	}
	public void setPostTags(String postTags) {
		this.postTags = postTags;
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
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	
	@Override
	public String toString() {
		return "AdPostHead [globalId=" + globalId + ", userId=" + userId + ", advertiserId=" + advertiserId
				+ ", adPostId=" + adPostId + ", langNo=" + langNo + ", postCoverUrl=" + postCoverUrl + ", postTitle="
				+ postTitle + ", postAuthor=" + postAuthor + ", postCategory=" + postCategory + ", postTags=" + postTags
				+ ", viewNum=" + viewNum + ", shortDesc=" + shortDesc + ", createDate=" + createDate + ", postDate="
				+ postDate + "]";
	}
}