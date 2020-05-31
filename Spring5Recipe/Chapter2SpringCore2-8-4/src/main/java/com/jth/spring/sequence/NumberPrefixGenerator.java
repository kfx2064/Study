package com.jth.spring.sequence;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class NumberPrefixGenerator implements PrefixGenerator {

	@Override
	public String getPrefix() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(100);
		String result = String.format("%03d", randomInt);
		return result;
	}
	
}
