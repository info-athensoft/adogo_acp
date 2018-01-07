package test.web.interceptor;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.adogo.uaas.entity.UserAccount;

import test.service.TestUserRoleService;

public class TestLoginInterceptor extends HandlerInterceptorAdapter {
	private static final String[] FILTERS = {"login", "assets", "test"};
	private static final String LOGIN = "login";
//	private static final int ADVERTISER = 2;
    private static final String ACP_LOGIN = "/acp/login";
    
/*    @Autowired
	private TestUserRoleService testUserRoleService;
		
	@Autowired
	public void setTestUserRoleService(TestUserRoleService testUserRoleService) {
		this.testUserRoleService = testUserRoleService;
	} */
 
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    	String url = request.getRequestURL().toString();
    	System.out.println("===========TestLoginInterceptor preHandle. RequestURL : " + url);
    	

    	boolean flag = false;
        for (String s : FILTERS) {
            if (url.contains(s)) {
                flag = true;
//                System.out.println("******: " + url);
                break;
            }
        }
        
    	if (!flag) {  //!url.contains(LOGIN)
    		HttpSession httpSession = request.getSession(false);
    		
    		if ( httpSession == null) { //if ( s.equals( "null" )) { 
    			System.out.println("<<<<<< httpSession is null. " + ">>>>>>" );
        		sendRedirect(request, response, ACP_LOGIN, "Please login first!");
        		 return true;
    		}
    		
//    		String s = httpSession.getAttribute("userAccount").toString();
    		if ( httpSession.getAttribute("userAccount") == null) { //if ( s.equals( "null" )) { 
    			System.out.println("<<<<<< UserAccount is null. " + ">>>>>>" );
        		sendRedirect(request, response, ACP_LOGIN, "Please login first!");
        		 return true;
    		}
    		
        	UserAccount userAccount = (UserAccount) httpSession.getAttribute("userAccount");
        	if (userAccount == null) {
            	System.out.println("<<<<<< UserAccount is NULL. " + ">>>>>>" );
        		sendRedirect(request, response, ACP_LOGIN, "Please login first!");
        	}
    	}
    	
        return true;
    }

	private void sendRedirect(HttpServletRequest request, HttpServletResponse response, String acpLogin, String msg) throws IOException {
		System.out.println(">>>>>>redirect to ACP LOGIN PAGE ....... ");
		request.getSession().setAttribute("loginReqMsg", msg);
		response.sendRedirect(acpLogin);
	}
 
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
        String url = request.getRequestURL().toString();
    	System.out.println("===========TestLoginInterceptor postHandle. RequestURL : " + url);
    }
    
    @Override  
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    	String url = request.getRequestURL().toString();
    	System.out.println("===========TestLoginInterceptor afterCompletion. RequestURL : " + url);
    }
    
}