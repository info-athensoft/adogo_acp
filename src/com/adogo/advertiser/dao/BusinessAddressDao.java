package com.adogo.advertiser.dao;

import java.util.List;

import com.adogo.advertiser.entity.BusinessAddress;
import com.athensoft.util.sql.Query;

public interface BusinessAddressDao {
	
	public List<BusinessAddress> findByBizId(long bizId);
	public List<BusinessAddress> findByQuery(Query query);
	
	
	public int create(BusinessAddress addr);
	public int update(BusinessAddress addr);
}
