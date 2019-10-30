package com.jth.spring.config;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.XmlViewResolver;

@Configuration
public class ViewResolverConfiguration implements WebMvcConfigurer, ResourceLoaderAware {
	
	private ResourceLoader resourceLoader;
	
	public ViewResolverConfiguration(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
	
	@Bean
	public XmlViewResolver viewResolver() {
		XmlViewResolver viewResolver = new XmlViewResolver();
		viewResolver.setOrder(0);
		viewResolver.setLocation(resourceLoader.getResource("/WEB-INF/court-views.xml"));
		return viewResolver;
	}
	
	/*@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setOrder(1);
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}*/

}
