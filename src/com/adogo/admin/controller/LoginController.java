package com.adogo.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String doLogin(){
		return "login_soft";
	}
	
	@RequestMapping("/logout")
	public String doLogout(){
		return "login_soft";
	}
	
}
