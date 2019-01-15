package me.whiteship.springtestdemo.sample;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleControllerTest3 {

	// 이건 asynchronous, 비동기임.
	@Autowired
	WebTestClient webTestClient;
	
	@MockBean
	SampleService mockSampleService;
	
	@Test
	public void hello() throws Exception {
		
		when(mockSampleService.getName()).thenReturn("whiteship");
		
		webTestClient.get().uri("/hello").exchange()
				.expectStatus().isOk()
				.expectBody(String.class).isEqualTo("hello whiteship");
		
	}
	
}
