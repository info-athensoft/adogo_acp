
package com.adogo.support.controller;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.adogo.advertiser.entity.booth.Booth;
import com.adogo.support.entity.Support;
import com.adogo.support.service.SupportService;
import com.athensoft.util.id.UUIDHelper;

@Controller
@RequestMapping("/support")
public class SupportController {
	
	private static final Logger logger = Logger.getLogger(SupportController.class);
	
	
	@Autowired
	private SupportService supportService;
		
	@Autowired
	public void setAdPostService(SupportService supportService) {
		this.supportService = supportService;
	}
	
	

	/**
	 * Create support
	 * @param
	 * @return
	 * 
	 * @author sfz
	 */
	
	@RequestMapping("/create.html")
	public String gotoCreate(){
		logger.info("entering... /acp/support/create.html");
		String viewName = "support/create";
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
	
	@RequestMapping("/edit.html")
	public ModelAndView gotoEdit(@RequestParam long supportId){
		logger.info("entering... /acp/support/edit.html");
		logger.info("supportId = " + supportId);

		/* prepare data */
		
		Support support = supportService.findSupportById(supportId);
		

		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		Map<String, Object> model = mav.getModel();
		
		/* set data */
		model.put("support", support);
		
		/* set view */
		String viewName = "support/edit";
        mav.setViewName(viewName);
		
		logger.info("exiting... /acp/support/edit.html");
		return mav;
	}
	

	
	/**
	 * @param adPostJSONString
	 * @return
	 * 
	 * @author sfz
	 */
	
	@RequestMapping("/saveSupport")
	public ModelAndView saveSupport(@RequestParam String supportJSONString){		
		logger.info("entering... /acp/support/saveSupport");
		
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

		
		/* prepare data */	
		/*create a new record of support table*/
		Support support = new Support();
		support.setTopicId(topicId);
		support.setLangNo(supportLangNo);
		support.setTopicTitle(supportTopicTitle);
		support.setTopicContent(supportTopicContent);
				
		this.supportService.create(support);
		
		
		/* assemble model and view */
		ModelAndView mav = new ModelAndView();
		
		/* set view */
		String viewName = ""; //"support/support_index";
        mav.setViewName(viewName);
		
		logger.info("exiting... /acp/support/saveSupport");
		return mav;
	}

	
	/**
	 * get Support list
	 * @return
	 * 
	 * @author sfz
	 */
	@RequestMapping(value="/list.html")
	public Map<String,Object> getSupportList(){
		logger.info("entering ... /acp/support/list.html");
		
		/* prepare data */
		
		List<Support> listSupport = supportService.getSupports();
		logger.info("listSupport size = " + listSupport.size());
		
		/* assemble data and view */
		ModelAndView mav = new ModelAndView();
		Map<String, Object> model = mav.getModel();
		
		/* set data */
		model.put("listSupport", listSupport);
		
		/* set view */
		String viewName = "support/list";
        mav.setViewName(viewName);
		
		
		logger.info("exiting ... /acp/support/list.html");
		return model;
	}
	
	
}

