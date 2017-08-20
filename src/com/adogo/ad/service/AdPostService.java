package com.adogo.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adogo.ad.dao.AdPostDao;
import com.adogo.ad.dao.AdPostHeadDao;
import com.adogo.ad.dao.AdPostTextDao;
import com.adogo.ad.entity.AdPostHead;
import com.adogo.ad.entity.AdPostText;

@Service
public class AdPostService {
	
	private AdPostDao adPostDao;
	
	@Autowired
	@Qualifier("adPostDaoJdbcImpl")
	public void setAdPostDao(AdPostDao adPostDao) {
		this.adPostDao = adPostDao;
	}
	
	private AdPostHeadDao adPostHeadDao;

	@Autowired
	@Qualifier("adPostHeadDaoJdbcImpl")
	public void setAdPostHeadDao(AdPostHeadDao adPostHeadDao) {
		this.adPostHeadDao = adPostHeadDao;
	}
	
	
	private AdPostTextDao adPostTextDao;

	@Autowired
	@Qualifier("adPostTextDaoJdbcImpl")
	public void setAdPostTextDao(AdPostTextDao adPostTextDao) {
		this.adPostTextDao = adPostTextDao;
	}
	
	
	
	/*master table*/
	public AdPostHead findById(long globalId) {
		return this.adPostHeadDao.findById(globalId);
	}
	
	public int saveTags(String adpostId, String tags) {
		return this.adPostHeadDao.saveTags(adpostId, tags);
	}

	@Transactional
	public long create(AdPostHead adPost) {
		return this.adPostHeadDao.create(adPost);
	}
	
	
	/*children tables*/
	public List<AdPostText> getListAdPostText(){
		return null;
	}
}

