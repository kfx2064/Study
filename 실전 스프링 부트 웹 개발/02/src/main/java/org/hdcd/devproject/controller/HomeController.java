package org.hdcd.devproject.controller;

import org.apache.tomcat.jni.Local;
import org.hdcd.devproject.domain.Address;
import org.hdcd.devproject.domain.Member;
import org.hibernate.validator.internal.util.privilegedactions.LoadClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ValueConstants;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/home0101", method = RequestMethod.GET)
    public String home0101() {
        return "home0101";
    }

    @RequestMapping(value = "/home0201", method = RequestMethod.GET)
    public String home0201() {
        return "home0201";
    }

    @RequestMapping(value = "/home0301", method = RequestMethod.GET)
    public String home0301() {
        return "home0301";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Model model) throws Exception {
        model.addAttribute("msg", "등록이 완료되었습니다.");

        return "success";
    }

}
