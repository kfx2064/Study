package org.hdcd.devproject.service;

import lombok.RequiredArgsConstructor;
import org.hdcd.devproject.dao.BoardDAO;
import org.hdcd.devproject.domain.Board;
import org.hdcd.devproject.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository repository;

    @Override
    @Transactional
    public void register(Board board) throws Exception {
        repository.save(board);
    }

    @Override
    @Transactional(readOnly = true)
    public Board read(Long boardNo) throws Exception {
        return repository.getOne(boardNo);
    }

    @Override
    @Transactional
    public void modify(Board board) throws Exception {
        Board boardEntity = repository.getOne(board.getBoardNo());

        boardEntity.setTitle(board.getTitle());
    }

    @Override
    @Transactional
    public void remove(Long boardNo) throws Exception {
        repository.deleteById(boardNo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Board> list() throws Exception {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "boardNo"));
    }
}
