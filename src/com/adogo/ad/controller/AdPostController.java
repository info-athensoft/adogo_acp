package com.adogo.ad.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adogo.ad.entity.AdPostHead;
import com.adogo.ad.service.AdPostService;
import com.adogo.ad.service.AdTagService;
import com.adogo.uaas.controller.AdvertiserController;

@Controller
@RequestMapping("/ad/adpost")
public class AdPostController {
	
	private static final Logger logger = Logger.getLogger(AdPostController.class);
	
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
		logger.info("entering -- /saveTags ... adpostId= " + adpostId + ", tags="+String.valueOf(tags));
		String viewName = "ad/ad_post";
		
		tags = tags.replaceAll("^\"|\"$", "");
		this.adpostService.saveTags(adpostId, tags);
		
		String[] arrayTags = tags.split(",");
		for (String tag : arrayTags) {
			this.adTagService.updateTag(tag);
		}
		
		logger.info("exiting -- /saveTags ");
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
		adPost.setUserId(1L);
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
