package com.jth.example.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SampleController {

    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @GetMapping("/barChart")
    public String home(Model model) throws Exception {
        logger.info("SampleController, barChart.");

        List<String> resultList = new ArrayList<>();

        for (int i = 1; i < 7; i++) {
            resultList.add(String.valueOf(i));
        }

        model.addAttribute("resultList", resultList);

        return "barChart";
    }

    @GetMapping("/pieChart")
    public String pieChart(Model model) throws Exception {
        logger.info("SampleController, pieChart.");

        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            double random = (Math.random() * 10) + 1;
            String strRandom = String.valueOf(random);
            String cutString = strRandom.substring(0, strRandom.indexOf("."));
            resultList.add(cutString);
        }

        model.addAttribute("resultList", resultList);

        return "pieChart";
    }

    @GetMapping("/doughnutChart")
    public String doughnut(Model model) throws Exception {
        logger.info("SampleController, doughnutChart.");

        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            double random = (Math.random() * 10) + 1;
            String strRandom = String.valueOf(random);
            String cutString = strRandom.substring(0, strRandom.indexOf("."));
            resultList.add(cutString);
        }

        model.addAttribute("resultList", resultList);

        return "doughnutChart";
    }

    @GetMapping("/lineChart")
    public String lineChart(Model model) throws Exception {
        logger.info("SampleController, lineChart.");

        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            double random = (Math.random() * 10) + 1;
            String strRandom = String.valueOf(random);
            String cutString = strRandom.substring(0, strRandom.indexOf("."));
            resultList.add(cutString);
        }

        model.addAttribute("resultList", resultList);

        return "lineChart";
    }

}
