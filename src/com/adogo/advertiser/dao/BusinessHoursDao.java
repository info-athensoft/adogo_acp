package com.adogo.advertiser.dao;

import com.adogo.advertiser.entity.business.BusinessHours;

public interface BusinessHoursDao {
	
	/**
	 * @param businessId
	 * @return
	 */
	public BusinessHours findBusinessHoursByBusinessId(Long businessId);
	public BusinessHours findByBoothId(Long boothId);
	public int persistBusinessHours(BusinessHours businessHours);
	
	public int create(BusinessHours businessHours);
	public int update(BusinessHours businessHours);
}
