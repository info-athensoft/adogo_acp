package com.adogo.global.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String doLogin(HttpServletRequest request){
		HttpSession session = request.getSession(true);
//		session.setAttribute("advertiserId", 1712010002L);
		session.setAttribute("advertiserId", 1712010001L);
//		return "uaas/login_soft";
		return "uaas/page_user_login_4";
	}
	
	@RequestMapping("/logout")
	public String doLogout(){
//		return "uaas/login_soft";
		return "uaas/page_user_login_4";
	}
	
}
