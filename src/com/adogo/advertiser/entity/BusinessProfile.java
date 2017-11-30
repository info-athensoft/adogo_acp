package com.adogo.advertiser.entity;

import java.util.Date;

public class BusinessProfile {
	private Long 	globalId;
	private Long 	userId;
	private Long 	advertiserId;
	private Long 	bizId;
	private String 	bizNo;			//official business no issued by govern.
	private String	bizName;
	private String	bizName2;
	private Integer	legalFormNo;
	private String	industryNo;
	private Integer bizType;
	private String	bizOwner;
	private Date	establishDate;	//official registration date at govern.
	private Date	createDate;		//registration date at Adogo
	private Integer	bizStatus;

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
	public String getIndustryNo() {
		return industryNo;
	}
	public void setIndustryNo(String industryNo) {
		this.industryNo = industryNo;
	}
	
	
}
