package org.hdcd.devproject.controller;

import org.hdcd.devproject.domain.CodeLabelValue;
import org.hdcd.devproject.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.*;

@Controller
public class MemberController {

    private final static Logger logger = LoggerFactory.getLogger(MemberController.class);

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Validated Member member, BindingResult result) {
        logger.info("register");

        logger.info("result.hasErrors() = " + result.hasErrors());

        if (result.hasErrors()) {
            List<ObjectError> allErrors = result.getAllErrors();
            List<ObjectError> globalErrors = result.getGlobalErrors();
            List<FieldError> fieldErrors = result.getFieldErrors();

            logger.info("allErrors.size() = " + allErrors.size());
            logger.info("globalErrors.size() = " + globalErrors.size());
            logger.info("fieldErrors.size() = " + fieldErrors.size());

            for (int i = 0; i < allErrors.size(); i++) {
                ObjectError objectError = allErrors.get(i);
                logger.info("objectError = " + objectError);
            }

            for (int i = 0; i < globalErrors.size(); i++) {
                ObjectError objectError = globalErrors.get(i);
                logger.info("objectError = " + objectError);
            }

            for (int i = 0; i < fieldErrors.size(); i++) {
                FieldError fieldError = fieldErrors.get(i);

                logger.info("fieldError = " + fieldError);
                logger.info("fieldError.getDefaultMessage() = " + fieldError.getDefaultMessage());
            }

            return "registerForm";
        }

        logger.info("member.getUserId() = " + member.getUserId());
        logger.info("member.getGender() = #" + member.getGender() + "#");

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

        member.setGender("female");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1988);
        cal.set(Calendar.MONTH, 10);
        cal.set(Calendar.DAY_OF_MONTH, 7);

        member.setDateOfBirth(cal.getTime());

        model.addAttribute("member", member);

        return "registerForm";
    }
}
