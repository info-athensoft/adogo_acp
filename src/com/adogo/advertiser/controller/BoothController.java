package com.adogo.advertiser.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.adogo.advertiser.entity.Booth;
import com.adogo.advertiser.entity.BusinessHours;
import com.adogo.advertiser.entity.BusinessProfile;
import com.adogo.advertiser.service.BoothService;
import com.adogo.advertiser.service.BusinessHoursService;
import com.adogo.advertiser.service.BusinessProfileService;
import com.adogo.advertiser.vo.VOBizProfileBooth;

@Controller
@RequestMapping("/advertiser/booth")
public class BoothController {
	
	private static final Logger logger = Logger.getLogger(BoothController.class);
	
	@Autowired
	private BoothService boothService;
		
	@Autowired
	public void setBoothService(BoothService boothService) {
		this.boothService = boothService;
	}
	
	@Autowired
	private BusinessProfileService businessProfileService;
		
	@Autowired
	public void setBusinessProfileService(BusinessProfileService businessProfileService) {
		this.businessProfileService = businessProfileService;
	}
	
	@Autowired
	private BusinessHoursService businessHoursService;
		
	@Autowired
	public void setBusinessHoursService(BusinessHoursService businessHoursService) {
		this.businessHoursService = businessHoursService;
	}
	
	@RequestMapping("/")
	public ModelAndView gotoBoothIndex(){
//	public ModelAndView gotoBoothIndex(@RequestParam long advertiserId){
		logger.info("entering... /advertiser/booth/");
		
		long advertiserId = 1712010001L;	//TODO test: get from session
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		/* assemble model and view */
		Map<String,Object> model = mav.getModel();
		
		//load business profiles
		List<BusinessProfile> listBizProfile = businessProfileService.getBusinessProfileByAdvertiserId(advertiserId);
		//test
		System.out.println("listBizProfile.size()="+listBizProfile.size());
		
		//load booths
		List<Booth> listBooth = boothService.getBoothByAdvertiserId(advertiserId);
		//test
		System.out.println("listBooth.size()="+listBooth.size());
		
		
		//
		List<VOBizProfileBooth> listVOBizProfileBooth = new ArrayList<VOBizProfileBooth>();
		
		
		//separate listBooth into sub-lists by bizId
		int numOfBizProfile = 0;
		if(listBizProfile!=null){
			numOfBizProfile = listBizProfile.size();
			
		}else{
			logger.info("INFO: Current Advertiser does not have any booth yet.");
		}
		
		
		for(BusinessProfile bizProfile: listBizProfile){
			long currentBizId = bizProfile.getBizId();
			String strCurrentBizId = String.valueOf(currentBizId);
			List<Booth> currentSubListBooth = boothService.getSubListBoothByBizId(listBooth, currentBizId);
			
			VOBizProfileBooth vo_bizProfileBooth = new VOBizProfileBooth();
			vo_bizProfileBooth.setBizProfile(bizProfile);
			vo_bizProfileBooth.setListBooth(currentSubListBooth);
			listVOBizProfileBooth.add(vo_bizProfileBooth);
			
			//test
			System.out.println("\t "+strCurrentBizId+"\t"+currentSubListBooth.size());
		}
		
		model.put("listVOBizProfileBooth", listVOBizProfileBooth);
		model.put("listBizProfile", listBizProfile);
		
		String viewName = "advertiser/booth_index";	//TODO booth page does not exist yet
        mav.setViewName(viewName);
		
        //TODO test
        System.out.println("listBizProfile.size()="+listBizProfile.size());
        System.out.println(listBizProfile);
        
        System.out.println("listVOBizProfileBooth.size()="+listVOBizProfileBooth.size());
        System.out.println(listVOBizProfileBooth);
        
        //end of test
        
		logger.info("exiting... /advertiser/booth/");
		return mav;
	}
	
	@RequestMapping("/index")
	public String gotoBoothIndex2(){
		String viewName = "advertiser/booth_index";
		return viewName;
	}
	
	
	@RequestMapping("/create.html")
	public ModelAndView gotoCreate(@RequestParam long bizId){
		logger.info("entering... /advertiser/booth/create.html");
		
		// initial settings 
		ModelAndView mav = new ModelAndView();
		Map<String, Object> model = mav.getModel();
		
		model.put("bizId", bizId);
		
		String viewName = "advertiser/booth_create";
		mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/booth/create.html");
		return mav;
	}
	
	
	@RequestMapping(value="/create",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Map<String,Object> createBooth(@RequestParam String boothJSONString){		
		logger.info("entering... /advertiser/booth/create");
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		/* prepare data */		
		JSONObject jsonObj= new JSONObject(boothJSONString);
		
		Long userId 			= jsonObj.getLong("userId");
		Long advertiserId		= jsonObj.getLong("advertiserId");
		Long bizId				= jsonObj.getLong("bizId");
		String bizName			= jsonObj.getString("bizName");
		Integer langNo			= jsonObj.getInt("langNo");
		String langBoothName	= jsonObj.getString("langBoothName");
		Integer categoryNo		= jsonObj.getInt("categoryNo");
		String langBizDesc		= jsonObj.getString("langBizDesc");
		
		/*create a new record of Booth into table*/
		Booth booth = new Booth();
		booth.setUserId(userId);
		booth.setAdvertiserId(advertiserId);
		booth.setBizId(bizId);
		booth.setBizName(bizName);
		booth.setLangNo(langNo);
		booth.setBoothName(langBoothName);
		booth.setBizDesc(langBizDesc);
		
		this.boothService.createBooth(booth);
		
		/* assemble model and view */
		Map<String,Object> model = mav.getModel();
		
		logger.info("exiting... /advertiser/booth/create");
		return model;
	}
	
	@RequestMapping("/edit.html")
	public ModelAndView gotoBoothEdit(@RequestParam Long boothId){
		logger.info("entering... /advertiser/booth/edit.html");
		
		System.out.println("boothId="+boothId);
		
		// initial settings 
		ModelAndView mav = new ModelAndView();
		Map<String, Object> model = mav.getModel();
		
		//TODO
//		Booth booth = new Booth();
//		booth.setBoothId(boothId);
//		booth.setLangNo(2052);
//		booth.setLangNo(3084);
		
		Booth booth = boothService.getBoothByBoothId(boothId);
		
		model.put("booth", booth);
		
		String viewName = "advertiser/booth_edit";
		mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/booth/edit.html");
		return mav;
	}
	
	/**
	 * @param adPostJSONString
	 * @return
	 * 
	 * @author sfz
	 */
	@RequestMapping(value="/saveBusinessHours",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Map<String,Object> saveBusinessHours(@RequestParam String businessHoursJSONString){		
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
		Map<String,Object> model = mav.getModel();
		
		//String viewName = "ad/booth";	//TODO booth page does not exist yet
        //mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/booth/saveBusinessHours");
		return model;
	}

}
