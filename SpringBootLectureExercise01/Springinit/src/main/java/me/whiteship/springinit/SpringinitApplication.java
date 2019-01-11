package me.whiteship.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringinitApplication {

	public static void main(String[] args) {
		
		SpringApplication application = new SpringApplication(SpringinitApplication.class);
		application.run(args);
		
		
		//SpringApplication.run(SpringinitApplication.class, args);
	}

}

