package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class MemberController {

    @GetMapping("/registerForm")
    public String registerForm(Model model) {
        log.info("registerForm");

        Member member = new Member();

        member.setEmail("aaa@ccc.com");
        member.setUserName("홍길동");

        model.addAttribute("member", member);

        return "registerForm";
    }

    @PostMapping("/register")
    public String register(@Validated Member member, BindingResult result) {
        log.info("register");

        if (result.hasErrors()) {
            return "registerForm";
        }

        log.info("member.getUserId() = " + member.getUserId());
        log.info("member.getUserName() = " + member.getUserName());
        log.info("member.getEmail() = " + member.getEmail());

        return "result";
    }

}
