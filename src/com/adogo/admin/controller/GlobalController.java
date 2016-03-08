package com.adogo.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GlobalController {
	@RequestMapping("/index")
	public String gotoIndex(){
		return "index";
	}
	
	@RequestMapping("/")
	public String gotoIndex2(){
		return "index";
	}
}
