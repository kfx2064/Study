package com.jth.spring.court;

import org.springframework.web.client.RestTemplate;

public class Main {

	public static void main(String[] args) throws Exception {
		final String uri = "http://localhost:8080/members.xml";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		System.out.println(result);
	}
	
}
