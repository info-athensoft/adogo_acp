package com.adogo.advertiser.dao;

import java.util.List;

import com.adogo.advertiser.entity.Address;

import test.shared.query.v2.Query;

public interface BusinessAddressDao {
	
	public List<Address> findByBizId(long bizId);
	public List<Address> findByQuery(Query query);
	
	
	public int create(Address addr);
	public int update(Address addr);
}
