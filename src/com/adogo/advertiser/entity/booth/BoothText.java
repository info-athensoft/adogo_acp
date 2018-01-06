package com.adogo.advertiser.entity.booth;

public class BoothText {
	
	protected Long globalId;
	protected Long userId;
	protected Long advertiserId;
	protected Long bizId;
	protected Integer langNo;
	protected Long boothId;
	
	private String textTitle;
	private String textContent;
	private int sortNo;
	
	
	public int getSortNo() {
		return sortNo;
	}
	public void setSortNo(int sortNo) {
		this.sortNo = sortNo;
	}
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
	public Long getBizId() {
		return bizId;
	}
	public void setBizId(Long bizId) {
		this.bizId = bizId;
	}
	public Integer getLangNo() {
		return langNo;
	}
	public void setLangNo(Integer langNo) {
		this.langNo = langNo;
	}
	public Long getBoothId() {
		return boothId;
	}
	public void setBoothId(Long boothId) {
		this.boothId = boothId;
	}
	public String getTextTitle() {
		return textTitle;
	}
	public void setTextTitle(String textTitle) {
		this.textTitle = textTitle;
	}
	public String getTextContent() {
		return textContent;
	}
	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}
	@Override
	public String toString() {
		return "BoothText [globalId=" + globalId + ", userId=" + userId + ", advertiserId=" + advertiserId + ", bizId="
				+ bizId + ", langNo=" + langNo + ", boothId=" + boothId + ", textTitle=" + textTitle + ", textContent="
				+ textContent + "]";
	}
	
}
