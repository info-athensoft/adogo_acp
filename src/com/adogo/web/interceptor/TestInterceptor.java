package com.adogo.web.interceptor;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.adogo.uaas.entity.UserAccount;

import com.adogo.uaas.service.UserRoleService;

public class TestInterceptor extends HandlerInterceptorAdapter {
	
	private static final Logger logger = Logger.getLogger(TestInterceptor.class);
	
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
    	HttpSession session = request.getSession(false);
    	
    	
    	//test ajax starts
    	if (url.contains("test")) {
    		logger.info("### TEST ### TEST ### TEST ### TEST ### TEST ### TEST : " + url);
    		response.setHeader("REQUIRES_AUTH", "1");
    		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
    	       return false;
    		//sendRedirect(request, response, "/acp/advertiser/biz/", "WARNING: test letting you OUT!");
    	}
    	//test ajax ends
    	
    	
        return true;
    }

	private void sendRedirect(HttpServletRequest request, HttpServletResponse response, String dest, String msg) throws IOException {
		logger.info(">>>>>>TestInterceptor redirect to ACP ROLE PAGE ....... ");
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