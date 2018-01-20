package com.adogo.support.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adogo.support.dao.SupportDao;
import com.adogo.support.entity.Support;


@Service
public class SupportService {
	
	private SupportDao supportDao;
	
	@Autowired
	@Qualifier("supportDaoJdbcImpl")
	public void setSupportDao(SupportDao supportDao) {
		this.supportDao = supportDao;
	}	

	@Transactional
	public int create(Support support) {
		return this.supportDao.create(support);
	}
	

}
