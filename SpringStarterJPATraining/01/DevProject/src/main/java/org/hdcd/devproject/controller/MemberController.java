package org.hdcd.devproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class MemberController {

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
        member.setDeveloper("Y");
        member.setForeigner(true);

        member.setHobby("Movie");

        String[] hobbyArray = {"Music", "Movie"};

        member.setHobbyArray(hobbyArray);

        List<String> hobbyList = new ArrayList<String>();
        hobbyList.add("Music");
        hobbyList.add("Movie");

        member.setHobbyList(hobbyList);

        model.addAttribute("member", member);

        return "registerForm";
    }

    @PostMapping("/register")
    public String register(Member member, Model model) {
        log.info("register");
        log.info("member.isForeigner() = " + member.isForeigner());
        log.info("member.getDeveloper() = " + member.getDeveloper());
        log.info("member.getHobby() = " + member.getHobby());

        String[] hobbyArray = member.getHobbyArray();

        if (hobbyArray != null) {
            log.info("hobbyArray != null = " + hobbyArray.length);

            for (int i = 0; i < hobbyArray.length; i++) {
                log.info("hobbyArray[" + i + "] = " + hobbyArray);
            }
        } else {
            log.info("hobbyArray == null");
        }

        List<String> hobbyList = member.getHobbyList();

        if (hobbyList != null) {
            log.info("hobbyList != null = " + hobbyList.size());

            for (int i = 0; i < hobbyList.size(); i++) {
                log.info("hobbyList(" + i + ") = " + hobbyList.get(i));
            }
        } else {
            log.info("hobbyList == null");
        }

        model.addAttribute("member", member);

        return "result";
    }

}
