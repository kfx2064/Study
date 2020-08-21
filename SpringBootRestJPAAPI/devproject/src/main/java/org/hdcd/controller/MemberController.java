package org.hdcd.controller;

import lombok.extern.java.Log;
import org.hdcd.domain.Member;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Log
@RestController
public class MemberController {

    @RequestMapping(value = "/register01", method = RequestMethod.GET)
    public void register01() {
        log.info("register01");
    }

    @RequestMapping(value = "/register02", method = RequestMethod.GET)
    public String register02() {
        log.info("register02");

        return "HELLO";
    }

    @RequestMapping(value = "/register03", method = RequestMethod.GET, produces = "application/json")
    public String register03() {
        log.info("register03");

        Member member = new Member();

        log.info("member value object");

        return member.toString();
    }

    @RequestMapping(value = "/register04", method = RequestMethod.GET)
    public String register04() {
        log.info("register04");

        List<Member> list = new ArrayList<Member>();

        Member member = new Member();
        list.add(member);

        Member member2 = new Member();
        list.add(member2);

        return list.toString();
    }

}
