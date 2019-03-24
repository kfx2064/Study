package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTests {
	
	private static Logger logger = LoggerFactory.getLogger(BoardServiceTests.class);
	
	@Autowired
	private BoardService service;
	
	@Test
	public void testUpdate() {
		
		BoardVO board = service.get(1L);
		
		if (board == null) {
			return;
		}
		
		board.setTitle("제목 수정합니다.");
		logger.info("MODIFY RESULT ::: " + service.modify(board));
	}
	
	/*
	@Test
	public void testDelete() {
		
		// 게시물 번호의 존재 여부를 확인하고 테스트
		logger.info("remove result :: " + service.remove(2L));
	}
	*/
	
	/*
	@Test
	public void testGet() {
		logger.info("service ::: " + service.get(1L).toString());
	}
	*/
	
	/*
	@Test
	public void testGetList() {
		service.getList().forEach(board -> logger.info(board.toString()));
	}
	*/
	
	/*
	@Test
	public void testRegister() {
		
		BoardVO board = new BoardVO();
		board.setTitle("새로 작성하는 글");
		board.setContent("새로 작성하는 내용");
		board.setWriter("newbie");
		
		service.register(board);
		
		logger.info("생성된 게시물의 번호 : " + board.getBno());
	}
	*/
	
	/*
	 * @Test public void testExist() { assertNotNull(service); }
	 */

}
