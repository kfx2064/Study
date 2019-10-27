package com.jth.spring.court.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.jth.spring.court.web.ExtensionInterceptor;
import com.jth.spring.court.web.MeasurementInterceptor;

@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(measurementInterceptor());
		registry.addInterceptor(summaryReportInterceptor()).addPathPatterns("/reservationSummary*");
	}
	
	public MeasurementInterceptor measurementInterceptor() {
		return new MeasurementInterceptor();
	}
	
	public ExtensionInterceptor summaryReportInterceptor() {
		return new ExtensionInterceptor();
	}
	
}
