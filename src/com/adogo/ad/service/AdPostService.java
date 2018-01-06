package com.adogo.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adogo.ad.dao.AdPostAudioDao;
import com.adogo.ad.dao.AdPostCoverImageDao;
import com.adogo.ad.dao.AdPostDao;
import com.adogo.ad.dao.AdPostGalleryImageDao;
import com.adogo.ad.dao.AdPostHeadDao;
import com.adogo.ad.dao.AdPostTextDao;
import com.adogo.ad.dao.AdPostVideoDao;
import com.adogo.advertiser.entity.adpost.AdPostAudio;
import com.adogo.advertiser.entity.adpost.AdPostCoverImage;
import com.adogo.advertiser.entity.adpost.AdPostGalleryImage;
import com.adogo.advertiser.entity.adpost.AdPostHead;
import com.adogo.advertiser.entity.adpost.AdPostSlideImage;
import com.adogo.advertiser.entity.adpost.AdPostText;
import com.adogo.advertiser.entity.adpost.AdPostVideo;


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
	
	private AdPostCoverImageDao adPostCoverImageDao;

	@Autowired
	@Qualifier("adPostCoverImageDaoJdbcImpl")
	public void setAdPostCoverImageDao(AdPostCoverImageDao adPostCoverImageDao) {
		this.adPostCoverImageDao = adPostCoverImageDao;
	}
	
	private AdPostGalleryImageDao adPostGalleryImageDao;

	@Autowired
	@Qualifier("adPostGalleryImageDaoJdbcImpl")
	public void setAdPostGalleryImageDao(AdPostGalleryImageDao adPostGalleryImageDao) {
		this.adPostGalleryImageDao = adPostGalleryImageDao;
	}
	
	private AdPostAudioDao adPostAudioDao;

	@Autowired
	@Qualifier("adPostAudioDaoJdbcImpl")
	public void setAdPostAudioDao(AdPostAudioDao adPostAudioDao) {
		this.adPostAudioDao = adPostAudioDao;
	}
	
	private AdPostVideoDao adPostVideoDao;

	@Autowired
	@Qualifier("adPostVideoDaoJdbcImpl")
	public void setAdPostVideoDao(AdPostVideoDao adPostVideoDao) {
		this.adPostVideoDao = adPostVideoDao;
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

	public List<AdPostText> getAdPostTextByAdPostId(Long adPostId){
		return this.adPostTextDao.findByAdPostId(adPostId);
	}
	
	public List<AdPostCoverImage> getAdPostCoverImageByAdPostId(Long adPostId){
		return this.adPostCoverImageDao.findByAdPostId(adPostId);
	}
	
	public Long getAdPostCoverImageCount() {
		return this.adPostCoverImageDao.findTotalCount();
	}
	
	public List<AdPostAudio> getAdPostAudioByAdPostId(Long adPostId){
		return this.adPostAudioDao.findByAdPostId(adPostId);
	}
	
	public List<AdPostVideo> getAdPostVideoByAdPostId(Long adPostId){
		return this.adPostVideoDao.findByAdPostId(adPostId);
	}
	
	public List<AdPostGalleryImage> getAdPostGalleryImageByAdPostId(Long adPostId){
		return this.adPostGalleryImageDao.findByAdPostId(adPostId);
	}
	
	@Transactional
	public long create(AdPostText contentObj) {
		long intFlag = 0L;
		if(!contentObj.getLongDesc().isEmpty()){
			return this.adPostDao.create(contentObj);
		}
		return intFlag;
	}
	
	@Transactional
	public long create(AdPostCoverImage contentObj) {
		long intFlag = 0L;
		if(!contentObj.getMediaUrl().isEmpty()){
			intFlag = this.adPostDao.create(contentObj);
		}
		return intFlag;
	}


	@Transactional
	public long create(AdPostVideo contentObj) {
		long intFlag = 0L;
		if(!contentObj.getMediaUrl().isEmpty()){
			return this.adPostDao.create(contentObj);
		}
		return intFlag;
	}

	@Transactional
	public long create(AdPostAudio contentObj) {
		long intFlag = 0L;
		if(!contentObj.getMediaUrl().isEmpty()){
			return this.adPostDao.create(contentObj);
		}
		return intFlag;
	}

	@Transactional
	public long create(AdPostSlideImage contentObj) {
		long intFlag = 0L;
		if(!contentObj.getMediaUrl().isEmpty()){
			return this.adPostDao.create(contentObj);
		}
		return intFlag;
	}
	
	@Transactional
	public long create(AdPostGalleryImage contentObj) {
		long intFlag = 0L;
		if(!contentObj.getMediaUrl().isEmpty()){
			return this.adPostDao.create(contentObj);
		}
		return intFlag;
	}
}
