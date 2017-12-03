package com.adogo.advertiser.dao;

import com.adogo.advertiser.entity.BusinessHours;

public interface BusinessHoursDao {
	
	/**
	 * @param businessId
	 * @return
	 */
	public BusinessHours findBusinessHoursByBusinessId(Long businessId);
	public int persistBusinessHours(BusinessHours businessHours);
}
