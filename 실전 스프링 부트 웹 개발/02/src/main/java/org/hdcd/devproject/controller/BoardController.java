package org.hdcd.devproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class BoardController {

    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm() {
        logger.info("registerForm.");

        return "success";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register() {
        logger.info("register");

        return "success";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public String modifyForm() {
        logger.info("modifyForm");
        return "success";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public String modify() {
        logger.info("modify");
        return "success";
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public String remove() {
        logger.info("remove");
        return "success";
    }

    @RequestMapping("/list")
    public void list() {
        logger.info("list");
    }

}
