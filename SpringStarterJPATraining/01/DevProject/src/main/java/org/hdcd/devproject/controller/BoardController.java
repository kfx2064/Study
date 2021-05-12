package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.Board;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping(value = "/{boardNo}", produces = "application/xml")
    public ResponseEntity<Board> readToXml(@PathVariable("boardNo") int boardNo) {
        log.info("readToXml");

        Board board = new Board();

        board.setTitle("제목");
        board.setContent("내용입니다.");
        board.setWriter("홍길동");
        board.setRegDate(LocalDateTime.now());

        ResponseEntity<Board> entity = new ResponseEntity<Board>(board, HttpStatus.OK);

        return entity;
    }

    @GetMapping(value = "/{boardNo}", produces = "application/json")
    public ResponseEntity<Board> readToJson(@PathVariable("boardNo") int boardNo) {
        log.info("readToJson");

        Board board = new Board();

        board.setTitle("제목");
        board.setContent("내용입니다.");
        board.setWriter("홍길동");
        board.setRegDate(LocalDateTime.now());

        ResponseEntity<Board> entity = new ResponseEntity<Board>(board, HttpStatus.OK);

        return entity;
    }

    @GetMapping("/{boardNo}")
    public ResponseEntity<Board> read(@PathVariable("boardNo") int boardNo) {
        log.info("read");

        Board board = new Board();

        board.setTitle("제목");
        board.setContent("내용입니다.");
        board.setWriter("홍길동");
        board.setRegDate(LocalDateTime.now());

        ResponseEntity<Board> entity = new ResponseEntity<Board>(board, HttpStatus.OK);

        return entity;
    }

}
