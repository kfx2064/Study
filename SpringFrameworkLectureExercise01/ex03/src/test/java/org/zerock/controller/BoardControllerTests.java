package org.zerock.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
// Test fpr Controller
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
						"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class BoardControllerTests {
	
	private static Logger logger = LoggerFactory.getLogger(BoardControllerTests.class);
	
	@Autowired
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void testRemove() throws Exception {
		// 삭제 전 데이터베이스에 게시물 번호 확인할 것
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/remove")
										.param("bno", "25"))
										.andReturn().getModelAndView().getViewName();
		
		logger.info(resultPage);
	}
	
	/*
	@Test
	public void testModify() throws Exception {
		
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/modify")
										.param("bno", "1")
										.param("title", "수정된 테스트 새 글 제목")
										.param("content", "수정된 테스트 새 글 내용")
										.param("writer", "user00"))
											.andReturn().getModelAndView().getViewName();
		
		logger.info(resultPage);
		
	}
	*/
	
	/*
	@Test
	public void testGet() throws Exception {
		
		logger.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/get")
								.param("bno", "1"))
								.andReturn()
								.getModelAndView().getModelMap()
								.toString()
					);
	}
	*/
	
	/*
	@Test
	public void testRegister() throws Exception {
		
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/register")
											.param("title", "테스트 새 글 제목")
											.param("content", "테스트 새 글 내용")
											.param("writer", "user00")
										).andReturn().getModelAndView().getViewName();
		logger.info(resultPage);
	}
	*/
	
	/*
	@Test
	public void testList() throws Exception {
		logger.info(
					mockMvc.perform(MockMvcRequestBuilders.get("/board/list"))
					.andReturn()
					.getModelAndView()
					.getModelMap()
					.toString()
				);
	}
	*/

}
