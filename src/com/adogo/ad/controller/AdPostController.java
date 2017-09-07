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


import com.adogo.ad.entity.AdPost;

import com.adogo.ad.entity.AdPostAudio;
import com.adogo.ad.entity.AdPostBody;
import com.adogo.ad.entity.AdPostCoverImage;
import com.adogo.ad.entity.AdPostGalleryImage;
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
	private AdPostService adPostService;
		
	@Autowired
	public void setAdPostService(AdPostService adPostService) {
		this.adPostService = adPostService;
	}
	
	@Autowired
	private AdTagService adTagService;
		
	@Autowired
	public void setAdTagService(AdTagService adTagService) {
		this.adTagService = adTagService;
	}
	
	@RequestMapping("/create.html")
	public String gotoCreate(){
		String viewName = "ad/ad_post_create";
		return viewName;
	}
	
	@RequestMapping("/edit.html")
	public String gotoEdit(){
		System.out.println("entering -- /edit");
		String viewName = "ad/ad_post_edit";
		System.out.println("exiting -- /edit");
		return viewName;
	}
	
	/**
	 * @param adpostId
	 * @param tags
	 * @return
	 * 
	 * @author sfz
	 */
	@RequestMapping("/saveTags")
	public String saveTags(@RequestParam String adpostId, @RequestParam String tags){
		logger.info("entering -- /saveTags ... adpostId= " + adpostId + ", tags="+String.valueOf(tags));
		String viewName = "ad/ad_post";
		
		this.adPostService.saveTags(adpostId, tags);
		
		this.adTagService.updateTagList(tags);
		
		logger.info("exiting -- /saveTags ");
		return viewName;
	}
	
	/**
	 * @param adPostJSONString
	 * @return
	 * 
	 * @author sfz
	 */
	@RequestMapping("/saveAdPost")
	public ModelAndView saveAdPost(@RequestParam String adPostJSONString){		
		logger.info("entering... /ad/adpost/saveAdPost");
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		/* prepare data */		
		JSONObject jsonObj= new JSONObject(adPostJSONString);
		
		Long adPostId 			= UUIDHelper.getUniqueLongId();
		Long adPostUserId 		= jsonObj.getLong("adPostUserId");
		Integer adPostLangNo 	= jsonObj.getInt("adPostLangNo");
		String adPostTitle 		= jsonObj.getString("adPostTitle");
		String adPostAuthor		= jsonObj.getString("adPostAuthor");
		Integer adPostCategory	= jsonObj.getInt("adPostCategory");
		String adPostTags		= jsonObj.getString("adPostTags").replaceAll("^\"|\"$", "");
		String adPostShortDesc	= jsonObj.getString("adPostShortDesc");
		logger.info("adPostCategory="+adPostCategory);
		logger.info("adPostShortDesc="+adPostShortDesc);
		
		//cover image
		String adPostCoverImgTitle		= jsonObj.getString("adPostCoverImgTitle");
		String adPostCoverImgUrl		= jsonObj.getString("adPostCoverImgUrl");
		String adPostCoverImgShortDesc	= jsonObj.getString("adPostCoverImgShortDesc");
		logger.info("cover image:adPostCoverImgTitle="+adPostCoverImgTitle);
		logger.info("cover image:adPostCoverImgUrl="+adPostCoverImgUrl);
		logger.info("cover image:adPostCoverImgShortDesc="+adPostCoverImgShortDesc);
		
		//text
		String adPostTextContentLongDesc = jsonObj.getString("adPostTextContentLongDesc");
		logger.info("text:adPostTextContentLongDesc="+adPostTextContentLongDesc);
		
		//video
		String adPostVideoContentTitle 		= jsonObj.getString("adPostVideoContentTitle");
		String adPostVideoContentUrl 		= jsonObj.getString("adPostVideoContentUrl");
		String adPostVideoContentShortDesc 	= jsonObj.getString("adPostVideoContentShortDesc");
		logger.info("video:adPostVideoContentTitle="+adPostVideoContentTitle);
		logger.info("video:adPostVideoContentUrl="+adPostVideoContentUrl);
		logger.info("video:adPostVideoContentShortDesc="+adPostVideoContentShortDesc);
		
		//audio
		String adPostAudioContentTitle 		= jsonObj.getString("adPostAudioContentTitle");
		String adPostAudioContentUrl 		= jsonObj.getString("adPostAudioContentUrl");
		String adPostAudioContentShortDesc 	= jsonObj.getString("adPostAudioContentShortDesc");
		logger.info("audio:adPostAudioContentTitle="+adPostAudioContentTitle);
		logger.info("audio:adPostAudioContentUrl="+adPostAudioContentUrl);
		logger.info("audio:adPostAudioContentShortDesc="+adPostAudioContentShortDesc);
		
		//gallery image
		final int SIZE_OF_ADPOST_GALLERY_IMAGE = 9;
		String[] adPostGalleryImgTitleList		= new String[SIZE_OF_ADPOST_GALLERY_IMAGE];
		String[] adPostGalleryImgUrlList		= new String[SIZE_OF_ADPOST_GALLERY_IMAGE];
		String[] adPostGalleryImgShortDescList	= new String[SIZE_OF_ADPOST_GALLERY_IMAGE];
		
		for(int i=0; i<SIZE_OF_ADPOST_GALLERY_IMAGE; i++){
			adPostGalleryImgTitleList[i] 		= jsonObj.getString("adPostGalleryImgTitle"+(i+1));
			adPostGalleryImgUrlList[i] 			= jsonObj.getString("adPostGalleryImgUrl"+(i+1));
			adPostGalleryImgShortDescList[i] 	= jsonObj.getString("adPostGalleryImgShortDesc"+(i+1));
			logger.info("gallery image:adPostGalleryImgTitleList["+i+"]="+adPostGalleryImgTitleList[i]);
			logger.info("gallery image:adPostGalleryImgUrlList["+i+"]="+adPostGalleryImgUrlList[i]);
			logger.info("gallery image:adPostGalleryImgShortDescList["+i+"]="+adPostGalleryImgShortDescList[i]);
		}
		
		
		/*create a new record of adpost into master table*/
		AdPostHead adPostHead = new AdPostHead();
		adPostHead.setAdPostId(adPostId);
		adPostHead.setUserId(adPostUserId);
		adPostHead.setLangNo(adPostLangNo);
		adPostHead.setPostTitle(adPostTitle);
		adPostHead.setPostAuthor(adPostAuthor);
		adPostHead.setPostCategory(adPostCategory);
		adPostHead.setTags(adPostTags);
		adPostHead.setShortDesc(adPostShortDesc);
				
		this.adPostService.create(adPostHead);
		
		/*update tags*/
		this.adTagService.updateTag(adPostTags);
		
		/*create AdPostBody for common fields*/
		AdPostBody adPostBody = new AdPostBody();
		adPostBody.setUserId(jsonObj.getLong("adPostUserId"));
		adPostBody.setAdPostId(adPostId);
		adPostBody.setMediaIndex(0);
		adPostBody.setLangNo(jsonObj.getInt("adPostLangNo"));
		
		/*create AdPostText*/
		AdPostText tContent = getAdPostText(adPostBody,adPostTextContentLongDesc);
		logger.info("tContent.getLongDesc()="+tContent.getLongDesc());
		this.adPostService.create(tContent);
		
		/*create AdPostCoverImage*/
		AdPostCoverImage cImg = getAdPostCoverImage(adPostBody, adPostCoverImgTitle, adPostCoverImgUrl, adPostCoverImgShortDesc);
		this.adPostService.create(cImg);
				
		/*create AdPostVideo*/
		AdPostVideo vContent = getAdPostVideo(adPostBody, adPostVideoContentTitle, adPostVideoContentUrl, adPostVideoContentShortDesc);
		this.adPostService.create(vContent);
		
		/*create AdPostAudio*/
		AdPostAudio aContent = getAdPostAudio(adPostBody, adPostAudioContentTitle, adPostAudioContentUrl, adPostAudioContentShortDesc);
		this.adPostService.create(aContent);
		
		/*create AdPostGalleryImage*/
		for(int i = 0; i < SIZE_OF_ADPOST_GALLERY_IMAGE; i++) {
			AdPostGalleryImage gImg = getAdPostGalleryImage(adPostBody, adPostGalleryImgTitleList[i], adPostGalleryImgUrlList[i], adPostGalleryImgShortDescList[i]);
			this.adPostService.create(gImg);
		}

		
		/* assemble model and view */
		String viewName = "ad/ad_post";
        mav.setViewName(viewName);
		
		logger.info("exiting... /ad/adpost/saveAdPost");
		return mav;
	}

	
	/**
	 * search and get all AdPost objects
	 * @return
	 */
	@RequestMapping(value="/adposts",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public Map<String,Object> getDataAdPostList(){
		logger.info("entering RESTFUL API... /ad/adpost/adposts");
		
		ModelAndView mav = new ModelAndView();
		
		//data
		Map<String, Object> model = mav.getModel();
		
		//retrieve data from database via service and dao		
		List<AdPost> listAdPost = new ArrayList<AdPost>();
		//TODO
		
		List<AdPostHead> listAdPostHead = new ArrayList<AdPostHead>();
		listAdPostHead = adPostService.getAllAdPostHead();
		
		Long numOfAdPost = adPostService.getAdPostHeadCount();
		logger.info(">>> Num of AdPost (header) is: "+numOfAdPost);
		
		
		
		
		model.put("listAdPost", listAdPost);
		model.put("listAdPostHead", listAdPostHead);
		model.put("countAdPost", numOfAdPost+"");
		
		logger.info("exiting RESTFUL API... /ad/adpost/adposts");
		return model;
	}
	
	
	/**
	 * search and get an AdPost object by id
	 * @param adPostId
	 * @return
	 * 
	 * @author Athens
	 */
/*	@RequestMapping(value="/adposts/{adPostId}",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public Map<String,Object> getDataAdPost(@PathVariable long adPostId){
		logger.info("entering RESTFUL API... /ad/adpost/adposts/"+adPostId);
		
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
	@RequestMapping(value="/{adPostId}",method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getDataAdPost(@PathVariable long adPostId){
		logger.info("entering RESTFUL API... /ad/adpost/"+adPostId);
		
		//retrieve data from database via service and dao		
		AdPost adPost = new AdPost();
		AdPostHead adPostHead = adPostService.getAdPostHeadByAdPostId(adPostId);
		adPost.setAdPostHead(adPostHead);
		List<AdPostCoverImage> adPostCoverImage = adPostService.getAdPostCoverImageByAdPostId(adPostId);
		adPost.setListAdPostCoverImage(adPostCoverImage);
		
		List<AdPostCoverImage> adPostCoverImage1 = adPost.getListAdPostCoverImage();
		for (AdPostCoverImage cImg : adPostCoverImage1) {
			logger.info("cImg getMediaCoverUrl()="+cImg.getMediaCoverUrl());
			logger.info("cImg getMediaUrl()="+cImg.getMediaUrl());
		}
		
		AdPostCoverImage primaryCoverImage = adPost.getPrimaryMediaObject(adPostCoverImage1);
		logger.info("primaryCoverImage getMediaUrl()="+primaryCoverImage.getMediaUrl());
		
		Long test = adPostService.getAdPostHeadCount();
		logger.info("test getAdPostHeadCount()="+test);
		
		Long test2 = adPostService.getAdPostCoverImageCount();
		logger.info("test getAdPostCoverImageCount()="+test2);
		
		logger.info("exiting RESTFUL API... /ad/adpost/"+adPostId);
		
		if (adPostHead == null) {
            logger.info("AdPost with id {"+ adPostId+"} not found.");
            
            return new ResponseEntity<AdPost>(HttpStatus.NOT_FOUND);
        }
		else {
			return new ResponseEntity<AdPost>(adPost, HttpStatus.OK);
		}
        
        
	}	
	
	/**
	 * create an AdPost object
	 * @param adPostJSONString
	 * @return
	 * 
	 * @author Athens
	 */
	@RequestMapping(value="/adposts",method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Boolean> createAdPost(@RequestParam String adPostJSONString){
		
		
		
		return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
	}
	
	
	/**
	 * update an AdPost object with entire object data
	 * @param adPostId
	 * @return
	 * 
	 * @author Athens
	 */
	@RequestMapping(value="/adposts/{adPostId}",method=RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Boolean> updateAdPost(@PathVariable String adPostId){
		
		
		
		return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
	}
	
	
	
	/**
	 * delete an AdPost object with entire object data
	 * @param adPostId
	 * @return
	 * 
	 * @author Athens
	 */
	@RequestMapping(value="/adposts/{adPostId}",method=RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Boolean> deleteAdPost(@PathVariable String adPostId){
		
		
		
		return new ResponseEntity<Boolean>(true,HttpStatus.NO_CONTENT);
	}


	
	
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
	}
	
	

	
}
