package org.zerock.mapper;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.Setter;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ReplyMapperTests {

	private static final Logger logger = LoggerFactory.getLogger(ReplyMapperTests.class);
	
	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;
	
	private Long[] bnoArr = {10L, 15L, 20L, 30L, 35L};
	
	@Test
	public void testList() {
		
		Criteria cri = new Criteria();
		
		List<ReplyVO> replies = mapper.getListWithPaging(cri, 10L);
		
		replies.forEach(reply -> logger.info(reply.toString()));
		
	}
	
	/*
	@Test
	public void testUpdate() {
		
		Long targetRno = 10L;
		
		ReplyVO vo = mapper.read(targetRno);
		
		vo.setReply("Update Reply ");
		
		int count = mapper.update(vo);
		
		logger.info("UPDATE COUNT ::: " + count);
		
	}
	*/
	
	/*
	@Test
	public void testDelete() {
		
		Long targetRno = 1L;
		int result = mapper.delete(targetRno);
		logger.info("showReturnValue ::: " + result);
	}
	*/
	
	/*
	@Test
	public void testRead() {
		
		Long targetRno = 5L;
		
		ReplyVO vo = mapper.read(targetRno);
		
	}
	*/
	
	/*
	@Test
	public void testCreate() {
		
		for (int i = 0; i < 5; i++) {
			ReplyVO vo = new ReplyVO();
			
			// 게시물의 번호
			vo.setBno(bnoArr[i]);
			vo.setReply("댓글 테스트 " + i);
			vo.setReplyer("replyer " + i);
			
			mapper.insert(vo);
		}
		
	}
	*/
	
	/*
	@Test
	public void testMapper() {
		logger.info("mapper : " + mapper.toString());
	}
	*/
	
}
