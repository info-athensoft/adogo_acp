package com.adogo.advertiser.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	
	@RequestMapping("/")
	public ModelAndView gotoBizProfileIndex(){
//	public ModelAndView gotoBizProfileIndex(@RequestParam long advertiserId){
		logger.info("entering... /advertiser/biz/");
		
		long advertiserId = 1712010001L;	//TODO test: get from session
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		/* assemble model and view */
		Map<String,Object> model = mav.getModel();
		
		//load business profiles
		List<BusinessProfile> listBizProfile = businessProfileService.getBusinessProfileByAdvertiserId(advertiserId);
		//test
		System.out.println("listBizProfile.size()="+listBizProfile.size());
		
		model.put("listBizProfile", listBizProfile);
		
		String viewName = "advertiser/bizprofile_index";	//TODO booth page does not exist yet
        mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/biz/");
		return mav;
	}
	
	
	@RequestMapping("/complete.html")
	public ModelAndView gotoBizProfileComplete(@RequestParam long bizId){
		logger.info("entering... /advertiser/biz/complete.html");
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		/* assemble model and view */
		Map<String,Object> model = mav.getModel();
		
		BusinessProfile businessProfile = businessProfileService.getBusinessProfileByBizId(bizId);
		
		/* assemble data */
        model.put("bizProfile", businessProfile);
		
		String viewName = "advertiser/bizprofile_complete";	
        mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/biz/complete.html");
		return mav;
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Map<String,Object> createBusinessProfile(@RequestParam String businessProfileJSONString){		
		logger.info("entering... /advertiser/biz/create");
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		/* prepare data */		
		JSONObject jsonObj= new JSONObject(businessProfileJSONString);
		
		//TODO Hard Code 
		String advertiserId = "1712010001";
		
//		String advertiserId	= jsonObj.getString("advertiserId");		
		Long bizId			= UUIDHelper.getUniqueLongIdUUID();
		String bizName 		= jsonObj.getString("bizName");
		String bizNo		= jsonObj.getString("bizNo");
		String bizOwner		= jsonObj.getString("bizOwner");
		String legalFormNo	= jsonObj.getString("legalFormNo");
		String industryCode	= jsonObj.getString("industryCode");
		String bizType		= jsonObj.getString("bizType");
		String bizPhone		= jsonObj.getString("bizPhone");
		String bizFax		= jsonObj.getString("bizFax");
		String bizEmail		= jsonObj.getString("bizEmail");
		String bizWebsite	= jsonObj.getString("bizWebsite");
		String bizDesc		= jsonObj.getString("bizDesc");
		
		/*create a new record of BusinessHours into master table*/
		BusinessProfile businessProfile = new BusinessProfile();
		businessProfile.setAdvertiserId(Long.parseLong(advertiserId));		//TODO
		businessProfile.setBizId(bizId);
		businessProfile.setBizName(bizName);
		businessProfile.setBizNo(bizNo);
		businessProfile.setBizOwner(bizOwner);
		businessProfile.setLegalFormNo(Integer.parseInt(legalFormNo));		//TODO
		businessProfile.setIndustryCode(industryCode);
		if(bizType==null || (bizType.trim()).equals("")) {bizType="0";}
		businessProfile.setBizType(Integer.parseInt(bizType));
		businessProfile.setBizPhone(bizPhone);
		businessProfile.setBizFax(bizFax);
		businessProfile.setBizEmail(bizEmail);
		businessProfile.setBizWebsite(bizWebsite);
		businessProfile.setCreateDate(new Date());							//TODO
		businessProfile.setEstablishDate(new Date());						//TODO
		businessProfile.setBizDesc(bizDesc);
		businessProfile.setBizStatus(BusinessStatus.ACTIVE);
		
		logger.info(businessProfile.toString());
		
		this.businessProfileService.saveBusinessProfile(businessProfile); 
		
		/* assemble model and view */
		//String viewName = "advertiser/bizprofile_complete";	
        //mav.setViewName(viewName);
        
        /* assemble data */
        Map<String,Object> model = mav.getModel();
        model.put("businessProfile", businessProfile);
		
		logger.info("exiting... /advertiser/biz/create");
		return model;
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
