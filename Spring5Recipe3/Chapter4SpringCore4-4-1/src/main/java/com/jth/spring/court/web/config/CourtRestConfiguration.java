package com.jth.spring.court.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.jth.spring.court.feeds.AtomFeedView;
import com.jth.spring.court.feeds.RSSFeedView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.jth.spring")
public class CourtRestConfiguration {
	
	@Bean
	public AtomFeedView atomfeedtemplate() {
		return new AtomFeedView();
	}
	
	@Bean
	public RSSFeedView rssfeedtemplate() {
		return new RSSFeedView();
	}
	
	@Bean
	public View jsontournamenttemplate() {
		MappingJackson2JsonView view = new MappingJackson2JsonView();
		view.setPrettyPrint(true);
		return view;
	}
	
	@Bean
	public ViewResolver viewResolver() {
		return new BeanNameViewResolver();
	}

}
