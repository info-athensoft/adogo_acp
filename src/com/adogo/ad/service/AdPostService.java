package com.adogo.ad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adogo.ad.dao.AdPostDao;
import com.adogo.ad.dao.AdPostHeadDao;
import com.adogo.ad.entity.AdPostAudio;
import com.adogo.ad.entity.AdPostCoverImage;
import com.adogo.ad.entity.AdPostHead;
import com.adogo.ad.entity.AdPostText;
import com.adogo.ad.entity.AdPostVideo;

@Service
public class AdPostService {
	
	private AdPostHeadDao adPostHeadDao;

	@Autowired
	@Qualifier("adPostHeadDaoJdbcImpl")
	public void setAdPostHeadDao(AdPostHeadDao adPostHeadDao) {
		this.adPostHeadDao = adPostHeadDao;
	}
	
	private AdPostDao adPostDao;
	
	@Autowired
	@Qualifier("adPostDaoJdbcImpl")
	public void setAdPostDao(AdPostDao adPostDao) {
		this.adPostDao = adPostDao;
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
	@Transactional
	public long create(AdPostCoverImage adPost) {
		return this.adPostDao.create(adPost);
	}

	public long create(AdPostText tContent) {
		return this.adPostDao.create(tContent);
	}

	public long create(AdPostVideo vContent) {
		return this.adPostDao.create(vContent);
	}

	public long create(AdPostAudio aContent) {
		return this.adPostDao.create(aContent);
	}
}

