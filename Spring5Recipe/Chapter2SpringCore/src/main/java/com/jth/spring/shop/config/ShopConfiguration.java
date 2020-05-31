package com.jth.spring.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jth.spring.shop.Battery;
import com.jth.spring.shop.Disc;
import com.jth.spring.shop.Product;

@Configuration
public class ShopConfiguration {
	
	@Bean
	public Product aaa() {
		Battery p1 = new Battery("AAA", 2.5);
		p1.setRechargeable(true);
		return p1;
	}
	
	@Bean
	public Product cdrw() {
		Disc p2 = new Disc("CD-RW", 1.5);
		p2.setCapacity(700);
		return p2;
	}

}
