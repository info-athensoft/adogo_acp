package com.adogo.global.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String doLogin(){
//		return "uaas/login_soft";
		return "uaas/page_user_login_4";
	}
	
	@RequestMapping("/logout")
	public String doLogout(){
//		return "uaas/login_soft";
		return "uaas/page_user_login_4";
	}
	
}
