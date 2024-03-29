package com.jth.spring.court.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jth.spring.court.domain.Member;
import com.jth.spring.court.service.MemberService;

@Controller
public class MemberController {

	private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@RequestMapping("/member/add")
	public String addMember(Model model) {
		model.addAttribute("member", new Member());
		model.addAttribute("guests", memberService.list());
		return "memberList";
	}
	
	/**
	 * value = {"", ""}을 통해 여러 개의 경로를 mapping할 수 있다.
	 * @param memberName
	 * @return
	 */
	@RequestMapping(value = {"/member/remove", "/member/delete"}, method = RequestMethod.GET)
	public String removeMember(@RequestParam("memberName") String memberName) {
		
		memberService.remove(memberName);
		
		return "redirect:";
	}
	
}
