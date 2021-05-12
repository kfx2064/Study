package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.Board;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {

    @PostMapping("/{boardNo}")
    public ResponseEntity<String> modify(@PathVariable("boardNo") int boadNo, @RequestBody Board board) {
        log.info("modify");

        ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @PutMapping(value = "/{boardNo}", consumes = "application/json")
    public ResponseEntity<String> modifyByJson(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
        log.info("modifyByJson");

        ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @PutMapping(value = "/{boardNo}", consumes = "application/xml")
    public ResponseEntity<String> modifyByXml(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
        log.info("modifyByXml boardNo : " + boardNo);

        log.info("modifyByXml board : " + board);

        ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

        return entity;
    }

}
