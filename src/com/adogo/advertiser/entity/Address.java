package com.adogo.advertiser.entity;

public class Address {
	
	public static final int STREET_TYPE_STREET		=11;
	public static final int STREET_TYPE_RUE			=21;
	public static final int STREET_TYPE_ANVENUE		=22;
	public static final int STREET_TYPE_BOULVARD	=23;
	
	public static final int PORT_TYPE_PORT		=1;	
	public static final int PORT_TYPE_SUITE		=2;	
	public static final int PORT_TYPE_APT		=3;	
	public static final int PORT_TYPE_APP		=4;
	
	public static final int STATUS_UNKNOWN 		=0;
	public static final int STATUS_ACTIVE 		=1;
	public static final int STATUS_INACTIVE 	=2;
	public static final int STATUS_CHECKING 	=3;
	
	
	protected Long		globalId;
	protected Integer 	langNo;				//language number
	
	protected String 	countryName;
	protected Integer 	countryNo;
	
	protected String  	provName;			//eg: Quebec
	protected String  	provShortName;		//eg: QC
	protected Integer 	provNo;
	
	protected String	areaName;
	protected Integer 	areaNo;
	
	protected String  	cityName;
	protected Integer 	cityNo;
	
	protected String	districtionName;
	protected String	districtionNo;
	
	protected String 	streetNo;
	protected String 	streetType;
	protected String	streetName;
	protected String 	portType;
	protected String  	portNo;
	
	protected String 	addrLine1;			//for future use
	protected String 	addrLine2;			//for future use
	
	protected String	postalCode;			//full code, eg: H4B1N2
	protected String  	postalCodeHigh;		//first 3-char code, eg: H4B
	protected String 	postalCodeLow;		//last 3-char code, eg: 1N2
	
	protected Integer 	locationStatus;
	protected String  	locationComment;
	
	public Long getGlobalId() {
		return globalId;
	}
	public void setGlobalId(Long globalId) {
		this.globalId = globalId;
	}
	public Integer getLangNo() {
		return langNo;
	}
	public void setLangNo(Integer langNo) {
		this.langNo = langNo;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Integer getCountryNo() {
		return countryNo;
	}
	public void setCountryNo(Integer countryNo) {
		this.countryNo = countryNo;
	}
	public String getProvName() {
		return provName;
	}
	public void setProvName(String provName) {
		this.provName = provName;
	}
	public String getProvShortName() {
		return provShortName;
	}
	public void setProvShortName(String provShortName) {
		this.provShortName = provShortName;
	}
	public Integer getProvNo() {
		return provNo;
	}
	public void setProvNo(Integer provNo) {
		this.provNo = provNo;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public Integer getAreaNo() {
		return areaNo;
	}
	public void setAreaNo(Integer areaNo) {
		this.areaNo = areaNo;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Integer getCityNo() {
		return cityNo;
	}
	public void setCityNo(Integer cityNo) {
		this.cityNo = cityNo;
	}
	public String getDistrictionName() {
		return districtionName;
	}
	public void setDistrictionName(String districtionName) {
		this.districtionName = districtionName;
	}
	public String getDistrictionNo() {
		return districtionNo;
	}
	public void setDistrictionNo(String districtionNo) {
		this.districtionNo = districtionNo;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public String getPortNo() {
		return portNo;
	}
	public void setPortNo(String portNo) {
		this.portNo = portNo;
	}
	public String getAddrLine1() {
		return addrLine1;
	}
	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}
	public String getAddrLine2() {
		return addrLine2;
	}
	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getPostalCodeHigh() {
		return postalCodeHigh;
	}
	public void setPostalCodeHigh(String postalCodeHigh) {
		this.postalCodeHigh = postalCodeHigh;
	}
	public String getPostalCodeLow() {
		return postalCodeLow;
	}
	public void setPostalCodeLow(String postalCodeLow) {
		this.postalCodeLow = postalCodeLow;
	}
	public Integer getLocationStatus() {
		return locationStatus;
	}
	public void setLocationStatus(Integer locationStatus) {
		this.locationStatus = locationStatus;
	}
	public String getLocationComment() {
		return locationComment;
	}
	public void setLocationComment(String locationComment) {
		this.locationComment = locationComment;
	}
	
	@Override
	public String toString() {
		return "Address [globalId=" + globalId + ", langNo=" + langNo + ", countryName=" + countryName + ", countryNo="
				+ countryNo + ", provName=" + provName + ", provShortName=" + provShortName + ", provNo=" + provNo
				+ ", areaName=" + areaName + ", areaNo=" + areaNo + ", cityName=" + cityName + ", cityNo=" + cityNo
				+ ", districtionName=" + districtionName + ", districtionNo=" + districtionNo + ", streetNo=" + streetNo
				+ ", streetType=" + streetType + ", streetName=" + streetName + ", portType=" + portType + ", portNo="
				+ portNo + ", addrLine1=" + addrLine1 + ", addrLine2=" + addrLine2 + ", postalCode=" + postalCode
				+ ", postalCodeHigh=" + postalCodeHigh + ", postalCodeLow=" + postalCodeLow + ", locationStatus="
				+ locationStatus + ", locationComment=" + locationComment + "]";
	}
	public String getStreetType() {
		return streetType;
	}
	public void setStreetType(String streetType) {
		this.streetType = streetType;
	}
	public String getPortType() {
		return portType;
	}
	public void setPortType(String portType) {
		this.portType = portType;
	}
	
}
