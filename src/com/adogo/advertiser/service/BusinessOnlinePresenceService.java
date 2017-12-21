package com.adogo.advertiser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.adogo.advertiser.dao.BusinessOnlinePresenceDao;
import com.adogo.advertiser.entity.BusinessOnlinePresence;

@Service
public class BusinessOnlinePresenceService {
	
	private BusinessOnlinePresenceDao businessOnlinePresenceDao;
	
	@Autowired
	@Qualifier("businessOnlinePresenceDaoJdbcImpl")
	public void setBusinessOnlinePresenceDao(BusinessOnlinePresenceDao businessOnlinePresenceDao) {
		this.businessOnlinePresenceDao = businessOnlinePresenceDao;
	}
	
	public int[] saveBusinessOnlinePresence(List<BusinessOnlinePresence> bizOnlinePresenceList){
		return businessOnlinePresenceDao.createInBatch(bizOnlinePresenceList);
	}
}
