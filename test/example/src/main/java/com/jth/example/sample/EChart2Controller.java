package com.jth.example.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EChart2Controller {

    private static final Logger logger = LoggerFactory.getLogger(EChart2Controller.class);

    @GetMapping("/pie/echartPieChart")
    public String echartPieChart(Model model) throws Exception {
        logger.info("EChart2Controller, echartPieChart.");

        return "echart/pie/echartPieChart";
    }

    @GetMapping("/pie/echartRoundPieChart")
    public String echartRoundPieChart(Model model) throws Exception {
        logger.info("EChart2Controller, echartRoundPieChart.");

        return "echart/pie/echartRoundPieChart";
    }

    @GetMapping("/pie/echartDoughnutChart")
    public String echartDoughnutChart(Model model) throws Exception {
        logger.info("EChart2Controller, echartDoughnutChart.");

        return "echart/pie/echartDoughnutChart";
    }

    @GetMapping("/pie/echartNestedPiesChart")
    public String echartNestedPiesChart(Model model) throws Exception {
        logger.info("EChart2Controller, echartNestedPiesChart.");

        return "echart/pie/echartNestedPiesChart";
    }

}