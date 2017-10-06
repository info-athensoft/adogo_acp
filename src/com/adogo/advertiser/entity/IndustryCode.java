package com.adogo.advertiser.entity;

public class IndustryCode {
	
	private int globalId;
	private String industryCode;
	private String parentCode;
	private String industryName;
	private int levelNo;
	private String regionTag;
	
	public int getGlobalId() {
		return globalId;
	}
	public void setGlobalId(int globalId) {
		this.globalId = globalId;
	}
	public String getIndustryCode() {
		return industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}
	public String getParentCode() {
		return parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}
	public String getIndustryName() {
		return industryName;
	}
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}
	public int getLevelNo() {
		return levelNo;
	}
	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}
	public String getRegionTag() {
		return regionTag;
	}
	public void setRegionTag(String regionTag) {
		this.regionTag = regionTag;
	}
	
	@Override
	public String toString() {
		return "IndustryCode [globalId=" + globalId + ", industryCode=" + industryCode + ", parentCode=" + parentCode
				+ ", industryName=" + industryName + ", levelNo=" + levelNo + ", regionTag=" + regionTag + "]";
	}
	
	
}
