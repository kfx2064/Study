package org.hdcd.controller;

import lombok.extern.java.Log;
import org.hdcd.domain.Board;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Log
@RestController
@RequestMapping("/boards")
public class BoardController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<Board>> list() {
        log.info("list");

        List<Board> boardList = new ArrayList<>();

        Board board = new Board();

        board.setBoardNo(1);
        board.setTitle("향수");
        board.setContent("넓은 벌 동쪽 끝으로");
        board.setWriter("hongkd");
        board.setRegDate(new Date());

        boardList.add(board);

        board = new Board();

        board.setBoardNo(2);
        board.setTitle("첫 마음");
        board.setContent("날마다 새로우며 깊어지고 넓어진다");
        board.setWriter("hongkd");
        board.setRegDate(new Date());

        boardList.add(board);

        ResponseEntity<List<Board>> entity = new ResponseEntity<>(boardList, HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<String> register(@RequestBody Board board) {
        log.info("register");

        log.info("Title : " + board.getTitle());
        log.info("Content : " + board.getContent());
        log.info("Writer : " + board.getWriter());

        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.GET)
    public ResponseEntity<Board> read(@PathVariable("boardNo") int boardNo) {
        log.info("read");

        Board board = new Board();

        board.setBoardNo(1);
        board.setTitle("향수");
        board.setContent("넓은 벌 동쪽 끝으로");
        board.setWriter("hongkd");
        board.setRegDate(new Date());

        return new ResponseEntity<>(board, HttpStatus.OK);
    }

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.DELETE)
    public ResponseEntity<String> remove(@PathVariable("boardNo") int boardNo) {
        log.info("remove");

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.PUT)
    public ResponseEntity<String> modify(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
        log.info("modify");

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

}
