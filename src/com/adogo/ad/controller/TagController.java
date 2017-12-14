package com.adogo.ad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	
	
	//TODO
	public void test(){
		System.out.println(this.adTagService);
	}
	
}
