package com.adogo.advertiser.entity;

public class BusinessStatus {
	public static final int CREATED = 1;		//created and not published yet
	public static final int ACTIVE = 2;			//created and published
	public static final int SUSPENDED = 3;		//suspended by admin or system
	public static final int BANNED = 4;			//banned by admin or system
	public static final int DISABLED = 5;		//disabled or trash by client
}
