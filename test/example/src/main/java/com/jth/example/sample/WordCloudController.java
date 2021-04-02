package com.jth.example.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WordCloudController {

    private static final Logger logger = LoggerFactory.getLogger(WordCloudController.class);

    @GetMapping("/echart/wordCloud/echartWordCloudChart")
    public String echartWordCloud(Model model) throws Exception {
        logger.info("WordCloudController, echartWordCloud.");

        return "echart/wordCloud/echartWordCloudChart";
    }

}
