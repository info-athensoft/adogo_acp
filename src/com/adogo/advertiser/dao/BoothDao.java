package com.adogo.advertiser.dao;

import java.util.List;

import com.adogo.advertiser.entity.Booth;

public interface BoothDao {
	public List<Booth> findBoothByUserId(long userId);
	public List<Booth> findBoothByAdvertiserId(long advertiserId);
	public List<Booth> findBoothByBizId(long bizId);
	
	public Booth findBoothByBoothId(long boothId);
	
	public int update(Booth x);
	public int create(Booth x);
}
