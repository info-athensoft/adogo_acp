package test.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import test.dao.TestUserRoleDao;


@Service
public class TestUserRoleService {
	
	private TestUserRoleDao testUserRoleDao;

	@Autowired
	@Qualifier("testUserRoleDaoJdbcImpl")
	public void setTestUserRoleDao(TestUserRoleDao testUserRoleDao) {
		this.testUserRoleDao = testUserRoleDao;
	}
	
	@Transactional
	public ArrayList<Integer> getRoleIdListByAcctId(long acctId) {
		return this.testUserRoleDao.getRoleIdListByAcctId(acctId);
	}
	
	
}
