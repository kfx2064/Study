package me.whiteship.springtestdemo.sample;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleControllerTest2 {

	@Autowired
	TestRestTemplate testRestTemplate;
	
	// SampleService로 등록된 빈을 테스트용으로 이 빈으로 교체해 버림
	@MockBean
	SampleService mockSampleService;
	
	@Test
	public void hello() throws Exception {
		when(mockSampleService.getName()).thenReturn("whiteship");
		
		String result = testRestTemplate.getForObject("/hello", String.class);
		assertThat(result).isEqualTo("hello whiteship");
	}
	
}
