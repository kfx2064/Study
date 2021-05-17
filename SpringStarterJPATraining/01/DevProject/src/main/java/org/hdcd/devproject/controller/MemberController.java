package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
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
import java.util.List;

@Slf4j
@Controller
public class MemberController {

    @PostMapping("/register")
    public String register(@Validated Member member, BindingResult result) {
        log.info("register");

        log.info("result.hasErrors() = " + result.hasErrors());

        if (result.hasErrors()) {
            List<ObjectError> allErrors = result.getAllErrors();
            List<ObjectError> globalErrors = result.getGlobalErrors();
            List<FieldError> fieldErrors = result.getFieldErrors();

            log.info("allErrors.size() = " + allErrors.size());
            log.info("globalErrors.size() = " + globalErrors.size());
            log.info("fieldErrors.size() = " + fieldErrors.size());

            for (int i = 0; i < allErrors.size(); i++) {
                ObjectError objectError = allErrors.get(i);
                log.info("allError = " + objectError);
            }

            for (int i = 0; i < globalErrors.size(); i++) {
                ObjectError objectError = globalErrors.get(i);
                log.info("globalError = " + objectError);
            }

            for (int i = 0; i < fieldErrors.size(); i++) {
                FieldError fieldError = fieldErrors.get(i);

                log.info("fieldError = " + fieldError);
                log.info("fieldError.getDefaultMessage() = " + fieldError.getDefaultMessage());
            }

            return "registerForm";
        }

        log.info("member.getUserId() = " + member.getUserId());
        log.info("member.getGender() = " + member.getGender());

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

        member.setGender("female");

        LocalDate dateOfBirth = LocalDate.of(1988, 10, 7);
        member.setDateOfBirth(dateOfBirth);

        model.addAttribute("member", member);

        return "registerForm";
    }

}
