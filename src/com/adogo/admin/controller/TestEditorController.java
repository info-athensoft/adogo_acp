package com.adogo.admin.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.adogo.admin.entity.TestEditorSfz;
import com.adogo.admin.service.TestEditorSfzService;

@Controller
public class TestEditorController {
	
	private static final Logger logger = Logger.getLogger(TestEditorController.class);
	
	@Autowired
	private TestEditorSfzService testEditorSfzService;
		
	@Autowired
	public void setAdTagService(TestEditorSfzService testEditorSfzService) {
		this.testEditorSfzService = testEditorSfzService;
	}
	
	@RequestMapping("/test_editor")
	public String gotoTextEditor(){
		return "/test/test_editor";
	}
	
	@RequestMapping(value="/save_editor_content",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Map<String, Object> saveEditorContent(@RequestParam String editor1){
		logger.info("entering -- /save_editor_content ... editor1= " + editor1 );
		
		ModelAndView mav = new ModelAndView();
		Map<String, Object> model = mav.getModel();
		
		testEditorSfzService.update(1, editor1);
		TestEditorSfz editorFromDb = testEditorSfzService.findById(1);
		String lTextFromDb = editorFromDb.getLtext();
		logger.info("lTextFromDb= " + lTextFromDb );
		model.put("lTextFromDb", lTextFromDb);
		
		//String viewName = "/test/test_editor";
		//String viewName = "";
       //mav.setViewName(viewName);
        
		logger.info("exiting -- /save_editor_content ");
		return model;
	}
}
