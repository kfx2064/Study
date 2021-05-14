package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.Address;
import org.hdcd.devproject.domain.Card;
import org.hdcd.devproject.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class MemberController {

    @GetMapping("/registerForm")
    public String registerForm() {
        log.info("registerForm");

        return "registerForm";
    }

    @PostMapping("/register01")
    public String register01(String userId) {
        log.info("register01");

        log.info("userId = " + userId);

        return "result01";
    }

    @PostMapping("/register02")
    public String register02(@ModelAttribute("userId") String userId) {
        log.info("register02");

        log.info("userId = " + userId);

        return "result02";
    }

    @PostMapping("/register03")
    public String register03(@ModelAttribute("userId") String userId, @ModelAttribute("password") String password) {
        log.info("register03");

        log.info("userId = " + userId);

        log.info("password = " + password);

        return "result03";
    }

    @PostMapping("/register04")
    public String register04(Member member) {
        log.info("register04");

        log.info("userId = " + member.getUserId());

        log.info("password = " + member.getPassword());

        return "result04";
    }

}
