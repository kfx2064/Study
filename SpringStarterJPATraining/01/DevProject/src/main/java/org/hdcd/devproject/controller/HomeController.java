package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.Address;
import org.hdcd.devproject.domain.Member;
import org.slf4j.Logger;
import org.springframework.boot.Banner;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/home0101")
    public String home0101() {
        return "home0101";
    }

    @GetMapping("/home0201")
    public String home0201() {
        return "home0201";
    }

    @GetMapping("/home0301")
    public String home0301() {
        return "home0301";
    }

    @PostMapping("/register")
    public String register(Model model) throws Exception {
        model.addAttribute("msg", "등록이 완료되었습니다.");

        return "success";
    }

}