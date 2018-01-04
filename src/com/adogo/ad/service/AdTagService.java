package com.adogo.ad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adogo.ad.dao.AdTagDao;
import com.adogo.advertiser.adpost.entity.AdTag;

@Service
public class AdTagService {
	
	private AdTagDao adTagDao;

	@Autowired
	@Qualifier("adTagDaoJdbcImpl")
	public void setAdPostDao(AdTagDao adTagDao) {
		this.adTagDao = adTagDao;
	}
	
	public AdTag findTagByName(String tagName) {
		return this.adTagDao.findTagByName(tagName);
	}

	@Transactional
	public int updateTag(String tagName) {
		return this.adTagDao.persistTag(tagName);
	}
	
	/**
	 * @param tagNameList
	 */
	public void updateTagList(String tagNameList) {
		tagNameList = tagNameList.replaceAll("^\"|\"$", "");
		String[] arrayTags = tagNameList.split(",");
		for (String tag : arrayTags) {
			this.updateTag(tag);
		}
	}
}
