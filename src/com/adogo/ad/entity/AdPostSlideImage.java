package com.adogo.ad.entity;

public class AdPostSlideImage extends AdPostMediaBody {
	
	public AdPostSlideImage(){
		super.setMediaType(MediaTypeConst.SLIDE_IMAGE);
	}

	@Override
	public String toString() {
		return "AdPostSlideImage [mediaTitle=" + mediaTitle + ", mediaIndex=" + mediaIndex + ", isPrimary=" + isPrimary
				+ ", mediaDesc=" + mediaDesc + ", globalId=" + globalId + ", userId=" + userId + ", adPostId="
				+ adPostId + ", mediaCoverUrl=" + mediaCoverUrl + ", mediaType=" + mediaType + ", langNo=" + langNo
				+ ", sortNo=" + sortNo + "]";
	}
	
	
}
