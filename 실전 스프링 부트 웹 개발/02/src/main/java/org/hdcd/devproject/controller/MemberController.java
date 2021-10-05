package org.hdcd.devproject.controller;

import org.hdcd.devproject.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MemberController {

    private final static Logger logger = LoggerFactory.getLogger(MemberController.class);

    @RequestMapping(value = "/registerForm01", method = RequestMethod.GET)
    public String registerForm01(Model model) {
        logger.info("registerForm01");

        model.addAttribute("member", new Member());

        return "registerForm";
    }

    @RequestMapping(value = "/registerForm02", method = RequestMethod.GET)
    public String registerForm02(Model model) {
        logger.info("registerForm02");

        Member member = new Member();

        member.setEmail("aaa@ccc.com");
        member.setUserName("홍길동");

        model.addAttribute("member", member);

        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Member member) {
        logger.info("register");

        logger.info("member.getUserId() = " + member.getUserId());
        logger.info("member.getUserName() = " + member.getUserName());
        logger.info("member.getEmail() = " + member.getEmail());

        return "result";
    }
}
