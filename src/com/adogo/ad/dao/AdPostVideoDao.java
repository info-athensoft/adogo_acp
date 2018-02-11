package com.adogo.ad.dao;

import java.util.List;

import com.adogo.advertiser.entity.adpost.old.AdPostVideo;

public interface AdPostVideoDao {
	public List<AdPostVideo> findAll();
	
	public List<AdPostVideo> findByAdPostId(String adPostId);
	
	public List<AdPostVideo> findByAdPostId(Long adPostId);
	
	public Long findTotalCount();
	
	public AdPostVideo findPrimary();
	
	
}
