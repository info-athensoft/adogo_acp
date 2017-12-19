package com.adogo.advertiser.entity;

public class Address {
	
	@SuppressWarnings("unused")
	private final int STREET_TYPE_STREET=11;
		
	@SuppressWarnings("unused")
	private final int STREET_TYPE_RUE=21;
	
	@SuppressWarnings("unused")
	private final int STREET_TYPE_ANVENUE=22;
	
	@SuppressWarnings("unused")
	private final int STREET_TYPE_BOULVARD=23;
	
	
	@SuppressWarnings("unused")
	private final int PORT_TYPE_PORT=1;
	
	@SuppressWarnings("unused")
	private final int PORT_TYPE_SUITE=2;
	
	@SuppressWarnings("unused")
	private final int PORT_TYPE_APT=3;
	
	@SuppressWarnings("unused")
	private final int PORT_TYPE_APP=4;
	
	
	public static final int ADDR_HQ = 1;	
	public static final int ADDR_OUTLET = 2;
	
	private Long	globalId;
	private Long	bizId;
	private Long 	advertiserId;
	private Integer langNo;			//language number
	private Integer locationType;
	
	private Integer	addrType;
	private String	addrName;
	
	private String 	streetNo;
	private Integer streetType;
	private String	streetName;
	private Integer portType;
	private String  portNo;
	private String 	addrLine1;		//for future use
	private String 	addrLine2;		//for future use
	
	private String	districtionName;
	private String	districtionNo;
	
	private String  cityName;
	private Integer cityNo;
	
	private String	areaName;
	private Integer areaNo;
	
	private String  provName;			//eg: Quebec
	private String  provShortName;		//eg: QC
	private Integer provNo;
	
	private String	postalCode;			//full code, eg: H4B1N2
	private String  postalCodeHigh;		//first 3-char code, eg: H4B
	private String 	postalCodeLow;		//last 3-char code, eg: 1N2
	
	
	public Integer getLangNo() {
		return langNo;
	}
	public void setLangNo(Integer langNo) {
		this.langNo = langNo;
	}
	public Integer getAddrType() {
		return addrType;
	}
	public void setAddrType(Integer addrType) {
		this.addrType = addrType;
	}
	public String getAddrName() {
		return addrName;
	}
	public void setAddrName(String addrName) {
		this.addrName = addrName;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public Integer getStreetType() {
		return streetType;
	}
	public void setStreetType(Integer streetType) {
		this.streetType = streetType;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public Integer getPortType() {
		return portType;
	}
	public void setPortType(Integer portType) {
		this.portType = portType;
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
	public Long getGlobalId() {
		return globalId;
	}
	public void setGlobalId(Long globalId) {
		this.globalId = globalId;
	}
	public Long getBizId() {
		return bizId;
	}
	public void setBizId(Long bizId) {
		this.bizId = bizId;
	}
	public Long getAdvertiserId() {
		return advertiserId;
	}
	public void setAdvertiserId(Long advertiserId) {
		this.advertiserId = advertiserId;
	}
	public Integer getLocationType() {
		return locationType;
	}
	public void setLocationType(Integer locationType) {
		this.locationType = locationType;
	}
	@Override
	public String toString() {
		return "Address [globalId=" + globalId + ", bizId=" + bizId + ", advertiserId=" + advertiserId + ", langNo="
				+ langNo + ", locationType=" + locationType + ", addrType=" + addrType + ", addrName=" + addrName
				+ ", streetNo=" + streetNo + ", streetType=" + streetType + ", streetName=" + streetName + ", portType="
				+ portType + ", portNo=" + portNo + ", addrLine1=" + addrLine1 + ", addrLine2=" + addrLine2
				+ ", districtionName=" + districtionName + ", districtionNo=" + districtionNo + ", cityName=" + cityName
				+ ", cityNo=" + cityNo + ", areaName=" + areaName + ", areaNo=" + areaNo + ", provName=" + provName
				+ ", provShortName=" + provShortName + ", provNo=" + provNo + ", postalCode=" + postalCode
				+ ", postalCodeHigh=" + postalCodeHigh + ", postalCodeLow=" + postalCodeLow + "]";
	}
	
}
