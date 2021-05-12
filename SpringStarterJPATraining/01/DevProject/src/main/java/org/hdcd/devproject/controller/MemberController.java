package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.Member;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Slf4j
@Controller
public class MemberController {

    @GetMapping("/registerForm")
    public String registerForm() {
        log.info("registerForm");

        return "registerForm";
    }

    @GetMapping("/registerByGet01")
    public String registerByGet01(String userId, @DateTimeFormat(pattern = "yyyyMMdd") LocalDate dateOfBirth) {
        log.info("registerByGet01");

        log.info("userId = " + userId);

        log.info("dateOfBirth = " + dateOfBirth);

        return "success";
    }

    @GetMapping("/registerByGet02")
    public String registerByGet02(Member member) {
        log.info("registerByGet02");

        log.info("member.getUserId() = " + member.getUserId());

        log.info("member.getDateOfBirth(){ = " + member.getDateOfBirth());

        return "success";
    }

    @PostMapping("/register")
    public String register(Member member) {
        log.info("register");

        log.info("member.getUserId() = " + member.getUserId());

        log.info("member.getPassword() = " + member.getPassword());

        log.info("member.getDateOfBirth() = " + member.getDateOfBirth());

        return "success";
    }

}
