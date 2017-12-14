package com.adogo.advertiser.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.adogo.advertiser.dao.BusinessProfileDao;
import com.adogo.advertiser.entity.BusinessProfile;

@Service
public class BusinessProfileService {
	
	private static final Logger logger = Logger.getLogger(BusinessProfileService.class);
	
	private BusinessProfileDao businessProfileDao;

	@Autowired
	@Qualifier("businessProfileDaoJdbcImpl")
	public void setBusinessProfileDao(BusinessProfileDao businessProfileDao) {
		this.businessProfileDao = businessProfileDao;
	}
	
	public List<BusinessProfile> getBusinessProfileByUserId(long userId){
		return businessProfileDao.getBusinessProfileByUserId(userId);
	}
	
	public List<BusinessProfile> getBusinessProfileByAdvertiserId(long advertiserId){
		return businessProfileDao.getBusinessProfileByAdvertiserId(advertiserId);
	}
	
	public BusinessProfile getBusinessProfileByBizId(long biz_id){
		return businessProfileDao.getBusinessProfileByBizId(biz_id);
	}
	
	public BusinessProfile getBusinessProfileByBizNo(String biz_no){
		return businessProfileDao.getBusinessProfileByBizNo(biz_no);
	}
	
	public void updateBusinessProfile(BusinessProfile bp){
		businessProfileDao.update(bp);
	}
	
	public void saveBusinessProfile(BusinessProfile bp){
		logger.info("enter saveBusinessProfile(BusinessProfile bp)");
		businessProfileDao.create(bp);
		logger.info("exit saveBusinessProfile(BusinessProfile bp)");
	}
}
