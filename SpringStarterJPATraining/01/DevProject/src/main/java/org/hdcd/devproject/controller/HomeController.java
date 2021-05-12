package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Locale locale, Model model) {

        log.info("Welcome home! The client locale is " + locale + ".");

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 (E) a h시 m분 s초");
        String formattedNow = now.format(formatter);

        model.addAttribute("serverTime", formattedNow);

        return "home";
    }

    @GetMapping("/formHome")
    public String formHome() {
        return "formHome";
    }

    @GetMapping("/ajaxHome")
    public String ajaxHome() {
        return "ajaxHome";
    }

    @GetMapping("/goHome0101")
    public void home0101() {
        log.info("home0101");
    }

    @GetMapping("/sub/goHome0102")
    public void home0102() {
        log.info("home0102");
    }

    @GetMapping("/goHome0201")
    public String home0201() {
        log.info("home0201");

        return "home0201";
    }

    @GetMapping("/sub/goHome0202")
    public String home0202() {
        log.info("home0202");

        return "home0202";
    }

    @GetMapping("/sub/goHome0203")
    public String home0203() {
        log.info("home0203");

        return "sub/home0203";
    }

    @GetMapping("/goHome0204")
    public String home0204() {
        log.info("home0204");

        return "redirect:/sub/goHome0205";
    }

    @GetMapping("/sub/goHome0205")
    public String home0205() {
        log.info("home0205");

        return "/sub/home0205";
    }

}
