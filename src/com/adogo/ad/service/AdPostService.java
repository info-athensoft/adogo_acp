package com.adogo.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adogo.ad.dao.AdPostDao;
import com.adogo.ad.dao.AdPostHeadDao;
import com.adogo.ad.dao.AdPostTextDao;
import com.adogo.ad.entity.AdPostAudio;
import com.adogo.ad.entity.AdPostCoverImage;
import com.adogo.ad.entity.AdPostGalleryImage;
import com.adogo.ad.entity.AdPostHead;
import com.adogo.ad.entity.AdPostSlideImage;
import com.adogo.ad.entity.AdPostText;
import com.adogo.ad.entity.AdPostVideo;


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
	public List<AdPostHead> getAllAdPostHead() {
		return this.adPostHeadDao.findAll();
	}
	
	
	public AdPostHead getAdPostHeadById(long globalId) {
		return this.adPostHeadDao.findById(globalId);
	}
	
	public AdPostHead getAdPostHeadByAdPostId(long adPostId) {
		return this.adPostHeadDao.findByAdPostId(adPostId);
	}
	
	public Long getAdPostHeadCount() {
		return this.adPostHeadDao.findTotalCount();
	}
	
	public int saveTags(String adpostId, String tagNameList) {
		tagNameList = tagNameList.replaceAll("^\"|\"$", "");
		return this.adPostHeadDao.saveTags(adpostId, tagNameList);
	}

	@Transactional
	public long create(AdPostHead adPost) {
		return this.adPostHeadDao.create(adPost);
	}
	
	
	/*children tables*/

	public List<AdPostText> getListAdPostText(){
		return null;
	}
	
	
	@Transactional
	public long create(AdPostText contentObj) {
		long intFlag = 0L;
		if(contentObj.getLongDesc().isEmpty()){
			return this.adPostDao.create(contentObj);
		}
		return intFlag;
	}
	
	@Transactional
	public long create(AdPostCoverImage contentObj) {
		long intFlag = 0L;
		if(contentObj.getMediaUrl().isEmpty()){
			intFlag = this.adPostDao.create(contentObj);
		}
		return intFlag;
	}


	@Transactional
	public long create(AdPostVideo contentObj) {
		long intFlag = 0L;
		if(contentObj.getMediaUrl().isEmpty()){
			return this.adPostDao.create(contentObj);
		}
		return intFlag;
	}

	@Transactional
	public long create(AdPostAudio contentObj) {
		long intFlag = 0L;
		if(contentObj.getMediaUrl().isEmpty()){
			return this.adPostDao.create(contentObj);
		}
		return intFlag;
	}

	@Transactional
	public long create(AdPostSlideImage contentObj) {
		long intFlag = 0L;
		if(contentObj.getMediaUrl().isEmpty()){
			return this.adPostDao.create(contentObj);
		}
		return intFlag;
	}
	
	@Transactional
	public long create(AdPostGalleryImage contentObj) {
		long intFlag = 0L;
		if(contentObj.getMediaUrl().isEmpty()){
			return this.adPostDao.create(contentObj);
		}
		return intFlag;
	}
}

