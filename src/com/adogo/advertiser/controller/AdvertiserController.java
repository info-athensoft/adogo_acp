package com.adogo.advertiser.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.adogo.advertiser.entity.IndustryCode;
import com.adogo.advertiser.entity.business.BusinessProfile;
import com.adogo.advertiser.service.BusinessProfileService;
import com.adogo.advertiser.service.IndustryCodeService;

@Controller
@RequestMapping("/advertiser")
public class AdvertiserController {
	
	private static final Logger logger = Logger.getLogger(AdvertiserController.class);
	
	
	@Autowired
	private IndustryCodeService industryCodeService;
		
	@Autowired
	public void setIndustryCodeService(IndustryCodeService industryCodeService) {
		this.industryCodeService = industryCodeService;
	}
	
	@Autowired
	private BusinessProfileService businessProfileService;
		
	@Autowired
	public void setBusinessProfileService(BusinessProfileService businessProfileService) {
		this.businessProfileService = businessProfileService;
	}
	
	
	/**
	 * @return
	 */
	@RequestMapping("/apply")
	public String applyAdvertiserStep1(){
		String viewName = "advertiser/advertiser_apply_agreement";
		return viewName;
	}
	
	/**
	 * @return
	 */
	@RequestMapping("/apply/quiz")
	public ModelAndView applyAdvertiserStep2(){
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		//Map<String,Object> model = mav.getModel();
		
		/* set view */
		String viewName = "advertiser/advertiser_apply_quiz";
		mav.setViewName(viewName);
		
		return mav;
	}
	
	
	
	/**
	 * @return
	 */
	@RequestMapping("/")
	public ModelAndView gotoDashboard(){
		//String viewName = "advertiser/advertiser_dashboard";
		//return viewName;
		return gotoDashboard3();
	}
	
	/**
	 * @return
	 */
	@RequestMapping("/index")
	public ModelAndView gotoDashboard2(){
		//String viewName = "advertiser/advertiser_dashboard";
		//return viewName;
		return gotoDashboard3();
	}
	
	/**
	 * @return
	 */
	@RequestMapping("/dashboard")
	public ModelAndView gotoDashboard3(){
		logger.info("entering... /advertiser/dashboard");
		
		// initial settings 
		ModelAndView mav = new ModelAndView();
		Map<String, Object> model = mav.getModel();
		
		//TODO
		long advertiserId = 1712010001L;
		List<BusinessProfile> listBizProfile = businessProfileService.getBusinessProfileByAdvertiserId(advertiserId);
		model.put("listBizProfile", listBizProfile);
				
		// assemble model and view 
		String viewName = "advertiser/advertiser_dashboard";	
        mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/dashboard");
		return mav;
		
	}
	
	/**
	 * @return
	 * 
	 * @author sfz
	 */
	@RequestMapping(value="/categoryChooseClick",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public Map<String,Object> categoryChooseClick(){
		logger.info("entering categoryChooseClick");
		
		ModelAndView mav = new ModelAndView();
		
		//data
		Map<String, Object> model = mav.getModel();
		
		//retrieve data from database via service and dao		
		List<IndustryCode> categoryList = new ArrayList<IndustryCode>();
		categoryList = industryCodeService.getIndustryCodeByLevelNo(1);
		model.put("categoryList", categoryList);
		
		logger.info("exiting categoryChooseClick");
		return model;
	}
	

	
	
}
