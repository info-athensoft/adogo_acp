package com.adogo.advertiser.entity;

public class BusinessType {
	public final static int PROD = 1;
	public final static int EPROD = 2;
	public final static int SERVICE = 4;
	
	private static boolean boolProdType = false;
	private static boolean boolEProdType = false;
	private static boolean boolServiceType = false;
	
	private static int intProdType = 0;
	private static int intEProdType = 0;
	private static int intServiceType = 0;
	
	public static int intProdType(){
		return intProdType;
	}
	
	public static int intEProdType(){
		return intEProdType;
	}
	
	public static int intServiceType(){
		return intServiceType;
	}
	
	public static boolean isProdType(){
		return boolProdType;
	}
	
	public static boolean isEProdType(){
		return boolEProdType;
	}
	
	public static boolean isServiceType(){
		return boolServiceType;
	}
	
	public static void showBusinessType(){
		System.out.println("SERVICE"+"\tEPROD"+"\tPROD");
		System.out.println(BusinessType.isServiceType()+"\t"+BusinessType.isEProdType()+"\t"+BusinessType.isProdType());
		System.out.println(BusinessType.intServiceType()+"\t"+BusinessType.intEProdType()+"\t"+BusinessType.intProdType());
	}
	
	public static void parseBusinessTypeValue(Integer bizTypeValue){
		switch(bizTypeValue){
			case 1:
				boolProdType = true; 
				boolEProdType = false; 
				boolServiceType = false;
				intProdType = 1;
				intEProdType = 0;
				intServiceType = 0;
				break;
			case 2:
				boolProdType = false; 
				boolEProdType = true; 
				boolServiceType = false;
				intProdType = 0;
				intEProdType = 1;
				intServiceType = 0;
				break;
			case 3:
				boolProdType = true; 
				boolEProdType = true; 
				boolServiceType = false;
				intProdType = 1;
				intEProdType = 1;
				intServiceType = 0;
				break;
			case 4:
				boolProdType = false; 
				boolEProdType = false; 
				boolServiceType = true;
				intProdType = 0;
				intEProdType = 0;
				intServiceType = 1;
				break;
			case 5:
				boolProdType = true; 
				boolEProdType = false; 
				boolServiceType = true;
				intProdType = 1;
				intEProdType = 0;
				intServiceType = 1;
				break;
			case 6:
				boolProdType = false; 
				boolEProdType = true; 
				boolServiceType = true;
				intProdType = 0;
				intEProdType = 1;
				intServiceType = 1;
				break;
			case 7:
				boolProdType = true; 
				boolEProdType = true; 
				boolServiceType = true;
				intProdType = 1;
				intEProdType = 1;
				intServiceType = 1;
				break;
			default:
				boolProdType = false; 
				boolEProdType = false; 
				boolServiceType = false;
				intProdType = 0;
				intEProdType = 0;
				intServiceType = 0;
				break;
		}
	}
	
	public static void main(String[] args) {
		
		BusinessType.parseBusinessTypeValue(0);
		BusinessType.showBusinessType();
		
		BusinessType.parseBusinessTypeValue(1);
		BusinessType.showBusinessType();
		
		BusinessType.parseBusinessTypeValue(2);
		BusinessType.showBusinessType();
		
		BusinessType.parseBusinessTypeValue(3);
		BusinessType.showBusinessType();
		
		BusinessType.parseBusinessTypeValue(4);
		BusinessType.showBusinessType();
		
		BusinessType.parseBusinessTypeValue(5);
		BusinessType.showBusinessType();
		
		BusinessType.parseBusinessTypeValue(6);
		BusinessType.showBusinessType();
		
		BusinessType.parseBusinessTypeValue(7);
		BusinessType.showBusinessType();
		
		BusinessType.parseBusinessTypeValue(8);
		BusinessType.showBusinessType();
	}
}
