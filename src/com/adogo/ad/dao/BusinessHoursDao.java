package com.adogo.ad.dao;

import com.adogo.ad.entity.BusinessHours;

public interface BusinessHoursDao {
	
	/**
	 * @param businessId
	 * @return
	 */
	public BusinessHours findBusinessHoursByBusinessId(Long businessId);
	public int persistBusinessHours(BusinessHours businessHours);
}
