package com.adogo.advertiser.entity.adpost.old;

public class AdPostBody {
	protected Long globalId;
	protected Long userId;
	protected Long adPostId;
	protected String mediaCoverUrl;
	protected Boolean isPrimary = false;
	protected Integer mediaIndex;
	protected Integer mediaType;
	protected Integer langNo;
	protected Integer sortNo;
	
	
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
	
	public Boolean getIsPrimary() {
		return isPrimary;
	}
	public void setIsPrimary(Boolean isPrimary) {
		this.isPrimary = isPrimary;
	}
	
	public Integer getMediaIndex() {
		return mediaIndex;
	}
	public void setMediaIndex(Integer mediaIndex) {
		this.mediaIndex = mediaIndex;
	}
	
}
