package com.adogo.global.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	@RequestMapping("/login")
	public String doLogin(){
		logger.info("entering...... /login");
//		return "uaas/login_soft";
		return "uaas/page_user_login_4";
	}
	
	@RequestMapping("/logout")
	public String doLogout(){
//		return "uaas/login_soft";
		return "uaas/page_user_login_4";
	}
	
}
