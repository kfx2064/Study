package org.hdcd.devproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/home0101", method = RequestMethod.GET)
    public String home0101(Model model) {
        int coin = 1000;

        model.addAttribute("coin", coin);

        return "home0101";
    }

    @RequestMapping(value = "/home0201", method = RequestMethod.GET)
    public String home0201(Model model) {
        Date date = new Date();

        model.addAttribute("now", date);

        return "home0201";
    }

    @RequestMapping(value = "/home0301", method = RequestMethod.GET)
    public String home0301(Model model) {
        String str = "Hello, World!";

        model.addAttribute("str", str);

        return "home0301";
    }

}