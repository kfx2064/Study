package com.jth.spring.sequence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new GenericXmlApplicationContext("appContext.xml");
		
		SequenceGenerator generator = (SequenceGenerator) context.getBean("sequenceGenerator");
		
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		
	}

}
