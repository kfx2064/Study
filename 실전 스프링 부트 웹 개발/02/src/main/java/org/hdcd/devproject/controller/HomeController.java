package org.hdcd.devproject.controller;

import org.hdcd.devproject.domain.Member;
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
        model.addAttribute("username", "Sebastian");

        return "home0101";
    }

    @RequestMapping(value = "/home0102", method = RequestMethod.GET)
    public String home0102(Model model) {
        model.addAttribute("username", "<b>Sebastian</b>");

        return "home0102";
    }

    @RequestMapping(value = "/home0201", method = RequestMethod.GET)
    public String home0201(Model model) {
        model.addAttribute("username", "<b>Sebastian</b>");

        return "home0201";
    }

    @RequestMapping(value = "/home0301", method = RequestMethod.GET)
    public String home0301(Model model) {
        model.addAttribute("username", "Sebastian");

        return "home0301";
    }

    @RequestMapping(value = "/home0401", method = RequestMethod.GET)
    public String home0401(Model model) {
        model.addAttribute("username", "Sebastian");

        return "home0401";
    }

}
