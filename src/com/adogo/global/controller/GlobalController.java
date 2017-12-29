package com.adogo.global.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adogo.advertiser.service.IndustryCodeService;
import com.adogo.uaas.entity.UserAccount;
import com.adogo.uaas.service.UserAccountService;


@Controller
@RequestMapping("/")
public class GlobalController {
	
	private static final Logger logger = Logger.getLogger(GlobalController.class);
	
	@Autowired
	private UserAccountService userAccountService;
	
	@RequestMapping("")
	public String gotoIndex(){
		logger.info("entering.. /");
		logger.info("exiting.. /");
		return "index";
//		return "uaas/page_user_login_4";
	}
	
	@RequestMapping("/index")
	public String gotoIndex1(HttpSession session, @RequestParam String  username){
		logger.info("entering.. /index   userName="+username);
		
		UserAccount userAccount = this.userAccountService.findByName(username);
		session.setAttribute("userAccount", userAccount);
		session.setAttribute("warningMsg", "");
		session.setAttribute("loginReqMsg", "");
		logger.info("exiting.. /index");
		return "index";
	}
	
	
		
}
