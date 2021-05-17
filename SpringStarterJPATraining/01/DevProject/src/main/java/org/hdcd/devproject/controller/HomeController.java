package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.Date;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/home0101")
    public String home0101(Model model) {
        int coin = 1000;

        model.addAttribute("coin", coin);

        return "home0101";
    }

    @GetMapping("/home0201")
    public String home0201(Model model) {
        Date date = new Date();

        model.addAttribute("now", date);

        return "home0201";
    }

    @GetMapping("/home0301")
    public String home0301(Model model) {
        String str = "Hello, World!";

        model.addAttribute("str", str);

        return "home0301";
    }

    @GetMapping("/home0401")
    public String home0401(Model model) {
        LocalDateTime now = LocalDateTime.now();

        model.addAttribute("now", now);

        return "home0401";
    }

}