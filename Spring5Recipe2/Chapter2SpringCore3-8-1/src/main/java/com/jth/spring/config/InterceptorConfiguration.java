package com.jth.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.jth.spring.web.ExtensionInterceptor;
import com.jth.spring.web.MeasurementInterceptor;

@Configuration
@ComponentScan("com.jth.spring")
public class InterceptorConfiguration implements WebMvcConfigurer {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(measurementInterceptor());
		registry.addInterceptor(summaryReportInterceptor()).addPathPatterns("/reservationSummary*");
	}
	
	@Bean
	public MeasurementInterceptor measurementInterceptor() {
		return new MeasurementInterceptor();
	}
	
	public ExtensionInterceptor summaryReportInterceptor() {
		return new ExtensionInterceptor();
	}

}
