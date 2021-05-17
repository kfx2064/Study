package org.hdcd.devproject.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

@Slf4j
@RequiredArgsConstructor
@Controller
public class HomeController {

    private final MessageSource messageSource;

    @GetMapping("/")
    public String home(Locale locale, Model model) {
        log.info("Welcome home! The client locale is " + locale + ".");

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 (E) a h시 m분 s초");
        String formattedNow = now.format(formatter);

        model.addAttribute("serverTime", formattedNow);

        return "home";
    }

    @GetMapping("/welcome")
    public String welcome() {
        String[] args = {"홍길동"};

        String message = messageSource.getMessage("welcome.message", args, Locale.KOREAN);

        log.info("Welcome message : " + message);

        return "home";
    }

}