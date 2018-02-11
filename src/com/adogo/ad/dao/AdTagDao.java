package com.adogo.ad.dao;

import com.adogo.advertiser.entity.adpost.old.AdTag;

public interface AdTagDao {
	
	/**
	 * @param tagName
	 * @return
	 */
	public AdTag findTagByName(String tagName);
	public int persistTag(String tagName);
}
