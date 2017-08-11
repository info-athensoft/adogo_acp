package com.adogo.ad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adogo.ad.entity.AdPostHead;
import com.adogo.ad.service.AdPostService;
import com.adogo.ad.service.AdTagService;

@Controller
@RequestMapping("/ad/adpost")
public class AdPostController {
	
	@Autowired
	private AdPostService adpostService;
		
	@Autowired
	public void setAdPostService(AdPostService adpostService) {
		this.adpostService = adpostService;
	}
	
	@Autowired
	private AdTagService adTagService;
		
	@Autowired
	public void setAdTagService(AdTagService adTagService) {
		this.adTagService = adTagService;
	}
	
	@RequestMapping("/create")
	public String gotoCreate(){
		String viewName = "ad/ad_post_create";
		return viewName;
	}
	
	@RequestMapping("/edit")
	public String gotoEdit(){
		System.out.println("entering -- /edit");
		String viewName = "ad/ad_post_edit";
		System.out.println("exiting -- /edit");
		return viewName;
	}
	
	@RequestMapping("/saveTags")
	public String saveTags(@RequestParam String adpostId, @RequestParam String tags){
	//public String saveTags(@RequestParam String adpostId){
	//public String saveTags(){
		tags = tags.replaceAll("^\"|\"$", "");
		System.out.println("entering -- /saveTags ... adpostId= " + adpostId + ", tags="+String.valueOf(tags));
		//System.out.println("entering -- /saveTags ... adpostId= " + adpostId );
		//System.out.println("entering -- /saveTags");
		String viewName = "ad/ad_post";
		
		this.adpostService.saveTags(adpostId, tags);
		//long globalId = 0;
		//AdPost ap = this.adpostService.findById(globalId);
		//System.out.println("found adpostId = " + ap.getAdpost_id());
		
		String[] arrayTags = tags.split(",");
		for (String tag : arrayTags) {
			//System.out.println("tag= " + tag );
			this.adTagService.updateTag(tag);
		}
		
		System.out.println("exiting -- /saveTags ");
		return viewName;
	}
	
	@RequestMapping("/saveAdPost")
	public String saveAdPost(@RequestParam String adPostId,
							 @RequestParam String adPostLang,
							 @RequestParam String adPostTitle,
							 @RequestParam String adPostAuthor,
							 @RequestParam String adPostCategory,
							 @RequestParam String adPostTags,
							 @RequestParam String adPostShortDesc,
							 @RequestParam String adPostCoverImgTitle,
							 @RequestParam String adPostCoverImgUrl,
							 @RequestParam String adPostCoverImgShortDesc){
	
		adPostTags = adPostTags.replaceAll("^\"|\"$", "");
		System.out.println("entering -- /saveAdPost ... adPostId= " + adPostId + ", adPostLang="+adPostLang+ ", adPostTitle="+adPostTitle+ ", adPostAuthor="+adPostAuthor+ ", adPostCategory="+adPostCategory + ", adPostTags="+String.valueOf(adPostTags)+ ", adPostShortDesc="+adPostShortDesc);
		System.out.println("entering -- /saveAdPost ... adPostCoverImgTitle= " + adPostCoverImgTitle + ", adPostCoverImgUrl="+adPostCoverImgUrl+ ", adPostCoverImgShortDesc="+adPostCoverImgShortDesc);
		//System.out.println("entering -- /saveTags ... adpostId= " + adpostId );
		//System.out.println("entering -- /saveTags");
		String viewName = "ad/adpost/create";
		
//		this.adpostService.saveTags(adPostId, tags);
		//long globalId = 0;
		//AdPost ap = this.adpostService.findById(globalId);
		//System.out.println("found adpostId = " + ap.getAdpost_id());
		AdPostHead adPost = new AdPostHead();
		adPost.setUserId('1');
		adPost.setAdPostId(adPostId);
		adPost.setMediaCoverUrl(adPostCoverImgUrl);
		adPost.setLangNo(1);
		adPost.setPostTitle(adPostTitle);
		adPost.setPostAuthor(adPostAuthor);
		adPost.setTags(adPostTags);
		this.adpostService.create(adPost);
		
		String[] arrayTags = adPostTags.split(",");
		for (String tag : arrayTags) {
			System.out.println("tag= " + tag );
			this.adTagService.updateTag(tag);
		}
		
		System.out.println("exiting -- /saveAdPost ");
		return viewName;
	}
}
