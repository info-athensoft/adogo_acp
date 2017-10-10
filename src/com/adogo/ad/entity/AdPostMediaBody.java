package com.adogo.ad.entity;

public class AdPostMediaBody extends AdPostBody{
	protected String mediaTitle;
	protected String mediaUrl;
	protected String mediaDesc;
	
	public AdPostMediaBody() {
		
	}
	
	public AdPostMediaBody(AdPostBody adPostBody) {
		this.globalId = adPostBody.getAdPostId();
		this.userId = adPostBody.getUserId();
		this.adPostId = adPostBody.getAdPostId();
		this.mediaCoverUrl = adPostBody.getMediaCoverUrl();
		this.isPrimary = adPostBody.getIsPrimary();
		this.mediaIndex = adPostBody.getMediaIndex();
		this.mediaType = adPostBody.getMediaType();
		this.langNo = adPostBody.getLangNo();
		this.sortNo = adPostBody.getSortNo();
	}
	
	public String getMediaTitle() {
		return mediaTitle;
	}
	public void setMediaTitle(String mediaTitle) {
		this.mediaTitle = mediaTitle;
	}
	public String getMediaDesc() {
		return mediaDesc;
	}
	public void setMediaDesc(String mediaDesc) {
		this.mediaDesc = mediaDesc;
	}
	public String getMediaUrl() {
		return mediaUrl;
	}
	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}

}
