package com.adogo.ad.dao;

import com.adogo.ad.entity.AdTag;

public interface AdTagDao {
	
	public AdTag findTagByName(String tagName);
	public int updateTag(String tagName);
}
