package com.adogo.web.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.adogo.uaas.entity.UserAccount;
import com.adogo.uaas.service.UserRoleService;

public class UaasInterceptor extends HandlerInterceptorAdapter {
private static final Logger logger = Logger.getLogger(UaasInterceptor.class);
	
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
    	logger.info("entering... UaasInterceptor preHandle. RequestURL : " + url);
    	HttpSession session = request.getSession(false);
    	
    	UserAccount userAccount = (UserAccount)session.getAttribute("userAccount");
    	if (userAccount != null) {
        	String userName = userAccount.getAcctName();
        	long acctId = userAccount.getAcctId();
        	logger.info(">>>>>>userName: " + userName + ">>>>>>acctId: " + acctId);
        	
        	boolean isAdmin = this.userRoleService.isAdminUnderAccount(acctId);
        	
        	if (!isAdmin) {
        		//session.setAttribute("advertiserRoleMsg", "WARNING: You do not have an Advertiser Role yet, please apply for it now!");
        		//session.setAttribute("flag_NotAdvertiser", true);
        		sendRedirect(request, response, ACP_ROLE, "WARNING: You do not have an Administrator Role!");
        		
        	}else{
        		//session.setAttribute("advertiserRoleMsg", "");
        		//session.setAttribute("flag_NotAdvertiser", false);
        	}
    	}
        return true;
    }

	private void sendRedirect(HttpServletRequest request, HttpServletResponse response, String dest, String msg) throws IOException {
		logger.info(">>>>>> UaasInterceptor redirect to ACP ROLE PAGE ....... ");
		request.getSession().setAttribute("warningMsg", msg);
		response.sendRedirect(dest);
	}
 
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
        String url = request.getRequestURL().toString();
//    	logger.info("===========TestInterceptor postHandle. RequestURL : " + url);
    }
    
    @Override  
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    	String url = request.getRequestURL().toString();
//    	logger.info("===========TestInterceptor afterCompletion. RequestURL : " + url);
    }
}
