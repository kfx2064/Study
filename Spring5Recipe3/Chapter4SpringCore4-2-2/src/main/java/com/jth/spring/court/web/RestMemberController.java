package com.jth.spring.court.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jth.spring.court.domain.Member;
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
	
	@RequestMapping(value = "/members", produces = MediaType.APPLICATION_XML_VALUE)
	public String getRestMember(Model model) {
		Members members = new Members();
		members.addMembers(memberService.findAll());
		model.addAttribute("members", members);
		return "xmlmembertemplate";
	}
	
	@RequestMapping(value = "/members", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getRestMembersJson(Model model) {
		Members members = new Members();
		members.addMembers(memberService.findAll());
		model.addAttribute("members", members);
		return "jsonmembertemplate";
	}
	
}
