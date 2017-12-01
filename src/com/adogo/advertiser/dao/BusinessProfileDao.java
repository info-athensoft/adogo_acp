package com.adogo.advertiser.dao;

import java.util.List;

import com.adogo.advertiser.entity.BusinessProfile;

public interface BusinessProfileDao {
	
	public List<BusinessProfile> getBusinessProfileByUserId(long userId);
	public List<BusinessProfile> getBusinessProfileByAdvertiserId(long advertiserId);
	
	public BusinessProfile getBusinessProfileByBizId(long bizId);
	public BusinessProfile getBusinessProfileByBizNo(String bizNo);
	
	public int update(BusinessProfile x);
	public int create(BusinessProfile x);
}
