package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TestIndexController {
	@RequestMapping("/index-sample")
	public String gotoIndex2(){
		return "test/index_sample";
	}
}
