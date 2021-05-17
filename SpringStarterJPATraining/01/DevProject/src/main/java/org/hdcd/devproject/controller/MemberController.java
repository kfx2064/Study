package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Slf4j
@Controller
public class MemberController {

    @GetMapping("/registerForm01")
    public String registerForm01() {
        log.info("registerForm01");

        return "registerForm";
    }

    @GetMapping("/registerForm02")
    public String registerForm02(Model model) {
        log.info("registerForm02");

        model.addAttribute("member", new Member());

        return "registerForm";
    }

    @GetMapping("/registerForm03")
    public String registerForm03(Model model) {
        log.info("registerForm03");

        model.addAttribute("user", new Member());

        return "registerForm";
    }

    @GetMapping("/registerForm04")
    public String registerForm04(Model model) {
        log.info("registerForm04");

        model.addAttribute("user", new Member());

        return "registerForm2";
    }

    @GetMapping("/registerForm05")
    public String registerForm05(Member member) {
        log.info("registerForm05");

        return "registerForm";
    }

    @GetMapping("/registerForm06")
    public String registerForm06(Member user) {
        log.info("registerForm06");

        return "registerForm";
    }

    @GetMapping("/registerForm07")
    public String registerForm07(@ModelAttribute("user") Member member) {
        log.info("registerForm07");

        return "registerForm";
    }

    @GetMapping("/registerForm08")
    public String registerForm08(@ModelAttribute("user") Member member) {
        log.info("registerForm08");

        return "registerForm2";
    }

    @GetMapping("/registerForm09")
    public String registerForm09(Model model) {
        log.info("registerForm09");

        Member member = new Member();

        member.setUserId("hongkd");
        member.setUserName("홍길동");

        model.addAttribute("member", member);

        return "registerForm";
    }

    @PostMapping("/register")
    public String register(Member member) {
        log.info("register");

        log.info("member.getUserId() = " + member.getUserId());
        log.info("member.getUserName() = " + member.getUserName());

        return "result";
    }

}
