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
import com.adogo.advertiser.service.IndustryCodeService;

@Controller
@RequestMapping("/advertiser/biz")
public class IndustryCodeController {
	
	private static final Logger logger = Logger.getLogger(BusinessProfileController.class);
	
	@Autowired
	private IndustryCodeService industryCodeService;
		
	@Autowired
	public void setIndustryCodeService(IndustryCodeService industryCodeService) {
		this.industryCodeService = industryCodeService;
	}
	
	
	@RequestMapping(value="/industrycode/class/{parentIndustryCode}",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public Map<String,Object> getDataSubIndustyCode(@PathVariable String parentIndustryCode){
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
}
