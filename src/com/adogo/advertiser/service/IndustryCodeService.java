package com.adogo.advertiser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.adogo.advertiser.dao.IndustryCodeDao;
import com.adogo.advertiser.entity.IndustryCode;

@Service
public class IndustryCodeService {
	private IndustryCodeDao industryCodeDao;
	
	@Autowired
	@Qualifier("industryCodeDaoJDBCImpl")
	public void setIndustryCodeDao(IndustryCodeDao industryCodeDao) {
		this.industryCodeDao = industryCodeDao;
	}
	
	public List<IndustryCode> getAllIndustryCode(){
		List<IndustryCode> list = new ArrayList<IndustryCode>();
		list = industryCodeDao.findAll();
		return list;
	}
	
	public List<IndustryCode> getIndustryCodeByLevelNo(int levelNo){
		List<IndustryCode> list = new ArrayList<IndustryCode>();
		list = industryCodeDao.findByLevelNo(levelNo);
		return list;
	}
	
	public List<IndustryCode> getIndustryCodeByLevelNo(int levelNo, String industryCode){
		List<IndustryCode> list = new ArrayList<IndustryCode>();
		list = industryCodeDao.findByLevelNo(levelNo, industryCode);
		return list;
	}
	
	public List<IndustryCode> getIndustryCodeByParentCode(String parentCode){
		List<IndustryCode> list = new ArrayList<IndustryCode>();
		list = industryCodeDao.findByParentCode(parentCode);
		return list;
	}
}
