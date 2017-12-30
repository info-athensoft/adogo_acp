package com.adogo.advertiser.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adogo.advertiser.dao.BusinessAddressDao;
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
	
	private BusinessAddressDao businessAddressDao;

	@Autowired
	@Qualifier("businessAddressDaoJdbcImpl")
	public void setBusinessAddressDao(BusinessAddressDao businessAddressDao) {
		this.businessAddressDao = businessAddressDao;
	}
	
	public List<BusinessProfile> getBusinessProfileByUserId(long userId){
		return businessProfileDao.getBusinessProfileByUserId(userId);
	}
	
	/**
	 * search all businesses by advertiserId
	 * @param advertiserId
	 * @return
	 */
	public List<BusinessProfile> getBusinessProfileByAdvertiserId(long advertiserId){
		return businessProfileDao.getBusinessProfileByAdvertiserId(advertiserId);
	}
	
	/**
	 * search businesses by advertiserId and bizStatus
	 * @param advertiserId
	 * @param bizStatus
	 * @return
	 */
	public List<BusinessProfile> getBusinessProfileByAdvertiserId(long advertiserId, int bizStatus){
		return businessProfileDao.getBusinessProfileByAdvertiserId(advertiserId, bizStatus);
	}
	
	public BusinessProfile getBusinessProfileByBizId(long biz_id){
		return businessProfileDao.getBusinessProfileByBizId(biz_id);
	}
	
	public BusinessProfile getBusinessProfileByBizNo(String biz_no){
		return businessProfileDao.getBusinessProfileByBizNo(biz_no);
	}
	
	@Transactional
	public void createBusinessProfile(BusinessProfile bp){
		logger.info("enter saveBusinessProfile(BusinessProfile bp)");
		businessProfileDao.create(bp);
		businessAddressDao.create(bp.getHqAddress());
		logger.info("exit saveBusinessProfile(BusinessProfile bp)");
	}
	
	public void updateBusinessProfile(BusinessProfile bp){
		businessProfileDao.update(bp);
	}
	
	public void publishBusinessProfile(BusinessProfile bp){
		businessProfileDao.updateStatus(bp);
	}
	
	public void disableBusinessProfile(BusinessProfile bp){
		businessProfileDao.updateStatus(bp);
	}
	
	public void trashBusinessProfile(BusinessProfile bp){
		businessProfileDao.updateStatus(bp);
	}
	
	
}
