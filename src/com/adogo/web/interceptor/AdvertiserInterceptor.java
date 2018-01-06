package com.adogo.web.interceptor;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.adogo.uaas.entity.UserAccount;

import com.adogo.uaas.service.UserRoleService;

public class AdvertiserInterceptor extends HandlerInterceptorAdapter {
	
	private static final Logger logger = Logger.getLogger(AdvertiserInterceptor.class);
	
	private static final int ADVERTISER = 2;
    private static final String ACP_ROLE = "/acp/";
    
    @Autowired
	private UserRoleService userRoleService;
		
	@Autowired
	public void setUserRoleService(UserRoleService userRoleService) {
		this.userRoleService = userRoleService;
	}
 
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    	String url = request.getRequestURL().toString();
    	logger.info("===========TestInterceptor preHandle. RequestURL : " + url);
    	HttpSession httpSession = request.getSession(false);
    	
    	//if already tested by login interceptor and required login 
    	String loginReqMsg = (String)httpSession.getAttribute("loginReqMsg");
    	if (loginReqMsg.contains("login")) {
    		return true;
    	}
    	
    	UserAccount userAccount = (UserAccount)httpSession.getAttribute("userAccount");
    	if (userAccount != null) {
        	String userName = userAccount.getAcctName();
        	long acctId = userAccount.getAcctId();
        	logger.info(">>>>>>userName: " + userName + ">>>>>>acctId: " + acctId);
        	ArrayList<Integer> roleIdList = this.userRoleService.getRoleIdListByAcctId(acctId);
        	logger.info(">>>>>>roleIdList: " + roleIdList + ">>>>>>" );
        	if (!roleIdList.contains(ADVERTISER)) {
        		sendRedirect(request, response, ACP_ROLE, "Please register first!");
        	}
    	}
        return true;
    }

	private void sendRedirect(HttpServletRequest request, HttpServletResponse response, String dest, String msg) throws IOException {
		logger.info(">>>>>>redirect to ACP ROLE PAGE ....... ");
		request.getSession().setAttribute("warningMsg", msg);
		response.sendRedirect(dest);
	}
 
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
        String url = request.getRequestURL().toString();
    	logger.info("===========TestInterceptor postHandle. RequestURL : " + url);
    }
    
    @Override  
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    	String url = request.getRequestURL().toString();
    	logger.info("===========TestInterceptor afterCompletion. RequestURL : " + url);
    }
    
}