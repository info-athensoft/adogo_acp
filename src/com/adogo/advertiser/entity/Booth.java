package com.adogo.advertiser.entity;

import java.util.Date;

public class Booth {
	private Long globalId;
	private Long userId;
	private Long advertiserId;
	private Long bizId;
	private Integer langNo;
	private String bizName;
	private String bizDesc;
	
	
	private Long boothId;			//bizId+langNo
	private String boothName;
	private Integer categoryNo;
	private Integer visitNum;
	private Integer followerNum;
	private Integer likeNum;
	private Double boothScore;
	
	private Date createDate;
	private Integer boothStatus;
	
	//fields for view
	private String langName;
	
	
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
	public String getBizName() {
		return bizName;
	}
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}
	public String getBizDesc() {
		return bizDesc;
	}
	public void setBizDesc(String bizDesc) {
		this.bizDesc = bizDesc;
	}
	public Integer getBoothStatus() {
		return boothStatus;
	}
	public void setBoothStatus(Integer boothStatus) {
		this.boothStatus = boothStatus;
	}
	public String getBoothName() {
		return boothName;
	}
	public void setBoothName(String boothName) {
		this.boothName = boothName;
	}
	public Integer getVisitNum() {
		return visitNum;
	}
	public void setVisitNum(Integer visitNum) {
		this.visitNum = visitNum;
	}
	public Integer getFollowerNum() {
		return followerNum;
	}
	public void setFollowerNum(Integer followerNum) {
		this.followerNum = followerNum;
	}
	public Integer getLikeNum() {
		return likeNum;
	}
	public void setLikeNum(Integer likeNum) {
		this.likeNum = likeNum;
	}
	public Double getBoothScore() {
		return boothScore;
	}
	public void setBoothScore(Double boothScore) {
		this.boothScore = boothScore;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(Integer categoryNo) {
		this.categoryNo = categoryNo;
	}
	public String getLangName() {
		return langName;
	}
	public void setLangName(String langName) {
		this.langName = langName;
	}
	
	@Override
	public String toString() {
		return "Booth [globalId=" + globalId + ", userId=" + userId + ", advertiserId=" + advertiserId + ", bizId="
				+ bizId + ", langNo=" + langNo + ", bizName=" + bizName + ", bizDesc=" + bizDesc + ", boothId="
				+ boothId + ", boothName=" + boothName + ", categoryNo=" + categoryNo + ", visitNum=" + visitNum
				+ ", followerNum=" + followerNum + ", likeNum=" + likeNum + ", boothScore=" + boothScore
				+ ", createDate=" + createDate + ", boothStatus=" + boothStatus + ", langName=" + langName + "]";
	}
	
}
