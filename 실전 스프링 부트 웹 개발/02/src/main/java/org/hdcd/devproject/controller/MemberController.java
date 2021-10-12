package org.hdcd.devproject.controller;

import org.hdcd.devproject.domain.CodeLabelValue;
import org.hdcd.devproject.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MemberController {

    private final static Logger logger = LoggerFactory.getLogger(MemberController.class);

    @RequestMapping(value = "/registerForm", method = RequestMethod.GET)
    public String registerForm(Model model) {
        logger.info("registerForm");

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
