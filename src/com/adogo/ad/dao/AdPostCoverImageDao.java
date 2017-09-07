package com.adogo.ad.dao;

import java.util.List;

import com.adogo.ad.entity.AdPostCoverImage;

public interface AdPostCoverImageDao {
	public List<AdPostCoverImage> findAll();
	
	public List<AdPostCoverImage> findByAdPostId(String adPostId);
	
	public List<AdPostCoverImage> findByAdPostId(Long adPostId);
	
	public Long findTotalCount();
	
	public AdPostCoverImage findPrimary();
	
	
}
