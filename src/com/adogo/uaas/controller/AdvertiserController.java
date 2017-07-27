package com.adogo.uaas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/uaas/advertiser")
public class AdvertiserController {
	
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
