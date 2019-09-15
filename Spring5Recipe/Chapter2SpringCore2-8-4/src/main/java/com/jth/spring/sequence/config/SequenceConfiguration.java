package com.jth.spring.sequence.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.jth.spring.sequence.SequenceGenerator;

@Configuration
public class SequenceConfiguration {
	
	@Bean
	@DependsOn("datePrefixGenerator")
	public SequenceGenerator sequenceGenerator() {
		SequenceGenerator sequence = new SequenceGenerator();
		sequence.setInitial(1000000);
		sequence.setSuffix("A");
		return sequence;
	}

}
