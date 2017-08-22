package com.adogo.uaas.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.adogo.uaas.entity.UserAccount;
import com.adogo.uaas.service.UserAccountService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * For Back-end Management use
 * For test purpose
 * 
 * @author Athens
 *
 */
@Controller
public class UserAccountController {
	
	private static final Logger logger = Logger.getLogger(UserAccountController.class);
	
	
	private UserAccountService userAccountService;
	
	@Autowired
	public void setUserAccountService(UserAccountService userAccountService) {
		this.userAccountService = userAccountService;
	}

	@RequestMapping(value="/useracct-test/{acctId}",method=RequestMethod.GET)
	@ResponseBody
	public UserAccount getUserAccountTest(@PathVariable long acctId){
		System.out.println("hello GET");
		UserAccount userAccount = userAccountService.getUserAccount(acctId);
		
		return userAccount;
	}


	private String convertToJson( UserAccount obj) {
		ObjectMapper mapper = new ObjectMapper();
		String json = "";
        try {
            json = mapper.writeValueAsString(obj);
            System.out.println("JSON = " + json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
		return json;
	}
	
	@RequestMapping(value="/useracct-test",method=RequestMethod.POST,produces="application/json",consumes="application/json")
	@ResponseBody
	public UserAccount createUserAccountTest(@RequestBody String json){
		System.out.println("hello POST");
		
		UserAccount userAccount = new UserAccount();
	    ObjectMapper mapper = new ObjectMapper();
	    try {
			userAccount = mapper.readValue(json, UserAccount.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long key = userAccountService.createUserAccount(userAccount);
		userAccount.setAcctId(key);
		
		return userAccount;
	}
	
	@RequestMapping(value="/useracct/{acctId}",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Map<String,Object> updateUserAccount(
			@PathVariable long acctId,
			@RequestParam String password
			){
		System.out.println("hello PUT");				
		
		//UserAccount userAccount = userAccountService.getUserAccount(acctId);
		
		//logger.info(userAccount.toString());		
		
		UserAccount userAccount = userAccountService.getUserAccount(acctId);
		userAccount.setPassword(password);
		
		userAccountService.updateUserAccount(userAccount);
		
		ModelAndView mav = new ModelAndView();
		Map<String,Object> data = mav.getModel();
		
//		data.put("userAccount", userAccount);
		data.put("userAccountKey", acctId);
		
		//mav.setViewName("redirect:/useracct/"+key);
		return data;
	}
	
}
