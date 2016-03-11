package com.adogo.admin.entity;


public class BusinessProfile {
	private int biz_id;
	private int biz_no;
	private String cp_firstname;
	private String cp_lastname;
	private String cp_nickname;
	private int cp_title;
	private int cp_showtype;
	private String biz_offer;
	private String biz_competency;
	private String loc_country;
	private String loc_prov;
	private String loc_area;
	private String loc_city;
	private String loc_distriction;
	private String loc_addr_line1;
	private String loc_addr_line2;
	private String loc_postalcode;
	private String loc_name;
	private String loc_desc;
	private String biz_tel1;
	private String biz_tel2;
	private String biz_cell1;
	private String biz_fax1;
	private String biz_email1;
	private String biz_email2;
	
	public int getBiz_id() {
		return biz_id;
	}
	public void setBiz_id(int biz_id) {
		this.biz_id = biz_id;
	}
	public int getBiz_no() {
		return biz_no;
	}
	public void setBiz_no(int biz_no) {
		this.biz_no = biz_no;
	}
	public String getCp_firstname() {
		return cp_firstname;
	}
	public void setCp_firstname(String cp_firstname) {
		this.cp_firstname = cp_firstname;
	}
	public String getCp_lastname() {
		return cp_lastname;
	}
	public void setCp_lastname(String cp_lastname) {
		this.cp_lastname = cp_lastname;
	}
	public String getCp_nickname() {
		return cp_nickname;
	}
	public void setCp_nickname(String cp_nickname) {
		this.cp_nickname = cp_nickname;
	}
	public int getCp_title() {
		return cp_title;
	}
	public void setCp_title(int cp_title) {
		this.cp_title = cp_title;
	}
	public int getCp_showtype() {
		return cp_showtype;
	}
	public void setCp_showtype(int cp_showtype) {
		this.cp_showtype = cp_showtype;
	}
	public String getBiz_offer() {
		return biz_offer;
	}
	public void setBiz_offer(String biz_offer) {
		this.biz_offer = biz_offer;
	}
	public String getBiz_competency() {
		return biz_competency;
	}
	public void setBiz_competency(String biz_competency) {
		this.biz_competency = biz_competency;
	}
	public String getLoc_country() {
		return loc_country;
	}
	public void setLoc_country(String loc_country) {
		this.loc_country = loc_country;
	}
	public String getLoc_prov() {
		return loc_prov;
	}
	public void setLoc_prov(String loc_prov) {
		this.loc_prov = loc_prov;
	}
	public String getLoc_area() {
		return loc_area;
	}
	public void setLoc_area(String loc_area) {
		this.loc_area = loc_area;
	}
	public String getLoc_city() {
		return loc_city;
	}
	public void setLoc_city(String loc_city) {
		this.loc_city = loc_city;
	}
	public String getLoc_distriction() {
		return loc_distriction;
	}
	public void setLoc_distriction(String loc_distriction) {
		this.loc_distriction = loc_distriction;
	}
	public String getLoc_addr_line1() {
		return loc_addr_line1;
	}
	public void setLoc_addr_line1(String loc_addr_line1) {
		this.loc_addr_line1 = loc_addr_line1;
	}
	public String getLoc_addr_line2() {
		return loc_addr_line2;
	}
	public void setLoc_addr_line2(String loc_addr_line2) {
		this.loc_addr_line2 = loc_addr_line2;
	}
	public String getLoc_postalcode() {
		return loc_postalcode;
	}
	public void setLoc_postalcode(String loc_postalcode) {
		this.loc_postalcode = loc_postalcode;
	}
	public String getLoc_name() {
		return loc_name;
	}
	public void setLoc_name(String loc_name) {
		this.loc_name = loc_name;
	}
	public String getLoc_desc() {
		return loc_desc;
	}
	public void setLoc_desc(String loc_desc) {
		this.loc_desc = loc_desc;
	}
	public String getBiz_tel1() {
		return biz_tel1;
	}
	public void setBiz_tel1(String biz_tel1) {
		this.biz_tel1 = biz_tel1;
	}
	public String getBiz_tel2() {
		return biz_tel2;
	}
	public void setBiz_tel2(String biz_tel2) {
		this.biz_tel2 = biz_tel2;
	}
	public String getBiz_cell1() {
		return biz_cell1;
	}
	public void setBiz_cell1(String biz_cell1) {
		this.biz_cell1 = biz_cell1;
	}
	public String getBiz_fax1() {
		return biz_fax1;
	}
	public void setBiz_fax1(String biz_fax1) {
		this.biz_fax1 = biz_fax1;
	}
	public String getBiz_email1() {
		return biz_email1;
	}
	public void setBiz_email1(String biz_email1) {
		this.biz_email1 = biz_email1;
	}
	public String getBiz_email2() {
		return biz_email2;
	}
	public void setBiz_email2(String biz_email2) {
		this.biz_email2 = biz_email2;
	}
	
	@Override
	public String toString() {
		return "BusinessProfile [biz_id=" + biz_id + ", biz_no=" + biz_no + ", cp_firstname=" + cp_firstname
				+ ", cp_lastname=" + cp_lastname + ", cp_nickname=" + cp_nickname + ", cp_title=" + cp_title
				+ ", cp_showtype=" + cp_showtype + ", biz_offer=" + biz_offer + ", biz_competency=" + biz_competency
				+ ", loc_country=" + loc_country + ", loc_prov=" + loc_prov + ", loc_area=" + loc_area + ", loc_city="
				+ loc_city + ", loc_distriction=" + loc_distriction + ", loc_addr_line1=" + loc_addr_line1
				+ ", loc_addr_line2=" + loc_addr_line2 + ", loc_postalcode=" + loc_postalcode + ", loc_name=" + loc_name
				+ ", loc_desc=" + loc_desc + ", biz_tel1=" + biz_tel1 + ", biz_tel2=" + biz_tel2 + ", biz_cell1="
				+ biz_cell1 + ", biz_fax1=" + biz_fax1 + ", biz_email1=" + biz_email1 + ", biz_email2=" + biz_email2
				+ "]";
	}
	
}
