package com.jth.spring.court.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jth.spring.court.domain.Members;
import com.jth.spring.court.service.MemberService;

@Controller
public class RestMemberController {
	
	private final MemberService memberService;
	
	@Autowired
	public RestMemberController(MemberService memberService) {
		super();
		this.memberService = memberService;
	}
	
	@RequestMapping("/members")
	public String getRestMember(Model model) {
		Members members = new Members();
		members.addMembers(memberService.findAll());
		model.addAttribute("members", members);
		return "membertemplate";
	}

}
