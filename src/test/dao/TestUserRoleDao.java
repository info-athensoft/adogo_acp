package test.dao;

import java.util.ArrayList;

public interface TestUserRoleDao {
	
	public ArrayList<Integer> getRoleIdListByAcctId(long acctId);
	
}
