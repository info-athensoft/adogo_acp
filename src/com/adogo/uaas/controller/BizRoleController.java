package com.adogo.uaas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/uaas")
public class BizRoleController {
	
	@RequestMapping("/bizrole")
	public String applyAdvertiser(){
		String viewName = "uaas/bizrole_home";
		return viewName;
	}
}
