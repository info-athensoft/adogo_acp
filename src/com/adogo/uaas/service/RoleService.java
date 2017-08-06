package com.adogo.uaas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.adogo.uaas.dao.RoleDao;
import com.adogo.uaas.entity.Role;


@Service
public class RoleService {
	
	@Autowired
	@Qualifier("roleDaoJdbcImpl")
	private RoleDao roleDao;

	public void setNewsDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}
	
	public List<Role> getAllRoles(){
		return roleDao.findAll();
	}
}
