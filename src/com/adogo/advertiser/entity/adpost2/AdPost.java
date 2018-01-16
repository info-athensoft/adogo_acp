package com.adogo.advertiser.entity.adpost2;

import java.util.ArrayList;
import java.util.List;

import com.adogo.advertiser.entity.adpost.AdPostAudio;
import com.adogo.advertiser.entity.adpost.AdPostCoverImage;
import com.adogo.advertiser.entity.adpost.AdPostGalleryImage;
import com.adogo.advertiser.entity.adpost.AdPostSlideImage;
import com.adogo.advertiser.entity.adpost.AdPostText;
import com.adogo.advertiser.entity.adpost.AdPostVideo;

public class AdPost {
	private AdPostHead adPostHead;
	private List<AdPostText> listAdPostText;
	private List<AdPostCoverImage> listAdPostCoverImage = new ArrayList<AdPostCoverImage>();
	private List<AdPostSlideImage> listAdPostSlideImage = new ArrayList<AdPostSlideImage>();
	private List<AdPostGalleryImage> listAdPostGalleryImage = new ArrayList<AdPostGalleryImage>();
	private List<AdPostAudio> listAdPostAudio = new ArrayList<AdPostAudio>();
	private List<AdPostVideo> listAdPostVideo = new ArrayList<AdPostVideo>();
}
