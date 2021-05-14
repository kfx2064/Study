package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/home0101")
    public String home0101(Model model) {
        model.addAttribute("username", "Sebastian");

        return "home0101";
    }

    @GetMapping("/home0102")
    public String home0102(Model model) {
        model.addAttribute("username", "<b>Sebastian</b>");

        return "home0102";
    }

    @GetMapping("/home0201")
    public String home0201(Model model) {
        model.addAttribute("username", "<b>Sebastian</b>");

        return "home0201";
    }

    @GetMapping("/home0301")
    public String home0301(Model model) {
        model.addAttribute("username", "Sebastian");

        return "home0301";
    }

    @GetMapping("/home0401")
    public String home0401(Model model) {
        model.addAttribute("username", "Sebastian");

        return "home0401";
    }

}