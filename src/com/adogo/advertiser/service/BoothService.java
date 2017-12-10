package com.adogo.advertiser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.adogo.advertiser.dao.BoothDao;
import com.adogo.advertiser.entity.Booth;

@Service
public class BoothService {
	private BoothDao boothDao;

	@Autowired
	@Qualifier("boothDaoJdbcImpl")
	public void setBoothDao(BoothDao boothDao) {
		this.boothDao = boothDao;
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
	
	public void createBooth(Booth booth){
		boothDao.create(booth);
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
