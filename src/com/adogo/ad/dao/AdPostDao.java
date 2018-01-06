package com.adogo.ad.dao;

import com.adogo.advertiser.entity.adpost.AdPostAudio;
import com.adogo.advertiser.entity.adpost.AdPostCoverImage;
import com.adogo.advertiser.entity.adpost.AdPostGalleryImage;
import com.adogo.advertiser.entity.adpost.AdPostSlideImage;
import com.adogo.advertiser.entity.adpost.AdPostText;
import com.adogo.advertiser.entity.adpost.AdPostVideo;

public interface AdPostDao {

	public long create(AdPostCoverImage adPost);

	public long create(AdPostText tContent);

	public long create(AdPostVideo vContent);

	public long create(AdPostAudio aContent);

	public long create(AdPostSlideImage sImg);
	
	public long create(AdPostGalleryImage gImg);
	
	

}
