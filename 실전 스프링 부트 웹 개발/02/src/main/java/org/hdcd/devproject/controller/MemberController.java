package org.hdcd.devproject.controller;

import org.hdcd.devproject.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class MemberController {

    private final static Logger logger = LoggerFactory.getLogger(MemberController.class);

    @RequestMapping(value = "/registerForm", method = RequestMethod.GET)
    public String registerForm() {
        logger.info("registerForm");
        return "registerForm";
    }

    @RequestMapping(value = "/registerByGet01", method = RequestMethod.GET)
    public String registerByGet01(String userId
            , @DateTimeFormat(pattern = "yyyyMMdd") Date dateOfBirth) {
        logger.info("registerByGet01");
        logger.info("userId = " + userId);
        logger.info("dateOfBirth = " + dateOfBirth);
        return "success";
    }

    @RequestMapping(value = "/registerByGet02", method = RequestMethod.GET)
    public String registerByGet02(Member member) {
        logger.info("registerByGet02");
        logger.info("member.getUserId() = " + member.getUserName());
        logger.info("member.getDateOfBirth() = " + member.getDateOfBirth());
        return "success";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Member member) {
        logger.info("register");
        logger.info("member.getUserId() = " + member.getUserName());
        logger.info("member.getPassword() = " + member.getPassword());
        logger.info("member.getDateOfBirth() = " + member.getDateOfBirth());
        return "success";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerByParameter(String userId, String password) {
        logger.info("registerByParameter");
        logger.info("userId = " + userId);
        logger.info("password = " + password);
        return "success";
    }

    @RequestMapping(value = "/register/{userId}", method = RequestMethod.GET)
    public String registerByPath(String userId) {
        logger.info("registerByPath");
        logger.info("userId = " + userId);
        return "success";
    }

    @RequestMapping(value = "/register/{userId}/{coin}", method = RequestMethod.GET)
    public String registerByPath(@PathVariable("userId") String userId
            , @PathVariable("coin") int coin) {
        logger.info("registerByPath");
        logger.info("userId = " + userId);
        logger.info("coin = " + coin);
        return "success";
    }

    @RequestMapping(value = "/register01", method = RequestMethod.POST)
    public String register01(Member member) {
        logger.info("register01");
        logger.info("member.getUserId() = " + member.getUserName());
        logger.info("member.getPassword() = " + member.getPassword());
        logger.info("member.getCoin() = " + member.getCoin());
        return "success";
    }

    @RequestMapping(value = "/register02", method = RequestMethod.POST)
    public String register02(Member member, int coin) {
        logger.info("register02");
        logger.info("member.getUserId() = " + member.getUserName());
        logger.info("member.getPassword() = " + member.getPassword());
        logger.info("member.getCoin() = " + member.getCoin());
        logger.info("coin = " + coin);
        return "success";
    }

    @RequestMapping(value = "/register0201", method = RequestMethod.POST)
    public String register0201(String username) {
        logger.info("register0201");
        logger.info("userId = " + username);
        return "success";
    }

    @RequestMapping(value = "/register0202", method = RequestMethod.POST)
    public String register0202(@RequestParam("userId") String username) {
        logger.info("register0202");
        logger.info("userId = " + username);
        return "success";
    }

    @RequestMapping(value = "/register03", method = RequestMethod.POST)
    public String register03(int uid, Member member) {
        logger.info("register03");
        logger.info("uid = " + uid);
        logger.info("member.getUserId() = " + member.getUserName());
        logger.info("member.getPassword() = " + member.getPassword());
        logger.info("member.getCoin() = " + member.getCoin());
        return "success";
    }

    @RequestMapping(value = "/register0301", method = RequestMethod.POST)
    public String register0301(String memberId) {
        logger.info("register0301");
        logger.info("userId = " + memberId);
        return "success";
    }

    @RequestMapping(value = "/register0302", method = RequestMethod.POST)
    public String register0302(@RequestParam("userId") String memberId) {
        logger.info("register0302");
        logger.info("userId = " + memberId);
        return "success";
    }

    @RequestMapping(value = "/register04", method = RequestMethod.POST)
    public String register04(String userId, String password, String coin) {
        logger.info("register04");
        logger.info("userId = " + userId);
        logger.info("password = " + password);
        logger.info("coin = " + coin);
        return "success";
    }

    @RequestMapping(value = "/register05", method = RequestMethod.POST)
    public String register05(String userId, String password, int coin) {
        logger.info("register05");
        logger.info("userId = " + userId);
        logger.info("password = " + password);
        logger.info("coin = " + coin);
        return "success";
    }

}
