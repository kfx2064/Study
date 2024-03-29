package com.jth.spring.sequence.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jth.spring.sequence.SequenceGenerator;
import com.jth.spring.sequence.config.SequenceGeneratorConfiguration;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SequenceGeneratorConfiguration.class);
		
		SequenceGenerator generator = context.getBean(SequenceGenerator.class);
		
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
	}

}
