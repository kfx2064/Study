package com.jth.demo.example.ch01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/example/ch01")
public class Ch01Controller {

    private static final Logger logger = LoggerFactory.getLogger(Ch01Controller.class);

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String callExampleCh01Hello() throws Exception {

        logger.info("===> Ch01Controller, callExampleCh01Hello.");

        return "example/ch01/hello";
    }

}
