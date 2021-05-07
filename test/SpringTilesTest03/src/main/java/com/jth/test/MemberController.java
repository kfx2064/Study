package com.jth.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)	
	public String join() {
		return "/member/member_join";
	}

}
