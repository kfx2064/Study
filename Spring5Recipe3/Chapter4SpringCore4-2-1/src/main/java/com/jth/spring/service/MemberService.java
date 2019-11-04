package com.jth.spring.service;

import java.util.Collection;

import com.jth.spring.domain.Member;

public interface MemberService {
	
	Collection<Member> findAll();
	
	Member find(long id);

}
