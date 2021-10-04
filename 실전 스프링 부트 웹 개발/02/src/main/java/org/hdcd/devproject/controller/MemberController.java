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
    public String registerForm01() {
        logger.info("registerForm01");

        return "registerForm";
    }

    @RequestMapping(value = "/registerForm02", method = RequestMethod.GET)
    public String registerForm02(Model model) {
        logger.info("registerForm02");

        model.addAttribute("member", new Member());

        return "registerForm";
    }

    @RequestMapping(value = "/registerForm03", method = RequestMethod.GET)
    public String registerForm03(Model model) {
        logger.info("registerForm03");

        model.addAttribute("user", new Member());

        return "registerForm";
    }

    @RequestMapping(value = "/registerForm04", method = RequestMethod.GET)
    public String registerForm04(Model model) {
        logger.info("registerForm04");

        model.addAttribute("user", new Member());

        return "registerForm02";
    }

    @RequestMapping(value = "/registerForm05", method = RequestMethod.GET)
    public String registerForm05(Member member) {
        logger.info("registerForm05");

        return "registerForm";
    }

    @RequestMapping(value = "/registerForm06", method = RequestMethod.GET)
    public String registerForm06(Member user) {
        logger.info("registerForm06");

        return "registerForm";
    }

    @RequestMapping(value = "/registerForm07", method = RequestMethod.GET)
    public String registerForm07(@ModelAttribute("user") Member member) {
        logger.info("registerForm07");

        return "registerForm";
    }

    @RequestMapping(value = "/registerForm08", method = RequestMethod.GET)
    public String registerForm08(@ModelAttribute("user") Member member) {
        logger.info("registerForm08");

        return "registerForm2";
    }

    @RequestMapping(value = "/registerForm09", method = RequestMethod.GET)
    public String registerForm09(Model model) {
        logger.info("registerForm09");

        Member member = new Member();

        member.setUserId("hongkd");
        member.setUserName("홍길동");

        model.addAttribute("member", member);

        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Member member) {
        logger.info("register");

        logger.info("member.getUserId() = " + member.getUserId());
        logger.info("member.getUserName() = " + member.getUserName());

        return "result";
    }

}
