package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.hdcd.devproject.domain.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class MemberController {

    @GetMapping("/register/{userId}")
    public ResponseEntity<String> register01(@PathVariable("userId") String userId) {
        log.info("register01");

        log.info("userId = " + userId);

        ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @PostMapping("/register/{userId}/{password}")
    public ResponseEntity<String> register02(@PathVariable("userId") String userId
            , @PathVariable("password") String password) {
        log.info("register02");

        log.info("userId = " + userId);
        log.info("password = " + password);

        ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @PostMapping("/register03")
    public ResponseEntity<String> register03(@RequestBody Member member) {
        log.info("register03");

        log.info("userId = " + member.getUserId());
        log.info("password = " + member.getPassword());

        ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @PostMapping("/register04")
    public ResponseEntity<String> register04(String userId) {
        log.info("register04");

        log.info("userId = " + userId);

        ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @PostMapping("/register05")
    public ResponseEntity<String> register05(String userId, String password) {
        log.info("register05");

        log.info("userId = " + userId);
        log.info("password = " + password);

        ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @PostMapping("/register/{userId}")
    public ResponseEntity<String> register06(@PathVariable("userId") String userId, @RequestBody Member member) {
        log.info("register06");

        log.info("userId = " + userId);

        log.info("member.getUserId() = " + member.getUserId());
        log.info("member.getPassword() = " + member.getPassword());

        ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @PostMapping("/register07")
    public ResponseEntity<String> register07(@RequestBody List<Member> memberList) {
        log.info("register07");

        for (Member member : memberList) {
            log.info("userId = " + member.getUserId());
            log.info("password = " + member.getPassword());
        }

        ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @PostMapping("/register08")
    public ResponseEntity<String> register08(@RequestBody Member member) {
        log.info("register08");

        log.info("userId = " + member.getUserId());
        log.info("password = " + member.getPassword());

        Address address = member.getAddress();

        if (address != null) {
            log.info("address.getPostCode() = " + address.getPostCode());
            log.info("address.getLocation() = " + address.getLocation());
        } else {
            log.info("address == null");
        }

        ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @PostMapping("/register09")
    public ResponseEntity<String> register09(@RequestBody Member member) {
        log.info("register09");

        log.info("userId = " + member.getUserId());
        log.info("password = " + member.getPassword());

        List<Card> cardList = member.getCardList();

        if (cardList != null) {
            log.info("cardList.size() = " + cardList.size());

            for (int i = 0; i < cardList.size(); i++) {
                Card card = cardList.get(i);
                log.info("card.getNo() = " + card.getNo());
                log.info("card.getValidMonth() = " + card.getValidMonth());
                card.getValidMonth();
            }
        } else {
            log.info("cardList == null");
        }

        ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

        return entity;
    }

}
