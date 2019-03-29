package org.zerock.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private static Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
	
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void register(BoardVO board) {
		logger.info("register........." + board);
		
		mapper.insertSelectKey(board);
	}

	@Override
	public BoardVO get(Long bno) {
		
		logger.info("get..........." + bno);
		
		BoardVO result = mapper.read(bno);
		
		return result;
	}

	@Override
	public boolean modify(BoardVO board) {
		
		logger.info("modify.........." + board);
		
		boolean result = mapper.update(board) == 1;
		
		return result;
	}

	@Override
	public boolean remove(Long bno) {
		
		logger.info("remove........." + bno);
		
		boolean result = mapper.delete(bno) == 1;
		
		return result;
	}

	@Override
	public List<BoardVO> getList(Criteria criteria) {
		
		logger.info("get List with criteria : " + criteria);
		
		List<BoardVO> resultList = mapper.getListWithPaging(criteria);
		
		return resultList;
	}

}
