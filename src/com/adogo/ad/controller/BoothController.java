package com.adogo.ad.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ad/booth")
public class BoothController {
	
	@RequestMapping("/create")
	public String gotoCreate(){
		String viewName = "ad/booth_create";
		return viewName;
	}
	
	@RequestMapping("/edit")
	public String gotoEdit(){
		String viewName = "ad/booth_edit";
		return viewName;
	}

}
