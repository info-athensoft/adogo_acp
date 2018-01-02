package com.adogo.global.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	@RequestMapping("/login")
	public String doLogin(HttpSession session){
		logger.info("session="+session);
//		HttpSession session = request.getSession(true);
//		session.setAttribute("advertiserId", 1712010002L);
		session.setAttribute("userId", new Long(123456789L));
		session.setAttribute("advertiserId", new Long(1712010001L));
		return "uaas/page_user_login_4";
	}
	
	@RequestMapping("/logout")
	public String doLogout(HttpSession session){
		logger.info("session="+session);
		session.removeAttribute("userId");
		session.removeAttribute("advertiserId");
		return "uaas/page_user_login_4";
	}	
}
