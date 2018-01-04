package com.adogo.advertiser.vo;

import java.util.ArrayList;
import java.util.List;

import com.adogo.advertiser.booth.entity.Booth;
import com.adogo.advertiser.business.entity.BusinessProfile;

public class VOBizProfileBooth{
	
	/**
	 * 
	 */
	private BusinessProfile bizProfile;
	
	/**
	 * list of booth of bizId
	 */
	private List<Booth> listBooth = new ArrayList<Booth>();

	
	
	public BusinessProfile getBizProfile() {
		return bizProfile;
	}

	public void setBizProfile(BusinessProfile bizProfile) {
		this.bizProfile = bizProfile;
	}

	public List<Booth> getListBooth() {
		return listBooth;
	}

	public void setListBooth(List<Booth> listBooth) {
		this.listBooth = listBooth;
	}
}
