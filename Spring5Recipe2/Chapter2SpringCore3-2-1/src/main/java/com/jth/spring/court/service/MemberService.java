package com.jth.spring.court.service;

import java.util.List;

import com.jth.spring.court.domain.Member;

public interface MemberService {

	void add(Member member);
	
	void remove(String memberName);
	
	List<Member> list();
	
}
