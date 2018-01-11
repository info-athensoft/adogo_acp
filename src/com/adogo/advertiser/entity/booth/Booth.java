package com.adogo.advertiser.entity.booth;

import java.util.Date;
import java.util.List;

import com.adogo.advertiser.entity.business.BusinessHours;

public class Booth {
	private Long globalId;
	private Long userId;
	private Long advertiserId;
	private Long bizId;
	private Integer langNo;
	
	/**
	 * view field of langNo
	 */
	private String langName;
	private String bizName;
	private String bizDesc;
	
	
	private BoothImage boothBanner;
	
	private BusinessHours businessHours;
	
	private List<BoothText> boothTextList;
	
	
	public List<BoothText> getBoothTextList() {
		return boothTextList;
	}
	public void setBoothTextList(List<BoothText> boothTextList) {
		this.boothTextList = boothTextList;
	}
	public BusinessHours getBusinessHours() {
		return businessHours;
	}
	public void setBusinessHours(BusinessHours businessHours) {
		this.businessHours = businessHours;
	}
	public BoothImage getBoothBanner() {
		return boothBanner;
	}
	public void setBoothBanner(BoothImage boothBanner) {
		this.boothBanner = boothBanner;
	}

	/**
	 * Booth ID is consisted of bizId and langNo
	 */
	private Long boothId;			
	private String boothName;
	private String boothImg;
	private Integer categoryNo;
	private Date createDate;
	private Date modifyDate;
	private Integer boothStatus;
	
	private Integer visitNum 		= 0;
	private Integer followerNum		= 0;
	private Integer likeNum			= 0;
	private Integer boothScore		= 0;
	
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
	public String getBoothImg() {
		return boothImg;
	}
	public void setBoothImg(String boothImg) {
		this.boothImg = boothImg;
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
	public Integer getBoothScore() {
		return boothScore;
	}
	public void setBoothScore(Integer boothScore) {
		this.boothScore = boothScore;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
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
	
	public static Long createBoothId(Long bizId, Integer langNo){
		return Long.parseLong(""+bizId+langNo);
	}
	
	public static Long createBoothId(String bizId, String langNo){
		return Long.parseLong(bizId+langNo);
	}
	@Override
	public String toString() {
		return "Booth [globalId=" + globalId + ", userId=" + userId + ", advertiserId=" + advertiserId + ", bizId="
				+ bizId + ", langNo=" + langNo + ", langName=" + langName + ", bizName=" + bizName + ", bizDesc="
				+ bizDesc + ", boothBanner=" + boothBanner + ", businessHours=" + businessHours + ", boothTextList="
				+ boothTextList + ", boothId=" + boothId + ", boothName=" + boothName + ", boothImg=" + boothImg
				+ ", categoryNo=" + categoryNo + ", createDate=" + createDate + ", modifyDate=" + modifyDate
				+ ", boothStatus=" + boothStatus + ", visitNum=" + visitNum + ", followerNum=" + followerNum
				+ ", likeNum=" + likeNum + ", boothScore=" + boothScore + "]";
	}
	
	
}
