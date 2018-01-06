package com.adogo.ad.dao;

import java.util.List;

import com.adogo.advertiser.entity.adpost.AdPostText;

public interface AdPostTextDao {
	public List<AdPostText> findAll();
	
	public List<AdPostText> findByAdPostId(String adPostId);
	
	public List<AdPostText> findByAdPostId(Long adPostId);
	
	public AdPostText findPrimary();
	
	public Long findTotalCount();
	
	
}
