package com.adogo.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GlobalController {
	@RequestMapping("/")
	public String gotoIndex(){
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
	
	/*
	@RequestMapping("/dashboard")
	public String gotoDashboard(){
		return "index_dashboard";
	}*/
	
}
