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

        Map<String, String> hobbyMap = new HashMap<String, String>();
        hobbyMap.put("01", "Sports");
        hobbyMap.put("02", "Music");
        hobbyMap.put("03", "Movie");

        model.addAttribute("hobbyMap", hobbyMap);

        model.addAttribute("member", new Member());

        return "registerForm01";
    }

    @GetMapping("/registerForm02")
    public String registerForm02(Model model) {
        log.info("registerForm02");

        List<CodeLabelValue> hobbyCodeList = new ArrayList<CodeLabelValue>();
        hobbyCodeList.add(new CodeLabelValue("01", "Sports"));
        hobbyCodeList.add(new CodeLabelValue("02", "Music"));
        hobbyCodeList.add(new CodeLabelValue("03", "Movie"));

        model.addAttribute("hobbyCodeList", hobbyCodeList);

        model.addAttribute("member", new Member());

        return "registerForm02";
    }

    @PostMapping("/register")
    public String register(Member member, Model model) {
        log.info("register");

        List<String> hobbyList = member.getHobbyList();

        if (hobbyList != null) {
            log.info("hobbyList != null = " + hobbyList.size());

            for (int i = 0; i < hobbyList.size(); i++) {
                log.info("hobbyList(" + i + ") = " + hobbyList.get(i));
            }
        } else {
            log.info("hobbyList == null");
        }

        model.addAttribute("hobbyList", hobbyList);

        return "result";
    }

}
