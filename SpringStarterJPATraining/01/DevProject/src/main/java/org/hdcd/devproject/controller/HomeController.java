package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/registerForm")
    public String registerForm() {
        log.info("registerForm");

        return "registerForm";
    }

}