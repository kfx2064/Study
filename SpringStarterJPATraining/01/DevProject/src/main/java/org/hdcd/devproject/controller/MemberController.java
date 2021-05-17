package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.CodeLabelValue;
import org.hdcd.devproject.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
public class MemberController {

    @GetMapping("/registerForm01")
    public String registerForm01(Model model) {
        log.info("registerForm01");

        Map<String, String> genderCodeMap = new HashMap<String, String>();
        genderCodeMap.put("01", "Male");
        genderCodeMap.put("02", "Female");
        genderCodeMap.put("03", "Other");

        model.addAttribute("genderCodeMap", genderCodeMap);

        model.addAttribute("member", new Member());

        return "registerForm01";
    }

    @GetMapping("/registerForm02")
    public String registerForm02(Model model) {
        log.info("registerForm02");

        List<CodeLabelValue> genderCodeList = new ArrayList<CodeLabelValue>();

        genderCodeList.add(new CodeLabelValue("01", "Male"));
        genderCodeList.add(new CodeLabelValue("02", "Female"));
        genderCodeList.add(new CodeLabelValue("03", "Other"));

        model.addAttribute("genderCodeList", genderCodeList);

        model.addAttribute("member", new Member());

        return "registerForm02";
    }

    @PostMapping("/register")
    public String register(Member member, Model model) {
        log.info("register");

        log.info("member.getGender() = " + member.getGender());

        model.addAttribute("gender", member.getGender());

        return "result";
    }

}
