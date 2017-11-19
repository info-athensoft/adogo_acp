package com.adogo.ad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.adogo.ad.dao.BusinessHoursDao;
import com.adogo.ad.entity.BusinessHours;

@Service
public class BusinessHoursService {
	
	private BusinessHoursDao businessHoursDao;

	@Autowired
	@Qualifier("businessHoursDaoJdbcImpl")
	public void setBusinessHoursDao(BusinessHoursDao businessHoursDao) {
		this.businessHoursDao = businessHoursDao;
	}
	
	public BusinessHours findBusinessHoursByBusinessId(Long businessId) {
		return this.businessHoursDao.findBusinessHoursByBusinessId(businessId);
	}

	public int persistBusinessHours(BusinessHours businessHours) {
		return this.businessHoursDao.persistBusinessHours(businessHours);
	}
	

}
