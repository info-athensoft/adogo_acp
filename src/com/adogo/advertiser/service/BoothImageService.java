package com.adogo.advertiser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.adogo.advertiser.dao.BoothImageDao;
import com.adogo.advertiser.entity.MediaType;
import com.adogo.advertiser.entity.booth.BoothImage;

@Service
public class BoothImageService {
	private BoothImageDao boothImageDao;

	@Autowired
	@Qualifier("boothImageDaoJdbcImpl")
	public void setBoothImageDao(BoothImageDao boothImageDao) {
		this.boothImageDao = boothImageDao;
	}
	
	public BoothImage getBoothBannerByBoothId(long boothId){
		BoothImage boothBanner = null;
		
		List<BoothImage> boothImageList = boothImageDao.findByBoothId(boothId, MediaType.BANNER_IMAGE);
		
		if(boothImageList.size()>0){
			boothBanner = boothImageList.get(0);
		}
		return boothBanner;
	}
	
	public void createBoothImage(BoothImage boothImage){
		
	}
}
