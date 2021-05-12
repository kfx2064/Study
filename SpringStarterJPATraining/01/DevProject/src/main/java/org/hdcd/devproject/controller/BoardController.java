package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping(value = "/get", params = "register")
    public String registerForm() {
        log.info("registerForm");

        return "board/register";
    }

    @PostMapping(value = "/post", params = "register")
    public String register() {
        log.info("register");

        return "board/list";
    }

    @GetMapping(value = "/get", params = "modify")
    public String modifyForm() {
        log.info("modifyForm");

        return "board/modify";
    }

    @PostMapping(value = "/post", params = "modify")
    public String modify() {
        log.info("modify");

        return "board/list";
    }

    @GetMapping(value = "/get", params = "remove")
    public String removeForm() {
        log.info("removeForm");

        return "board/remove";
    }

    @PostMapping(value = "/post", params = "remove")
    public String remove() {
        log.info("remove");

        return "board/list";
    }

    @GetMapping(value = "/get", params = "list")
    public String list() {
        log.info("list");

        return "board/list";
    }

    @GetMapping(value = "/get", params = "read")
    public String read() {
        log.info("read");

        return "board/read";
    }

}
