package com.adogo.advertiser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.adogo.advertiser.dao.BusinessOnlinePresenceDao;
import com.adogo.advertiser.entity.business.BusinessOnlinePresence;

@Service
public class BusinessOnlinePresenceService {
	
	private BusinessOnlinePresenceDao businessOnlinePresenceDao;
	
	@Autowired
	@Qualifier("businessOnlinePresenceDaoJdbcImpl")
	public void setBusinessOnlinePresenceDao(BusinessOnlinePresenceDao businessOnlinePresenceDao) {
		this.businessOnlinePresenceDao = businessOnlinePresenceDao;
	}
	
	public List<BusinessOnlinePresence> getBusinessPresenceByBizId(long bizId){
		return businessOnlinePresenceDao.findByBizId(bizId);
	}
	
	public int[] createBusinessOnlinePresence(List<BusinessOnlinePresence> bizOnlinePresenceList){
		return businessOnlinePresenceDao.createInBatch(bizOnlinePresenceList);
	}
	
	public int[] updateBusinessOnlinePresence(List<BusinessOnlinePresence> bizOnlinePresenceList){
		return businessOnlinePresenceDao.updateInBatch(bizOnlinePresenceList);
	}
	
}
