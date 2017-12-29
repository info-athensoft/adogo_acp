package com.adogo.advertiser.dao;

import java.util.List;

import com.adogo.advertiser.entity.BusinessProfile;

public interface BusinessProfileDao {
	
	public List<BusinessProfile> getBusinessProfileByUserId(long userId);
	public List<BusinessProfile> getBusinessProfileByAdvertiserId(long advertiserId);
	public List<BusinessProfile> getBusinessProfileByAdvertiserId(long advertiserId, int bizStatus);
	
	
	public BusinessProfile getBusinessProfileByBizId(long bizId);
	public BusinessProfile getBusinessProfileByBizNo(String bizNo);
	
	public int update(BusinessProfile x);
	public int create(BusinessProfile x);
	
	/**
	 * update status of business profiles by specified status
	 * most common scenario is disable namely trash a business profile
	 * @param x usually updating BusinessProfile.bizStatus, BusinessProfile.modifyDate
	 * @return
	 */
	public int updateStatus(BusinessProfile x);
}
