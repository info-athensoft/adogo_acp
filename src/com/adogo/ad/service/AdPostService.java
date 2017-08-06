package com.adogo.ad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adogo.ad.dao.AdPostDao;
import com.adogo.ad.entity.AdPost;

@Service
public class AdPostService {
	
	private AdPostDao adPostDao;

	@Autowired
	@Qualifier("adPostDaoJdbcImpl")
	public void setAdPostDao(AdPostDao adPostDao) {
		this.adPostDao = adPostDao;
	}
	
	public AdPost findById(long globalId) {
		return this.adPostDao.findById(globalId);
	}
	
	public int saveTags(String adpostId, String tags) {
		return this.adPostDao.saveTags(adpostId, tags);
	}

}
