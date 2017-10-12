package com.adogo.admin.service;

import java.sql.Blob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adogo.admin.dao.TestEditorSfzDao;
import com.adogo.admin.entity.TestEditorSfz;


@Service
public class TestEditorSfzService {
	
	private TestEditorSfzDao testEditorSfzDao;

	@Autowired
	@Qualifier("testEditorSfzDaoJdbcImpl")
	public void setTestEditorSfzDao(TestEditorSfzDao testEditorSfzDao) {
		this.testEditorSfzDao = testEditorSfzDao;
	}
	
	@Transactional
	public int update(int id, String ltext) {
		return this.testEditorSfzDao.update(id, ltext);
	}
	
	@Transactional
	public int update(int id, Blob btext) {
		return this.testEditorSfzDao.update(id, btext);
	}
	
	@Transactional
	public int update(int id, String ltext, Blob btext) {
		return this.testEditorSfzDao.update(id, ltext, btext);
	}
	
	@Transactional
	public TestEditorSfz findById(int id) {
		return this.testEditorSfzDao.findById(id);
	}
}
