package com.adogo.ad.controller;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.adogo.ad.entity.AdPostAudio;
import com.adogo.ad.entity.AdPostBody;
import com.adogo.ad.entity.AdPostCoverImage;
import com.adogo.ad.entity.AdPostHead;
import com.adogo.ad.entity.AdPostMediaBody;
import com.adogo.ad.entity.AdPostText;
import com.adogo.ad.entity.AdPostVideo;
import com.adogo.ad.service.AdPostService;
import com.adogo.ad.service.AdTagService;
import com.athensoft.util.id.UUIDHelper;

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
	public ModelAndView saveAdPost(@RequestParam String adPostJSONString){		
		logger.info("entering... /ad/adpost/saveAdPost");
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		//set model
		JSONObject jsonObj= new JSONObject(adPostJSONString);
		
		AdPostHead adPostHead = new AdPostHead();
		
//		adPostHead.setGlobalId(globalId);
		Long adPostId = UUIDHelper.getUniqueLongId();
		adPostHead.setAdPostId(adPostId);
		adPostHead.setUserId(jsonObj.getLong("adPostUserId"));
		
		adPostHead.setLangNo(jsonObj.getInt("adPostLangNo"));
		adPostHead.setPostTitle(jsonObj.getString("adPostTitle"));
		adPostHead.setPostAuthor(jsonObj.getString("adPostAuthor"));
		adPostHead.setPostCategory(jsonObj.getInt("adPostCategory"));
		
//		adPostHead.setMediaCoverUrl(jsonObj.getString(""));
		
		String adPostTags = jsonObj.getString("adPostTags");
		
		adPostTags = adPostTags.replaceAll("^\"|\"$", "");
		//this.adpostService.saveTags(adPostId, adPostTags);
		adPostHead.setTags(adPostTags);
		
		/*create a new record of adpost into master table*/
		this.adpostService.create(adPostHead);
		
		/*update tags*/
		String[] arrayTags = adPostTags.split(",");
		for (String tag : arrayTags) {
			logger.info("tag= " + tag );
			this.adTagService.updateTag(tag);
		}
		
		/*create a new AdPostCoverImage*/
		AdPostBody adPostBody = new AdPostBody();
		adPostBody.setUserId(jsonObj.getLong("adPostUserId"));
		adPostBody.setAdPostId(adPostId);
		//cImg.setMediaCoverUrl(jsonObj.getString(""));
		//adPostBody.setIsPrimary(false);
		adPostBody.setMediaIndex(0);
		adPostBody.setLangNo(jsonObj.getInt("adPostLangNo"));
		//adPostBody.setSortNo(0);
		
		AdPostMediaBody adPostMediaBody = new AdPostMediaBody(adPostBody);
		adPostMediaBody.setMediaTitle(jsonObj.getString("adPostCoverImgTitle"));
		adPostMediaBody.setMediaUrl(jsonObj.getString("adPostCoverImgUrl"));
		adPostMediaBody.setMediaDesc(jsonObj.getString("adPostCoverImgShortDesc")); 
		AdPostCoverImage cImg = new AdPostCoverImage(adPostMediaBody);
		this.adpostService.create(cImg);
		
		AdPostText tContent = new AdPostText(adPostBody);
		tContent.setLongDesc(jsonObj.getString("adPostTextContentLongDesc"));
		this.adpostService.create(tContent);
		
		AdPostMediaBody adPostMediaBodyForVideo = new AdPostMediaBody(adPostBody);
		adPostMediaBodyForVideo.setMediaTitle(jsonObj.getString("adPostVideoContentTitle"));
		adPostMediaBodyForVideo.setMediaUrl(jsonObj.getString("adPostVideoContentUrl"));
		adPostMediaBodyForVideo.setMediaDesc(jsonObj.getString("adPostVideoContentShortDesc"));
		AdPostVideo vContent = new AdPostVideo(adPostMediaBodyForVideo);
		this.adpostService.create(vContent);
		
		AdPostMediaBody adPostMediaBodyForAudio = new AdPostMediaBody(adPostBody);
		adPostMediaBodyForAudio.setMediaTitle(jsonObj.getString("adPostAudioContentTitle"));
		adPostMediaBodyForAudio.setMediaUrl(jsonObj.getString("adPostAudioContentUrl"));
		adPostMediaBodyForAudio.setMediaDesc(jsonObj.getString("adPostAudioContentShortDesc"));
		AdPostAudio aContent = new AdPostAudio(adPostMediaBodyForAudio);
		this.adpostService.create(aContent);
		
		
		/*	
		adPostTags = adPostTags.replaceAll("^\"|\"$", "");
		System.out.println("entering -- /saveAdPost ... adPostId= " + adPostId + ", adPostLang="+adPostLang+ ", adPostTitle="+adPostTitle+ ", adPostAuthor="+adPostAuthor+ ", adPostCategory="+adPostCategory + ", adPostTags="+String.valueOf(adPostTags)+ ", adPostShortDesc="+adPostShortDesc);
		System.out.println("entering -- /saveAdPost ... adPostCoverImgTitle= " + adPostCoverImgTitle + ", adPostCoverImgUrl="+adPostCoverImgUrl+ ", adPostCoverImgShortDesc="+adPostCoverImgShortDesc);
		
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
		
		*/
		
		/* assemble model and view */
		String viewName = "ad/adpost/create";
        mav.setViewName(viewName);
		
		logger.info("exiting... /ad/adpost/saveAdPost");
		return mav;
	}
}
