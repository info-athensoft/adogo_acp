package com.adogo.support.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adogo.support.dao.SupportDao;
import com.adogo.support.entity.Support;


/**
 * @author fz
 *
 */
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

	@Transactional
	public List<Support> getSupports() {
		return this.supportDao.getSupports();
	}

	public Support findSupportById(long supportId) {
		return this.supportDao.findSupportById(supportId);
	}
	

}
