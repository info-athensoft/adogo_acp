package com.adogo.advertiser.business.entity;

public class BusinessStatus {
	public static final int CREATED = 1;		//created and not published yet
	public static final int PUBLISHED = 2;		//created and published
	public static final int DISABLED = 3;		//disabled by client
	public static final int TRASHED = 4;		//trashed by client
	public static final int SUSPENDED = 5;		//suspended by administrator or system
	public static final int BANNED = 6;			//banned by administrator or system
}
