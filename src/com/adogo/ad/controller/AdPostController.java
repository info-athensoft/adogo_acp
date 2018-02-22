
package com.adogo.ad.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.adogo.ad.service.AdPostService;
import com.adogo.ad.service.AdTagService;
import com.adogo.advertiser.entity.adpost.old.AdPost;
import com.adogo.advertiser.entity.adpost.old.AdPostAudio;
import com.adogo.advertiser.entity.adpost.old.AdPostBody;
import com.adogo.advertiser.entity.adpost.old.AdPostCoverImage;
import com.adogo.advertiser.entity.adpost.old.AdPostGalleryImage;
import com.adogo.advertiser.entity.adpost.old.AdPostHead;
import com.adogo.advertiser.entity.adpost.old.AdPostMediaBody;
import com.adogo.advertiser.entity.adpost.old.AdPostText;
import com.adogo.advertiser.entity.adpost.old.AdPostVideo;
import com.athensoft.util.id.UUIDHelper;

@Controller
@RequestMapping("/advertiser/adpost")
public class AdPostController {
	
	private static final Logger logger = Logger.getLogger(AdPostController.class);
	
	
	@Autowired
	private AdPostService adPostService;
	
	@Autowired
	private AdTagService adTagService;
		
	@Autowired
	public void setAdPostService(AdPostService adPostService) {
		this.adPostService = adPostService;
	}
		
	@Autowired
	public void setAdTagService(AdTagService adTagService) {
		this.adTagService = adTagService;
	}
	
	@RequestMapping("/")
	public String gotoAdPostIndex(){
		logger.info("entering... /acp/advertiser/adpost/");
		String viewName = "advertiser/adpost_index";
		logger.info("exiting... /acp/advertiser/adpost/");
		return viewName;
	}
	
	@RequestMapping("/index.html")
	public String gotoAdPostIndex2(){
		logger.info("entering... /acp/advertiser/adpost/index.html");
		String viewName = "advertiser/adpost_index";
		logger.info("exiting... /acp/advertiser/adpost/index.html");
		return viewName;
	}
	
	
	@RequestMapping("/create.html")
	public String gotoAdPostCreate(){
		logger.info("entering... /acp/advertiser/adpost/create.html");
		String viewName = "advertiser/adpost_create";
		logger.info("exiting... /acp/advertiser/adpost/create.html");
		return viewName;
	}
	
	@RequestMapping("/create_zq.html")
	public String gotoAdPostCreate2(){
		logger.info("entering... /acp/advertiser/adpost/create_zq.html");
		String viewName = "advertiser/adpost_create_zq";
		logger.info("exiting... /acp/advertiser/adpost/create_zq.html");
		return viewName;
	}
	
	@RequestMapping("/edit.html")
	public String gotoAdPostEdit(){
		logger.info("entering... /acp/advertiser/adpost/edit.html");
		String viewName = "advertiser/adpost_edit";
		logger.info("exiting... /acp/advertiser/adpost/edit.html");
		return viewName;
	}
	
	/**
	 * create an AdPost object
	 * @param adPostJSONString
	 * @return
	 * 
	 * @author Athens
	 */
	/*
	@RequestMapping(value="/adposts",method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Boolean> createAdPost(@RequestParam String adPostJSONString){
		logger.info("entering... /acp/advertiser/adpost/adposts	POST");
		
		// prepare data //		
		JSONObject jsonObj= new JSONObject(adPostJSONString);
		System.out.println(jsonObj);
		
		logger.info("exiting... /acp/advertiser/adpost/adposts	POST");
		return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
	}*/

	/**
	 * update an AdPost object with entire object data
	 * @param adPostId
	 * @return
	 * 
	 * @author Athens
	 */
	/*
	@RequestMapping(value="/adposts/{adPostId}",method=RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Boolean> updateAdPost(@PathVariable String adPostId){
		
		return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
	}*/

