package com.adogo.uaas.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adogo.uaas.dao.UserRoleDao;


@Service
public class UserRoleService {
	
	private UserRoleDao userRoleDao;

	@Autowired
	@Qualifier("userRoleDaoJdbcImpl")
	public void setUserRoleDao(UserRoleDao userRoleDao) {
		this.userRoleDao = userRoleDao;
	}
	
	@Transactional
	public ArrayList<Integer> getRoleIdListByAcctId(long acctId) {
		return this.userRoleDao.getRoleIdListByAcctId(acctId);
	}
	
	
}
