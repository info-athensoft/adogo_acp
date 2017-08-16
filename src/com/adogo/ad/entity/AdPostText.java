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
	
	public AdPostText(AdPostBody adPostBody){
		this.globalId = adPostBody.getAdPostId();
		this.userId = adPostBody.getUserId();
		this.adPostId = adPostBody.getAdPostId();
		this.mediaCoverUrl = adPostBody.getMediaCoverUrl();
		this.isPrimary = adPostBody.getIsPrimary();
		this.mediaIndex = adPostBody.getMediaIndex();
		this.mediaType = adPostBody.getMediaType();
		this.langNo = adPostBody.getLangNo();
		this.sortNo = adPostBody.getSortNo();
		super.setMediaType(MediaTypeConst.TEXT);
	}

	public String getLongDesc() {
		return longDesc;
	}

	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}
	
	
	
	
}
