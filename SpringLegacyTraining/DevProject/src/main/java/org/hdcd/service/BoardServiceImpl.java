package org.hdcd.service;

import org.hdcd.domain.Board;
import org.hdcd.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    /*@Autowired
    private BoardDAO dao;*/

    @Autowired
    private BoardRepository boardRepository;

    @Override
    @Transactional
    public void register(Board board) throws Exception {
        //dao.create(board);
        boardRepository.save(board);
    }

    @Override
    @Transactional(readOnly = true)
    public Board read(Integer boardNo) throws Exception {
        //return dao.read(boardNo);
        return boardRepository.findOne(boardNo);
    }

    @Override
    @Transactional
    public void modify(Board board) throws Exception {
        //dao.update(board);
        Board boardEntity = boardRepository.findOne(board.getBoardNo());

        boardEntity.setTitle(board.getTitle());
    }

    @Override
    @Transactional
    public void remove(Integer boardNo) throws Exception {
        //dao.delete(boardNo);
        boardRepository.delete(boardNo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Board> list() throws Exception {
        //return dao.list();
        return boardRepository.findAll(new Sort(Sort.Direction.DESC, "boardNo"));
    }

}
