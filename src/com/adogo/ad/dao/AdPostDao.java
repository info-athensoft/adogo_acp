package com.adogo.ad.dao;

import com.adogo.ad.entity.AdPostAudio;
import com.adogo.ad.entity.AdPostCoverImage;
import com.adogo.ad.entity.AdPostGalleryImage;
import com.adogo.ad.entity.AdPostSlideImage;
import com.adogo.ad.entity.AdPostText;
import com.adogo.ad.entity.AdPostVideo;

public interface AdPostDao {

	public long create(AdPostCoverImage adPost);

	public long create(AdPostText tContent);

	public long create(AdPostVideo vContent);

	public long create(AdPostAudio aContent);

	public long create(AdPostSlideImage sImg);
	
	public long create(AdPostGalleryImage gImg);
	
	

}
