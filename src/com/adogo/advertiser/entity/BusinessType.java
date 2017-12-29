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
	
	public int intProdType(){
		return intProdType;
	}
	
	public int intEProdType(){
		return intEProdType;
	}
	
	public int intServiceType(){
		return intServiceType;
	}
	
	public boolean isProdType(){
		return boolProdType;
	}
	
	public boolean isEProdType(){
		return boolEProdType;
	}
	
	public boolean isServiceType(){
		return boolServiceType;
	}
	
	public void showBusinessType(){
		System.out.println("SERVICE"+"\tEPROD"+"\tPROD");
		System.out.println(this.isServiceType()+"\t"+this.isEProdType()+"\t"+this.isProdType());
		System.out.println(this.intServiceType()+"\t"+this.intEProdType()+"\t"+this.intProdType());
	}
	
	public void parseBusinessTypeValue(Integer bizTypeValue){
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
		
		
	}
}
