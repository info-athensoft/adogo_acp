package com.adogo.uaas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/advertiser")
public class AdvertiserController {
	
	@RequestMapping("/apply")
	public String applyAdvertiser(){
		String viewName = "uaas/advertiser_apply";
		return viewName;
	}
}
