package com.adogo.advertiser.business.entity;

import com.adogo.advertiser.entity.Address;

public class BusinessAddress extends Address {
	
	public static final int LOC_TYPE_HQ 	= 1;	
	public static final int LOC_TYPE_OUTLET = 2;
	
	private Long 	advertiserId;
	private Long	bizId;
	private Long 	boothId;
	private Integer locationType;		//type of business location
	private String	locationName;		//alias
	
		
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
	public Long getBoothId() {
		return boothId;
	}
	public void setBoothId(Long boothId) {
		this.boothId = boothId;
	}
	public Integer getLocationType() {
		return locationType;
	}
	public void setLocationType(Integer locationType) {
		this.locationType = locationType;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	@Override
	public String toString() {
		return "BusinessAddress [advertiserId=" + advertiserId + ", bizId=" + bizId + ", boothId=" + boothId
				+ ", locationType=" + locationType + ", locationName=" + locationName + ", globalId=" + globalId
				+ ", langNo=" + langNo + ", countryName=" + countryName + ", countryNo=" + countryNo + ", provName="
				+ provName + ", provShortName=" + provShortName + ", provNo=" + provNo + ", areaName=" + areaName
				+ ", areaNo=" + areaNo + ", cityName=" + cityName + ", cityNo=" + cityNo + ", districtionName="
				+ districtionName + ", districtionNo=" + districtionNo + ", streetNo=" + streetNo + ", streetType="
				+ streetType + ", streetName=" + streetName + ", portType=" + portType + ", portNo=" + portNo
				+ ", addrLine1=" + addrLine1 + ", addrLine2=" + addrLine2 + ", postalCode=" + postalCode
				+ ", postalCodeHigh=" + postalCodeHigh + ", postalCodeLow=" + postalCodeLow + ", locationStatus="
				+ locationStatus + ", locationComment=" + locationComment + "]";
	}
	
}
