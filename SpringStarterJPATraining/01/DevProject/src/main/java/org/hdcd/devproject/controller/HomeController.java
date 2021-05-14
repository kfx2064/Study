package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.Address;
import org.hdcd.devproject.domain.Member;
import org.springframework.boot.Banner;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/home0101")
    public String home0101() {
        return "home0101";
    }

    @GetMapping("/home0201")
    public String home0201(Model model) {
        model.addAttribute("msg", "Hello world!");

        return "home0201";
    }

    @GetMapping("/home0202")
    public String home0202(Model model) {
        Member member = new Member();

        member.setUserId("hongkd");
        member.setPassword("1234");
        member.setEmail("aaa@ccc.com");
        member.setUserName("홍길동");

        LocalDate dateOfBirth = LocalDate.of(1988, 10, 7);
        member.setDateOfBirth(dateOfBirth);

        model.addAttribute(member);

        return "home0202";
    }

    @GetMapping("/home0203")
    public String home0203(Model model) {
        Member member = new Member();

        Address address = new Address();
        address.setPostCode("080908");
        address.setLocation("seoul");

        member.setAddress(address);

        model.addAttribute(member);

        return "home0203";
    }

    @GetMapping("/home0301")
    public String home0301(Model model) {
        Member member = new Member();

        member.setUserId("hongkd");
        member.setPassword("1234");
        member.setEmail("aaa@ccc.com");
        member.setUserName("홍길동");

        LocalDate dateOfBirth = LocalDate.of(1988, 10, 7);
        member.setDateOfBirth(dateOfBirth);

        model.addAttribute(member);

        return "home0301";
    }

    @GetMapping("/home0302")
    public String home0302(Model model) {
        Member member = new Member();

        member.setUserId("hongkd");
        member.setPassword("1234");
        member.setEmail("aaa@ccc.com");
        member.setUserName("홍길동");

        LocalDate dateOfBirth = LocalDate.of(1988, 10, 7);
        member.setDateOfBirth(dateOfBirth);

        model.addAttribute(member);

        return "home0302";
    }

    @GetMapping("/home0401")
    public String home0401() {
        return "home0401";
    }

    @GetMapping("/sub/home0402")
    public String home0402() {
        return "sub/home0402";
    }

    @GetMapping("/home0403")
    public String home0403() {
        return "home0403";
    }

    @GetMapping("/home0501")
    public String home0501() {
        return "home0501";
    }

    @GetMapping("/home0601")
    public String home0601(Locale locale, Model model) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 (E) a h시 m분 s초");
        String formattedNow = now.format(formatter);

        model.addAttribute("serverTime", formattedNow);

        return "home0601";
    }

    @GetMapping("/home0701")
    public String home0701(Locale locale, Model model) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 (E) a h시 m분 s초");
        String formattedNow = now.format(formatter);

        model.addAttribute("serverTime", formattedNow);

        return "home0701";
    }

}