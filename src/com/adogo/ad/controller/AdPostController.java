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
import com.adogo.ad.entity.AdPostHead;
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
		
		tags = tags.replaceAll("^\"|\"$", "");
		this.adPostService.saveTags(adpostId, tags);
		
		String[] arrayTags = tags.split(",");
		for (String tag : arrayTags) {
			this.adTagService.updateTag(tag);
		}
		
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
		
		//set model
		JSONObject jsonObj= new JSONObject(adPostJSONString);
		
		AdPostHead adPostHead = new AdPostHead();
		
//		adPostHead.setGlobalId(globalId);
		String adPostId = UUIDHelper.getUUID();
		adPostHead.setAdPostId(adPostId);
		adPostHead.setUserId(jsonObj.getLong("adPostUserId"));
		
		adPostHead.setLangNo(jsonObj.getInt("adPostLangNo"));
		adPostHead.setPostTitle(jsonObj.getString("adPostTitle"));
		adPostHead.setPostAuthor(jsonObj.getString("adPostAuthor"));
		adPostHead.setPostCategory(jsonObj.getInt("adPostCategory"));
		
//		adPostHead.setMediaCoverUrl(jsonObj.getString(""));
		
		String adPostTags = jsonObj.getString("adPostTags");
		adPostTags = adPostTags.replaceAll("^\"|\"$", "");
		this.adPostService.saveTags(adPostId, adPostTags);
		adPostHead.setTags(adPostTags);
		
		/*create a new record of adpost into master table*/
		this.adPostService.create(adPostHead);
		
		/*update tags*/
		String[] arrayTags = adPostTags.split(",");
		for (String tag : arrayTags) {
			logger.info("tag= " + tag );
			this.adTagService.updateTag(tag);
		}
		
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
		List<AdPost> list = new ArrayList<AdPost>();
		//TODO
		
		model.put("listAdPost", list);
		
		logger.info("exiting RESTFUL API... /ad/adpost/adposts");
		return null;
	}
	
	
	/**
	 * search and get an AdPost object by id
	 * @param adPostId
	 * @return
	 * 
	 * @author Athens
	 */
	@RequestMapping(value="/adposts/{adPostId}",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public Map<String,Object> getDataAdPost(@PathVariable String adPostId){
		logger.info("entering RESTFUL API... /ad/adpost/adposts/"+adPostId);
		
		ModelAndView mav = new ModelAndView();
		
		//data
		Map<String, Object> model = mav.getModel();
		
		//retrieve data from database via service and dao		
		AdPost obj = new AdPost();
		//TODO
		
		model.put("adPost", obj);
		
		logger.info("exiting RESTFUL API... /ad/adpost/adposts"+adPostId);
		return null;
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
	
}
