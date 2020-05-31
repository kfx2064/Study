package com.jth.spring.sequence.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jth.spring.sequence.SequenceGenerator;

@Configuration
public class SequenceGeneratorConfiguration {
	
	@Bean
	public SequenceGenerator sequenceGenerator() {
		SequenceGenerator segen = new SequenceGenerator();
		segen.setPrefix("30");
		segen.setSuffix("A");
		segen.setInitial(100000);
		return segen;
	}

}
