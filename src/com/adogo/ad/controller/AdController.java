package com.adogo.ad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ad")
public class AdController {
	
	@RequestMapping("/adPostCreate")
	public String gotoAdPost(){
		String viewName = "ad/ad_post";
		return viewName;
	}
	
	@RequestMapping("/adPostEdit")
	public String editAdPost(){
		String viewName = "ad/ad_post_edit";
		return viewName;
	}
}
