package com.adogo.global.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class GlobalController {
	
	private static final Logger logger = Logger.getLogger(GlobalController.class);
	
	@RequestMapping("")
	public String gotoIndex(){
		logger.info("entering.. /");
		return "index";
	}
	
	@RequestMapping("/index")
	public String gotoIndex1(){
		return "index";
	}
	
	@RequestMapping("/index-sample")
	public String gotoIndex2(){
		return "index_sample";
	}
		
}
