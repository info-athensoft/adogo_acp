package com.adogo.ad.dao;

import com.adogo.ad.entity.AdPostHead;

public interface AdPostHeaderDao {
	public AdPostHead findById(long globalId);
	public int saveTags(String adpostId, String tags);
}
