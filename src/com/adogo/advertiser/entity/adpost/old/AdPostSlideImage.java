package com.adogo.advertiser.entity.adpost.old;

import com.adogo.advertiser.entity.MediaType;

public class AdPostSlideImage extends AdPostMediaBody {
	
	public AdPostSlideImage(){
		super.setMediaType(MediaType.SLIDE_IMAGE);
	}
	
	public AdPostSlideImage(AdPostMediaBody adPostMediaBody){
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
		super.setMediaType(MediaType.SLIDE_IMAGE);
	}

	@Override
	public String toString() {
		return "AdPostSlideImage [mediaTitle=" + mediaTitle + ", mediaIndex=" + mediaIndex + ", isPrimary=" + isPrimary
				+ ", mediaDesc=" + mediaDesc + ", globalId=" + globalId + ", userId=" + userId + ", adPostId="
				+ adPostId + ", mediaCoverUrl=" + mediaCoverUrl + ", mediaType=" + mediaType + ", langNo=" + langNo
				+ ", sortNo=" + sortNo + "]";
	}
	
	
}
