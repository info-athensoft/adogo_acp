package com.adogo.uaas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.adogo.uaas.dao.FunctionDao;
import com.adogo.uaas.entity.Function;

@Service
public class FunctionService {
	
	@Autowired
	@Qualifier("functionDaoJdbcImpl")
	private FunctionDao functionDao;

	public void setFunctionDao(FunctionDao functionDao) {
		this.functionDao = functionDao;
	}
	
	public List<Function> getAllFunctions(){
		return functionDao.findAll();
	}
}
