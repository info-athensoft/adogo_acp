package com.adogo.ad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adogo.ad.service.AdPostService;
import com.adogo.ad.service.AdTagService;

@Controller
@RequestMapping("/ad/tag")
public class TagController {
	
	@Autowired
	private AdTagService adTagService;
		
	@Autowired
	public void setAdTagService(AdTagService adTagService) {
		this.adTagService = adTagService;
	}
	
	
}
