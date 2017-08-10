package com.adogo.ad.entity;

import java.util.List;

public class AdPost extends AdPostHead {
	private List<AdPostAudio> listAdPostAudio;
	private List<AdPostVideo> listAdPostVideo;
	private List<AdPostCoverImage> listAdPostCoverImage;
	private List<AdPostSlideImage> listAdPostSlideImage;
	private List<AdPostGalleryImage> listAdPostGalleryImage;
	private List<AdPostText> listAdPostText;
	
	public List<AdPostAudio> getListAdPostAudio() {
		return listAdPostAudio;
	}
	public void setListAdPostAudio(List<AdPostAudio> listAdPostAudio) {
		this.listAdPostAudio = listAdPostAudio;
	}
	public List<AdPostVideo> getListAdPostVideo() {
		return listAdPostVideo;
	}
	public void setListAdPostVideo(List<AdPostVideo> listAdPostVideo) {
		this.listAdPostVideo = listAdPostVideo;
	}
	public List<AdPostCoverImage> getListAdPostCoverImage() {
		return listAdPostCoverImage;
	}
	public void setListAdPostCoverImage(List<AdPostCoverImage> listAdPostCoverImage) {
		this.listAdPostCoverImage = listAdPostCoverImage;
	}
	public List<AdPostSlideImage> getListAdPostSlideImage() {
		return listAdPostSlideImage;
	}
	public void setListAdPostSlideImage(List<AdPostSlideImage> listAdPostSlideImage) {
		this.listAdPostSlideImage = listAdPostSlideImage;
	}
	public List<AdPostGalleryImage> getListAdPostGalleryImage() {
		return listAdPostGalleryImage;
	}
	public void setListAdPostGalleryImage(List<AdPostGalleryImage> listAdPostGalleryImage) {
		this.listAdPostGalleryImage = listAdPostGalleryImage;
	}
	public List<AdPostText> getListAdPostText() {
		return listAdPostText;
	}
	public void setListAdPostText(List<AdPostText> listAdPostText) {
		this.listAdPostText = listAdPostText;
	}
	
	
}
