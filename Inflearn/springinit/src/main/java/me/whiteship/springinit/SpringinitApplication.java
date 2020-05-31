package me.whiteship.springinit;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
@EnableConfigurationProperties(KeesunProperties.class)
public class SpringinitApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringinitApplication.class, args);
        SpringApplication app = new SpringApplication(SpringinitApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
	}

}
