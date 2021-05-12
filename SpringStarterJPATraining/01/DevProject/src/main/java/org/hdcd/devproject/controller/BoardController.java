package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class BoardController {

    @RequestMapping(value = "/board/register")
    public void registerForm() {
        log.info("registerForm");
    }

    @RequestMapping("/board/modify")
    public void modifyForm() {
        log.info("modifyForm");
    }

    @RequestMapping("/board/list")
    public void list() {
        log.info("list");
    }

}
