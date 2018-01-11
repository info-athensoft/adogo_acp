package com.adogo.advertiser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adogo.advertiser.dao.BoothDao;
import com.adogo.advertiser.dao.BoothImageDao;
import com.adogo.advertiser.dao.BoothTextDao;
import com.adogo.advertiser.dao.BusinessHoursDao;
import com.adogo.advertiser.entity.booth.Booth;
import com.adogo.advertiser.entity.booth.BoothImage;
import com.adogo.advertiser.entity.booth.BoothText;
import com.adogo.advertiser.entity.business.BusinessHours;

@Service
public class BoothService {
	private BoothDao boothDao;
	private BoothImageDao boothImageDao;
	private BusinessHoursDao businessHoursDao;
	private BoothTextDao boothTextDao;
	
	private BoothImageService boothImageService;
	
	@Autowired
	public void setBoothImageService(BoothImageService boothImageService) {
		this.boothImageService = boothImageService;
	}
	
	private BoothTextService boothTextService;
	
	@Autowired
	public void setBoothTextService(BoothTextService boothTextService) {
		this.boothTextService = boothTextService;
	}

	@Autowired
	@Qualifier("boothDaoJdbcImpl")
	public void setBoothDao(BoothDao boothDao) {
		this.boothDao = boothDao;
	}

	@Autowired
	@Qualifier("boothImageDaoJdbcImpl")
	public void setBoothImageDao(BoothImageDao boothImageDao) {
		this.boothImageDao = boothImageDao;
	}

	@Autowired
	@Qualifier("businessHoursDaoJdbcImpl")
	public void setBusinessHoursDao(BusinessHoursDao businessHoursDao) {
		this.businessHoursDao = businessHoursDao;
	}
	
	@Autowired
	@Qualifier("boothTextDaoJdbcImpl")
	public void setBoothTextDao(BoothTextDao boothTextDao) {
		this.boothTextDao = boothTextDao;
	}

	public List<Booth> getBoothByUserId(long userId){
		return boothDao.findBoothByUserId(userId);
	}
	
	public List<Booth> getBoothByAdvertiserId(long advertiserId){
		return boothDao.findBoothByAdvertiserId(advertiserId);
	}
	
	public List<Booth> getBoothByBizId(long bizId){
		return boothDao.findBoothByBizId(bizId);
	}
	
	public Booth getBoothByBoothId(long boothId){
		Booth booth = boothDao.findBoothByBoothId(boothId);
		BoothImage boothBanner = boothImageService.getBoothBannerByBoothId(boothId);
		BusinessHours businessHours = businessHoursDao.findByBoothId(boothId);
		List<BoothText> boothTextList = boothTextService.getBoothTextByBoothId(boothId);
		booth.setBoothBanner(boothBanner);
		booth.setBusinessHours(businessHours);
		booth.setBoothTextList(boothTextList);
		return booth;
	}
	
	@Transactional
	public void createBooth(Booth booth){
		boothDao.create(booth);
		boothImageDao.create(booth.getBoothBanner());
		businessHoursDao.create(booth.getBusinessHours());
		boothTextDao.createInBatch(booth.getBoothTextList());
	}
	
	@Transactional
	public void updateBooth(Booth booth){
		boothDao.update(booth);
		boothImageDao.update(booth.getBoothBanner());
		businessHoursDao.update(booth.getBusinessHours());
		boothTextDao.updateInBatch(booth.getBoothTextList());
	}
	
	public List<Booth> getSubListBoothByBizId(List<Booth> listBooth, long bizId){
		List<Booth> subListBooth = new ArrayList<Booth>();
		for(Booth booth: listBooth){
			if(booth.getBizId()==bizId){
				subListBooth.add(booth);
			}else{
				continue;
			}
		}
		return subListBooth;
	}
}
