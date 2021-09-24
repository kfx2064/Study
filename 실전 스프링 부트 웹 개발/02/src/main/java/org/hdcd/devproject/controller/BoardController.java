package org.hdcd.devproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @RequestMapping(value = "/board/register")
    public void registerForm() {
        logger.info("registerForm.");
    }

    @RequestMapping("/board/modify")
    public void modifyForm() {
        logger.info("modifyForm");
    }

    @RequestMapping("/board/list")
    public void list() {
        logger.info("list");
    }

}
