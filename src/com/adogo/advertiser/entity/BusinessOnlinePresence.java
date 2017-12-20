package com.adogo.advertiser.entity;

public class BusinessOnlinePresence {
	private Long 	globalId;
	private Long	userId;
	private Long	advertiserId;
	private Long	bizId;
	private Integer	presenceNo;
	private String 	presenceName;
	private String 	presenceURL;
	private Integer presenceStatus;
	
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
	public Integer getPresenceNo() {
		return presenceNo;
	}
	public void setPresenceNo(Integer presenceNo) {
		this.presenceNo = presenceNo;
	}
	public String getPresenceName() {
		return presenceName;
	}
	public void setPresenceName(String presenceName) {
		this.presenceName = presenceName;
	}
	public String getPresenceURL() {
		return presenceURL;
	}
	public void setPresenceURL(String presenceURL) {
		this.presenceURL = presenceURL;
	}
	public Integer getPresenceStatus() {
		return presenceStatus;
	}
	public void setPresenceStatus(Integer presenceStatus) {
		this.presenceStatus = presenceStatus;
	}
	@Override
	public String toString() {
		return "BusinessOnlinePresence [globalId=" + globalId + ", userId=" + userId + ", advertiserId=" + advertiserId
				+ ", bizId=" + bizId + ", presenceNo=" + presenceNo + ", presenceName=" + presenceName
				+ ", presenceURL=" + presenceURL + ", presenceStatus=" + presenceStatus + "]";
	}
	
	
	
}
