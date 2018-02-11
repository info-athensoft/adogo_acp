package com.adogo.ad.dao;

import com.adogo.advertiser.entity.adpost.old.AdPostAudio;
import com.adogo.advertiser.entity.adpost.old.AdPostCoverImage;
import com.adogo.advertiser.entity.adpost.old.AdPostGalleryImage;
import com.adogo.advertiser.entity.adpost.old.AdPostSlideImage;
import com.adogo.advertiser.entity.adpost.old.AdPostText;
import com.adogo.advertiser.entity.adpost.old.AdPostVideo;

public interface AdPostDao {

	public long create(AdPostCoverImage adPost);

	public long create(AdPostText tContent);

	public long create(AdPostVideo vContent);

	public long create(AdPostAudio aContent);

	public long create(AdPostSlideImage sImg);
	
	public long create(AdPostGalleryImage gImg);
	
	

}
