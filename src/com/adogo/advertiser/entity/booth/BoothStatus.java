package com.adogo.advertiser.entity.booth;

/**
 * The definitions of Booth Status
 * @author Athens
 *
 */
public class BoothStatus {
	/**
	 * the CREATED status of booth
	 * Clients just created or edited their booths
	 */
	public static final int CREATED 	= 1;
	
	/**
	 * the PUBLISHED status of booth
	 * Clients just published their booths
	 */
	public static final int PUBLISHED 	= 2;
	
	/**
	 * the EXPIRED status of booth
	 * Clients' booths get normally expired on its expiration date
	 */
	public static final int EXPIRED 	= 3;
	
	/**
	 * the DISABLED status of booth
	 * Clients' manually disabled their booths, no matter the booth is in publishing or not. If their booth is still in publishing time, 
	 * they can switch their booth to PUBLISHED status.
	 */
	public static final int DISABLED 	= 4;
	
	/**
	 * the TRAHSED status of booth
	 * Clients manually trashed their booths, and once their booth is trashed successfully, they cannot see the trashed booth any more.
	 */
	public static final int TRAHSED 	= 5;
	
	/**
	 * the SUSPENED status of booth
	 * Clients' booths are under inspection by System or Administrators. Client has no privileges to switch this status to others.
	 * Clients can not take back the right of control until their booths have passed the inspection and get approved by System or Administrator.
	 */
	public static final int SUSPENED 	= 6;
	
	/**
	 * the BANNED status of booth
	 * Clients' booths are banned by System or Administrators. Client has no privileges to switch this status to others.
	 */
	public static final int BANNED 		= 7;
}
