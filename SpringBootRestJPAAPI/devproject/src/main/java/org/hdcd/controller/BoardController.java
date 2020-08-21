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

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.GET)
    public ResponseEntity<Board> read(@PathVariable("boardNo") int boardNo) {
        log.info("read");

        Board board = new Board();

        ResponseEntity<Board> entity = new ResponseEntity<>(board, HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.DELETE)
    public ResponseEntity<String> remove(@PathVariable("boardNo") int boardNo) {
        log.info("remove");

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @RequestMapping(value = "/{boardNo}", method = RequestMethod.PUT)
    public ResponseEntity<String> modifyByPut(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
        log.info("modifyByPut");

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
