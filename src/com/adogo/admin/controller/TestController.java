package com.adogo.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/formwizard")
	public String gotoIndex(){
		return "form_wizard";
	}
}
