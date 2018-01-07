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

@Service
public class BoothService {
	private BoothDao boothDao;
	private BoothImageDao boothImageDao;
	private BusinessHoursDao businessHoursDao;
	private BoothTextDao boothTextDao;
	
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
	@Qualifier("boothTextDaoDaoJdbcImpl")
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
		return boothDao.findBoothByBoothId(boothId);
	}
	
	@Transactional
	public void createBooth(Booth booth){
		boothDao.create(booth);
		boothImageDao.create(booth.getBoothBanner());
		businessHoursDao.create(booth.getBusinessHours());
		boothTextDao.createInBatch(booth.getBoothTextList());
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
