package com.adogo.advertiser.controller;

import java.util.ArrayList;
import java.util.Date;
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
	
	
	@RequestMapping("/")
	public ModelAndView gotoBizProfileIndex(){
//	public ModelAndView gotoBizProfileIndex(@RequestParam long advertiserId){
		logger.info("entering... /advertiser/biz/");
		
		long advertiserId = 1712010001L;	//TODO test: get from session
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		/* assemble model and view */
		Map<String,Object> model = mav.getModel();
		
		//load business profiles
		List<BusinessProfile> listBizProfile = businessProfileService.getBusinessProfileByAdvertiserId(advertiserId,BusinessStatus.ACTIVE);
		
		//test
//		System.out.println("listBizProfile.size()="+listBizProfile.size());
		
		model.put("listBizProfile", listBizProfile);
		
		String viewName = "advertiser/bizprofile_index";	//TODO booth page does not exist yet
        mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/biz/");
		return mav;
	}
	
	@RequestMapping("/manage.html")
	public ModelAndView gotoBizProfileManage(){
		logger.info("entering... /advertiser/biz/manage.html");
		
		long advertiserId = 1712010001L;	//TODO test: get from session
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		/* assemble model and view */
		Map<String,Object> model = mav.getModel();
		
		//load business profiles
		List<BusinessProfile> listBizProfile = businessProfileService.getBusinessProfileByAdvertiserId(advertiserId);
		
		//test
//		System.out.println("listBizProfile.size()="+listBizProfile.size());
		
		model.put("listBizProfile", listBizProfile);
		
		String viewName = "advertiser/bizprofile_manage";	
        mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/biz/manage.html");
		return mav;
	}
	

	@RequestMapping("/create.html")
	public ModelAndView gotoCreateBizProfile(){
		
		ModelAndView mav = new ModelAndView();
		
		String viewName = "advertiser/bizprofile_create";
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
	
	
	@RequestMapping("/complete.html")
	public ModelAndView gotoCompleteBizProfile(@RequestParam long bizId){
		logger.info("entering... /advertiser/biz/complete.html");
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		/* assemble model and view */
		Map<String,Object> model = mav.getModel();
		
		BusinessProfile businessProfile = businessProfileService.getBusinessProfileByBizId(bizId);
		
		/* assemble data */
        model.put("bizProfile", businessProfile);
		
		String viewName = "advertiser/bizprofile_complete";	
        mav.setViewName(viewName);
		
		logger.info("exiting... /advertiser/biz/complete.html");
		return mav;
	}
	
	
	@RequestMapping("/edit.html")
	public ModelAndView gotoEditBizProfile(@RequestParam long bizId){
		logger.info("entering... /advertiser/biz/edit.html");
		
		//test
		logger.info("bizId="+bizId);
		
		//
		BusinessProfile businessProfile = this.businessProfileService.getBusinessProfileByBizId(bizId);
		BusinessAddress hqAddress = this.businessAddressService.getHQAddressByBizId(bizId);
		List<BusinessOnlinePresence> onlinePresenceList = this.businessOnlinePresenceService.getBusinessPresenceByBizId(bizId);
		
		//test
		logger.info("onlinePresenceList.size()="+onlinePresenceList.size());
		
		Map<String,String> presenceURLMap = new HashMap<String,String>();
		
		for(BusinessOnlinePresence bop : onlinePresenceList){
			
			//test
			logger.info("@ edit.html");
			logger.info(bop.toString());
			
			int index = bop.getPresenceNo();
			String prefixURL = "presenceURL";
			String key = prefixURL+index;
			String value = bop.getPresenceURL();
			presenceURLMap.put(key, value);
		}
		
		
		IndustryCode industryCodeObj = new IndustryCode();
		
		String bizCode = businessProfile.getIndustryCode();
		logger.info("bizCode="+bizCode);
		
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
		String selectedCodeLevel1 = bizCode.substring(0, 2);
		
		List<IndustryCode> naicsLevel2 = new ArrayList<IndustryCode>();
		naicsLevel2 = industryCodeService.getIndustryCodeByLevelNo(LEVEL_2, bizCode);
		String selectedCodeLevel2 = bizCode.substring(0, 3);
		
		List<IndustryCode> naicsLevel3 = new ArrayList<IndustryCode>();
		naicsLevel3 = industryCodeService.getIndustryCodeByLevelNo(LEVEL_3, bizCode);
		String selectedCodeLevel3 = bizCode.substring(0, 4);
		
		List<IndustryCode> naicsLevel4 = new ArrayList<IndustryCode>();
		naicsLevel4 = industryCodeService.getIndustryCodeByLevelNo(LEVEL_4, bizCode);
		
		int bizType = businessProfile.getBizType();
		BusinessType bt = new BusinessType();
		bt.parseBusinessTypeValue(bizType);
		Boolean boolProd = bt.isProdType();
		Boolean boolEProd = bt.isEProdType();
		Boolean boolService = bt.isServiceType();
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		String viewName = "advertiser/bizprofile_edit";
		mav.setViewName(viewName);
		
		/* assemble data */
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
		
		logger.info("exiting... /advertiser/biz/edit.html");
		return mav;
	}
	
	/**
	 * Disable a business profile, usually by client
	 * @param bizId
	 * @return
	 */
	@RequestMapping("/disable.html")
	public ModelAndView gotoDisableBizProfile(@RequestParam long bizId){
		logger.info("entering... /advertiser/biz/trash.html");
		
		//test
		logger.info("bizId="+bizId);
		
		BusinessProfile bp = new BusinessProfile();
		bp.setBizId(bizId);
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		String viewName = "advertiser/bizprofile_disable";
		mav.setViewName(viewName);
		
		Map<String,Object> model = mav.getModel();
		model.put("bizProfile", bp);
		
		logger.info("exiting... /advertiser/biz/trash.html");
		return mav;
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST,produces="application/json")
		@ResponseBody
		public Map<String,Object> createBizProfile(@RequestParam String businessProfileJSONString){		
			logger.info("entering... /advertiser/biz/create");
			
			/* prepare data */		
			JSONObject jsonObj= new JSONObject(businessProfileJSONString);
			
			//TODO Hard Code 
			String advertiserId = "1712010001";
			
	//		String advertiserId	= jsonObj.getString("advertiserId");		
			Long bizId			= UUIDHelper.getUniqueLongIdUUID();
			String bizName 		= jsonObj.getString("bizName");
			String bizNo		= jsonObj.getString("bizNo");
			String bizOwner		= jsonObj.getString("bizOwner");
			String legalFormNo	= jsonObj.getString("legalFormNo");
			String industryCode	= jsonObj.getString("industryCode");
			
			String bizDesc		= jsonObj.getString("bizDesc");
			
			//Integer bizType 		= jsonObj.getInt("bizType");
			Integer bizTypeProduct  = jsonObj.getInt("bizTypeProduct");
			Integer bizTypeEProduct = jsonObj.getInt("bizTypeEProduct");
			Integer bizTypeService  = jsonObj.getInt("bizTypeService");
			
			String bizPhone		= jsonObj.getString("bizPhone");
			String bizFax		= jsonObj.getString("bizFax");
			String bizEmail		= jsonObj.getString("bizEmail");
			String bizWebsite	= jsonObj.getString("bizWebsite");
			
			String streetNo		= jsonObj.getString("streetNo");
			String streetType	= jsonObj.getString("streetType");
			String streetName	= jsonObj.getString("streetName");
			String portType		= jsonObj.getString("portType");
			String portNo		= jsonObj.getString("portNo");
			String cityName		= jsonObj.getString("cityName");
			String provName		= jsonObj.getString("provName");
			String postalCode	= jsonObj.getString("postalCode");
			
			/*field*/
			Integer bizType 	= bizTypeProduct+bizTypeEProduct+bizTypeService;
			
			/*create a new Business Profile into master table*/
			BusinessProfile businessProfile = new BusinessProfile();
			businessProfile.setAdvertiserId(Long.parseLong(advertiserId));
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
									
			businessProfile.setBizStatus(BusinessStatus.ACTIVE);
			
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
			
			this.businessProfileService.saveBusinessProfile(businessProfile);
			
			/* initial settings */
			ModelAndView mav = new ModelAndView();
			
			/* assemble model and view */
			//String viewName = "advertiser/bizprofile_complete";	
	        //mav.setViewName(viewName);
	        
	        /* assemble data */
	        Map<String,Object> model = mav.getModel();
	        model.put("businessProfile", businessProfile);
			
			logger.info("exiting... /advertiser/biz/create");
			return model;
		}


	@RequestMapping(value="/complete",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Map<String,Object> completeBizProfile(@RequestParam String businessProfileJSONString){		
		logger.info("entering... /advertiser/biz/complete");
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		/* prepare data */		
		JSONObject jsonObj= new JSONObject(businessProfileJSONString);
		
		//test
		logger.info("businessProfileJSONString = \n"+businessProfileJSONString);
		
		Long bizId			= jsonObj.getLong("bizId");
		String userId		= jsonObj.getString("userId");
		String advertiserId	= jsonObj.getString("advertiserId");
		
		/* populate presence id and url */
		final int PRESENCE_COUNT = 6;				//TODO HardCode
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
		logger.info(bizOnlinePresenceList.toString());
		
		/*create a new record of BusinessOnlinePresence into master table*/
		this.businessOnlinePresenceService.createBusinessOnlinePresence(bizOnlinePresenceList); 
		
		/* assemble model and view */
		//String viewName = "advertiser/bizprofile_complete";	
        //mav.setViewName(viewName);
        
        /* assemble data */
        Map<String,Object> model = mav.getModel();
        model.put("bizOnlinePresenceList", bizOnlinePresenceList);
		
		logger.info("exiting... /advertiser/biz/complete");
		return model;
	}
	
	/**
	 * old url: @RequestMapping("/saveAdvertiserProfile")
	 * old method: public ModelAndView saveAdvertiserProfile(@RequestParam String bizProfileJSONString){
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
		
		//Integer bizType 		= jsonObj.getInt("bizType");
		Integer bizTypeProduct  = jsonObj.getInt("bizTypeProduct");
		Integer bizTypeEProduct = jsonObj.getInt("bizTypeEProduct");
		Integer bizTypeService  = jsonObj.getInt("bizTypeService");
		
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
		
		//
		this.businessProfileService.updateBusinessProfile(bp);
		this.businessAddressService.updateBusinessAddress(ba);
		this.businessOnlinePresenceService.updateBusinessPresence(bopList);
		
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		/* assemble model and view */
		//String viewName = ""; //"/advertiser/biz/edit.html";
        //mav.setViewName(viewName);
		
		Map<String,Object> model = mav.getModel();
		model.put("bizProfile", bp);
		
		logger.info("exiting... /advertiser/biz/save");
		return model;
	}
	
	
	/**
	 * disable a business profile, not permanently remove
	 * @param businessProfileJSONString
	 * @return
	 */
	@RequestMapping(value="/disable",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Map<String,Object> disableBizProfile(@RequestParam String bizProfileJSONString){		
		logger.info("entering... /advertiser/biz/trash");
		
		/* prepare data */	
		JSONObject jsonObj= new JSONObject(bizProfileJSONString);
		
		//test
		logger.info("jsonObj = "+jsonObj);
		
		//biz profile
		Long bizId	= jsonObj.getLong("bizId");
		
		/* populate presence id and url */
		BusinessProfile bp = new BusinessProfile();
		bp.setBizId(bizId);
		bp.setBizStatus(BusinessStatus.DISABLED);
		
		/*create a new record of BusinessOnlinePresence into master table*/
		this.businessProfileService.trashBusinessProfile(bp); 
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		/* assemble model and view */
		
        /* assemble data */
        Map<String,Object> model = mav.getModel();
        model.put("bizProfile", bp);
        
		logger.info("exiting... /advertiser/biz/trash");
		return model;
	}
	
	@RequestMapping(value="/{bizId}",method=RequestMethod.GET)
	public ModelAndView viewBusinessProfile(@PathVariable long bizId){		
		logger.info("entering... /advertiser/biz/{bizId}"+bizId);
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		
		/* assemble model and view */
		String viewName = "advertiser/bizprofile_view";	
        mav.setViewName(viewName);
        
		logger.info("entering... /advertiser/biz/{bizId}"+bizId);
		return mav;
	}
}
