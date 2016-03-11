package com.adogo.admin.dao;

import com.adogo.admin.entity.BusinessProfile;

public interface BusinessProfileDao {
	public BusinessProfile getBusinessProfileByBizId(int biz_id);
	public BusinessProfile getBusinessProfileByBizNo(int biz_no);
	
	public int update(BusinessProfile bp);
}
