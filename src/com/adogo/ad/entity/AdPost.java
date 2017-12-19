package com.adogo.ad.entity;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;


public class AdPost extends AdPostHead {
	
	private static final Logger logger = Logger.getLogger(AdPost.class);
	
	private List<AdPostText> listAdPostText;
	private List<AdPostCoverImage> listAdPostCoverImage = new ArrayList<AdPostCoverImage>();
	private List<AdPostSlideImage> listAdPostSlideImage = new ArrayList<AdPostSlideImage>();
	private List<AdPostGalleryImage> listAdPostGalleryImage = new ArrayList<AdPostGalleryImage>();
	private List<AdPostAudio> listAdPostAudio = new ArrayList<AdPostAudio>();
	private List<AdPostVideo> listAdPostVideo = new ArrayList<AdPostVideo>();
	
	
	/**
	 * @param mediaList
	 * @return
	 */
	public <T extends AdPostMediaBody> T getPrimaryMediaObject(List<T> mediaList){
		T primaryMediaObj = null;
		
		int listSize = mediaList.size();
		
		if(listSize==0){
			logger.info("The media list does not exist.");
		}else if(listSize==1){
			primaryMediaObj = mediaList.get(0);
		}else{
			for(T obj : mediaList){
				if(obj.isPrimary==null){
					continue;
				}else{
					if(obj.getIsPrimary()){
						primaryMediaObj = obj;
						break;
					}
				}
			}//end-of-for-loop
			if(primaryMediaObj ==null){
				primaryMediaObj = mediaList.get(0);
			}
		}//end-of-else
		
		return primaryMediaObj;
	}
	
	public void setAdPostHead(AdPostHead adPostHead){
		this.globalId = adPostHead.getGlobalId();
		this.userId = adPostHead.getUserId();
		this.adPostId = adPostHead.getAdPostId();
		this.mediaCoverUrl = adPostHead.getMediaCoverUrl();
		this.postTitle = adPostHead.getPostTitle();
		this.postAuthor = adPostHead.getPostAuthor();
		this.postCategory = adPostHead.getPostCategory();
		this.createDatetime = adPostHead.getCreateDatetime();
		this.postDatetime = adPostHead.getPostDatetime();
		this.langNo = adPostHead.getLangNo();
		this.tags = adPostHead.getTags();
		this.viewNum = adPostHead.getViewNum();
		this.shortDesc = adPostHead.getShortDesc();
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
