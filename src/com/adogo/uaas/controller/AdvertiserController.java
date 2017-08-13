package com.adogo.uaas.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/uaas/advertiser")
public class AdvertiserController {
	
	private static final Logger logger = Logger.getLogger(AdvertiserController.class);
	
	@RequestMapping("/apply")
	public String applyAdvertiserStep1(){
		String viewName = "uaas/advertiser_apply_agreement";
		return viewName;
	}
	
	@RequestMapping("/apply2")
	public String applyAdvertiserStep2(){
		String viewName = "uaas/advertiser_apply_form";
		return viewName;
	}
}
