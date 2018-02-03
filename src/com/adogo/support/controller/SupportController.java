
package com.adogo.support.controller;

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

import com.adogo.info.lang.LanguageMap;
import com.adogo.support.entity.Support;
import com.adogo.support.entity.SupportStatus;
import com.adogo.support.service.SupportService;
import com.athensoft.util.id.UUIDHelper;

@Controller
@RequestMapping("/support")
public class SupportController {
	
	private static final Logger logger = Logger.getLogger(SupportController.class);
	
	private static final String ACTION_EDIT = "Edit";
	private static final String ACTION_DELETE = "Delete";
	
	@Autowired
	private SupportService supportService;
		
	@Autowired
	public void setAdPostService(SupportService supportService) {
		this.supportService = supportService;
	}
	
	/**
	 * gotoDashboard
	 * @param
	 * @return
	 * 
	 * @author sfz
	 */
	
	@RequestMapping(value="/")
	public String gotoDashboard(){
		logger.info("entering /support/");
		
		String viewName = "support/support_dashboard";
		
		logger.info("entering /support/");
		return viewName;
	}
	
	@RequestMapping(value="/dashboard.html")
	public String gotoDashboard2(){
		logger.info("entering /support/dashboard.html");
		
		String viewName = "support/support_dashboard";
		
		logger.info("entering /support/dashboard.html");
		return viewName;
	}
	
	/**
	 * gotoSupportList
	 * @param
	 * @return
	 * 
	 * @author sfz
	 */
	
	@RequestMapping(value="/faq/")
	public String gotoFaqIndex(){
		logger.info("entering /support/faq/index.html");
		
		/* set view */
		String viewName = "support/faq_index";
		
		logger.info("entering /support/faq/index.html");
		return viewName;
	}
	
	
	@RequestMapping(value="/faq/index.html")
	public String gotoFaqIndex2(){
		logger.info("entering /support/faq/index.html");
		
		/* set view */
		String viewName = "support/faq_index";
		
		logger.info("entering /support/faq/index.html");
		return viewName;
	}
	
	/**
	 * Create support
	 * @param
	 * @return
	 * 
	 * @author sfz
	 */
	@RequestMapping("/faq/create.html")
	public String gotoCreate(){
		logger.info("entering... /acp/support/create.html");
		
		String viewName = "support/faq_create";
		
		logger.info("exiting... /acp/support/create.html");
		return viewName;
	}

	/**
	 * Edit support
	 * @param
	 * @return
	 * 
	 * @author sfz
	 */
	
	@RequestMapping("/faq/edit.html")
	public ModelAndView gotoEdit(@RequestParam long supportId){
		logger.info("entering... /acp/support/faq/edit.html");
		logger.info("supportId = " + supportId);
	
		/* execute business logic */
		Support support = supportService.findById(supportId);
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		Map<String, Object> model = mav.getModel();
		
		/* set data */
		model.put("support", support);
		
		/* set view */
		String viewName = "support/faq_edit";
	    mav.setViewName(viewName);
		
		logger.info("exiting... /acp/support/faq/edit.html");
		return mav;
	}

	/**
	 * @param supportJSONString
	 * @return
	 * 
	 * @author sfz
	 */
	
