package com.adogo.ad.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.adogo.ad.entity.AdPostText;

@Component
@Qualifier("adPostTextDaoJdbcImpl")
public class AdPostTextDaoJdbcImpl implements AdPostTextDao {

	@Override
	public List<AdPostText> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdPostText> findByAdPostId(String adPostId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdPostText> findByAdPostId(Long adPostId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdPostText findPrimary() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
