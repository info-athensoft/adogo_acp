package com.adogo.uaas.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adogo.uaas.dao.UserRoleDao;
import com.adogo.uaas.entity.Role;


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
		return userRoleDao.getRoleIdListByAcctId(acctId);
	}
	
	public boolean isVisitorUnderAccount(long acctId){
		boolean isRole = false;
		ArrayList<Integer> roleIdList = userRoleDao.getRoleIdListByAcctId(acctId);
		if(roleIdList.contains(Role.VISITOR)){
			isRole = true;
		}
		return isRole;
	}
	
	public boolean isAdvertiserUnderAccount(long acctId){
		boolean isRole = false;
		ArrayList<Integer> roleIdList = userRoleDao.getRoleIdListByAcctId(acctId);
		if(roleIdList.contains(Role.ADVERTISER)){
			isRole = true;
		}
		return isRole;
	}
	
	public boolean isDistributorUnderAccount(long acctId){
		boolean isRole = false;
		ArrayList<Integer> roleIdList = userRoleDao.getRoleIdListByAcctId(acctId);
		if(roleIdList.contains(Role.DISTRIBUTOR)){
			isRole = true;
	}
		return isRole;
	}
	
	public boolean isCooperatorUnderAccount(long acctId){
		boolean isRole = false;
		ArrayList<Integer> roleIdList = userRoleDao.getRoleIdListByAcctId(acctId);
		if(roleIdList.contains(Role.COOPERATOR)){
			isRole = true;
		}
		return isRole;
	}
	
	public boolean isAdminUnderAccount(long acctId){
		boolean isRole = false;
		ArrayList<Integer> roleIdList = userRoleDao.getRoleIdListByAcctId(acctId);
		if(roleIdList.contains(Role.ADMIN)){
			isRole = true;
		}
		return isRole;
	}
	
	
}
