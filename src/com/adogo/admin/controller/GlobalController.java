package com.adogo.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GlobalController {
	@RequestMapping("/")
	public String gotoIndex(){
		return "index2";
	}
	
	@RequestMapping("/index")
	public String gotoIndex1(){
		return "index";
	}
	
	@RequestMapping("/index2")
	public String gotoIndex2(){
		return "index2";
	}
	
	@RequestMapping("/dashboard")
	public String gotoDashboard(){
		return "index_dashboard";
	}
	
}
