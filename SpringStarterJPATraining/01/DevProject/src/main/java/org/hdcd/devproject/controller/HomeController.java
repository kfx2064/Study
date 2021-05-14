package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.Address;
import org.hdcd.devproject.domain.Card;
import org.hdcd.devproject.domain.Member;
import org.slf4j.Logger;
import org.springframework.boot.Banner;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/home0101")
    public String home0101(Model model) {
        Member member = new Member();

        model.addAttribute(member);

        return "home0101";
    }

    @GetMapping("/home0102")
    public String home0102(Model model) {
        Member member = new Member();
        member.setForeigner(true);

        model.addAttribute(member);

        return "home0102";
    }

    @GetMapping("/home0103")
    public String home0103(Model model) {
        Member member = new Member();
        member.setForeigner(false);

        model.addAttribute(member);

        return "home0103";
    }

    @GetMapping("/home0201")
    public String home0201(Model model) {
        Member member = new Member();

        model.addAttribute(member);

        return "home0201";
    }

    @GetMapping("/home0202")
    public String home0202(Model model) {
        Member member = new Member();
        member.setGender("F");

        model.addAttribute(member);

        return "home0201";
    }

    @GetMapping("/home0203")
    public String home0203(Model model) {
        Member member = new Member();
        member.setGender("M");

        model.addAttribute(member);

        return "home0201";
    }

    @GetMapping("/home0301")
    public String home0301(Model model) {
        Member member = new Member();

        String[] hobbyArray = {"Music", "Movie"};

        member.setHobbyArray(hobbyArray);

        model.addAttribute(member);

        return "home0301";
    }

    @GetMapping("/home0302")
    public String home0302(Model model) {
        Member member = new Member();

        List<String> hobbyList = new ArrayList<String>();
        hobbyList.add("Music");
        hobbyList.add("Movie");

        member.setHobbyList(hobbyList);

        model.addAttribute(member);

        return "home0302";
    }

    @GetMapping("/home0303")
    public String home0303(Model model) {
        Member member = new Member();

        List<Card> cardList = new ArrayList<Card>();

        Card card1 = new Card();
        card1.setNo("123456");

        YearMonth validMonth = YearMonth.of(2020, 9);
        card1.setValidMonth(validMonth);
        cardList.add(card1);

        Card card2 = new Card();
        card2.setNo("456786");

        YearMonth validMonth2 = YearMonth.of(2022, 11);
        card2.setValidMonth(validMonth2);

        cardList.add(card2);

        member.setCardList(cardList);

        model.addAttribute(member);

        return "home0303";
    }

    @GetMapping("/home0401")
    public String home0401(Model model) {
        Member member = new Member();

        member.setUserId("hongkd");

        model.addAttribute(member);

        return "home0401";
    }

    @GetMapping("/home0402")
    public String home0402(Model model) {
        Member member = new Member();

        member.setUserId("hongkd");

        model.addAttribute(member);

        return "home0402";
    }
}