package com.adogo.advertiser.controller;


import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.adogo.advertiser.entity.BusinessHours;
import com.adogo.advertiser.service.BusinessHoursService;

@Controller
@RequestMapping("/advertiser/booth")
public class BoothController {
	
	private static final Logger logger = Logger.getLogger(BoothController.class);
	
	@Autowired
	private BusinessHoursService businessHoursService;
		
	@Autowired
	public void setBusinessHoursService(BusinessHoursService businessHoursService) {
		this.businessHoursService = businessHoursService;
	}
	
	@RequestMapping("/")
	public String gotoBoothIndex(){
		String viewName = "advertiser/booth_index";
		return viewName;
	}
	
	@RequestMapping("/index")
	public String gotoBoothIndex2(){
		String viewName = "advertiser/booth_index";
		return viewName;
	}
	
	
	@RequestMapping("/create")
	public String gotoCreate(){
		String viewName = "advertiser/booth_create";
		return viewName;
	}
	
	@RequestMapping("/edit")
	public String gotoEdit(){
		String viewName = "advertiser/booth_edit";
		return viewName;
	}
	
	/**
	 * @param adPostJSONString
	 * @return
	 * 
	 * @author sfz
	 */
	@RequestMapping("/saveBusinessHours")
	public ModelAndView saveAdPost(@RequestParam String businessHoursJSONString){		
		logger.info("entering... /advertiser/booth/saveBusinessHours");
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		/* prepare data */		
		JSONObject jsonObj= new JSONObject(businessHoursJSONString);
		
//		Long uId 			= UUIDHelper.getUniqueLongId();
		Long businessId 		= jsonObj.getLong("businessId");
		Integer langNo			= jsonObj.getInt("langNo");
		String day1StartTime 	= jsonObj.getString("day1StartTime");
		String day1EndTime 		= jsonObj.getString("day1EndTime");
		String day2StartTime 	= jsonObj.getString("day2StartTime");
		String day2EndTime 		= jsonObj.getString("day2EndTime");
		String day3StartTime 	= jsonObj.getString("day3StartTime");
		String day3EndTime 		= jsonObj.getString("day3EndTime");
		String day4StartTime 	= jsonObj.getString("day4StartTime");
		String day4EndTime 		= jsonObj.getString("day4EndTime");
		String day5StartTime 	= jsonObj.getString("day5StartTime");
		String day5EndTime 		= jsonObj.getString("day5EndTime");
		String day6StartTime 	= jsonObj.getString("day6StartTime");
		String day6EndTime 		= jsonObj.getString("day6EndTime");
		String day7StartTime 	= jsonObj.getString("day7StartTime");
		String day7EndTime 		= jsonObj.getString("day7EndTime");
		String comment	= jsonObj.getString("comment");
		logger.info("businessId="+businessId);
		logger.info("day1StartTime="+day1StartTime);
		logger.info("day1EndTime="+day1EndTime);
		logger.info("comment="+comment);
		
		
		

		
		/*create a new record of BusinessHours into master table*/
		BusinessHours businessHours = new BusinessHours();
		businessHours.setBusinessId(businessId);
		businessHours.setLangNo(langNo);
		businessHours.setDay1StartTime(day1StartTime);
		businessHours.setDay1EndTime(day1EndTime);
		businessHours.setDay2StartTime(day2StartTime);
		businessHours.setDay2EndTime(day2EndTime);
		businessHours.setDay3StartTime(day3StartTime);
		businessHours.setDay3EndTime(day3EndTime);
		businessHours.setDay4StartTime(day4StartTime);
		businessHours.setDay4EndTime(day4EndTime);
		businessHours.setDay5StartTime(day5StartTime);
		businessHours.setDay5EndTime(day5EndTime);
		businessHours.setDay6StartTime(day6StartTime);
		businessHours.setDay6EndTime(day6EndTime);
		businessHours.setDay7StartTime(day7StartTime);
		businessHours.setDay7EndTime(day7EndTime);
		businessHours.setComment(comment);
		
		this.businessHoursService.persistBusinessHours(businessHours); 
		
		
		
		/* assemble model and view */
		String viewName = "ad/booth";	//TODO booth page does not exist yet
        mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/booth/saveBusinessHours");
		return mav;
	}

}
