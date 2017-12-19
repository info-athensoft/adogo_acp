package test.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
@SessionAttributes(value={"userId"})
public class TestSessionController {
	@RequestMapping("/session")
	public ModelAndView gotoIndex(){
		ModelAndView mav = new ModelAndView();
		
		Map<String,Object> model = mav.getModel();
		model.put("userId", "USER1001-101");
		
		String viewName = "test/test_session_index";
		mav.setViewName(viewName);
		
		return mav;
	}
	
	@RequestMapping("/result")
	public String viewSessionPage1(){
		String viewName = "test/test_session_result";
		return viewName;
	}
	
	
	@RequestMapping("/session2")
	public String gotoIndex2(HttpSession session){
		
		session.setAttribute("bizId", "BIZ1001-110");
		
		String viewName = "test/test_session_index";
		
		return viewName;
	}
	
	@RequestMapping("/result2")
	public ModelAndView viewSessionPage2(HttpSession session){
		ModelAndView mav = new ModelAndView();
		Map<String,Object> model = mav.getModel();
		
		
		model.put("myBizId", session.getAttribute("bizId"));
		
		String viewName = "test/test_session_result";
		mav.setViewName(viewName);
		return mav;
	}
}
