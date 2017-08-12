package com.adogo.ad.entity;

public class AdPostCoverImage extends AdPostMediaBody{
	
	public AdPostCoverImage(){
		super.setMediaType(MediaTypeConst.COVER_IMAGE);
	}

	@Override
	public String toString() {
		return "AdPostCoverImage [mediaTitle=" + mediaTitle + ", mediaIndex=" + mediaIndex + ", isPrimary=" + isPrimary
				+ ", mediaDesc=" + mediaDesc + ", globalId=" + globalId + ", userId=" + userId + ", adPostId="
				+ adPostId + ", mediaCoverUrl=" + mediaCoverUrl + ", mediaType=" + mediaType + ", langNo=" + langNo
				+ ", sortNo=" + sortNo + "]";
	}
	
	
	
}
