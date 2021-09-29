package org.hdcd.devproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/home0101", method = RequestMethod.GET)
    public String home0101(Model model) {
        model.addAttribute("msg", "<b>Hello world!</b>");
        return "home0101";
    }

    @RequestMapping(value = "/home0102", method = RequestMethod.GET)
    public String home0102(Model model) {
        model.addAttribute("msg", "<b>Hello world!</b>");
        return "home0102";
    }
}
