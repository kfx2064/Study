package com.jth.spring.court;

import org.springframework.web.client.RestTemplate;

import com.jth.spring.court.domain.Members;

public class Main {

	public static void main(String[] args) throws Exception {
		final String uri = "http://localhost:8080/members.xml";
		RestTemplate restTemplate = new RestTemplate();
		Members result = restTemplate.getForObject(uri, Members.class);
		System.out.println(result);
	}
	
}
