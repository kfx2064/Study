package me.whiteship;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@TestPropertySource(properties = "taehyun.name=taehyun")
@SpringBootTest
public class Springinit2ApplicationTests {
	
	@Autowired
	Environment environment;

	@Test
	public void contextLoads() {
		 assertThat(environment.getProperty("taehyun.name"))
		 						.isEqualTo("taehyun");
	}

}

