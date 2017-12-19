package com.adogo.advertiser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.adogo.advertiser.dao.BusinessAddressDao;
import com.adogo.advertiser.entity.Address;

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
	public Address getHQAddressByBizId(long bizId){
		Address hqAddress = null;
		
		List<Address> bizAddressList = new ArrayList<Address>();
		bizAddressList = businessAddressDao.findByBizId(bizId);
		if(bizAddressList.size()>0){
			hqAddress = bizAddressList.get(0);
		}
		return hqAddress;
	}
	
	
	/**
	 * get all business address
	 * @param bizId
	 * @return
	 */
	public List<Address> getAllAddressByBizId(long bizId){
		List<Address> bizAddressList = new ArrayList<Address>();
		bizAddressList = businessAddressDao.findByBizId(bizId);
		return bizAddressList;
	}


	
}
