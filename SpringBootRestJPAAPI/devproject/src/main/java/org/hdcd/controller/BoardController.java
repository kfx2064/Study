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

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.GET, produces = "application/xml")
    public ResponseEntity<Board> readToXml(@PathVariable("boardNo") int boardNo) {
        log.info("readToXml");

        Board board = new Board();

        board.setBoardNo(boardNo);
        board.setTitle("제목");
        board.setContent("내용입니다.");
        board.setWriter("홍길동");
        board.setRegDate(new Date());

        ResponseEntity<Board> entity = new ResponseEntity<>(board, HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Board> readToJson(@PathVariable("boardNo") int boardNo) {
        log.info("readToJson");

        Board board = new Board();

        board.setBoardNo(boardNo);
        board.setTitle("제목");
        board.setContent("내용입니다.");
        board.setWriter("홍길동");
        board.setRegDate(new Date());

        ResponseEntity<Board> entity = new ResponseEntity<>(board, HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.GET)
    public ResponseEntity<Board> read(@PathVariable("boardNo") int boardNo) {
        log.info("read");

        Board board = new Board();

        board.setBoardNo(boardNo);
        board.setTitle("제목");
        board.setContent("내용입니다.");
        board.setWriter("홍길동");
        board.setRegDate(new Date());

        ResponseEntity<Board> entity = new ResponseEntity<>(board, HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<Board>> list() {
        log.info("list");

        List<Board> boardList = new ArrayList<>();

        boardList.add(new Board());

        ResponseEntity<List<Board>> entity = new ResponseEntity<>(boardList, HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<String> register(@RequestBody Board board) {
        log.info("register");

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.DELETE)
    public ResponseEntity<String> remove(@PathVariable("boardNo") int boardNo) {
        log.info("remove");

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.POST)
    public ResponseEntity<String> modify(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
        log.info("modify");

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.PUT, consumes = "application/json")
    public ResponseEntity<String> modifyByJson(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
        log.info("modifyByJson");

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.PUT, consumes = "application/xml")
    public ResponseEntity<String> modifyByXml(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
        log.info("modifyByXml boardNo : " + boardNo);
        log.info("modifyByXml board : " + board);

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.PUT, headers = "X-HTTP-Method-Override=PUT")
    public ResponseEntity<String> modifyByHeader(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
        log.info("modifyByHeader");

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.PATCH)
    public ResponseEntity<String> modifyByPatch(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
        log.info("modifyByPatch");

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping("/read2/{no}")
    public String read2(@PathVariable("no") int boardNo) {
        log.info("read2 boardNo : " + boardNo);

        return "READ2 boardNo : " + boardNo;
    }

    @RequestMapping(value = "/register")
    public String registerForm() {
        log.info("registerForm");

        return "REGISTER";
    }

    @RequestMapping(value = "/modify")
    public String modifyForm() {
        log.info("modifyForm");

        return "MODIFY";
    }

}
