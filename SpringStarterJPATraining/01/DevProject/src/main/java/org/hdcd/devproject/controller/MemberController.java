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

        Map<String, String> nationalityCodeMap = new HashMap<String, String>();
        nationalityCodeMap.put("01", "Korea");
        nationalityCodeMap.put("02", "Germany");
        nationalityCodeMap.put("03", "Australia");

        model.addAttribute("nationalityCodeMap", nationalityCodeMap);

        model.addAttribute("member", new Member());

        return "registerForm01";
    }

    @GetMapping("/registerForm02")
    public String registerForm02(Model model) {
        log.info("registerForm02");

        List<CodeLabelValue> nationalityCodeList = new ArrayList<CodeLabelValue>();
        nationalityCodeList.add(new CodeLabelValue("01", "Korea"));
        nationalityCodeList.add(new CodeLabelValue("02", "Germany"));
        nationalityCodeList.add(new CodeLabelValue("03", "Australia"));

        model.addAttribute("nationalityCodeList", nationalityCodeList);

        model.addAttribute("member", new Member());

        return "registerForm02";
    }

    @PostMapping("/register")
    public String register(Member member, Model model) {
        log.info("register");

        log.info("member.getNationality() = " + member.getNationality());

        model.addAttribute("nationality", member.getNationality());

        return "result";
    }

    @GetMapping("/registerForm03")
    public String registerForm03(Model model) {
        log.info("registerForm03");

        Map<String, String> carCodeMap = new HashMap<String, String>();
        carCodeMap.put("01", "Volvo");
        carCodeMap.put("02", "Saab");
        carCodeMap.put("03", "Opel");

        model.addAttribute("carCodeMap", carCodeMap);

        model.addAttribute("member", new Member());

        return "registerForm03";
    }

    @GetMapping("/registerForm04")
    public String regsiterForm04(Model model) {
        log.info("registerForm04");

        List<CodeLabelValue> carCodeList = new ArrayList<CodeLabelValue>();
        carCodeList.add(new CodeLabelValue("01", "Volvo"));
        carCodeList.add(new CodeLabelValue("02", "Saab"));
        carCodeList.add(new CodeLabelValue("03", "Opel"));

        model.addAttribute("carCodeList", carCodeList);

        model.addAttribute("member", new Member());

        return "registerForm04";
    }

    @PostMapping("/register2")
    public String register2(Member member, Model model) {
        log.info("register2");

        List<String> carList = member.getCarList();

        if (carList != null) {
            log.info("carList != null = " + carList.size());

            for (int i = 0; i < carList.size(); i++) {
                log.info("carList(" + i + ") = " + carList.get(i));
            }
        } else {
            log.info("carList == null");
        }

        model.addAttribute("carList", member.getCarList());

        return "result2";
    }

    @GetMapping("/registerForm05")
    public String registerForm05(Model model) {
        log.info("registerForm05");

        List<CodeLabelValue> carCodeList = new ArrayList<CodeLabelValue>();
        carCodeList.add(new CodeLabelValue("01", "Volvo"));
        carCodeList.add(new CodeLabelValue("02", "Saab"));
        carCodeList.add(new CodeLabelValue("03", "Opel"));

        model.addAttribute("carCodeList", carCodeList);

        model.addAttribute("member", new Member());

        return "registerForm05";
    }

}
