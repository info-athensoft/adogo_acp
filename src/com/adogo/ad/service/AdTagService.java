package com.adogo.ad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adogo.ad.dao.AdPostDao;
import com.adogo.ad.dao.AdTagDao;
import com.adogo.ad.entity.AdPostHead;
import com.adogo.ad.entity.AdTag;

@Service
@Transactional
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
	
	public int updateTag(String tagName) {
		return this.adTagDao.persistTag(tagName);
	}
	
}
