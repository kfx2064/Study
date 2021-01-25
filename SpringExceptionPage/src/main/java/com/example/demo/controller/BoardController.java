package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @GetMapping("/board/list")
    public String boardList() throws Exception {
        logger.info("BoardController, boardList.");

        int divide = 10 / 0;

        return "board/list";
    }

}
