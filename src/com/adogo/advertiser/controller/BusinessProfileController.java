package com.adogo.advertiser.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

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

import com.adogo.advertiser.entity.BusinessAddress;
import com.adogo.advertiser.entity.BusinessOnlinePresence;
import com.adogo.advertiser.entity.BusinessProfile;
import com.adogo.advertiser.entity.BusinessStatus;
import com.adogo.advertiser.entity.BusinessType;
import com.adogo.advertiser.entity.IndustryCode;
import com.adogo.advertiser.service.BusinessAddressService;
import com.adogo.advertiser.service.BusinessOnlinePresenceService;
import com.adogo.advertiser.service.BusinessProfileService;
import com.adogo.advertiser.service.IndustryCodeService;
import com.athensoft.util.id.UUIDHelper;

@Controller
@RequestMapping("/advertiser/biz")
public class BusinessProfileController {
	private static final Logger logger = Logger.getLogger(BusinessProfileController.class);
	
	private static final String MSG_NO_SUCH_ADVERTISER = "WARNING: No such advertiser or please login in!";
	
	@Autowired
	private BusinessProfileService businessProfileService;
		
	@Autowired
	public void setBusinessProfilesService(BusinessProfileService businessProfileService) {
		this.businessProfileService = businessProfileService;
	}
	
	@Autowired
	private BusinessAddressService businessAddressService;
		
	@Autowired
	public void setBusinessAddressService(BusinessAddressService businessAddressService) {
		this.businessAddressService = businessAddressService;
	}
	
	@Autowired
	private BusinessOnlinePresenceService businessOnlinePresenceService;
		
	@Autowired
	public void setBusinessOnlinePresenceService(BusinessOnlinePresenceService businessOnlinePresenceService) {
		this.businessOnlinePresenceService = businessOnlinePresenceService;
	}
	
	@Autowired
	private IndustryCodeService industryCodeService;
		
	@Autowired
	public void setIndustryCodeService(IndustryCodeService industryCodeService) {
		this.industryCodeService = industryCodeService;
	}
	
	
	/**
	 * @param session
	 * @return
	 */
	@RequestMapping("/")
	public ModelAndView gotoBizProfileIndex(HttpSession session){
		logger.info("entering... /advertiser/biz/");
		
		/* get data from session */
		Object advertiserIdObj = session.getAttribute("advertiserId");
		long advertiserId = 0L;
		String errorMsg = "";
		
		if(advertiserIdObj != null){
			advertiserId = (Long)advertiserIdObj;
		}else{
			errorMsg = MSG_NO_SUCH_ADVERTISER;
		}
		
		/* execute business logic */
		List<BusinessProfile> listBizProfile = businessProfileService.getBusinessProfileByAdvertiserId(advertiserId,BusinessStatus.ACTIVE);
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		Map<String,Object> model = mav.getModel();
		
		/* set data */
		model.put("listBizProfile", listBizProfile);
		model.put("errorMsg", errorMsg);
		
		/* set view */
		String viewName = "advertiser/bizprofile_index";
        mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/biz/");
		return mav;
	}
	
	/**
	 * @param session
	 * @return
	 */
	@RequestMapping("/manage.html")
	public ModelAndView gotoBizProfileManage(HttpSession session){
		logger.info("entering... /advertiser/biz/manage.html");
		
		/* get data from session */
		Object advertiserIdObj = session.getAttribute("advertiserId");
		long advertiserId = 0L;
		String errorMsg = "";
		
		if(advertiserIdObj != null){
			advertiserId = (Long)advertiserIdObj;
		}else{
			errorMsg = MSG_NO_SUCH_ADVERTISER;
		}
		
		/* execute business logic */
		List<BusinessProfile> listBizProfile = businessProfileService.getBusinessProfileByAdvertiserId(advertiserId);
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		Map<String,Object> model = mav.getModel();
		
		/* set data */
		model.put("listBizProfile", listBizProfile);
		model.put("errorMsg", errorMsg);
		
		/* set view */
		String viewName = "advertiser/bizprofile_manage";	
        mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/biz/manage.html");
		return mav;
	}
	

