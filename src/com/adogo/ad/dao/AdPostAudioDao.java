package com.adogo.ad.dao;

import java.util.List;

import com.adogo.ad.entity.AdPostAudio;

public interface AdPostAudioDao {
	public List<AdPostAudio> findAll();
	
	public List<AdPostAudio> findByAdPostId(String adPostId);
	
	public List<AdPostAudio> findByAdPostId(Long adPostId);
	
	public Long findTotalCount();
	
	public AdPostAudio findPrimary();
	
	
}
