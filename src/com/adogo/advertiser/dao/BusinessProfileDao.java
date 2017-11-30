package com.adogo.advertiser.dao;

import com.adogo.advertiser.entity.BusinessProfile;

public interface BusinessProfileDao {
	public BusinessProfile getBusinessProfileByBizId(long bizId);
	public BusinessProfile getBusinessProfileByBizNo(long bizNo);
	
	public int update(BusinessProfile x);
	public int create(BusinessProfile x);
}
