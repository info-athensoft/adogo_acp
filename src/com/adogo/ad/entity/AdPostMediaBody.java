package com.adogo.ad.entity;

public class AdPostMediaBody extends AdPostBody{
	protected String mediaTitle;
	protected Integer mediaIndex;
	protected Boolean isPrimary = false;
	protected String mediaDesc;
	
	public String getMediaTitle() {
		return mediaTitle;
	}
	public void setMediaTitle(String mediaTitle) {
		this.mediaTitle = mediaTitle;
	}
	public Integer getMediaIndex() {
		return mediaIndex;
	}
	public void setMediaIndex(Integer mediaIndex) {
		this.mediaIndex = mediaIndex;
	}
	public Boolean getIsPrimary() {
		return isPrimary;
	}
	public void setIsPrimary(Boolean isPrimary) {
		this.isPrimary = isPrimary;
	}
	public String getMediaDesc() {
		return mediaDesc;
	}
	public void setMediaDesc(String mediaDesc) {
		this.mediaDesc = mediaDesc;
	}
	

}
