package com.adogo.advertiser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.adogo.advertiser.dao.BusinessAddressDao;
import com.adogo.advertiser.entity.BusinessAddress;

@Service
public class BusinessAddressService {
	
	private BusinessAddressDao businessAddressDao;
	
	@Autowired
	@Qualifier("businessAddressDaoJdbcImpl")
	public void setBusinessAddressDao(BusinessAddressDao businessAddressDao) {
		this.businessAddressDao = businessAddressDao;
	}
	
	
	/**
	 * get Headquarters address
	 * @param bizId
	 * @return
	 */
	public BusinessAddress getHQAddressByBizId(long bizId){
		BusinessAddress hqAddress = null;
		
		List<BusinessAddress> bizAddressList = new ArrayList<BusinessAddress>();
		bizAddressList = businessAddressDao.findByBizId(bizId);
		if(bizAddressList.size()>0){
			hqAddress = bizAddressList.get(0);
		}
		return hqAddress;
	}
	
	
	/**
	 * get all business addresses
	 * @param bizId
	 * @return
	 */
	public List<BusinessAddress> getBusinessAddressByBizId(long bizId){
		List<BusinessAddress> bizAddressList = new ArrayList<BusinessAddress>();
		bizAddressList = businessAddressDao.findByBizId(bizId);
		return bizAddressList;
	}

	public void updateBusinessAddress(BusinessAddress ba){
		businessAddressDao.update(ba);
	}
	
	public void createBusinessAddress(BusinessAddress ba){
		businessAddressDao.create(ba);
	}
	
}
