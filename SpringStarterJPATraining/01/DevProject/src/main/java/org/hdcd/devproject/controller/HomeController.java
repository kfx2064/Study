package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.Member;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Slf4j
@Controller
public class HomeController {

    @ResponseBody
    @GetMapping("/goHome05")
    public Map<String, Member> home05() {
        log.info("home05");

        Map<String, Member> map = new HashMap<String, Member>();

        Member member = new Member();
        map.put("key1", member);

        Member member2 = new Member();
        map.put("key2", member2);

        return map;
    }

    @ResponseBody
    @GetMapping("/goHome06")
    public ResponseEntity<Void> home06() {
        log.info("home06");

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping("/goHome07")
    public ResponseEntity<String> home07() {
        log.info("home07");

        return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
    }

}
