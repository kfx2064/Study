package com.jth.spring.court;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

public class Main {
	
	public static void main(String[] args) throws Exception {
		final String uri = "http://localhost:8080/members/{memberid}";
		Map<String, String> params = new HashMap<>();
		params.put("memberid", "1");
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class, params);
		System.out.println(result);
	}

}
