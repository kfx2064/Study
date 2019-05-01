package org.zerock.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.domain.BoardAttachVO;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardAttachMapper;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private static Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
	
	@Autowired
	private BoardMapper mapper;
	
	@Autowired
	private BoardAttachMapper attachMapper;
	
	@Transactional
	@Override
	public BoardVO register(BoardVO board) {
		
		logger.info("register........." + board);
		System.out.println("register.............");
		
		mapper.insertSelectKey(board);
		
		return board;
	}
	
	@Transactional
	@Override
	public void registerAttach(BoardVO board) {

		if(board.getAttachList() == null || board.getAttachList().size() <= 0) {
			return;
		}
		
		System.out.println("showboardbno : " + board.getBno());
		
		board.getAttachList().forEach(attach -> {
			
			attach.setBno(board.getBno() + 1);
			attachMapper.insert(attach);
			
		});
	}

	@Override
	public BoardVO get(Long bno) {
		
		logger.info("get..........." + bno);
		
		BoardVO result = mapper.read(bno);
		
		return result;
	}

	@Transactional
	@Override
	public boolean modify(BoardVO board) {
		
		logger.info("modify.........." + board);
		
		attachMapper.deleteAll(board.getBno());
		
		boolean modifyResult = mapper.update(board) == 1;
		
		if(modifyResult && board.getAttachList().size() > 0) {
			
			board.getAttachList().forEach(attach -> {
				
				attach.setBno(board.getBno());
				attachMapper.insert(attach);
				
			});
			
		}
		
		return modifyResult;
	}

	@Override
	public boolean remove(Long bno) {
		
		logger.info("remove........." + bno);
		
		attachMapper.deleteAll(bno);
		
		boolean result = mapper.delete(bno) == 1;
		
		return result;
	}

	@Override
	public List<BoardVO> getList(Criteria criteria) {
		
		logger.info("get List with criteria : " + criteria);
		
		List<BoardVO> resultList = mapper.getListWithPaging(criteria);
		
		return resultList;
	}

	@Override
	public int getTotal(Criteria cri) {
		
		logger.info("get total count.");
		
		int result = 0;
		
		result = mapper.getTotalCount(cri);
		
		return result;
	}

	@Override
	public List<BoardAttachVO> getAttachList(Long bno) {
	
		logger.info("get Attach list by bno : " + bno);
	
		List<BoardAttachVO> resultList = null;
		
		resultList = attachMapper.findByBno(bno);
		
		return resultList;
	}

}
