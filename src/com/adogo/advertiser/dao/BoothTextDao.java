package com.adogo.advertiser.dao;

import java.util.List;

import com.adogo.advertiser.entity.booth.BoothText;

public interface BoothTextDao {
		public List<BoothText> findByBoothId(long boothId);
		
		public int create(BoothText boothText);
		
		public int update(BoothText boothText);
}
