package com.adogo.uaas.dao;

import java.util.List;

import com.adogo.uaas.entity.UserAccount;

public interface UserAccountDao {
	public List<UserAccount> find();
	public UserAccount findById(long acctId);
	
	public long create(UserAccount userAccount);
	public void update(UserAccount userAccount);
	public void delete();
	
	//business query
	public UserAccount querySignin(UserAccount userAccount);
	public void activateAccount(UserAccount userAccount);
}
