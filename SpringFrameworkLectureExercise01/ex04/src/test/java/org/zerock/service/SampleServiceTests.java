package org.zerock.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.java.Log;

@RunWith(SpringJUnit4ClassRunner.class)
@Log
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class SampleServiceTests {

	@Setter(onMethod_ = @Autowired)
	private SampleService service;
	
	@Test
	public void testAddError() throws Exception {
		
		log.info("start testAddError");
		service.doAdd("123", "5");
		
	}
	
	/*
	@Test
	public void testClass() {
		
		log.info(service.toString());
		try {
			service.doAdd("2", "1");
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info(service.getClass().getName());
		
	}
	*/
	
}
