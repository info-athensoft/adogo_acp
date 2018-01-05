package com.adogo.advertiser.dao;

import java.util.List;

import com.adogo.advertiser.booth.entity.BoothText;

public interface BoothTextDao {
		public List<BoothText> findByBoothId(long boothId);
		
		public int create(BoothText boothText);
		
		public int update(BoothText boothText);
}
