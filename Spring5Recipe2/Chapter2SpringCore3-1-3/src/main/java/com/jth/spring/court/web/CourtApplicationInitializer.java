package com.jth.spring.court.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.jth.spring.court.service.config.ServiceConfiguration;
import com.jth.spring.court.web.config.WebConfiguration;

public class CourtApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {ServiceConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/", "/welcome"};
	}

}
