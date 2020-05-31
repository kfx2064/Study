package com.jth.spring.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jth.spring.shop.Product;
import com.jth.spring.shop.ProductCreator;

@Configuration
@ComponentScan("com.jth.spring.shop")
public class ShopConfiguration {
	
	@Bean
	public Product aaa() {
		return ProductCreator.createProduct("aaa");
	}
	
	@Bean
	public Product cdrw() {
		return ProductCreator.createProduct("cdrw");
	}
	
	@Bean 
	public Product dvdrw() {
		return ProductCreator.createProduct("dvdrw");
	}

}
