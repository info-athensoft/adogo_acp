package com.adogo.advertiser.dao;

import java.util.List;

import com.adogo.advertiser.entity.Booth;

public interface BoothDao {
	public List<Booth> findBoothByBizId(long bizId);
}
