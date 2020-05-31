package me.whiteship;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
//@Order(1)
public class SampleListener implements ApplicationRunner {
	
	// @Order(1)을 붙이면 숫자 순으로 ApplicationRunner 우선 순위가 정해진다.
	// 마지막 코드는 CommandLineRunner로 구성해 봤다.
	
	private Logger logger = LoggerFactory.getLogger(SampleListener.class);
	
	@Autowired
	private String hello;
	
	@Autowired
	private TaehyunProperties taehyunProperties;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("=====================");
		logger.debug(hello);
		logger.debug(taehyunProperties.getName());
		logger.debug(taehyunProperties.getFullName());
		logger.info("=====================");
	}

}
