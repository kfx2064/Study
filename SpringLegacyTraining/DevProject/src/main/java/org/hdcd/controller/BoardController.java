package org.hdcd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping("/read/{boardNo}")
	public String read(@PathVariable("boardNo") int boardNo) {
		logger.info("read boardNo : " + boardNo);
		
		return "board/read";
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.GET, params="register")
	public String registerForm() {
		logger.info("registerForm");
		
		return "board/register";
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.POST, params="register")
	public String register() {
		logger.info("register");
		
		return "board/list";
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.GET, params="modify")
	public String modifyForm() {
		logger.info("modifyForm");
		
		return "board/modify";
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST, params="modify")
	public String modify() {
		logger.info("modify");

		return "success";
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET, params = "remove")
	public String removeForm() {
		logger.info("removeForm");

		return "board/remove";
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST, params = "remove")
	public String remove() {
		logger.info("remove");

		return "board/list";
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET, params = "list")
	public String list() {
		logger.info("list");

		return "board/list";
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET, params = "read")
	public String read() {
		logger.info("read");

		return "board/read";
	}

}
