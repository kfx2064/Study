package com.jth.spring.shop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jth.spring.shop.Product;
import com.jth.spring.shop.config.ShopConfiguration;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ShopConfiguration.class);
		
		Product aaa = context.getBean("aaa", Product.class);
		Product cdrw = context.getBean("cdrw", Product.class);
		
		System.out.println(aaa);
		System.out.println(cdrw);
	}

}
