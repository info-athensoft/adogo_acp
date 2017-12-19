package com.adogo.advertiser.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.adogo.advertiser.entity.Address;

import test.shared.query.v2.Query;

@Component
@Qualifier("businessAddressDaoJdbcImpl")
public class BusinessAddressDaoJdbcImpl implements BusinessAddressDao {

	@Override
	public List<Address> findByBizId(long bizId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> findByQuery(Query query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int create(Address addr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Address addr) {
		// TODO Auto-generated method stub
		return 0;
	}

}