	/**
	 * @param adPostJSONString
	 * @return
	 * 
	 * @author sfz
	 */
	/*
	@RequestMapping("/saveAdPost")
	public ModelAndView saveAdPost(@RequestParam String adPostJSONString){		
		logger.info("entering... /acp/advertiser/adpost/saveAdPost");
		
		// prepare data //		
		JSONObject jsonObj= new JSONObject(adPostJSONString);
		
		Long adPostId 					= UUIDHelper.getUniqueLongId();
		Long adPostUserId 				= jsonObj.getLong("adPostUserId");
		Integer adPostLangNo 			= jsonObj.getInt("adPostLangNo");
		String adPostTitle 				= jsonObj.getString("adPostTitle");
		String adPostAuthor				= jsonObj.getString("adPostAuthor");
		Integer adPostCategory			= jsonObj.getInt("adPostCategory");
		String adPostTags				= jsonObj.getString("adPostTags").replaceAll("^\"|\"$", "");
		String adPostShortDesc			= jsonObj.getString("adPostShortDesc");
		
		//cover image
		String adPostCoverImgTitle		= jsonObj.getString("adPostCoverImgTitle");
		String adPostCoverImgUrl		= jsonObj.getString("adPostCoverImgUrl");
		String adPostCoverImgShortDesc	= jsonObj.getString("adPostCoverImgShortDesc");
		
		//text
		String adPostTextContentLongDesc 	= jsonObj.getString("adPostTextContentLongDesc");
		
		//video
		String adPostVideoContentTitle 		= jsonObj.getString("adPostVideoContentTitle");
		String adPostVideoContentUrl 		= jsonObj.getString("adPostVideoContentUrl");
		String adPostVideoContentShortDesc 	= jsonObj.getString("adPostVideoContentShortDesc");
		
		//audio
		String adPostAudioContentTitle 		= jsonObj.getString("adPostAudioContentTitle");
		String adPostAudioContentUrl 		= jsonObj.getString("adPostAudioContentUrl");
		String adPostAudioContentShortDesc 	= jsonObj.getString("adPostAudioContentShortDesc");
		
		logger.info("adPostCategory="+adPostCategory);
		logger.info("adPostShortDesc="+adPostShortDesc);
		logger.info("cover image:adPostCoverImgTitle="+adPostCoverImgTitle);
		logger.info("cover image:adPostCoverImgUrl="+adPostCoverImgUrl);
		logger.info("cover image:adPostCoverImgShortDesc="+adPostCoverImgShortDesc);
		logger.info("text: adPostTextContentLongDesc="+adPostTextContentLongDesc);
		logger.info("video: adPostVideoContentTitle="+adPostVideoContentTitle);
		logger.info("video: adPostVideoContentUrl="+adPostVideoContentUrl);
		logger.info("video: adPostVideoContentShortDesc="+adPostVideoContentShortDesc);
		logger.info("audio: adPostAudioContentTitle="+adPostAudioContentTitle);
		logger.info("audio: adPostAudioContentUrl="+adPostAudioContentUrl);
		logger.info("audio: adPostAudioContentShortDesc="+adPostAudioContentShortDesc);
		
		//gallery image
//			final int SIZE_OF_ADPOST_GALLERY_IMAGE = 9;
//			String[] adPostGalleryImgTitleList		= new String[SIZE_OF_ADPOST_GALLERY_IMAGE];
//			String[] adPostGalleryImgUrlList		= new String[SIZE_OF_ADPOST_GALLERY_IMAGE];
//			String[] adPostGalleryImgShortDescList	= new String[SIZE_OF_ADPOST_GALLERY_IMAGE];
//			
//			for(int i=0; i<SIZE_OF_ADPOST_GALLERY_IMAGE; i++){
//				adPostGalleryImgTitleList[i] 		= jsonObj.getString("adPostGalleryImgTitle"+(i+1));
//				adPostGalleryImgUrlList[i] 			= jsonObj.getString("adPostGalleryImgUrl"+(i+1));
//				adPostGalleryImgShortDescList[i] 	= jsonObj.getString("adPostGalleryImgShortDesc"+(i+1));
//				logger.info("gallery image:adPostGalleryImgTitleList["+i+"]="+adPostGalleryImgTitleList[i]);
//				logger.info("gallery image:adPostGalleryImgUrlList["+i+"]="+adPostGalleryImgUrlList[i]);
//				logger.info("gallery image:adPostGalleryImgShortDescList["+i+"]="+adPostGalleryImgShortDescList[i]);
//			}
		
		
		// prepare data //	
		AdPostHead adPostHead = new AdPostHead();
		adPostHead.setAdPostId(adPostId);
		adPostHead.setUserId(adPostUserId);
		adPostHead.setLangNo(adPostLangNo);
		adPostHead.setPostTitle(adPostTitle);
		adPostHead.setPostAuthor(adPostAuthor);
		adPostHead.setPostCategory(adPostCategory);
		adPostHead.setTags(adPostTags);
		adPostHead.setShortDesc(adPostShortDesc);
				
		//AdPostBody
		AdPostBody adPostBody = new AdPostBody();
		adPostBody.setUserId(jsonObj.getLong("adPostUserId"));
		adPostBody.setAdPostId(adPostId);
		adPostBody.setMediaIndex(0);
		adPostBody.setLangNo(jsonObj.getInt("adPostLangNo"));
		
		//AdPostText
//			AdPostText tContent = getAdPostText(adPostBody,adPostTextContentLongDesc);
		
		//AdPostCoverImage
//			AdPostCoverImage cImg = getAdPostCoverImage(adPostBody, adPostCoverImgTitle, adPostCoverImgUrl, adPostCoverImgShortDesc);
		
			
		//AdPostVideo
//			AdPostVideo vContent = getAdPostVideo(adPostBody, adPostVideoContentTitle, adPostVideoContentUrl, adPostVideoContentShortDesc);
		
		
		//AdPostAudio
//			AdPostAudio aContent = getAdPostAudio(adPostBody, adPostAudioContentTitle, adPostAudioContentUrl, adPostAudioContentShortDesc);
		
		
		//AdPostGalleryImage
//			for(int i = 0; i < SIZE_OF_ADPOST_GALLERY_IMAGE; i++) {
//				AdPostGalleryImage gImg = getAdPostGalleryImage(adPostBody, adPostGalleryImgTitleList[i], adPostGalleryImgUrlList[i], adPostGalleryImgShortDescList[i]);
//				this.adPostService.create(gImg);
//			}
		
		this.adPostService.create(adPostHead);
		this.adTagService.updateTag(adPostTags);
//			this.adPostService.create(tContent);
//			this.adPostService.create(cImg);
//			this.adPostService.create(vContent);
//			this.adPostService.create(aContent);
		
		// assemble model and view //
		ModelAndView mav = new ModelAndView();
		
		// set view //
		String viewName = "advertiser/adpost_index";
        mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/adpost/saveAdPost");
		return mav;
	}*/

