package org.hdcd.devproject.controller;

import org.hdcd.devproject.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.util.*;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        return "home";
    }

    @RequestMapping(value = "/formHome", method = RequestMethod.GET)
    public String formHome() {
        return "formHome";
    }

    @RequestMapping(value = "/ajaxHome", method = RequestMethod.GET)
    public String ajaxHome() {
        return "ajaxHome";
    }

    @RequestMapping(value = "/goHome0101", method = RequestMethod.GET)
    public void home0101() {
        logger.info("home0101");
    }

    @RequestMapping(value = "/sub/goHome0102", method = RequestMethod.GET)
    public void home0102() {
        logger.info("home0102");
    }

    @RequestMapping(value = "/goHome0201", method = RequestMethod.GET)
    public String home0201() {
        logger.info("home0201");
        return "home0201";
    }

    @RequestMapping(value = "/sub/goHome0202", method = RequestMethod.GET)
    public String home0202() {
        logger.info("home0202");
        return "home0202";
    }

    @RequestMapping(value = "/sub/goHome0203", method = RequestMethod.GET)
    public String home0203() {
        logger.info("home0203");
        return "sub/home0203";
    }

    @RequestMapping(value = "/goHome0204", method = RequestMethod.GET)
    public String home0204() {
        logger.info("home0204");
        return "redirect:/sub/goHome0205";
    }

    @RequestMapping(value = "/sub/goHome0205", method = RequestMethod.GET)
    public String home0205() {
        logger.info("home0205");
        return "/sub/home0205";
    }

    @ResponseBody
    @RequestMapping(value = "/goHome0301", method = RequestMethod.GET)
    public Member home0301() {
        logger.info("home0301");

        Member member = new Member();

        return member;
    }

    @ResponseBody
    @RequestMapping(value = "/goHome04", method = RequestMethod.GET)
    public List<Member> home04() {
        logger.info("home04");

        List<Member> list = new ArrayList<>();

        Member member = new Member();
        list.add(member);

        Member member2 = new Member();
        list.add(member2);

        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/goHome05", method = RequestMethod.GET)
    public Map<String, Member> home05() {
        logger.info("home05");

        Map<String, Member> map = new HashMap<>();

        Member member = new Member();
        map.put("key1", member);

        Member member2 = new Member();
        map.put("key2", member2);

        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/goHome06", method = RequestMethod.GET)
    public ResponseEntity<Void> home06() {
        logger.info("home06");

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
