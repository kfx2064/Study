package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.Address;
import org.hdcd.devproject.domain.Card;
import org.hdcd.devproject.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class MemberController {

    @GetMapping("/read01")
    public String read01(Model model) {
        log.info("read01");

        model.addAttribute("userId", "hongkd");
        model.addAttribute("password", "1234");
        model.addAttribute("email", "aaa@ccc.com");
        model.addAttribute("userName", "홍길동");
        model.addAttribute("birthDay", "1989-09-07");

        return "read01";
    }

    @GetMapping("/read02")
    public String read02(Model model) {
        log.info("read02");

        Member member = new Member();

        member.setUserId("hongkd");
        member.setPassword("1234");
        member.setEmail("aaa@ccc.com");
        member.setUserName("홍길동");

        LocalDate dateOfBirth = LocalDate.of(1988, 10, 7);
        member.setDateOfBirth(dateOfBirth);

        model.addAttribute(member);

        return "read02";
    }

    @GetMapping("/read03")
    public String read03(Model model) {
        log.info("read03");

        Member member = new Member();

        member.setUserId("hongkd");
        member.setPassword("1234");
        member.setEmail("aaa@ccc.com");
        member.setUserName("홍길동");

        LocalDate dateOfBirth = LocalDate.of(1988, 10, 7);
        member.setDateOfBirth(dateOfBirth);

        model.addAttribute("user", member);

        return "read03";
    }

    @GetMapping("/read04")
    public String read04(Model model) {
        log.info("read04");

        String[] carArray = {"saab", "audi"};

        List<String> carList = new ArrayList<String>();
        carList.add("saab");
        carList.add("audi");

        String[] hobbyArray = {"Music", "Movie"};
        List<String> hobbyList = new ArrayList<String>();
        hobbyList.add("Music");
        hobbyList.add("Movie");

        model.addAttribute("carArray", carArray);
        model.addAttribute("carList", carList);

        model.addAttribute("hobbyArray", hobbyArray);
        model.addAttribute("hobbyList", hobbyList);

        return "read04";
    }

    @GetMapping("/read05")
    public String read05(Model model) {
        log.info("read05");

        Member member = new Member();

        Address address = new Address();
        address.setPostCode("080908");
        address.setLocation("seoul");
        member.setAddress(address);

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

        model.addAttribute("user", member);

        return "read05";
    }

    @GetMapping("/read06")
    public String read06(Model model) {
        log.info("read06");
        
        Member member = new Member();
        
        member.setUserId("hongkd");
        member.setPassword("1234");
        member.setEmail("aaa@ccc.com");
        member.setUserName("홍길동");

        member.setGender("female");

        member.setDeveloper("Y");
        member.setForeigner(true);

        member.setNationality("Australia");

        member.setCars("saab");

        String[] carArray = {"saab", "audi"};

        member.setCarArray(carArray);

        List<String> carList = new ArrayList<String>();
        carList.add("saab");
        carList.add("audi");

        member.setCarList(carList);

        member.setHobby("Movie");

        String[] hobbyArray = {"Music", "Movie"};

        member.setHobbyArray(hobbyArray);

        List<String> hobbyList = new ArrayList<String>();
        hobbyList.add("Music");
        hobbyList.add("Movie");

        member.setHobbyList(hobbyList);

        Address address = new Address();
        address.setPostCode("080908");
        address.setLocation("seoul");
        member.setAddress(address);

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

        LocalDate dateOfBirth = LocalDate.of(1988, 10, 7);
        member.setDateOfBirth(dateOfBirth);

        String introduction = "안녕하세요.\n반갑습니다.";

        member.setIntroduction(introduction);

        model.addAttribute("user", member);

        return "read06";
    }

}
