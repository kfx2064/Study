package me.whiteship.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import me.whiteship.Holoman;

@SpringBootApplication
public class SpringinitApplication {

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(SpringinitApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
		
		//SpringApplication.run(SpringinitApplication.class, args);
	}

}

