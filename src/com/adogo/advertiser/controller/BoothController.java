package com.adogo.advertiser.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.adogo.advertiser.entity.MediaType;
import com.adogo.advertiser.entity.booth.Booth;
import com.adogo.advertiser.entity.booth.BoothImage;
import com.adogo.advertiser.entity.booth.BoothStatus;
import com.adogo.advertiser.entity.booth.BoothText;
import com.adogo.advertiser.entity.business.BusinessAddress;
import com.adogo.advertiser.entity.business.BusinessHours;
import com.adogo.advertiser.entity.business.BusinessProfile;
import com.adogo.advertiser.entity.business.BusinessStatus;
import com.adogo.advertiser.service.BoothService;
import com.adogo.advertiser.service.BusinessAddressService;
import com.adogo.advertiser.service.BusinessHoursService;
import com.adogo.advertiser.service.BusinessProfileService;
import com.adogo.advertiser.vo.VOBizProfileBooth;
import com.adogo.info.lang.LanguageMap;

@Controller
@RequestMapping("/advertiser/booth")
public class BoothController {
	
	private static final Logger logger = Logger.getLogger(BoothController.class);
	
	private static final String MSG_NO_SUCH_USER = "WARNING: No such user or please login in!";
	private static final String MSG_NO_SUCH_ADVERTISER = "WARNING: No such advertiser or please login in!";
	
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
	
	@Autowired
	private BusinessAddressService businessAddressService;
		
	@Autowired
	public void setBusinessAddressService(BusinessAddressService businessAddressService) {
		this.businessAddressService = businessAddressService;
	}
	
	@Autowired
	private LanguageMap langMapObj;
	
	@Autowired
	public void setLanguageMap(LanguageMap langMapObj){
		this.langMapObj = langMapObj;
	}
	
	/**
	 * goto the page of booth index
	 * @param session
	 * @return
	 */
	@RequestMapping("/")
	public ModelAndView gotoBoothIndex(HttpSession session){
		logger.info("entering... /advertiser/booth/");
		
		/* get data from session */
		Object advertiserIdObj = session.getAttribute("advertiserId");
		long advertiserId = 0L;
		if(advertiserIdObj != null){
			advertiserId = (Long)advertiserIdObj;
		}		
		logger.info("advertiserIdObj="+advertiserIdObj);
		logger.info("advertiserId="+advertiserId);
		
		Object userIdObj = session.getAttribute("userId");
		long userId = 0L;
		if(userIdObj != null){
			userId = (Long)userIdObj;
		}		
		logger.info("userIdObj="+userIdObj);
		logger.info("userId="+userId);
		
		//load business profiles in status of PUBLISHED
		List<BusinessProfile> listBizProfile = businessProfileService.getBusinessProfileByAdvertiserId(advertiserId,BusinessStatus.PUBLISHED);
		
		//load booths
		List<Booth> listBooth = boothService.getBoothByAdvertiserId(advertiserId);
		
		/* execute business logic */
		//separate listBooth into sub-lists by bizId
		List<VOBizProfileBooth> listVOBizProfileBooth = new ArrayList<VOBizProfileBooth>();
		int numOfBizProfile = 0;
		numOfBizProfile = listBizProfile.size();
		if(numOfBizProfile==0){
			logger.info("INFO: Current Advertiser does not have any booth yet.");
		}
		
		for(BusinessProfile bizProfile: listBizProfile){
			long currentBizId = bizProfile.getBizId();
//			String strCurrentBizId = String.valueOf(currentBizId);
			List<Booth> currentSubListBooth = boothService.getSubListBoothByBizId(listBooth, currentBizId);
			
			VOBizProfileBooth vo_bizProfileBooth = new VOBizProfileBooth();
			vo_bizProfileBooth.setBizProfile(bizProfile);
			vo_bizProfileBooth.setListBooth(currentSubListBooth);
			listVOBizProfileBooth.add(vo_bizProfileBooth);
		}
		
//		logger.info("langMapObj="+langMapObj);
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		Map<String,Object> model = mav.getModel();
		
		/* set data */
		model.put("listVOBizProfileBooth", listVOBizProfileBooth);
		model.put("listBizProfile", listBizProfile);
		model.put("langMapObj", langMapObj);
		
		/* set view */
		String viewName = "advertiser/booth_index";
        mav.setViewName(viewName);
        
		logger.info("exiting... /advertiser/booth/");
		return mav;
	}
	
