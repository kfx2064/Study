package com.jth.spring.shop;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jth.spring.shop.config.ShopConfiguration;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ShopConfiguration.class);
		
		String alert = context.getMessage("alert.checkout", null, Locale.US);
		String alertInventory = context.getMessage("alert.inventory.checkout", new Object[] {"[DVD-RW 3.0]", new Date()}, Locale.US);
		
		System.out.println("The I18N message for alert.checkout is : " + alert);
		System.out.println("The I18N message for alert.inventory.checkout is : " + alertInventory);
		
	}

}