	@RequestMapping(value="/faq/create",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Map<String,Object> createFaq(@RequestParam String supportJSONString){		
		logger.info("entering... /acp/support/create");
		
		/* prepare data */		
		JSONObject jsonObj= new JSONObject(supportJSONString);
		
		Long topicId 			= UUIDHelper.getUniqueLongId();
		Integer supportLangNo 	= jsonObj.getInt("supportLangNo");
		String supportTopicTitle 		= jsonObj.getString("supportTopicTitle");
		String supportTopicContent	= jsonObj.getString("supportTopicContent");
		
		logger.info("topicId="+topicId);
		logger.info("supportLangNo="+supportLangNo);
		logger.info("supportTopicTitle="+supportTopicTitle);
		logger.info("supportTopicContent="+supportTopicContent);
	
		
		/* execute business logic */
		Support support = new Support();
		support.setTopicId(topicId);
		support.setLangNo(supportLangNo);
		support.setTopicTitle(supportTopicTitle);
		support.setTopicContent(supportTopicContent);
		support.setTopicStatus(SupportStatus.CREATED);
				
		this.supportService.create(support);
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		
		/* set data */
		Map<String,Object> model = mav.getModel();
		
		/* set view */
//		String viewName = "support/support_list";
//	    mav.setViewName(viewName);
		
		logger.info("exiting... /acp/support/create");
		return model;
	}

	/**
		 * @param adPostJSONString
		 * @return
		 * 
		 * @author sfz
		 */
		
	@RequestMapping(value="/faq/update",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Map<String,Object> updateFaq(@RequestParam String supportJSONString){		
		logger.info("entering... /acp/support/faq/update");
		
		/* prepare data */		
		JSONObject jsonObj= new JSONObject(supportJSONString);
		
//		Long topicId 			= UUIDHelper.getUniqueLongId();
		Long supportId 	= jsonObj.getLong("supportId");
		Integer supportLangNo 		= jsonObj.getInt("supportLangNo");
		String supportTopicTitle 	= jsonObj.getString("supportTopicTitle");
		String supportTopicContent	= jsonObj.getString("supportTopicContent");
		Integer supportTopicStatus	= jsonObj.getInt("supportTopicStatus");
		
		logger.info("supportId="+supportId);
		logger.info("supportLangNo="+supportLangNo);
		logger.info("supportTopicTitle="+supportTopicTitle);
		logger.info("supportTopicContent="+supportTopicContent);
		logger.info("supportTopicStatus="+supportTopicStatus);

		/* execute business logic */
		Support support = new Support();
		support.setGlobalId(supportId);
		support.setLangNo(supportLangNo);
		support.setTopicTitle(supportTopicTitle);
		support.setTopicContent(supportTopicContent);
		support.setTopicStatus(supportTopicStatus);
				
		this.supportService.update(support);
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		
		/* set data */
		Map<String,Object> model = mav.getModel();
		
		/* set view */
//		String viewName = "support/support_list";
//        mav.setViewName(viewName);
		
		logger.info("exiting... /acp/support/faq/update");
		return model;
	}

	/**
	 * getDataSupportList
	 * @param
	 * @return
	 * 
	 * @author sfz
	 */
	@RequestMapping(value="/supportListData",produces="application/json")
	@ResponseBody
	public Map<String,Object> getDataSupportList(){
		logger.info("entering /support/supportListData");
		
		/* execute business logic */
		List<Support> listSupport = supportService.findAll();
		logger.info("Length of Support entries: "+ listSupport.size());
		
		String[][] data = getData(listSupport, ACTION_EDIT);
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		
		/* set data */
		Map<String, Object> model = mav.getModel();
		model.put("draw", new Integer(1));
		model.put("recordsTotal", new Integer(5));
		model.put("recordsFiltered", new Integer(5));
		model.put("data", data);
		model.put("customActionStatus","OK");
		model.put("customActionMessage","Data loaded");
		
		logger.info("leaving /support/supportListData");
		return model;
	}

	/**
	 * getData
	 * @param list, actionName
	 * @return
	 * 
	 * @author sfz
	 */
	private String[][] getData(List<Support> list, String actionName){
		int entryLength = list.size();
		final int COLUMN_NUM = 8;
		String[][] data = new String[entryLength][COLUMN_NUM];
		
		String field0 = "";	//check box
		String field1 = "";	//support id
		String field2 = "";	//topic id
		String field3 = "";	//language no
		String field4 = "";	//topic
		String field5 = "";	//content
		String field6 = "";	//support status
		String field7 = "";	//action
		
		for(int i=0; i<entryLength ; i++){			
			field0 = "<input type='checkbox' name='id[]' value="+list.get(i).getGlobalId()+">";
			field1 = list.get(i).getGlobalId()+"";
			field2 = list.get(i).getTopicId()+"";
			field3 = LanguageMap.getLangName(list.get(i).getLangNo());
			field4 = list.get(i).getTopicTitle()+"";
			field5 = list.get(i).getTopicContent();
			
			Integer statusParameter = list.get(i).getTopicStatus();
			String[] statusPair = getStatusPair(statusParameter);
			
			if(statusPair!=null && statusPair.length > 0) {
				String statusKey = statusPair[0];
				String status = statusPair[1];
				
				field6 = "<span class='label label-sm label-"+statusKey+"'>"+status+"</span>";
			}
			else{
				field6 = "";
			}
			
			field7 = "<a href='/acp/support/faq/edit.html?supportId="+field1+"' class='btn btn-xs default btn-editable'><i class='fa fa-pencil'></i> "+actionName+"</a>";
			
			data[i][0] = field0;
			data[i][1] = field1;
			data[i][2] = field2;
			data[i][3] = field3;
			data[i][4] = field4;
			data[i][5] = field5;
			data[i][6] = field6;
			data[i][7] = field7;
		}
		
		return data;
	}
	
	/**
	 * getStatusPair
	 * @param statusParameter
	 * @return
	 * 
	 * @author sfz
	 */
	private String[] getStatusPair(Integer statusParameter){
		
//		if (statusParameter == null || statusParameter.isEmpty()) {
//			return null;
//		}
		String[] objectStatusPair = new String[2];
		
		String objectStatus = "";
		String objectStatusKey = "";
		switch(statusParameter){
			case SupportStatus.CREATED: 
				objectStatus = "Created";
				objectStatusKey = "success";
				break;
			case SupportStatus.PUBLISHED: 
				objectStatus = "Published";
				objectStatusKey = "warning";
				break;
			case SupportStatus.DISABLED: 
				
				objectStatus = "Disabled";
				objectStatusKey = "default";
				break;
			default: 
				break;
		}
		
		objectStatusPair[0]=objectStatusKey;
		objectStatusPair[1]=objectStatus;
		
		
		return objectStatusPair;
	}
	
}

