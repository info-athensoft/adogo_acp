package com.adogo.global.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class GlobalController {
	
	private static final Logger logger = Logger.getLogger(GlobalController.class);
	
	@RequestMapping("")
	public String gotoIndex(){
		logger.info("entering.. /");
		logger.info("exiting.. /");
		return "index";
//		return "uaas/page_user_login_4";
	}
	
	@RequestMapping("/index")
	public String gotoIndex1(@RequestParam String  username){
		logger.info("entering.. /index   userName="+username);
		logger.info("exiting.. /index");
		return "index";
	}
	
	
		
}
