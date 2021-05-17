package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.Address;
import org.hdcd.devproject.domain.Card;
import org.hdcd.devproject.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class MemberController {

    @PostMapping("/register")
    public String register(@Validated Member member, BindingResult result) {
        log.info("register");

        if (result.hasErrors()) {
            return "registerForm";
        }

        log.info("member.getUserId() = " + member.getUserId());
        log.info("member.getBirthDate() = " + member.getDateOfBirth());

        Address address = member.getAddress();

        if (address != null) {
            log.info("address != null address.getPostCode() = " + address.getPostCode());
            log.info("address != null address.getLocation() = " + address.getLocation());
        } else {
            log.info("address == null");
        }

        List<Card> cardList = member.getCardList();

        if (cardList != null) {
            log.info("cardList != null = " + cardList.size());

            for (int i = 0; i < cardList.size(); i++) {
                Card card = cardList.get(i);
                log.info("card.getNo() = " + card.getNo());
                log.info("card.getValidMonth() = " + card.getValidMonth());
            }
        } else {
            log.info("cardList == null");
        }

        return "success";
    }

    @GetMapping("/registerForm01")
    public String registerForm01(Model model) {
        log.info("registerForm01");

        model.addAttribute("member", new Member());

        return "registerForm";
    }

    @GetMapping("/registerForm02")
    public String registerForm02(Model model) {
        log.info("registerForm02");

        Member member = new Member();

        member.setPassword("1234");
        member.setEmail("aaa@ccc.com");
        member.setUserName("홍길동");

        Address address = new Address();
        address.setPostCode("080908");
        address.setLocation("seoul");

        member.setAddress(address);

        List<Card> cardList = new ArrayList<Card>();

        Card card1 = new Card();
        card1.setNo("123456");

        YearMonth validMonth = YearMonth.of(2023, 9);
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

        model.addAttribute("member", member);

        return "registerForm";
    }

}
