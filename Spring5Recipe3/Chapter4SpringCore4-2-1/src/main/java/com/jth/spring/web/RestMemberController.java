package com.jth.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jth.spring.domain.Members;
import com.jth.spring.service.MemberService;

@Controller
public class RestMemberController {
	
	private final MemberService memberService;
	
	@Autowired
	public RestMemberController(MemberService memberService) {
		super();
		this.memberService = memberService;
	}
	
	@RequestMapping("/members")
	public String getRestMembersJson(Model model) {
		Members members = new Members();
		members.addMembers(memberService.findAll());
		System.out.println(members.toString());
		model.addAttribute("members", members);
		return "jsonmembertemplate";
	}

}
