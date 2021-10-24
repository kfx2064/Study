package org.hdcd.devproject.controller;

import org.hdcd.devproject.domain.Address;
import org.hdcd.devproject.domain.Card;
import org.hdcd.devproject.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Controller
public class MemberController {

    private final static Logger logger = LoggerFactory.getLogger(MemberController.class);

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Validated Member member, BindingResult result) {
        logger.info("register");

        if (result.hasErrors()) {
            return "registerForm";
        }

        logger.info("member.getUserId() = " + member.getUserId());
        logger.info("member.getBirthDate() = " + member.getDateOfBirth());

        Address address = member.getAddress();

        if (address != null) {
            logger.info("address != null address.getPostCode() = " + address.getPostCode());
            logger.info("address != null address.getLocation() = " + address.getLocation());
        } else {
            logger.info("address == null");
        }

        List<Card> cardList = member.getCardList();

        if (cardList != null) {
            logger.info("cardList != null = " + cardList.size());

            for (int i = 0; i < cardList.size(); i++) {
                Card card = cardList.get(i);
                logger.info("card.getNo() = " + card.getNo());
                logger.info("card.getValidMonth() = " + card.getValidMonth());
            }
        } else {
            logger.info("cardList == null");
        }

        return "success";
    }

    @RequestMapping(value = "/registerForm01", method = RequestMethod.GET)
    public String registerForm01(Model model) {
        logger.info("registerForm01");

        model.addAttribute("member", new Member());

        return "registerForm";
    }

    @RequestMapping(value = "/registerForm02", method = RequestMethod.GET)
    public String registerForm02(Model model) {
        logger.info("registerForm02");

        Member member = new Member();

        member.setPassword("1234");
        member.setEmail("aaa@ccc.com");
        member.setUserName("홍길동");

        Address address = new Address();
        address.setPostCode("080908");
        address.setLocation("seoul");

        member.setAddress(address);

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

        cal.set(Calendar.YEAR, 1988);
        cal.set(Calendar.MONTH, 10);
        cal.set(Calendar.DAY_OF_MONTH, 7);

        member.setDateOfBirth(cal.getTime());

        model.addAttribute("member", member);

        return "registerForm";
    }
}
