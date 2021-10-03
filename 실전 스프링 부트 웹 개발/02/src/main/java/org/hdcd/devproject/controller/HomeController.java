package org.hdcd.devproject.controller;

import org.apache.tomcat.jni.Local;
import org.hdcd.devproject.domain.Address;
import org.hdcd.devproject.domain.Member;
import org.hibernate.validator.internal.util.privilegedactions.LoadClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/home0101", method = RequestMethod.GET)
    public String home0101() {
        return "home0101";
    }

    @RequestMapping(value = "/home0201", method = RequestMethod.GET)
    public String home0201(Model model) {
        model.addAttribute("msg", "Hello world!");
        return "home0201";
    }

    @RequestMapping(value = "/home020", method = RequestMethod.GET)
    public String home0202(Model model) {
        Member member = new Member();

        member.setUserId("hongkd");
        member.setPassword("1234");
        member.setEmail("aaa@ccc.com");
        member.setUserName("홍길동");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1988);
        cal.set(Calendar.MONTH, 10);
        cal.set(Calendar.DAY_OF_MONTH, 7);

        member.setDateOfBirth(cal.getTime());

        model.addAttribute(member);

        return "home0202";
    }

    @RequestMapping(value = "/home0203", method = RequestMethod.GET)
    public String home0203(Model model) {
        Member member = new Member();

        Address address = new Address();
        address.setPostCode("080908");
        address.setLocation("seoul");

        member.setAddress(address);

        model.addAttribute(member);

        return "home0203";
    }

    @RequestMapping(value = "/home0301", method = RequestMethod.GET)
    public String home0301(Model model) {
        Member member = new Member();

        member.setUserId("hongkd");
        member.setPassword("1234");
        member.setEmail("aaa@ccc.com");
        member.setUserName("홍길동");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1988);
        cal.set(Calendar.MONTH, 10);
        cal.set(Calendar.DAY_OF_MONTH, 7);

        member.setDateOfBirth(cal.getTime());

        model.addAttribute(member);

        return "home0301";
    }

    @RequestMapping(value = "/home0302", method = RequestMethod.GET)
    public String home0302(Model model) {
        Member member = new Member();

        member.setUserId("hongkd");
        member.setPassword("1234");
        member.setEmail("aaa@ccc.com");
        member.setUserName("홍길동");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1988);
        cal.set(Calendar.MONTH, 10);
        cal.set(Calendar.DAY_OF_MONTH, 7);

        member.setDateOfBirth(cal.getTime());

        model.addAttribute(member);

        return "home0302";
    }

    @RequestMapping(value = "/home0401", method = RequestMethod.GET)
    public String home0401() {
        return "home0401";
    }

    @RequestMapping(value = "/sub/home0402", method = RequestMethod.GET)
    public String home0402() {
        return "sub/home0402";
    }

    @RequestMapping(value = "/home0403", method = RequestMethod.GET)
    public String home0403() {
        return "home0403";
    }

    @RequestMapping(value = "/home0501", method = RequestMethod.GET)
    public String home0501() {
        return "home0501";
    }

    @RequestMapping(value = "/home0601", method = RequestMethod.GET)
    public String home0601(Locale locale, Model model) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        return "home0601";
    }

    @RequestMapping(value = "/home0701", method = RequestMethod.GET)
    public String home0701(Locale locale, Model model) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        return "home0701";
    }

}