	/**
	 * delete an AdPost object with entire object data
	 * @param adPostId
	 * @return
	 * 
	 * @author Athens
	 */
	/*
	@RequestMapping(value="/adposts/{adPostId}",method=RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Boolean> deleteAdPost(@PathVariable String adPostId){
		return new ResponseEntity<Boolean>(true,HttpStatus.NO_CONTENT);
	}*/

	/**
	 * @param adpostId
	 * @param tags
	 * @return
	 * 
	 * @author sfz
	 */
	/*
	@RequestMapping("/saveTags")
	public String saveTags(@RequestParam String adpostId, @RequestParam String tags){
		logger.info("entering... /acp/advertiser/adpost/saveTags");
		
		//test
		logger.info("adpostId= " + adpostId + ", tags="+String.valueOf(tags));
		
		// execute business logic 
		this.adPostService.saveTags(adpostId, tags);		
		this.adTagService.updateTagList(tags);
		
		// set view 
		String viewName = "advertiser/adpost_index";
		
		logger.info("exiting... /acp/advertiser/adpost/saveTags");
		return viewName;
	}*/
	
	/**
	 * search and get all AdPost objects
	 * @return
	 */
	/*
	@RequestMapping(value="/adposts",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public Map<String,Object> getDataAdPostList(){
		logger.info("entering RESTFUL API... /advertiser/adpost/adposts");
		
		// execute business logic //	
		List<AdPost> listAdPost = new ArrayList<AdPost>();		//FIXME	
		
		List<AdPostHead> listAdPostHead = new ArrayList<AdPostHead>();
		listAdPostHead = adPostService.getAllAdPostHead();

		Long numOfAdPost = adPostService.getAdPostHeadCount();
		logger.info(">>> Num of AdPost (header) is: "+numOfAdPost);
		
		// assemble data and view //
		ModelAndView mav = new ModelAndView();
		Map<String, Object> model = mav.getModel();
		
		// set data //
		model.put("listAdPost", listAdPost);					//FIXME
		model.put("listAdPostHead", listAdPostHead);
		model.put("countAdPost", numOfAdPost+"");
		
		logger.info("exiting RESTFUL API... /advertiser/adpost/adposts");
		return model;
	}*/
	
	
	/**
	 * search and get an AdPost object by id
	 * @param adPostId
	 * @return
	 * 
	 * @author sfz
	 */
/*	@RequestMapping(value="/adposts/{adPostId}",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public Map<String,Object> getDataAdPost(@PathVariable long adPostId){
		logger.info("entering RESTFUL API... /advertiser/adpost/adposts/"+adPostId);
		
		ModelAndView mav = new ModelAndView();
		
		//data
		Map<String, Object> model = mav.getModel();
		
		//retrieve data from database via service and dao		
		AdPost adPost = new AdPost();
		//TODO
		
		AdPostHead adPostHead = adPostService.getAdPostHeadByAdPostId(adPostId);
		
		adPost.setAdPostHead(adPostHead);
		
		//
		model.put("adPost", adPost);
		model.put("adPostHead", adPostHead);
		
		logger.info("exiting RESTFUL API... /ad/adpost/adposts"+adPostId);
		return model;
	} */
	
	
	/*
	@RequestMapping(value="/{adPostId}",method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getDataAdPost(@PathVariable long adPostId){
		logger.info("entering RESTFUL API... /advertiser/adpost/"+adPostId);
		
		//retrieve data from database via service and dao		
		AdPost adPost = new AdPost();
		AdPostHead adPostHead = adPostService.getAdPostHeadByAdPostId(adPostId);
		adPost.setAdPostHead(adPostHead);
		
		//AdPostText
		List<AdPostText> adPostText = new ArrayList<AdPostText>();
		logger.info("adPostId = "+adPostId);
		adPostText = adPostService.getAdPostTextByAdPostId(adPostId);
		adPost.setListAdPostText(adPostText);
		
		//AdPostCoverImage
		List<AdPostCoverImage> adPostCoverImage = new ArrayList<AdPostCoverImage>();
		logger.info("adPostId = "+adPostId);
		adPostCoverImage = adPostService.getAdPostCoverImageByAdPostId(adPostId);
		adPost.setListAdPostCoverImage(adPostCoverImage);
		
		logger.info("adPostCoverImage size = "+adPostCoverImage.size());
		
		List<AdPostCoverImage> adPostCoverImage2 = adPost.getListAdPostCoverImage();
		AdPostCoverImage primaryCoverImage = adPost.getPrimaryMediaObject(adPostCoverImage2);
		logger.info("primaryCoverImage getMediaUrl()="+primaryCoverImage.getMediaUrl());
		
		
		List<AdPostAudio> adPostAudio = adPostService.getAdPostAudioByAdPostId(adPostId);
		adPost.setListAdPostAudio(adPostAudio);
		
		List<AdPostAudio> adPostAudio2 = adPost.getListAdPostAudio();
				
		AdPostAudio primaryAudio = adPost.getPrimaryMediaObject(adPostAudio2);
		logger.info("primaryAudio getMediaUrl()="+primaryAudio.getMediaUrl());
		
		
		List<AdPostVideo> adPostVideo = adPostService.getAdPostVideoByAdPostId(adPostId);
		adPost.setListAdPostVideo(adPostVideo);
		
		List<AdPostVideo> adPostVideo2 = adPost.getListAdPostVideo();
				
		AdPostVideo primaryVideo = adPost.getPrimaryMediaObject(adPostVideo2);
		logger.info("primaryVideo getMediaUrl()="+primaryVideo.getMediaUrl());
		
		//TODO temporarily commented for test
		//2017-11-12 by Athens
		
//		List<AdPostGalleryImage> adPostGalleryImage = adPostService.getAdPostGalleryImageByAdPostId(adPostId);
//		adPost.setListAdPostGalleryImage(adPostGalleryImage);
//		
//		List<AdPostGalleryImage> adPostGalleryImage2 = adPost.getListAdPostGalleryImage();
//		for (AdPostGalleryImage gImg : adPostGalleryImage2) {
//			logger.info("gImg getMediaUrl()="+gImg.getMediaUrl());
//		} 
//		AdPostGalleryImage primaryGalleryImage = adPost.getPrimaryMediaObject(adPostGalleryImage2);
//		logger.info("primaryGalleryImage getMediaUrl()="+primaryGalleryImage.getMediaUrl());
		
		
		logger.info("exiting RESTFUL API... /advertiser/adpost/"+adPostId);
		
		
		if (adPostHead == null) {
            logger.info("AdPost with id {"+ adPostId+"} not found.");
            
            return new ResponseEntity<AdPost>(HttpStatus.NOT_FOUND);
        }
		else {
			return new ResponseEntity<AdPost>(adPost, HttpStatus.OK);
		}
        
	}	*/

