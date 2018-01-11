package com.adogo.advertiser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.adogo.advertiser.dao.BoothTextDao;
import com.adogo.advertiser.entity.booth.BoothText;

@Service
public class BoothTextService {
	
	
	private BoothTextDao boothTextDao;
	
	@Autowired
	@Qualifier("boothTextDaoJdbcImpl")
	public void setBoothTextDao(BoothTextDao boothTextDao) {
		this.boothTextDao = boothTextDao;
	}

	public List<BoothText> getBoothTextByBoothId(Long boothId){
		return boothTextDao.findByBoothId(boothId);
	}
}
