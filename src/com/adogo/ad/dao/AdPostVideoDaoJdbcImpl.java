package com.adogo.ad.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.adogo.ad.entity.AdPostVideo;

@Component
@Qualifier("adPostVideoDaoJdbcImpl")
public class AdPostVideoDaoJdbcImpl implements AdPostVideoDao {

	@Override
	public List<AdPostVideo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdPostVideo> findByAdPostId(String adPostId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdPostVideo> findByAdPostId(Long adPostId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdPostVideo findPrimary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long findTotalCount() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
