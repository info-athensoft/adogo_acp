package com.adogo.advertiser.booth.entity;

import com.adogo.advertiser.entity.MediaType;

public class BoothBanner extends BoothImage{
	
	public BoothBanner(){
		super();
		super.mediaType = MediaType.BANNER_IMAGE;	
	}

	@Override
	public String toString() {
		return "BoothBanner [globalId=" + globalId + ", userId=" + userId + ", advetiserId=" + advertiserId + ", bizId="
				+ bizId + ", langNo=" + langNo + ", boothId=" + boothId + ", mediaUrl=" + mediaUrl + ", mediaType="
				+ mediaType + "]";
	}
	
}
