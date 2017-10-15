package com.adogo.ad.dao;

import java.util.List;

import com.adogo.ad.entity.AdPostHead;

public interface AdPostHeadDao {
	
	public List<AdPostHead> findAll();
	
	public AdPostHead findById(long globalId);
	
	public AdPostHead findByAdPostId(long adPostId);
	
	public Long findTotalCount();
	
	public int saveTags(String adpostId, String tags);
	
	public long create(AdPostHead adPost);
	
	public int update(AdPostHead adPost);
	
}
