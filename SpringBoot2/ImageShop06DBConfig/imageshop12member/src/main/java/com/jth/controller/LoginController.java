package com.jth.controller;

import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class LoginController {

    @RequestMapping("/login")
    public String loginForm(String error, String logout, Model model) {
        if(error != null) {
            model.addAttribute("error", "Login Error!!!");
        }

        if(logout != null) {
            model.addAttribute("logout", "Logout!!!");
        }

        return "auth/loginForm";
    }

    // 로그아웃 화면
    @RequestMapping("/logout")
    public String logoutForm() {
        return "auth/logoutForm";
    }

}
