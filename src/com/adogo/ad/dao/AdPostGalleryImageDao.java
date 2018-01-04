package com.adogo.ad.dao;

import java.util.List;

import com.adogo.advertiser.adpost.entity.AdPostGalleryImage;

public interface AdPostGalleryImageDao {
	public List<AdPostGalleryImage> findAll();
	
	public List<AdPostGalleryImage> findByAdPostId(String adPostId);
	
	public List<AdPostGalleryImage> findByAdPostId(Long adPostId);
	
	public Long findTotalCount();
	
	public AdPostGalleryImage findPrimary();
	
	
}
