package com.adogo.ad.dao;

import com.adogo.advertiser.adpost.entity.AdPostAudio;
import com.adogo.advertiser.adpost.entity.AdPostCoverImage;
import com.adogo.advertiser.adpost.entity.AdPostGalleryImage;
import com.adogo.advertiser.adpost.entity.AdPostSlideImage;
import com.adogo.advertiser.adpost.entity.AdPostText;
import com.adogo.advertiser.adpost.entity.AdPostVideo;

public interface AdPostDao {

	public long create(AdPostCoverImage adPost);

	public long create(AdPostText tContent);

	public long create(AdPostVideo vContent);

	public long create(AdPostAudio aContent);

	public long create(AdPostSlideImage sImg);
	
	public long create(AdPostGalleryImage gImg);
	
	

}
