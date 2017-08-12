package com.adogo.ad.entity;

public class AdPostGalleryImage extends AdPostMediaBody {
	
	public AdPostGalleryImage(){
		super.setMediaType(MediaTypeConst.GALLERY_IMAGE);
	}

	@Override
	public String toString() {
		return "AdPostGalleryImage [mediaTitle=" + mediaTitle + ", mediaIndex=" + mediaIndex + ", isPrimary="
				+ isPrimary + ", mediaDesc=" + mediaDesc + ", globalId=" + globalId + ", userId=" + userId
				+ ", adPostId=" + adPostId + ", mediaCoverUrl=" + mediaCoverUrl + ", mediaType=" + mediaType
				+ ", langNo=" + langNo + ", sortNo=" + sortNo + "]";
	}

	
}
