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
	
	//TODO
	/**
	 * transferred from BusinessProfile.java to IndustryCode.java by Athens on 2017-12-24
	 * 
	 * @param subIndustryCode
	 * @param level
	 * @return
	 * 
	 * @author sfz
	 */
	public boolean isSubIndustrySelected(String subIndustryCode, int level) {
		String parentIndustryCode = this.industryCode.substring(0, level+1);
		if (subIndustryCode.indexOf("-")!=-1) {
			String[] codes = subIndustryCode.split("-");
			if ((Integer.parseInt(parentIndustryCode) >= Integer.parseInt(codes[0])) && Integer.parseInt(parentIndustryCode) <=Integer.parseInt(codes[1])) {
				System.out.println("IndustryCode.isSubIndustrySelected()");
				System.out.println("level="+level +" Return True! subIndustryCode="+subIndustryCode);
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return parentIndustryCode.equals(subIndustryCode);
		}
	}
	
	public boolean isSubIndustrySelected(String industryCode, String subIndustryCode, int level) {
		String parentIndustryCode = industryCode.substring(0, level+1);
		if (subIndustryCode.indexOf("-")!=-1) {
			String[] codes = subIndustryCode.split("-");
			if ((Integer.parseInt(parentIndustryCode) >= Integer.parseInt(codes[0])) && Integer.parseInt(parentIndustryCode) <=Integer.parseInt(codes[1])) {
				System.out.println("IndustryCode.isSubIndustrySelected()");
				System.out.println("level="+level +" Return True! subIndustryCode="+subIndustryCode);
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return parentIndustryCode.equals(subIndustryCode);
		}
	}
}
