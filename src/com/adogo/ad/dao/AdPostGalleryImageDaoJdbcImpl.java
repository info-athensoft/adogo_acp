package com.adogo.ad.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.adogo.ad.entity.AdPostGalleryImage;
import com.adogo.ad.entity.AdPostText;

@Component
@Qualifier("adPostGalleryImageDaoJdbcImpl")
public class AdPostGalleryImageDaoJdbcImpl implements AdPostGalleryImageDao {

	@Override
	public List<AdPostGalleryImage> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdPostGalleryImage> findByAdPostId(String adPostId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdPostGalleryImage> findByAdPostId(Long adPostId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdPostGalleryImage findPrimary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long findTotalCount() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
