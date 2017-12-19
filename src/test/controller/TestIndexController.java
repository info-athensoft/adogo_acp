package test.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adogo.uaas.entity.UserAccount;

@Controller
@RequestMapping("/")
public class TestIndexController {
	@RequestMapping("/index-sample")
	public String gotoIndex2(){
		return "test/index_sample";
	}
	
	public void testSession(HttpSession session, 
							@RequestParam long acctId,
							@RequestParam String acctName){
		UserAccount userAcctObj = new UserAccount();
		userAcctObj.setAcctId(acctId);
		userAcctObj.setAcctName(acctName);
		
		session.setAttribute("userAcct", userAcctObj);
	}
}
