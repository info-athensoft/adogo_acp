package com.adogo.support.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adogo.support.dao.SupportDao;
import com.adogo.support.entity.Support;


/**
 * @author sfz
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

	public List<Support> findAll() {
		return this.supportDao.findAll();
	}

	public Support findById(long supportId) {
		return this.supportDao.findById(supportId);
	}

	@Transactional
	public int create(Support support) {
		return this.supportDao.create(support);
	}

	@Transactional
	public int update(Support support) {
		return this.supportDao.update(support);
	}

}
