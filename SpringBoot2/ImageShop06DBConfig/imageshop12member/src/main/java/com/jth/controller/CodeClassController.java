package com.jth.controller;

import com.jth.domain.CodeClass;
import com.jth.service.CodeClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/codeclass")
public class CodeClassController {

    @Autowired
    private CodeClassService service;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public void registerForm(Model model) throws Exception {
        CodeClass codeClass = new CodeClass();

        model.addAttribute(codeClass);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(CodeClass codeClass, RedirectAttributes rttr) throws Exception {
        service.create(codeClass);

        rttr.addFlashAttribute("msg", "SUCCESS");
        return "redirect:/codeclass/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public void list(Model model) throws Exception {
        model.addAttribute("list", service.list());
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public void read(String classCode, Model model) throws Exception {
        model.addAttribute(service.read(classCode));
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public String remove(String classCode, RedirectAttributes rttr) throws Exception {
        service.delete(classCode);

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/codeclass/list";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public void modifyForm(String classCode, Model model) throws Exception {
        model.addAttribute(service.read(classCode));
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public String modify(CodeClass codeClass, RedirectAttributes rttr) throws Exception {

        service.update(codeClass);

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/codeclass/list";
    }

}
