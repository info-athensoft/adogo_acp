package com.adogo.admin.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.adogo.ad.entity.BusinessProfile;
import com.adogo.ad.service.BusinessProfileService;

@Controller
public class BusinessController {
	//value="/biz/{bizNo}",method=RequestMethod.GET
	
	private BusinessProfileService businessProfileService;
	
	@Autowired
	public void setBusinessProfileService(BusinessProfileService businessProfileService) {
		this.businessProfileService = businessProfileService;
	}
	
	@RequestMapping(value="/bizprofile")
	public String updateBizProfile(){
		String url = "/bizprofile";
		System.out.println("INFO: url "+url);
		return "biz_profile";
	}
	
	
	@RequestMapping(value="/bizprofile/{bizNo}",method=RequestMethod.GET)
	public ModelAndView getBizProfile(@PathVariable int bizNo){
		System.out.println("INFO: GET "+bizNo);
		
		ModelAndView mav = new ModelAndView();
		
		String viewName = "biz_profile";
		mav.setViewName(viewName);
		
//		BusinessProfile bp = businessProfileService.getBusinessProfileByBizId(bizNo);
		BusinessProfile bp = businessProfileService.getBusinessProfileByBizNo(bizNo);
		
		Map<String, Object> data = mav.getModel();
		data.put("businessProfile", bp);
		return mav;
	}
	
	@RequestMapping(value="/bizprofile/{bizNo}",method=RequestMethod.POST)
	public ModelAndView updateBizProfile(@PathVariable int bizNo,
			@RequestParam String cp_firstname){
		System.out.println("INFO: POST "+bizNo);
		
		BusinessProfile bp = new BusinessProfile();
		bp.setBiz_no(bizNo);
		bp.setCp_firstname(cp_firstname);
		businessProfileService.updateBusinessProfile(bp);
		
		
		ModelAndView mav = new ModelAndView();
		
		String viewName = "biz_profile";
		mav.setViewName(viewName);
		
		bp = businessProfileService.getBusinessProfileByBizNo(bizNo);
		
		Map<String, Object> data = mav.getModel();
		data.put("businessProfile", bp);	
		
		return mav;
	}

	
	
	//test
	/*
	public ResponseEntity<String> getUser(){
		String s = "";
		return new ResponseEntity<String>(s, HttpStatus.OK);
	}*/
}