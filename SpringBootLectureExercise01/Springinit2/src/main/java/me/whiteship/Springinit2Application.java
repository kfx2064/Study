package me.whiteship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(TaehyunProperties.class)
public class Springinit2Application {

	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(Springinit2Application.class);
		//app.addListeners(new SampleListener());
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
		
		//SpringApplication.run(Springinit2Application.class, args);
		
		/*new SpringApplicationBuilder()
			.sources(Springinit2Application.class)			
			.run(args);*/
	}

}

