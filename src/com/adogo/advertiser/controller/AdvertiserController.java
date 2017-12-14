package com.adogo.advertiser.controller;

import java.util.ArrayList;
import java.util.HashMap;
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
import com.adogo.advertiser.entity.IndustryCode;
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
		
		listIndustryCode = industryCodeService.getIndustryCodeByParentCode(parentIndustryCode);
		
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
	
	@RequestMapping("/biz/register.html")
	public String gotoRegisiterBiz(){
		String viewName = "advertiser/advertiser_bizprofile_register";
		return viewName;
	}
	
	@RequestMapping("/biz/create.html")
	public ModelAndView gotoCreateBizProfile(){
		
		ModelAndView mav = new ModelAndView();
		
		String viewName = "advertiser/advertiser_bizprofile_create";
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
	
	
	
	@RequestMapping("/biz/edit.html")
	public ModelAndView gotoEditBizProfile(){
		logger.info("entering... /advertiser/biz/edit.html");
		ModelAndView mav = new ModelAndView();
		String viewName = "advertiser/advertiser_bizprofile_edit";
		
		Map<String,Object> model = mav.getModel();
		
		//TODO To be passed by parameter
		long bizId = 1002781507L;
		BusinessProfile businessProfile = this.businessProfileService.getBusinessProfileByBizId(bizId);
		String bizCode = businessProfile.getIndustryCode();
		
		model.put("businessProfile", businessProfile);
		
		//TODO to optimize data load later
		HashMap<Integer,String> listOfBizCategories=new HashMap<Integer,String>();
		listOfBizCategories.put(0,"Choose a legal form");
		listOfBizCategories.put(1,"Solo business - Not registered");
		listOfBizCategories.put(2,"Solo business - Registered");
		listOfBizCategories.put(3,"Partnership");
		listOfBizCategories.put(4,"Corporation, LLC");
		model.put("listOfBizCategories", listOfBizCategories);
		
		final int LEVEL_1 = 1;
		final int LEVEL_2 = 2;
		final int LEVEL_3 = 3;
		final int LEVEL_4 = 4;
//		final int LEVEL_5 = 5;
		
		List<IndustryCode> naicsLevel1 = new ArrayList<IndustryCode>();
		naicsLevel1 = industryCodeService.getIndustryCodeByLevelNo(LEVEL_1);
		String selectedCodeLevel1 = bizCode.substring(0, 2);
		
		List<IndustryCode> naicsLevel2 = new ArrayList<IndustryCode>();
		naicsLevel2 = industryCodeService.getIndustryCodeByLevelNo(LEVEL_2, bizCode);
		String selectedCodeLevel2 = bizCode.substring(0, 3);
		
		List<IndustryCode> naicsLevel3 = new ArrayList<IndustryCode>();
		naicsLevel3 = industryCodeService.getIndustryCodeByLevelNo(LEVEL_3, bizCode);
		String selectedCodeLevel3 = bizCode.substring(0, 4);
		
		List<IndustryCode> naicsLevel4 = new ArrayList<IndustryCode>();
		naicsLevel4 = industryCodeService.getIndustryCodeByLevelNo(LEVEL_4, bizCode);
		
		model.put("NAICS_level_1", naicsLevel1);
		model.put("NAICS_level_2", naicsLevel2);
		model.put("NAICS_level_3", naicsLevel3);
		model.put("NAICS_level_4", naicsLevel4);
		
		model.put("selectedCodeLevel1", selectedCodeLevel1);
		model.put("selectedCodeLevel2", selectedCodeLevel2);
		model.put("selectedCodeLevel3", selectedCodeLevel3);
//		model.put("selectedCodeLevel4", selectedCodeLevel4);
		
		mav.setViewName(viewName);
		logger.info("exiting... /advertiser/biz/edit.html");
		return mav;
	}
	
	/**
	 * @param bizProfileJSONString
	 * @return
	 * 
	 * @author sfz
	 */
	@RequestMapping("/saveAdvertiserProfile")
	public ModelAndView saveAdvertiserProfile(@RequestParam String bizProfileJSONString){		
		logger.info("entering... /advertiser/biz/saveAdvertiserProfile");
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		/* prepare data */		
		JSONObject jsonObj= new JSONObject(bizProfileJSONString);
		
		String bizName 		= jsonObj.getString("bizName");
		String bizNo 	= jsonObj.getString("bizNo");
		String bizOwner		= jsonObj.getString("bizOwner");
		Integer legalFormNo	= jsonObj.getInt("legalFormNo");
		String industryCode	= jsonObj.getString("industryCode");
		Integer businessType 	= jsonObj.getInt("businessType");
		
		logger.info("bizName="+bizName);
		logger.info("bizNo="+bizNo);
		logger.info("bizOwner="+bizOwner);
		logger.info("legalFormNo="+legalFormNo);
		logger.info("industryCode="+industryCode);
		logger.info("businessType="+businessType);
		
		
		BusinessProfile bp = new BusinessProfile();
		bp.setBizName(bizName);
		bp.setBizNo(bizNo);
		bp.setBizOwner(bizOwner);
		bp.setLegalFormNo(legalFormNo);
		bp.setIndustryCode(industryCode);
		bp.setBizType(businessType);
		
				
		this.businessProfileService.updateBusinessProfile(bp);
		
		/* assemble model and view */
		String viewName = ""; //"/advertiser/biz/edit.html";
        mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/biz/saveAdvertiserProfile");
		return mav;
	}
	
}