	@RequestMapping("/index")
	public String gotoBoothIndex2(){
		logger.info("entering... /advertiser/booth/index");
		
		/* set view */
		String viewName = "advertiser/booth_index";
		
		logger.info("entering... /advertiser/booth/index");
		return viewName;
	}
	
	
	/**
	 * goto to page of booth create
	 * @param bizId
	 * @return
	 */
	@RequestMapping("/create.html")
	public ModelAndView gotoBoothCreate(@RequestParam long bizId){
		logger.info("entering... /advertiser/booth/create.html");
		
		/* execute business logic */
		BusinessProfile bp = businessProfileService.getBusinessProfileByBizId(bizId);
		BusinessAddress hqAddress = businessAddressService.getHQAddressByBizId(bizId);
		bp.setHqAddress(hqAddress);
		
		//test
		logger.info(bp.toString());
		logger.info(hqAddress.toString());
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		Map<String, Object> model = mav.getModel();
		
		/* set data */
		model.put("bizProfile", bp);
		model.put("hqAddress", hqAddress);
		
		/* set view */
		String viewName = "advertiser/booth_create";
		mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/booth/create.html");
		return mav;
	}
	
	
	/**
	 * create a booth
	 * @param boothJSONString
	 * @return
	 */
	@RequestMapping(value="/create",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Map<String,Object> createBooth(HttpSession session, @RequestParam String boothJSONString){		
		logger.info("entering... /advertiser/booth/create");
		
		/* get data from session */
		Object userIdObj = session.getAttribute("userId");
		long userId = 0L;
		String errorMsg = "";
		
		if(userIdObj != null){
			userId = (Long)userIdObj;
		}else{
			errorMsg = MSG_NO_SUCH_USER;
		}
		
		/* get data from JSON */		
		JSONObject jsonObj= new JSONObject(boothJSONString);
		
		Long advertiserId		= jsonObj.getLong("advertiserId");
		Long bizId				= jsonObj.getLong("bizId");
		String bizName			= jsonObj.getString("bizName");
		Integer langNo			= jsonObj.getInt("langNo");
		String langBoothName	= jsonObj.getString("langBoothName");
		Integer categoryNo		= jsonObj.getInt("categoryNo");
		String langBizDesc		= jsonObj.getString("langBizDesc");
		String boothImg			= jsonObj.getString("boothImg");
		
		//booth banner image
		String boothBannerImgUrl= jsonObj.getString("boothBannerImg");
		
		//booth introduction 
		String textTitle1 		= jsonObj.getString("textTitle1");
		String text1 			= jsonObj.getString("text1");
		String textTitle2 		= jsonObj.getString("textTitle2");
		String text2 			= jsonObj.getString("text2");
		String textTitle3 		= jsonObj.getString("textTitle3");
		String text3 			= jsonObj.getString("text3");
		
		//business hours
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
		String comment			= jsonObj.getString("comment");
		
		/* prepare data */
		final Long boothId = Booth.createBoothId(bizId, langNo);
		logger.info("boothId="+boothId);
		final Date today = new Date();
		
		//booth basic information
		Booth booth = new Booth();
		booth.setUserId(userId);
		booth.setAdvertiserId(advertiserId);
		booth.setBizId(bizId);
		booth.setBizName(bizName);
		booth.setLangNo(langNo);
		booth.setBoothId(boothId);
		booth.setBoothName(langBoothName);
		booth.setBoothImg(boothImg);
		booth.setCategoryNo(categoryNo);
		booth.setBizDesc(langBizDesc);
		booth.setCreateDate(today);
		booth.setModifyDate(today);
		booth.setBoothStatus(BoothStatus.CREATED);
		
		//booth banner image
		BoothImage boothBanner = new BoothImage();
		boothBanner.setUserId(userId);
		boothBanner.setAdvertiserId(advertiserId);
		boothBanner.setBizId(bizId);
		boothBanner.setLangNo(langNo);
		boothBanner.setBoothId(boothId);
		boothBanner.setMediaUrl(boothBannerImgUrl);
		boothBanner.setMediaType(MediaType.BANNER_IMAGE);		
		
		//booth introduction
		BoothText bt1 = new BoothText();
		bt1.setUserId(userId);
		bt1.setAdvertiserId(advertiserId);
		bt1.setBizId(bizId);
		bt1.setLangNo(langNo);
		bt1.setBoothId(boothId);
		bt1.setTextTitle(textTitle1);
		bt1.setTextContent(text1);
		bt1.setSortNo(1);				//HARDCODE
		
		BoothText bt2 = new BoothText();
		bt2.setUserId(userId);
		bt2.setAdvertiserId(advertiserId);
		bt2.setBizId(bizId);
		bt2.setLangNo(langNo);
		bt2.setBoothId(boothId);
		bt2.setTextTitle(textTitle2);
		bt2.setTextContent(text2);
		bt2.setSortNo(2);				//HARDCODE
		
		BoothText bt3 = new BoothText();
		bt3.setUserId(userId);
		bt3.setAdvertiserId(advertiserId);
		bt3.setBizId(bizId);
		bt3.setLangNo(langNo);
		bt3.setBoothId(boothId);
		bt3.setTextTitle(textTitle3);
		bt3.setTextContent(text3);
		bt3.setSortNo(3);				//HARDCODE
		
		List<BoothText> boothTextList = new ArrayList<BoothText>();
		boothTextList.add(bt1);
		boothTextList.add(bt2);
		boothTextList.add(bt3);
		
		//business hours
		BusinessHours businessHours = new BusinessHours();
		businessHours.setUserId(userId);
		businessHours.setAdvertiserId(advertiserId);
		businessHours.setBizId(bizId);
		businessHours.setLangNo(langNo);
		businessHours.setBoothId(Booth.createBoothId(bizId, langNo));		
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
		
		// set contained objects
		booth.setBoothBanner(boothBanner);
		booth.setBusinessHours(businessHours);
		booth.setBoothTextList(boothTextList);
		
		/* execute business logic */
		this.boothService.createBooth(booth);
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		Map<String,Object> model = mav.getModel();
		
		/* set data */
		model.put("errorMsg", errorMsg);
		
		logger.info("exiting... /advertiser/booth/create");
		return model;
	}
	
	/**
	 * goto the page of boot edit
	 * @param boothId
	 * @return
	 */
	@RequestMapping("/edit.html")
	public ModelAndView gotoBoothEdit(@RequestParam Long boothId){
		logger.info("entering... /advertiser/booth/edit.html");
		
		logger.info("boothId="+boothId);
		
		/* execute business logic */
		Booth booth = boothService.getBoothByBoothId(boothId);
		
		/* assemble model and view */ 
		ModelAndView mav = new ModelAndView();
		Map<String, Object> model = mav.getModel();
		
		/* set data */
		model.put("booth", booth);
		
		/* set view */
		String viewName = "advertiser/booth_edit";
		mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/booth/edit.html");
		return mav;
	}
	
	/**
	 * save update of business hours
	 * @param businessHoursJSONString
	 * @return
	 * 
	 * @author sfz
	 */
	@RequestMapping(value="/saveBusinessHours",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Map<String,Object> saveBusinessHours(HttpSession session, @RequestParam String businessHoursJSONString){		
		logger.info("entering... /advertiser/booth/saveBusinessHours");
		
		/* get data from session */
		Object userIdObj = session.getAttribute("userId");
		Object advertiserIdObj = session.getAttribute("advertiserId");
		long userId = 0L;
		long advertiserId = 0L;
		String errorMsg = "";
		
		if(userIdObj != null){
			userId = (Long)userIdObj;
		}else{
			errorMsg = MSG_NO_SUCH_USER;
		}
		
		if(advertiserIdObj != null){
			advertiserId = (Long)advertiserIdObj;
		}else{
			errorMsg = MSG_NO_SUCH_ADVERTISER;
		}
		
		
		/* get data from JSON */		
		JSONObject jsonObj= new JSONObject(businessHoursJSONString);
		
		Long bizId 				= jsonObj.getLong("businessId");
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
		String comment			= jsonObj.getString("comment");

		/* prepare data */
		BusinessHours businessHours = new BusinessHours();
		businessHours.setUserId(userId);
		businessHours.setAdvertiserId(advertiserId);
		businessHours.setBizId(bizId);
		businessHours.setLangNo(langNo);
		businessHours.setBoothId(Booth.createBoothId(bizId, langNo));
		
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
		
		/* execute business logic */
		this.businessHoursService.persistBusinessHours(businessHours); 
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		Map<String,Object> model = mav.getModel();
		
		logger.info("exiting... /advertiser/booth/saveBusinessHours");
		return model;
	}
}