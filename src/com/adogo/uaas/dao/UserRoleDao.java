package com.adogo.uaas.dao;

import java.util.ArrayList;

public interface UserRoleDao {
	
	public ArrayList<Integer> getRoleIdListByAcctId(long acctId);
	
}
