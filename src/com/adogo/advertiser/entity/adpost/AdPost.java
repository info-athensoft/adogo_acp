package com.adogo.advertiser.entity.adpost;

import java.util.ArrayList;
import java.util.List;

import com.adogo.advertiser.entity.adpost.old.AdPostAudio;
import com.adogo.advertiser.entity.adpost.old.AdPostCoverImage;
import com.adogo.advertiser.entity.adpost.old.AdPostGalleryImage;
import com.adogo.advertiser.entity.adpost.old.AdPostSlideImage;
import com.adogo.advertiser.entity.adpost.old.AdPostText;
import com.adogo.advertiser.entity.adpost.old.AdPostVideo;

public class AdPost {
	private AdPostHead adPostHead;
	private List<AdPostText> listAdPostText;
	private List<AdPostCoverImage> listAdPostCoverImage = new ArrayList<AdPostCoverImage>();
	private List<AdPostSlideImage> listAdPostSlideImage = new ArrayList<AdPostSlideImage>();
	private List<AdPostGalleryImage> listAdPostGalleryImage = new ArrayList<AdPostGalleryImage>();
	private List<AdPostAudio> listAdPostAudio = new ArrayList<AdPostAudio>();
	private List<AdPostVideo> listAdPostVideo = new ArrayList<AdPostVideo>();
}
