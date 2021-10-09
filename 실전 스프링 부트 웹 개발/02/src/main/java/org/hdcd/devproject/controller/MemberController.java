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

        Map<String, String> hobbyMap = new HashMap<>();
        hobbyMap.put("01", "Sports");
        hobbyMap.put("02", "Music");
        hobbyMap.put("03", "Movie");

        model.addAttribute("hobbyMap", hobbyMap);

        model.addAttribute("member", new Member());

        return "registerForm01";
    }

    @RequestMapping(value = "/registerForm02", method = RequestMethod.GET)
    public String registerForm02(Model model) {
        logger.info("registerForm02");

        List<CodeLabelValue> hobbyCodeList = new ArrayList<>();
        hobbyCodeList.add(new CodeLabelValue("01", "Sports"));
        hobbyCodeList.add(new CodeLabelValue("02", "Music"));
        hobbyCodeList.add(new CodeLabelValue("03", "Movie"));

        model.addAttribute("hobbyCodeList", hobbyCodeList);

        model.addAttribute("member", new Member());

        return "registerForm02";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Member member, Model model) {
        logger.info("register");

        List<String> hobbyList = member.getHobbyList();

        if (hobbyList != null) {
            logger.info("hobbyList != null = " + hobbyList.size());

            for (int i = 0; i < hobbyList.size(); i++) {
                logger.info("hobbyList(" + i + ") = " + hobbyList.get(i));
            }
        } else {
            logger.info("hobbyList == null");
        }

        model.addAttribute("hobbyList", hobbyList);

        return "result";
    }

}
