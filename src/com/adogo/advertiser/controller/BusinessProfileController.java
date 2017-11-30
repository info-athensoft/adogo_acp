package com.adogo.advertiser.controller;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.adogo.advertiser.entity.BusinessProfile;
import com.adogo.advertiser.service.BusinessProfileService;

@Controller
@RequestMapping("/advertiser/biz")
public class BusinessProfileController {
private static final Logger logger = Logger.getLogger(BusinessProfileController.class);
	
	@Autowired
	private BusinessProfileService businessProfileService;
		
	@Autowired
	public void setBusinessProfilesService(BusinessProfileService businessProfileService) {
		this.businessProfileService = businessProfileService;
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public ModelAndView createBusinessProfile(@RequestParam String businessProfileJSONString){		
		logger.info("entering... /advertiser/biz/create");
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		/* prepare data */		
		JSONObject jsonObj= new JSONObject(businessProfileJSONString);
		
		String bizName 		= jsonObj.getString("bizName");
		String bizNo		= jsonObj.getString("bizNo");
		String bizOwner		= jsonObj.getString("bizOwner");
		String legalFormNo		= jsonObj.getString("legalFormNo");
		
		/*create a new record of BusinessHours into master table*/
		BusinessProfile businessProfile = new BusinessProfile();
		businessProfile.setBizName(bizName);
		businessProfile.setBizNo(bizNo);
		businessProfile.setBizOwner(bizOwner);
		businessProfile.setLegalFormNo(Integer.parseInt(legalFormNo));
		
		//this.businessProfileService.saveBusinessProfile(businessProfile); 
		
		/* assemble model and view */
		String viewName = "advertiser/advertiser_dashboard";	
        mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/biz/create");
		return mav;
	}
}
