package me.whiteship.demoinflearnrestapi.home;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() throws Exception {
        log.info("HomeController, home.");

        return "home/home";
    }

}
