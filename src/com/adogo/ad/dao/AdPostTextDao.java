package com.adogo.ad.dao;

import java.util.List;

import com.adogo.ad.entity.AdPostText;

public interface AdPostTextDao {
	public List<AdPostText> findAll();
	
	public List<AdPostText> findByAdPostId(String adPostId);
	
	public List<AdPostText> findByAdPostId(Long adPostId);
	
	public AdPostText findPrimary();
	
	
}