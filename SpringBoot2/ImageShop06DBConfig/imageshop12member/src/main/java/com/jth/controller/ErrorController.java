package com.jth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/error")
public class ErrorController {

    @RequestMapping(value = "/accessError", method = RequestMethod.GET)
    public String showAccessError() {
        return "error/accessError";
    }
}
