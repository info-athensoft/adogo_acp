package com.adogo.advertiser.dao;

import java.util.List;

import com.adogo.advertiser.entity.IndustryCode;

public interface IndustryCodeDao {
	public List<IndustryCode> findAll();
	
	public List<IndustryCode> findByLevelNo(int levelNo);
	
	public List<IndustryCode> findByLevelNo(int levelNo, String industryCode);
	
	public List<IndustryCode> findLevelSelected(int levelNo, String industryCode);
	
	public List<IndustryCode> findByParentCode(String parentCode);
	
	public IndustryCode findByCode(String industryCode);
}
