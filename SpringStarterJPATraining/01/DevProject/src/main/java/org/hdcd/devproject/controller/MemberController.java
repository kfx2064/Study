package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class MemberController {

    @GetMapping("/registerForm")
    public String registerForm() {
        log.info("registerForm");

        return "registerForm";
    }

    @GetMapping("/register")
    public String registerByParameter(String userId, String password) {
        log.info("registerByParameter");

        log.info("userId = " + userId);

        log.info("password = " + password);

        return "success";
    }

    @GetMapping("/register/{userId}")
    public String registerByPath(String userId) {
        log.info("registerByPath");

        log.info("userId = " + userId);

        return "success";
    }

    @PostMapping("/register01")
    public String register01(String userId) {
        log.info("register01");

        log.info("userId = " + userId);

        return "success";
    }

    @PostMapping("/register02")
    public String register02(String userId, String password) {
        log.info("register02");

        log.info("userId = " + userId);

        log.info("password = " + password);

        return "success";
    }

    @PostMapping("/register03")
    public String register03(String password, String userId) {
        log.info("register03");

        log.info("userId = " + userId);

        log.info("password = " + password);

        return "success";
    }

    @PostMapping("/register04")
    public String register04(String userId, String password, String coin) {
        log.info("register04");

        log.info("userId = " + userId);

        log.info("password = " + password);

        log.info("coin = " + coin);

        return "success";
    }

    @PostMapping("/register05")
    public String register05(String userId, String password, int coin) {
        log.info("register05");

        log.info("userId = " + userId);

        log.info("password = " + password);

        log.info("coin = " + coin);

        return "success";
    }

}