	/*
	private AdPostText getAdPostText(AdPostBody adPostBody, String mediaDesc){
		AdPostText contentObj = new AdPostText(adPostBody);
		contentObj.setLongDesc(mediaDesc);
		return contentObj;
	}

	private AdPostCoverImage getAdPostCoverImage(AdPostBody adPostBody, String mediaTitle, String mediaUrl, String mediaDesc){
		AdPostMediaBody mediaBody = getAdPostMediaBody(adPostBody, mediaTitle, mediaUrl, mediaDesc);		
		AdPostCoverImage contentObj = new AdPostCoverImage(mediaBody);
		return contentObj;
	}
	
	private AdPostGalleryImage getAdPostGalleryImage(AdPostBody adPostBody, String mediaTitle, String mediaUrl, String mediaDesc){
		AdPostMediaBody mediaBody = getAdPostMediaBody(adPostBody, mediaTitle, mediaUrl, mediaDesc);		
		AdPostGalleryImage contentObj = new AdPostGalleryImage(mediaBody);
		return contentObj;
	}

	private AdPostVideo getAdPostVideo(AdPostBody adPostBody, String mediaTitle, String mediaUrl, String mediaDesc){
		AdPostMediaBody mediaBody = getAdPostMediaBody(adPostBody, mediaTitle, mediaUrl, mediaDesc);		
		AdPostVideo contentObj = new AdPostVideo(mediaBody);
		return contentObj;
	}
	
	private AdPostAudio getAdPostAudio(AdPostBody adPostBody, String mediaTitle, String mediaUrl, String mediaDesc){
		AdPostMediaBody mediaBody = getAdPostMediaBody(adPostBody, mediaTitle, mediaUrl, mediaDesc);		
		AdPostAudio contentObj = new AdPostAudio(mediaBody);
		return contentObj;
	}
	
	private AdPostMediaBody getAdPostMediaBody(AdPostBody adPostBody, String mediaTitle, String mediaUrl, String mediaDesc){
		AdPostMediaBody mediaBody = new AdPostMediaBody(adPostBody);
		mediaBody.setMediaTitle(mediaTitle);
		mediaBody.setMediaUrl(mediaUrl);
		mediaBody.setMediaDesc(mediaDesc);
		return mediaBody;
	}	*/
}

