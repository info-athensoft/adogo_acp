package com.adogo.advertiser.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	@RequestMapping("/apply")
	public String applyAdvertiserStep1(){
		String viewName = "advertiser/advertiser_apply_agreement";
		return viewName;
	}
	
	@RequestMapping("/apply2")
	public ModelAndView applyAdvertiserStep2(){
		ModelAndView mav = new ModelAndView();
		
		String viewName = "advertiser/advertiser_apply_form";
		mav.setViewName(viewName);
		
		
		//data
		final int LEVEL_1 = 1;
//		final int LEVEL_2 = 2;
//		final int LEVEL_3 = 3;
//		final int LEVEL_4 = 4;
//		final int LEVEL_5 = 5;
		
		List<IndustryCode> naicsLevel1 = new ArrayList<IndustryCode>();
		naicsLevel1 = industryCodeService.getIndustryCodeByLevelNo(LEVEL_1);
		
		Map<String,Object> model = mav.getModel();
		model.put("NAICS_level_1", naicsLevel1);
		
		return mav;
	}
	
	@RequestMapping(value="/industrycode/class/{parentIndustryCode}",method=RequestMethod.GET,produces="application/json")
	//@RequestMapping(value="/industrycode",method=RequestMethod.POST,produces="application/json") //working
	@ResponseBody
	public Map<String,Object> getDataSubIndustyCode(@PathVariable String parentIndustryCode){
	//public Map<String,Object> getDataSubIndustyCode(@RequestParam String parentIndustryCode){ //working
		logger.info("entering RESTFUL API ... /advertiser/industrycode/sub/"+parentIndustryCode);
		
		ModelAndView mav = new ModelAndView();
		
		//data
		Map<String, Object> model = mav.getModel();
		
		//retrieve data from database via service and dao		
		List<IndustryCode> listIndustryCode = new ArrayList<IndustryCode>();
		
		if (parentIndustryCode.indexOf("-")!=-1) {
			String[] codes = parentIndustryCode.split("-");
			int[] arrayCode = IntStream.rangeClosed(Integer.parseInt(codes[0]), Integer.parseInt(codes[1])).toArray();
			for(int code : arrayCode){
				listIndustryCode.addAll(industryCodeService.getIndustryCodeByParentCode(Integer.toString(code)));
			}
		}
		else {
			listIndustryCode = industryCodeService.getIndustryCodeByParentCode(parentIndustryCode);
		}
		
		model.put("listIndustryCode", listIndustryCode);
		
		logger.info("exiting RESTFUL API... /advertiser/industrycode/sub/");
		return model;
	}
	
	@RequestMapping("/")
	public ModelAndView gotoDashboard(){
		//String viewName = "advertiser/advertiser_dashboard";
		//return viewName;
		return gotoDashboard3();
	}
	
	@RequestMapping("/index")
	public ModelAndView gotoDashboard2(){
		//String viewName = "advertiser/advertiser_dashboard";
		//return viewName;
		return gotoDashboard3();
	}
	
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
