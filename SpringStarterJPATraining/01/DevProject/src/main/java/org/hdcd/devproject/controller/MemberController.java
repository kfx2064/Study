package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Slf4j
@Controller
public class MemberController {

    @GetMapping("/registerForm")
    public String registerForm() {
        log.info("registerForm");

        return "registerForm";
    }

    @PostMapping("/register")
    public String register(Member member, RedirectAttributes rttr) throws Exception {
        log.info("register");

        rttr.addFlashAttribute("msg", "success");
        return "redirect:/result";
    }

    @GetMapping("/result")
    public String result() {
        log.info("result");

        return "result";
    }

}
