package com.adogo.ad.dao;

import com.adogo.ad.entity.AdPostHead;

public interface AdPostHeadDao {
	public AdPostHead findById(long globalId);
	public int saveTags(String adpostId, String tags);
	public long create(AdPostHead adPost);
	public int update(AdPostHead adPost);
}
