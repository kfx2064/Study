package com.jth.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.jth.spring.domain.SportTypeConverter;

@Configuration
public class BindingConfiguration implements WebMvcConfigurer {
	
	@Autowired
	public SportTypeConverter sportTypeConverter;
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		System.out.println("Registring SportTypeConverter");
		registry.addConverter(sportTypeConverter);
	}

}
