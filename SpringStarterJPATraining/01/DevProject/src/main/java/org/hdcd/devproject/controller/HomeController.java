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
        model.addAttribute("msg", "Hello world!");

        return "home0101";
    }

    @GetMapping("/home0201")
    public String home0201(Model model) {
        model.addAttribute("msg", "Hello world!");

        return "home0201";
    }

}