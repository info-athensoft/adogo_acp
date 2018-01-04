package com.adogo.advertiser.dao;

import java.util.List;

import com.adogo.advertiser.business.entity.BusinessOnlinePresence;

public interface BusinessOnlinePresenceDao {
	
	public List<BusinessOnlinePresence> findByBizId(long bizId);
	public int[] createInBatch(List<BusinessOnlinePresence> listBOP);
	public int[] updateInBatch(List<BusinessOnlinePresence> listBOP);
}
