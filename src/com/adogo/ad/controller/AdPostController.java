package com.adogo.ad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ad/adpost")
public class AdPostController {
	
	@RequestMapping("/create")
	public String gotoCreate(){
		String viewName = "ad/ad_post_create";
		return viewName;
	}
	
	@RequestMapping("/edit")
	public String gotoEdit(){
		String viewName = "ad/ad_post_edit";
		return viewName;
	}
}
