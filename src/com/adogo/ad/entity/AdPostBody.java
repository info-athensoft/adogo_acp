package com.adogo.ad.entity;

public class AdPostBody {
	private Long globalId;
	private Long userId;
	private Long adPostId;
	private String mediaCoverUrl;
	private Integer mediaType;
	private Integer langNo;
	private Integer sortNo;
	
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
	public Integer getMediaType() {
		return mediaType;
	}
	public void setMediaType(Integer mediaType) {
		this.mediaType = mediaType;
	}
	public Integer getLangNo() {
		return langNo;
	}
	public void setLangNo(Integer langNo) {
		this.langNo = langNo;
	}
	public Integer getSortNo() {
		return sortNo;
	}
	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}
	
	
}
