package com.adogo.advertiser.dao;

import java.util.List;

import com.adogo.advertiser.entity.BusinessOnlinePresence;

public interface BusinessOnlinePresenceDao {
	public int[] createInBatch(List<BusinessOnlinePresence> listBOP);
}
