package com.adogo.ad.entity;

import java.util.List;

public class AdPost extends AdPostHead {
	
	private List<AdPostText> listAdPostText;
	private List<AdPostCoverImage> listAdPostCoverImage;
	private List<AdPostSlideImage> listAdPostSlideImage;
	private List<AdPostGalleryImage> listAdPostGalleryImage;
	private List<AdPostAudio> listAdPostAudio;
	private List<AdPostVideo> listAdPostVideo;
	
	
	public <T extends AdPostMediaBody> T getPrimaryMediaObject(List<T> mediaList){
		T primaryMediaObj = null;
		for(T obj : mediaList){
			//System.out.println(obj.toString());
			if(obj.isPrimary==null){
				continue;
			}else{
				if(obj.getIsPrimary()){
					primaryMediaObj = obj;
				}
			}
			
		}
		return primaryMediaObj;
	}
	
	
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
	
	@Override
	public String toString() {
		return "AdPost [listAdPostText=" + listAdPostText + ", listAdPostCoverImage=" + listAdPostCoverImage
				+ ", listAdPostSlideImage=" + listAdPostSlideImage + ", listAdPostGalleryImage="
				+ listAdPostGalleryImage + ", listAdPostAudio=" + listAdPostAudio + ", listAdPostVideo="
				+ listAdPostVideo + ", globalId=" + globalId + ", userId=" + userId + ", adPostId=" + adPostId
				+ ", mediaCoverUrl=" + mediaCoverUrl + ", postTitle=" + postTitle + ", postAuthor=" + postAuthor
				+ ", createDatetime=" + createDatetime + ", postDatetime=" + postDatetime + ", langNo=" + langNo
				+ ", tags=" + tags + "]";
	}
	
	
}
