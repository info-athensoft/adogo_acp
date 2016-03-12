package com.adogo.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GlobalController {
	@RequestMapping("/")
	public String gotoIndex2(){
		return "login_soft";
	}
	
	@RequestMapping("/index")
	public String gotoIndex(){
		return "index";
	}
	
	@RequestMapping("/dashboard")
	public String gotoDashboard(){
		return "index_dashboard";
	}
	
}
