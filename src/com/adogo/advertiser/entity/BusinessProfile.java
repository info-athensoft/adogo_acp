package com.adogo.advertiser.entity;

import java.util.Date;
import java.util.List;

public class BusinessProfile {
	private Long 	globalId;
	private Long 	userId;
	private Long 	advertiserId;
	private Long 	bizId;
	private String 	bizNo;			//official business no issued by govern.
	private String	bizName;
	private String	bizName2;
	private Integer	legalFormNo;
	private String	industryCode;
	private Integer bizType;
	private String	bizOwner;
	private Date	establishDate;	//official registration date at govern.
	private Date	createDate;		//registration date at Adogo
	private Integer	bizStatus;
	private String  bizDesc;		//business description
	
	private String	bizPhone;
	private String 	bizFax;
	private String	bizEmail;
	private String	bizWebsite;				//website
	
	private BusinessAddress hqAddress;		//headquarters address
	
	private List<BusinessOnlinePresence> bizOnlinePresenceList;	//business online presence

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
	public String getBizNo() {
		return bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizName() {
		return bizName;
	}
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}
	public String getBizName2() {
		return bizName2;
	}
	public void setBizName2(String bizName2) {
		this.bizName2 = bizName2;
	}
	public Integer getLegalFormNo() {
		return legalFormNo;
	}
	public void setLegalFormNo(Integer legalFormNo) {
		this.legalFormNo = legalFormNo;
	}
	public Integer getBizType() {
		return bizType;
	}
	public void setBizType(Integer bizType) {
		this.bizType = bizType;
	}
	public String getBizOwner() {
		return bizOwner;
	}
	public void setBizOwner(String bizOwner) {
		this.bizOwner = bizOwner;
	}
	public Date getEstablishDate() {
		return establishDate;
	}
	public void setEstablishDate(Date establishDate) {
		this.establishDate = establishDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getBizStatus() {
		return bizStatus;
	}
	public void setBizStatus(Integer bizStatus) {
		this.bizStatus = bizStatus;
	}
	public String getIndustryCode() {
		return industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}
	public String getBizDesc() {
		return bizDesc;
	}
	public void setBizDesc(String bizDesc) {
		this.bizDesc = bizDesc;
	}
	public BusinessAddress getHqAddress() {
		return hqAddress;
	}
	public void setHqAddress(BusinessAddress hqAddress) {
		this.hqAddress = hqAddress;
	}
	public String getBizEmail() {
		return bizEmail;
	}
	public void setBizEmail(String bizEmail) {
		this.bizEmail = bizEmail;
	}
	public String getBizWebsite() {
		return bizWebsite;
	}
	public void setBizWebsite(String bizWebsite) {
		this.bizWebsite = bizWebsite;
	}
	public String getBizPhone() {
		return bizPhone;
	}
	public void setBizPhone(String bizPhone) {
		this.bizPhone = bizPhone;
	}
	public String getBizFax() {
		return bizFax;
	}
	public void setBizFax(String bizFax) {
		this.bizFax = bizFax;
	}
	
	@Override
	public String toString() {
		return "BusinessProfile [globalId=" + globalId + ", userId=" + userId + ", advertiserId=" + advertiserId
				+ ", bizId=" + bizId + ", bizNo=" + bizNo + ", bizName=" + bizName + ", bizName2=" + bizName2
				+ ", legalFormNo=" + legalFormNo + ", industryCode=" + industryCode + ", bizType=" + bizType
				+ ", bizOwner=" + bizOwner + ", establishDate=" + establishDate + ", createDate=" + createDate
				+ ", bizStatus=" + bizStatus + ", bizDesc=" + bizDesc + ", bizPhone=" + bizPhone + ", bizFax=" + bizFax
				+ ", bizEmail=" + bizEmail + ", bizWebsite=" + bizWebsite + ", hqAddress=" + hqAddress + "]";
	}
	public List<BusinessOnlinePresence> getBusinessOnlinePresenceList() {
		return bizOnlinePresenceList;
	}
	public void setBusinessOnlinePresenceList(List<BusinessOnlinePresence> businessOnlinePresenceList) {
		this.bizOnlinePresenceList = businessOnlinePresenceList;
	}
	
	
	
}