	/**
	 * @return
	 */
	@RequestMapping("/create.html")
	public ModelAndView gotoBizProfileCreate(){
		logger.info("entering... /advertiser/biz/create.html");
		
		/* execute business logic */
		/* prepare industry code */
		final int LEVEL_1 = 1;
//		final int LEVEL_2 = 2;
//		final int LEVEL_3 = 3;
//		final int LEVEL_4 = 4;
//		final int LEVEL_5 = 5;
		
		List<IndustryCode> naicsLevel1 = new ArrayList<IndustryCode>();
		naicsLevel1 = industryCodeService.getIndustryCodeByLevelNo(LEVEL_1);
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		Map<String,Object> model = mav.getModel();
		
		/* set data */
		model.put("NAICS_level_1", naicsLevel1);
		
		/* set view */
		String viewName = "advertiser/bizprofile_create";
		mav.setViewName(viewName);
		
		logger.info("entering... /advertiser/biz/create.html");
		return mav;
	}
	
	
	/**
	 * @param bizId
	 * @return
	 */
	@RequestMapping("/complete.html")
	public ModelAndView gotoBizProfileComplete(@RequestParam long bizId){
		logger.info("entering... /advertiser/biz/complete.html");
		
		/* execute business logic */
		BusinessProfile businessProfile = businessProfileService.getBusinessProfileByBizId(bizId);
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		Map<String,Object> model = mav.getModel();
				
		/* set data */
        model.put("bizProfile", businessProfile);
		
        /* set view */
		String viewName = "advertiser/bizprofile_complete";	
        mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/biz/complete.html");
		return mav;
	}
	
	
	/**
	 * @param bizId
	 * @return
	 */
	@RequestMapping("/edit.html")
	public ModelAndView gotoBizProfileEdit(@RequestParam long bizId){
		logger.info("entering... /advertiser/biz/edit.html");
		
		/* execute business logic */
		BusinessProfile businessProfile = this.businessProfileService.getBusinessProfileByBizId(bizId);
		BusinessAddress hqAddress = this.businessAddressService.getHQAddressByBizId(bizId);
		List<BusinessOnlinePresence> onlinePresenceList = this.businessOnlinePresenceService.getBusinessPresenceByBizId(bizId);
		
		Map<String,String> presenceURLMap = new HashMap<String,String>();
		
		for(BusinessOnlinePresence bop : onlinePresenceList){
			int index = bop.getPresenceNo();
			String prefixURL = "presenceURL";
			String key = prefixURL+index;
			String value = bop.getPresenceURL();
			presenceURLMap.put(key, value);
		}
		
		IndustryCode industryCodeObj = new IndustryCode();
		String strIndustryCode = businessProfile.getIndustryCode();
		
		//TODO to optimize data load later
		HashMap<Integer,String> listOfBizCategories=new HashMap<Integer,String>();
		listOfBizCategories.put(0,"Choose a legal form");
		listOfBizCategories.put(1,"Solo business - Not registered");
		listOfBizCategories.put(2,"Solo business - Registered");
		listOfBizCategories.put(3,"Partnership");
		listOfBizCategories.put(4,"Corporation, LLC");
		
		final int LEVEL_1 = 1;
		final int LEVEL_2 = 2;
		final int LEVEL_3 = 3;
		final int LEVEL_4 = 4;
//		final int LEVEL_5 = 5;
		
		List<IndustryCode> naicsLevel1 = new ArrayList<IndustryCode>();
		naicsLevel1 = industryCodeService.getIndustryCodeByLevelNo(LEVEL_1);
		String selectedCodeLevel1 = strIndustryCode.substring(0, 2);
		
		List<IndustryCode> naicsLevel2 = new ArrayList<IndustryCode>();
		naicsLevel2 = industryCodeService.getIndustryCodeByLevelNo(LEVEL_2, strIndustryCode);
		String selectedCodeLevel2 = strIndustryCode.substring(0, 3);
		
		List<IndustryCode> naicsLevel3 = new ArrayList<IndustryCode>();
		naicsLevel3 = industryCodeService.getIndustryCodeByLevelNo(LEVEL_3, strIndustryCode);
		String selectedCodeLevel3 = strIndustryCode.substring(0, 4);
		
		List<IndustryCode> naicsLevel4 = new ArrayList<IndustryCode>();
		naicsLevel4 = industryCodeService.getIndustryCodeByLevelNo(LEVEL_4, strIndustryCode);
		
		int bizType = businessProfile.getBizType();
		BusinessType bt = new BusinessType();
		bt.parseBusinessTypeValue(bizType);
		Boolean boolProd = bt.isProdType();
		Boolean boolEProd = bt.isEProdType();
		Boolean boolService = bt.isServiceType();
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		
		/* set data */
		Map<String,Object> model = mav.getModel();
		model.put("businessProfile", businessProfile);
		model.put("hqAddress", hqAddress);
		model.put("listOfBizCategories", listOfBizCategories);
		
		//business type check-box value
		model.put("bizType_product", boolProd);
		model.put("bizType_eproduct", boolEProd);
		model.put("bizType_service", boolService);
		
		//online presence
		model.put("presenceURL1", presenceURLMap.get("presenceURL1"));
		model.put("presenceURL2", presenceURLMap.get("presenceURL2"));
		model.put("presenceURL3", presenceURLMap.get("presenceURL3"));
		model.put("presenceURL4", presenceURLMap.get("presenceURL4"));
		model.put("presenceURL5", presenceURLMap.get("presenceURL5"));
		model.put("presenceURL6", presenceURLMap.get("presenceURL6"));
		
		//industry code
		model.put("industryCodeObj", industryCodeObj);
		model.put("NAICS_level_1", naicsLevel1);
		model.put("NAICS_level_2", naicsLevel2);
		model.put("NAICS_level_3", naicsLevel3);
		model.put("NAICS_level_4", naicsLevel4);
		model.put("selectedCodeLevel1", selectedCodeLevel1);
		model.put("selectedCodeLevel2", selectedCodeLevel2);
		model.put("selectedCodeLevel3", selectedCodeLevel3);
//		model.put("selectedCodeLevel4", selectedCodeLevel4);
		
		/* set view */
		String viewName = "advertiser/bizprofile_edit";
		mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/biz/edit.html");
		return mav;
	}
	
	
	/**
	 * Disable a business profile, usually by client
	 * @param bizId
	 * @return
	 */
	@RequestMapping("/publish.html")
	public ModelAndView gotoBizProfilePublish(@RequestParam long bizId){
		logger.info("entering... /advertiser/biz/publish.html");
		
		/* execute business logic */
		BusinessProfile bp = businessProfileService.getBusinessProfileByBizId(bizId);
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		Map<String,Object> model = mav.getModel();
		
		/* set data */
		model.put("bizProfile", bp);
		
		/* set view */
		String viewName = "advertiser/bizprofile_publish";
		mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/biz/publish.html");
		return mav;
	}
	
	
	/**
	 * Disable a business profile, usually by client
	 * @param bizId
	 * @return
	 */
	@RequestMapping("/disable.html")
	public ModelAndView gotoBizProfileDisable(@RequestParam long bizId){
		logger.info("entering... /advertiser/biz/disable.html");
		
		/* execute business logic */
		BusinessProfile bp = businessProfileService.getBusinessProfileByBizId(bizId);
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		Map<String,Object> model = mav.getModel();
		
		/* set data */
		model.put("bizProfile", bp);
		
		/* set view */
		String viewName = "advertiser/bizprofile_disable";
		mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/biz/disable.html");
		return mav;
	}
	
	
	/**
	 * Trash a business profile, usually by client
	 * @param bizId
	 * @return
	 */
	@RequestMapping("/trash.html")
	public ModelAndView gotoBizProfileTrash(@RequestParam long bizId){
		logger.info("entering... /advertiser/biz/trash.html");
		
		/* execute business logic */
		BusinessProfile bp = businessProfileService.getBusinessProfileByBizId(bizId);
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		Map<String,Object> model = mav.getModel();
		
		/* set data */
		model.put("bizProfile", bp);
		
		/* set view */
		String viewName = "advertiser/bizprofile_trash";
		mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/biz/trash.html");
		return mav;
	}
	
	
	/**
	 * @param businessProfileJSONString
	 * @return
	 */
	@RequestMapping(value="/create",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Map<String,Object> createBizProfile(HttpSession session, @RequestParam String businessProfileJSONString){		
		logger.info("entering... /advertiser/biz/create");
		
		/* get data from session */
		Object advertiserIdObj = session.getAttribute("advertiserId");
		long advertiserId = 0L;
		String errorMsg = "";
		
		if(advertiserIdObj != null){
			advertiserId = (Long)advertiserIdObj;
		}else{
			errorMsg = MSG_NO_SUCH_ADVERTISER;
		}
		
		/* prepare data */		
		JSONObject jsonObj= new JSONObject(businessProfileJSONString);
		
		Long bizId			= UUIDHelper.getUniqueLongIdUUID();
		String bizName 		= jsonObj.getString("bizName");
		String bizNo		= jsonObj.getString("bizNo");
		String bizOwner		= jsonObj.getString("bizOwner");
		String legalFormNo	= jsonObj.getString("legalFormNo");
		String industryCode	= jsonObj.getString("industryCode");
		String bizDesc		= jsonObj.getString("bizDesc");
		Integer bizTypeProduct  = jsonObj.getInt("bizTypeProduct");		//bizType
		Integer bizTypeEProduct = jsonObj.getInt("bizTypeEProduct");	//bizType
		Integer bizTypeService  = jsonObj.getInt("bizTypeService");		//bizType
		String streetNo		= jsonObj.getString("streetNo");
		String streetType	= jsonObj.getString("streetType");
		String streetName	= jsonObj.getString("streetName");
		String portType		= jsonObj.getString("portType");
		String portNo		= jsonObj.getString("portNo");
		String cityName		= jsonObj.getString("cityName");
		String provName		= jsonObj.getString("provName");
		String postalCode	= jsonObj.getString("postalCode");
		String bizPhone		= jsonObj.getString("bizPhone");
		String bizFax		= jsonObj.getString("bizFax");
		String bizEmail		= jsonObj.getString("bizEmail");
		String bizWebsite	= jsonObj.getString("bizWebsite");
		
		//field - bizType
		Integer bizType 	= bizTypeProduct+bizTypeEProduct+bizTypeService;
		
		BusinessProfile businessProfile = new BusinessProfile();
		businessProfile.setAdvertiserId(advertiserId);
		businessProfile.setBizId(bizId);
		businessProfile.setBizName(bizName);
		businessProfile.setBizNo(bizNo);
		businessProfile.setBizOwner(bizOwner);
		businessProfile.setLegalFormNo(Integer.parseInt(legalFormNo));		
		businessProfile.setIndustryCode(industryCode);
		businessProfile.setBizType(bizType);
		businessProfile.setBizDesc(bizDesc);
		businessProfile.setBizPhone(bizPhone);
		businessProfile.setBizFax(bizFax);
		businessProfile.setBizEmail(bizEmail);
		businessProfile.setBizWebsite(bizWebsite);
		businessProfile.setEstablishDate(new Date());
		businessProfile.setCreateDate(businessProfile.getEstablishDate());							
		businessProfile.setModifyDate(businessProfile.getEstablishDate());							
		businessProfile.setBizStatus(BusinessStatus.CREATED);
		
		BusinessAddress hqAddress = new BusinessAddress();
		hqAddress.setBizId(bizId);
		hqAddress.setStreetNo(streetNo);
		hqAddress.setStreetType(streetType);
		hqAddress.setStreetName(streetName);
		hqAddress.setPortType(portType);
		hqAddress.setPortNo(portNo);
		hqAddress.setCityName(cityName);
		hqAddress.setProvName(provName);
		hqAddress.setPostalCode(postalCode);
		hqAddress.setLocationType(BusinessAddress.LOC_TYPE_HQ);
		
		businessProfile.setHqAddress(hqAddress);
		
		logger.info(businessProfile.toString());
		
		/* execute business logic */
		this.businessProfileService.createBusinessProfile(businessProfile);
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		Map<String,Object> model = mav.getModel();
		
        /* set data */
        model.put("businessProfile", businessProfile);
        model.put("errorMsg", errorMsg);
        
        /* set view */
        
		logger.info("exiting... /advertiser/biz/create");
		return model;
	}


	/**
	 * @param businessProfileJSONString
	 * @return
	 */
	@RequestMapping(value="/complete",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Map<String,Object> completeBizProfile(@RequestParam String businessProfileJSONString){		
		logger.info("entering... /advertiser/biz/complete");
		
		/* prepare data */		
		JSONObject jsonObj= new JSONObject(businessProfileJSONString);
		
		Long bizId			= jsonObj.getLong("bizId");
		String userId		= jsonObj.getString("userId");
		String advertiserId	= jsonObj.getString("advertiserId");
		
		// populate presence id and url
		final int PRESENCE_COUNT = 6;						//TODO HardCode
		String[] presenceNo = new String[PRESENCE_COUNT];
		String[] presenceURL = new String[PRESENCE_COUNT];
		
		List<BusinessOnlinePresence> bizOnlinePresenceList = new ArrayList<BusinessOnlinePresence>();
		
		for(int i =0 ; i<PRESENCE_COUNT; i++){
			String strNo = "presenceNo"+(i+1);
			presenceNo[i] = jsonObj.getString(strNo);
			String strURL = "presenceURL"+(i+1);
			presenceURL[i] = jsonObj.getString(strURL);
			
			BusinessOnlinePresence bop = new BusinessOnlinePresence();
			bop.setBizId(bizId);
			bop.setUserId(Long.parseLong(userId));
			bop.setAdvertiserId(Long.parseLong(advertiserId));
			bop.setPresenceNo(Integer.parseInt(presenceNo[i]));
			bop.setPresenceURL(presenceURL[i]);
			bop.setPresenceStatus(BusinessOnlinePresence.ACTIVE);
			
			bizOnlinePresenceList.add(bop);
		}
//		logger.info(bizOnlinePresenceList.toString());
		
		
		/* execute business logic */
		//create a new record of BusinessOnlinePresence into master table
		this.businessOnlinePresenceService.createBusinessOnlinePresence(bizOnlinePresenceList); 
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
        
        /* set data */
        Map<String,Object> model = mav.getModel();
        model.put("bizOnlinePresenceList", bizOnlinePresenceList);
		
        /* set view */

        logger.info("exiting... /advertiser/biz/complete");
		return model;
	}
	
	/**
	 * @param bizProfileJSONString
	 * @return
	 * 
	 * @author sfz
	 */
	@RequestMapping(value="/save",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Map<String,Object> saveBizProfile(@RequestParam String bizProfileJSONString){		
		logger.info("entering... /advertiser/biz/save");
		
		/* prepare data */		
		JSONObject jsonObj= new JSONObject(bizProfileJSONString);
		
		//biz profile
		Long bizId				= jsonObj.getLong("bizId");
		String bizName 			= jsonObj.getString("bizName");
		String bizNo 			= jsonObj.getString("bizNo");
		String bizOwner			= jsonObj.getString("bizOwner");
		Integer legalFormNo		= jsonObj.getInt("legalFormNo");
		String industryCode		= jsonObj.getString("industryCode");
		String bizDesc			= jsonObj.getString("bizDesc");
		
		Integer bizTypeProduct  = jsonObj.getInt("bizTypeProduct");		//bizType
		Integer bizTypeEProduct = jsonObj.getInt("bizTypeEProduct");	//bizType
		Integer bizTypeService  = jsonObj.getInt("bizTypeService");		//bizType
		
		//contact info
		String streetNo		= jsonObj.getString("streetNo");
		String streetType	= jsonObj.getString("streetType");
		String streetName	= jsonObj.getString("streetName");
		String portType		= jsonObj.getString("portType");
		String portNo		= jsonObj.getString("portNo");
		String cityName		= jsonObj.getString("cityName");
		String provName		= jsonObj.getString("provName");
		String postalCode	= jsonObj.getString("postalCode");
		String bizPhone		= jsonObj.getString("bizPhone");
		String bizFax		= jsonObj.getString("bizFax");
		String bizEmail		= jsonObj.getString("bizEmail");
		String bizWebsite	= jsonObj.getString("bizWebsite");
		
		//business type
		Integer bizType 	= bizTypeProduct+bizTypeEProduct+bizTypeService;
		logger.info("bizType = "+bizType);
		
		//business online presence
		final int OLP_COUNT = 6;
		int[] presenceNo 		= new int[OLP_COUNT];
		String[] presenceURL 	= new String[OLP_COUNT];
		for(int i=0; i<OLP_COUNT; i++){
			String pno 		= jsonObj.getString("presenceNo"+(i+1));
			presenceNo[i]	= Integer.parseInt(pno);
			//presenceNo[i]	= i+1;
			presenceURL[i] 	= jsonObj.getString("presenceURL"+(i+1));
		}
		
		BusinessProfile bp = new BusinessProfile();
		bp.setBizId(bizId);
		bp.setBizName(bizName);
		bp.setBizNo(bizNo);
		bp.setBizOwner(bizOwner);
		bp.setLegalFormNo(legalFormNo);
		bp.setIndustryCode(industryCode);
		bp.setBizType(bizType);
		bp.setBizDesc(bizDesc);
		bp.setBizPhone(bizPhone);
		bp.setBizFax(bizFax);
		bp.setBizEmail(bizEmail);
		bp.setBizWebsite(bizWebsite);
		bp.setModifyDate(new Date());
		bp.setBizStatus(BusinessStatus.CREATED);
		
		BusinessAddress ba = new BusinessAddress();
		ba.setBizId(bizId);
		ba.setStreetNo(streetNo);
		ba.setStreetType(streetType);
		ba.setStreetName(streetName);
		ba.setPortType(portType);
		ba.setPortNo(portNo);
		ba.setCityName(cityName);
		ba.setProvName(provName);
		ba.setPostalCode(postalCode);
		ba.setLocationType(BusinessAddress.LOC_TYPE_HQ);
		
		List<BusinessOnlinePresence> bopList = new ArrayList<BusinessOnlinePresence>();
		
		for(int i=0; i<OLP_COUNT; i++){
			BusinessOnlinePresence bop = new BusinessOnlinePresence();
			bop.setBizId(bizId);
			bop.setPresenceNo(presenceNo[i]);
			bop.setPresenceURL(presenceURL[i]);
			bopList.add(bop);
			logger.info(bop.toString());
			bop = null;
		}
		
		/* execute business logic */
		this.businessProfileService.updateBusinessProfile(bp);
		this.businessAddressService.updateBusinessAddress(ba);
		this.businessOnlinePresenceService.updateBusinessPresence(bopList);
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		Map<String,Object> model = mav.getModel();
		
		/* set data */
		model.put("bizProfile", bp);
		
		/* set view */
		
		logger.info("exiting... /advertiser/biz/save");
		return model;
	}
	
	
	/**
	 * publish a business profile
	 * @param businessProfileJSONString
	 * @return
	 */
	@RequestMapping(value="/publish",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Map<String,Object> publishBizProfile(@RequestParam String bizProfileJSONString){		
		logger.info("entering... /advertiser/biz/publish");
		
		/* prepare data */	
		JSONObject jsonObj= new JSONObject(bizProfileJSONString);
		
		//biz profile
		Long bizId	= jsonObj.getLong("bizId");
		
		// populate presence id and url
		BusinessProfile bp = new BusinessProfile();
		bp.setBizId(bizId);
		bp.setBizStatus(BusinessStatus.ACTIVE);
		
		/* execute business logic */
		//create a new record of BusinessOnlinePresence into master table
		this.businessProfileService.publishBusinessProfile(bp); 
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		
	    /* set data */
	    Map<String,Object> model = mav.getModel();
	    model.put("bizProfile", bp);
	    
		logger.info("exiting... /advertiser/biz/publish");
		return model;
	}


	/**
	 * disable a business profile, not to show on index
	 * @param businessProfileJSONString
	 * @return
	 */
	@RequestMapping(value="/disable",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Map<String,Object> disableBizProfile(@RequestParam String bizProfileJSONString){		
		logger.info("entering... /advertiser/biz/disable");
		
		/* prepare data */	
		JSONObject jsonObj= new JSONObject(bizProfileJSONString);
		
		//biz profile
		Long bizId	= jsonObj.getLong("bizId");
		
		//populate presence id and url
		BusinessProfile bp = new BusinessProfile();
		bp.setBizId(bizId);
		bp.setBizStatus(BusinessStatus.DISABLED);
		
		/* execute business logic */
		//create a new record of BusinessOnlinePresence into master table
		this.businessProfileService.disableBusinessProfile(bp); 
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		Map<String,Object> model = mav.getModel();
		
        /* set data */
        model.put("bizProfile", bp);
        
		logger.info("exiting... /advertiser/biz/disable");
		return model;
	}
	
	
	/**
	 * trash a business profile, not to show on index or on manage any more, client cannot see it anymore
	 * @param businessProfileJSONString
	 * @return
	 */
	@RequestMapping(value="/trash",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Map<String,Object> trashBizProfile(@RequestParam String bizProfileJSONString){		
		logger.info("entering... /advertiser/biz/trash");
		
		/* prepare data */	
		JSONObject jsonObj= new JSONObject(bizProfileJSONString);
				
		//biz profile
		Long bizId	= jsonObj.getLong("bizId");
		
		/* populate presence id and url */
		BusinessProfile bp = new BusinessProfile();
		bp.setBizId(bizId);
		bp.setBizStatus(BusinessStatus.TRASHED);
		
		/*create a new record of BusinessOnlinePresence into master table*/
		this.businessProfileService.trashBusinessProfile(bp); 
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		Map<String,Object> model = mav.getModel();
		
        /* set data */
        model.put("bizProfile", bp);
        
		logger.info("exiting... /advertiser/biz/trash");
		return model;
	}
	
	
	@RequestMapping(value="/{bizId}",method=RequestMethod.GET)
	public ModelAndView viewBusinessProfile(@PathVariable long bizId){		
		logger.info("entering... /advertiser/biz/{bizId}"+bizId);
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		
		/* set view */
		String viewName = "advertiser/bizprofile_view";	
        mav.setViewName(viewName);
        
		logger.info("entering... /advertiser/biz/{bizId}"+bizId);
		return mav;
	}
}
