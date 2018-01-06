package com.adogo.global.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.adogo.uaas.entity.UserAccount;
import com.adogo.uaas.service.UserAccountService;

@Controller
public class LoginController {
	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	@Autowired
	private UserAccountService userAccountService;
	
	@Autowired
	public void setUserAccountService(UserAccountService userAccountService) {
		this.userAccountService = userAccountService;
	}

	
	@RequestMapping("/login.html")
	public String gotoLogin(HttpSession session){
		logger.info("entering... gotoLogin");
		
		
		
		String viewName = "uaas/page_user_login_4";
		logger.info("exiting... gotoLogin");
		return viewName;
	}
	
	@RequestMapping(value="/login", produces="application/json")
	@ResponseBody
	public Map<String,Object> doLogin(HttpSession session, @RequestParam String userName){
		logger.info("entering... doLogin");
		
		UserAccount userAccount = userAccountService.findByName(userName);
		session.setAttribute("userAccount", userAccount);
		session.setAttribute("warningMsg", "");
		session.setAttribute("loginReqMsg", "");
		
		session.setAttribute("userId", new Long(123456789L));
		session.setAttribute("advertiserId", new Long(1712010001L));
		
		/* assemble data and view */
		ModelAndView mav = new ModelAndView();
		Map<String,Object> model = mav.getModel();
		
		/* set data */
		model.put("userAccount", userAccount);
		
		/* set view */
		//String viewName = "index";
		
		logger.info("exiting... doLogin");
		return model;
	}
	
	@RequestMapping("/logout")
	public String doLogout(HttpSession session){
		logger.info("entering... doLogout");
		
		session.removeAttribute("userId");
		session.removeAttribute("advertiserId");
		
		String viewName = "redirect:/login.html";
		logger.info("exiting... doLogout");
		return viewName;
	}	
}
