package com.jth.service;

import com.jth.domain.Board;
import com.jth.domain.PageRequest;
import com.jth.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper mapper;

    @Override
    public void register(Board board) throws Exception {
        mapper.create(board);
    }

    @Override
    public Board read(Integer boardNo) throws Exception {
        return mapper.read(boardNo);
    }

    @Override
    public void modify(Board board) throws Exception {
        mapper.update(board);
    }

    @Override
    public void remove(Integer boardNo) throws Exception {
        mapper.delete(boardNo);
    }

    @Override
    public List<Board> list() throws Exception {
        return mapper.list();
    }

    @Override
    public List<Board> list(PageRequest pageRequest) throws Exception {
        return mapper.list(pageRequest);
    }

    @Override
    public int count() throws Exception {
        return mapper.count();
    }
}
