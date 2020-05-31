package com.jth.service;

import com.jth.domain.Board;
import com.jth.domain.PageRequest;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface BoardService {

    public void register(Board board) throws Exception;

    public Board read(Integer boardNo) throws Exception;

    public void modify(Board board) throws Exception;

    public void remove(Integer boardNo) throws Exception;

    public List<Board> list() throws Exception;

    public List<Board> list(PageRequest pageRequest) throws Exception;

    public int count() throws Exception;

    public int count(PageRequest pageRequest) throws Exception;

}
