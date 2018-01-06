package com.adogo.advertiser.dao;

import java.util.List;

import com.adogo.advertiser.entity.booth.BoothImage;

public interface BoothImageDao {
	
	public List<BoothImage> findByBoothId(long boothId);
	public List<BoothImage> findByBoothId(long boothId, int mediaType);
	
	public int create(BoothImage boothImage);
	public int update(BoothImage boothImage);
	
}
