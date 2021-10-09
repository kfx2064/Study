package org.hdcd.devproject.controller;

import org.hdcd.devproject.domain.Card;
import org.hdcd.devproject.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/home0101", method = RequestMethod.GET)
    public String home0101(Model model) {
        int coin = 1000;

        model.addAttribute("coin", coin);

        return "home0101";
    }

    @RequestMapping(value = "/home0201", method = RequestMethod.GET)
    public String home0201(Model model) {
        Date date = new Date();

        model.addAttribute("now", date);

        return "home0201";
    }

    @RequestMapping(value = "/home0301", method = RequestMethod.GET)
    public String home0301(Model model) {
        String str = "Hello, World!";

        model.addAttribute("str", str);

        return "home0301";
    }

    @RequestMapping(value = "/home0302", method = RequestMethod.GET)
    public String home0302(Model model) {
        Member member = new Member();

        List<String> hobbyList = new ArrayList<>();
        hobbyList.add("Music");
        hobbyList.add("Movie");

        member.setHobbyList(hobbyList);

        model.addAttribute(member);

        return "home0302";
    }

    @RequestMapping(value = "/home0303", method = RequestMethod.GET)
    public String home0303(Model model) {
        Member member = new Member();

        List<Card> cardList = new ArrayList<>();

        Card card1 = new Card();
        card1.setNo("123456");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 9);
        cal.set(Calendar.DAY_OF_MONTH, 8);

        card1.setValidMonth(cal.getTime());

        cardList.add(card1);

        Card card2 = new Card();
        card2.setNo("456786");

        cal.set(Calendar.YEAR, 2022);
        cal.set(Calendar.MONTH, 11);
        cal.set(Calendar.DAY_OF_MONTH, 7);

        card2.setValidMonth(cal.getTime());

        cardList.add(card2);

        member.setCardList(cardList);

        model.addAttribute(member);

        return "home0303";
    }

    @RequestMapping(value = "/home0401", method = RequestMethod.GET)
    public String home0401(Model model) {
        Member member = new Member();

        member.setUserId("hongkd");

        model.addAttribute(member);

        return "home0401";
    }

    @RequestMapping(value = "/home0402", method = RequestMethod.GET)
    public String home0402(Model model) {
        Member member = new Member();

        member.setUserId("hongkd");

        model.addAttribute(member);

        return "home0402";
    }

}