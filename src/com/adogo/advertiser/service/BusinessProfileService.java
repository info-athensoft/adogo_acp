package com.adogo.advertiser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.adogo.advertiser.dao.BusinessProfileDao;
import com.adogo.advertiser.entity.BusinessProfile;

@Service
public class BusinessProfileService {

	private BusinessProfileDao businessProfileDao;

	@Autowired
	@Qualifier("businessProfileDaoJdbcImpl")
	public void setBusinessProfileDao(BusinessProfileDao businessProfileDao) {
		this.businessProfileDao = businessProfileDao;
	}
	
	public BusinessProfile getBusinessProfileByBizId(int biz_id){
		return businessProfileDao.getBusinessProfileByBizId(biz_id);
	}
	
	public BusinessProfile getBusinessProfileByBizNo(int biz_no){
		return businessProfileDao.getBusinessProfileByBizNo(biz_no);
	}
	
	public void updateBusinessProfile(BusinessProfile bp){
		businessProfileDao.update(bp);
	}
	
	public void saveBusinessProfile(BusinessProfile bp){
		businessProfileDao.create(bp);
	}
}
