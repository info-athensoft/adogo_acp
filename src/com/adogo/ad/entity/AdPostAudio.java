package com.adogo.ad.entity;

public class AdPostAudio extends AdPostMediaBody {
	//private String mediaTitle;
	private Integer mediaIndex;
	private Boolean isPrimary;
	//private String mediaDesc;
	
	public AdPostAudio(){
		super.setMediaType(MediaTypeConst.AUDIO);
	}
	
	public AdPostAudio(AdPostMediaBody adPostMediaBody){
		this.globalId = adPostMediaBody.getAdPostId();
		this.userId = adPostMediaBody.getUserId();
		this.adPostId = adPostMediaBody.getAdPostId();
		this.mediaCoverUrl = adPostMediaBody.getMediaCoverUrl();
		this.isPrimary = adPostMediaBody.getIsPrimary();
		this.mediaIndex = adPostMediaBody.getMediaIndex();
		this.mediaType = adPostMediaBody.getMediaType();
		this.langNo = adPostMediaBody.getLangNo();
		this.sortNo = adPostMediaBody.getSortNo();
		this.mediaTitle = adPostMediaBody.getMediaTitle();
		this.mediaUrl = adPostMediaBody.getMediaUrl();
		this.mediaDesc = adPostMediaBody.getMediaDesc();
		super.setMediaType(MediaTypeConst.AUDIO);
	}
	
	/* public String getMediaTitle() {
		return mediaTitle;
	}
	public void setMediaTitle(String mediaTitle) {
		this.mediaTitle = mediaTitle;
	} */
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
	/* public String getMediaDesc() {
		return mediaDesc;
	}
	public void setMediaDesc(String mediaDesc) {
		this.mediaDesc = mediaDesc;
	}
*/	
}	
