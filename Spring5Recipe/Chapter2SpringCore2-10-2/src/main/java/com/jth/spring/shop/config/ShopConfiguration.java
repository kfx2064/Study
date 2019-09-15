package com.jth.spring.shop.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jth.spring.shop.Battery;
import com.jth.spring.shop.Disc;
import com.jth.spring.shop.Product;
import com.jth.spring.shop.ProductCreator;

@Configuration
@ComponentScan("com.jth.spring.shop")
public class ShopConfiguration {
	
	@Bean
	public ProductCreator productCreatorFactory() {
		ProductCreator factory = new ProductCreator();
		Map<String, Product> products = new HashMap<String, Product>();
		products.put("aaa", new Battery("AAA", 2.5));
		products.put("cdrw", new Disc("CD-RW", 1.5));
		products.put("dvdrw", new Disc("DVD-RW", 3.0));
		factory.setProducts(products);
		return factory;
	}
	
	@Bean
	public Product aaa() {
		return productCreatorFactory().createProduct("aaa");
	}
	
	@Bean
	public Product cdrw() {
		return productCreatorFactory().createProduct("cdrw");
	}
	
	@Bean
	public Product dvdrw() {
		return productCreatorFactory().createProduct("dvdrw");
	}

}




