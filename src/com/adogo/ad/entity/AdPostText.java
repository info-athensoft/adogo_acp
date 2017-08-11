package com.adogo.ad.entity;

/**
 * @author Athens
 *
 */
public class AdPostText extends AdPostBody{
	private String longDesc;
	
	public AdPostText(){
		super.setMediaType(MediaTypeConst.TEXT);
	}

	public String getLongDesc() {
		return longDesc;
	}

	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}
	
	
	
	
}
