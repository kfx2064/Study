package org.zerock.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyPageDTO;
import org.zerock.domain.ReplyVO;
import org.zerock.mapper.ReplyMapper;

import lombok.Setter;

@Service
public class ReplyServiceImpl implements ReplyService {
	
	private static final Logger logger = LoggerFactory.getLogger(ReplyServiceImpl.class);

	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;
	
	@Override
	public int register(ReplyVO vo) {
		
		logger.info("register......" + vo);
		
		int result = mapper.insert(vo);
		
		return result;
	}

	@Override
	public ReplyVO get(Long rno) {
		
		logger.info("get....." + rno);
		
		ReplyVO result = mapper.read(rno);
		
		return result;
	}

	@Override
	public int modify(ReplyVO vo) {
		
		logger.info("modify....." + vo);
		
		int result = mapper.update(vo);
		
		return result;
	}

	@Override
	public int remove(Long rno) {
		
		logger.info("remove....." + rno);
		
		int result = mapper.delete(rno);
		
		return result;
	}

	@Override
	public List<ReplyVO> getList(Criteria cri, Long bno) {
		
		logger.info("get Reply List of a Board " + bno);
		
		List<ReplyVO> resultList = mapper.getListWithPaging(cri, bno);
		
		return resultList;
	}

	@Override
	public ReplyPageDTO getListPage(Criteria cri, Long bno) {
		
		ReplyPageDTO replyPageDto = null;
		
		replyPageDto = new ReplyPageDTO(mapper.getCountByBno(bno)
										, mapper.getListWithPaging(cri, bno));
		
		return replyPageDto;
	}

}
