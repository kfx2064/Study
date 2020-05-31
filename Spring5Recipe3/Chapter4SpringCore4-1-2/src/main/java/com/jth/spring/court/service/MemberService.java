package com.jth.spring.court.service;

import java.util.Collection;

import com.jth.spring.court.domain.Member;

public interface MemberService {
	
	Collection<Member> findAll();
	
	Member find(long id);

}
