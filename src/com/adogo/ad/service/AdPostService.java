package com.adogo.ad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adogo.ad.dao.AdPostHeadDao;
import com.adogo.ad.entity.AdPostHead;

@Service
public class AdPostService {
	
	private AdPostHeadDao adPostDao;

	@Autowired
	@Qualifier("adPostDaoJdbcImpl")
	public void setAdPostDao(AdPostHeadDao adPostDao) {
		this.adPostDao = adPostDao;
	}
	
	public AdPostHead findById(long globalId) {
		return this.adPostDao.findById(globalId);
	}
	
	public int saveTags(String adpostId, String tags) {
		return this.adPostDao.saveTags(adpostId, tags);
	}

	@Transactional
	public long create(AdPostHead adPost) {
		return this.adPostDao.create(adPost);
	}
}

