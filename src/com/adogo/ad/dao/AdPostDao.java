package com.adogo.ad.dao;

import com.adogo.ad.entity.AdPostAudio;
import com.adogo.ad.entity.AdPostCoverImage;
import com.adogo.ad.entity.AdPostSlideImage;
import com.adogo.ad.entity.AdPostText;
import com.adogo.ad.entity.AdPostVideo;

public interface AdPostDao {

	long create(AdPostCoverImage adPost);

	long create(AdPostText tContent);

	long create(AdPostVideo vContent);

	long create(AdPostAudio aContent);

	long create(AdPostSlideImage sImg);


}
