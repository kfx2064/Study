package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class MemberController {

    @GetMapping("/registerForm01")
    public String registerForm01(Model model) {
        log.info("registerForm01");

        model.addAttribute("member", new Member());

        return "registerForm";
    }

    @GetMapping("/registerForm02")
    public String registerForm02(Model model) {
        log.info("registerForm02");

        Member member = new Member();

        member.setPassword("1234");

        model.addAttribute("member", member);

        return "registerForm";
    }

    @PostMapping("/register")
    public String register(Member member) {
        log.info("register");

        log.info("member.getPassword() = " + member.getPassword());

        return "result";
    }

}
