package com.adogo.ad.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}
