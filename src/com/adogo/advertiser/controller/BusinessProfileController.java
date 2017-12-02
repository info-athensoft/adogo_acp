package com.adogo.advertiser.controller;

import java.util.Date;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.adogo.advertiser.entity.BusinessProfile;
import com.adogo.advertiser.entity.BusinessStatus;
import com.adogo.advertiser.service.BusinessProfileService;
import com.athensoft.util.id.UUIDHelper;

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
		
		Long bizId			= UUIDHelper.getUniqueLongIdUUID();
		
		String bizName 		= jsonObj.getString("bizName");
		String bizNo		= jsonObj.getString("bizNo");
		String bizOwner		= jsonObj.getString("bizOwner");
		String legalFormNo	= jsonObj.getString("legalFormNo");
		String industryCode	= jsonObj.getString("industryCode");
		
		
		/*create a new record of BusinessHours into master table*/
		BusinessProfile businessProfile = new BusinessProfile();
		businessProfile.setBizId(bizId);
		businessProfile.setBizName(bizName);
		businessProfile.setBizNo(bizNo);
		businessProfile.setBizOwner(bizOwner);
		businessProfile.setLegalFormNo(Integer.parseInt(legalFormNo));		//TODO
		businessProfile.setIndustryCode(industryCode);
		businessProfile.setCreateDate(new Date());							//TODO
		businessProfile.setBizStatus(BusinessStatus.ACTIVE);
		
		this.businessProfileService.saveBusinessProfile(businessProfile); 
		
		/* assemble model and view */
		String viewName = "advertiser/advertiser_dashboard";	
        mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/biz/list");
		return mav;
	}
	
	/*
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView getBusinessProfileByAdvertiserId(){
		logger.info("entering... /advertiser/biz/create");
		
		// initial settings 
		ModelAndView mav = new ModelAndView();
		
		// assemble model and view 
		String viewName = "advertiser/advertiser_dashboard";	
        mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/biz/list");
		return mav;
	}*/
	
	@RequestMapping(value="/{bizId}",method=RequestMethod.GET)
	public ModelAndView viewBusinessProfile(@PathVariable long bizId){		
		logger.info("entering... /advertiser/biz/{bizId}"+bizId);
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		
		/* assemble model and view */
		String viewName = "advertiser/advertiser_bizprofile_view";	
        mav.setViewName(viewName);
        
		logger.info("entering... /advertiser/biz/{bizId}"+bizId);
		return mav;
	}
}
