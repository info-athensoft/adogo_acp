package com.adogo.ad.dao;

import com.adogo.ad.entity.AdPost;

public interface AdPostDao {
	public AdPost findById(long globalId);
	public int saveTags(String adpostId, String tags);
}
