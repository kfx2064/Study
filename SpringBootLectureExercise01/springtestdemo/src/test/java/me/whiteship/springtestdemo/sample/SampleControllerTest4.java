package me.whiteship.springtestdemo.sample;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
public class SampleControllerTest4 {
	
	@Rule
	public OutputCapture outputCapture = new OutputCapture();
	
	@MockBean
	SampleService mockSampleService;
	
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void hello() throws Exception {
		// SampleService의 getName 메서드로 돌려주는 값을 taehyun으로 고정시킨다.
		// 만약 다른 SampleService에 다른 값으로 셋팅되어 있더라도 현재 여기에 입력된 값으로 바꾼다.
		when(mockSampleService.getName()).thenReturn("taehyun");
		
		/*
		mockMvc.perform(get("/hello"))
				.andExpect(content().string("hello taehyun"));
				*/
		
		mockMvc.perform(get("/hello"))
				.andExpect(content().string("hello taehyun"))
				.andDo(print());
		
		assertThat(outputCapture.toString())
				.contains("holoman")
				.contains("skip");
		
		/*
		mockMvc.perform(get("/hello"))
		.andExpect(status().isOk())
		.andExpect(content().string("hello taehyun"))
		.andDo(print());
		*/
	}

}
