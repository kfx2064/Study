package com.jth.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandController {
	
	private static final Logger logger = LoggerFactory.getLogger(LandController.class);

	@GetMapping("/land")
	public String scLand() throws Exception {
		logger.info("LandController, scLand.");
		return "land/layout";
	}
	
	@GetMapping("/sea")
	public String scSea() throws Exception {
		logger.info("LandController, scSea.");
		return "sea/layout";
	}
	
	@GetMapping("/air")
	public String scAir() throws Exception {
		logger.info("LandController, scAir.");
		return "air/layout";
	}
	
}
