package com.adogo.advertiser.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.adogo.advertiser.entity.IndustryCode;
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
	
	@RequestMapping(value="industrycode/class/{parentIndustryCode}",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public Map<String,Object> getDataSubIndustyCode(@PathVariable String parentIndustryCode){
		logger.info("entering RESTFUL API... /uaas/advertiser/industrycode/sub/"+parentIndustryCode);
		
		ModelAndView mav = new ModelAndView();
		
		//data
		Map<String, Object> model = mav.getModel();
		
		//retrieve data from database via service and dao		
		List<IndustryCode> listIndustryCode = new ArrayList<IndustryCode>();
		
		listIndustryCode = industryCodeService.getIndustryCodeByParentCode(parentIndustryCode);
		
		model.put("listIndustryCode", listIndustryCode);
		
		logger.info("exiting RESTFUL API... /uaas/advertiser/industrycode/sub/");
		return model;
	}


	
	
	@RequestMapping("/")
	public String gotoDashboard(){
		String viewName = "advertiser/advertiser_dashboard";
		return viewName;
	}
	
	@RequestMapping("/index")
	public String gotoDashboard2(){
		String viewName = "advertiser/advertiser_dashboard";
		return viewName;
	}
	
	@RequestMapping("/dashboard")
	public String gotoDashboard3(){
		String viewName = "advertiser/advertiser_dashboard";
		return viewName;
	}
	
	@RequestMapping("/biz/register")
	public String gotoRegisiterBiz(){
		String viewName = "advertiser/advertiser_bizprofile_register";
		return viewName;
	}
	
	@RequestMapping("/biz/edit")
	public String gotoEditBizProfile(){
		String viewName = "advertiser/advertiser_bizprofile_edit";
		return viewName;
	}
	
}
