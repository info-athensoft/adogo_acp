package com.adogo.admin.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adogo.ad.controller.AdPostController;

@Controller
public class TestEditorController {
	
	private static final Logger logger = Logger.getLogger(TestEditorController.class);
	
	@RequestMapping("/test_editor")
	public String gotoIndex(){
		return "/test/test_editor";
	}
	
	@RequestMapping("/save_editor_content")
	public String saveEditorContent(@RequestParam String editor1){
		logger.info("entering -- /save_editor_content ... editor1= " + editor1 );
		
		logger.info("exiting -- /save_editor_content ");
		return "/test/test_editor";
	}
}
