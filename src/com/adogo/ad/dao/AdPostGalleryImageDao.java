package com.adogo.ad.dao;

import java.util.List;

import com.adogo.advertiser.entity.adpost.AdPostGalleryImage;

public interface AdPostGalleryImageDao {
	public List<AdPostGalleryImage> findAll();
	
	public List<AdPostGalleryImage> findByAdPostId(String adPostId);
	
	public List<AdPostGalleryImage> findByAdPostId(Long adPostId);
	
	public Long findTotalCount();
	
	public AdPostGalleryImage findPrimary();
	
	
}
