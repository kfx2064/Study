package com.jth.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.jth.spring.domain.SportTypeConverter;

@Configuration
public class BidingConfiguration implements WebMvcConfigurer {
	
	private final SportTypeConverter sportTypeConverter;
	
	public BidingConfiguration(SportTypeConverter sportTypeConverter) {
		this.sportTypeConverter = sportTypeConverter;
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(this.sportTypeConverter);
	}

}
