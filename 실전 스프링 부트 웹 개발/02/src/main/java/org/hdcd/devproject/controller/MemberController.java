package org.hdcd.devproject.controller;

import org.hdcd.devproject.domain.CodeLabelValue;
import org.hdcd.devproject.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MemberController {

    private final static Logger logger = LoggerFactory.getLogger(MemberController.class);

    @RequestMapping(value = "/registerForm01", method = RequestMethod.GET)
    public String registerForm01(Model model) {
        logger.info("registerForm01");

        Map<String, String> genderCodeMap = new HashMap<>();
        genderCodeMap.put("01", "Male");
        genderCodeMap.put("02", "Female");
        genderCodeMap.put("03", "Other");

        model.addAttribute("genderCodeMap", genderCodeMap);

        model.addAttribute("member", new Member());

        return "registerForm01";
    }

    @RequestMapping(value = "/registerForm02", method = RequestMethod.GET)
    public String registerForm02(Model model) {
        logger.info("registerForm02");

        List<CodeLabelValue> genderCodeList = new ArrayList<>();
        genderCodeList.add(new CodeLabelValue("01", "Male"));
        genderCodeList.add(new CodeLabelValue("02", "Female"));
        genderCodeList.add(new CodeLabelValue("03", "Other"));

        model.addAttribute("genderCodeList", genderCodeList);

        model.addAttribute("member", new Member());

        return "registerForm02";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Member member, Model model) {
        logger.info("register");

        logger.info("member.getGender() = " + member.getGender());

        model.addAttribute("gender", member.getGender());

        return "result";
    }

}
