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

        model.addAttribute("member", new Member());

        return "registerForm";
    }

    @RequestMapping(value = "/registerForm02", method = RequestMethod.GET)
    public String registerForm02(Model model) {
        logger.info("registerForm02");

        Member member = new Member();

        member.setDeveloper("Y");
        member.setForeigner(true);

        member.setHobby("Movie");

        String[] hobbyArray = {"Music", "Movie"};

        member.setHobbyArray(hobbyArray);

        List<String> hobbyList = new ArrayList<>();
        hobbyList.add("Music");
        hobbyList.add("Movie");

        member.setHobbyList(hobbyList);

        model.addAttribute("member", member);

        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Member member, Model model) {
        logger.info("register");
        logger.info("member.isForeigner() = " + member.isForeigner());
        logger.info("member.getDeveloper() = " + member.getDeveloper());
        logger.info("member.getHobby() = " + member.getHobby());

        String[] hobbyArray = member.getHobbyArray();

        if (hobbyArray != null) {
            logger.info("hobbyArray != null = " + hobbyArray.length);

            for (int i = 0; i < hobbyArray.length; i++) {
                logger.info("hobbyArray[" + i + "] = " + hobbyArray[i]);
            }
        } else {
            logger.info("hobbyArray == null");
        }

        List<String> hobbyList = member.getHobbyList();

        if (hobbyList != null) {
            logger.info("hobbyList != null = " + hobbyList.size());

            for (int i = 0; i < hobbyList.size(); i++) {
                logger.info("hobbyList(" + i + ") = " + hobbyList.get(i));
            }
        } else {
            logger.info("hobbyList == null");
        }

        model.addAttribute("member", member);

        return "result";
    }
}
