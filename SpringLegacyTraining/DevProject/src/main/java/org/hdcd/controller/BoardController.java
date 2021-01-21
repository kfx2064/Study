package org.hdcd.controller;

import org.hdcd.controller.domain.Board;
import org.hdcd.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	private BoardService service;
	
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

	@RequestMapping(value = "/{boardNo}", method = RequestMethod.POST)
	public ResponseEntity<String> modify(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
		logger.info("modify");

		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

		return entity;
	}

	@RequestMapping(value = "/{boardNo}", method = RequestMethod.PUT, headers = "X-HTTP-Method-Override=PUT")
	public ResponseEntity<String> modifyByHeader(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
		logger.info("modifyByHeader");

		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

		return entity;
	}

	@RequestMapping(value = "/{boardNo}", method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<String> modifyByJson(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
		logger.info("modifyByJson");

		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

		return entity;
	}

	@RequestMapping(value = "/{boardNo}", method = RequestMethod.PUT, consumes = "application/xml")
	public ResponseEntity<String> modifyByXml(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
		logger.info("modifyByXml boardNo: " + boardNo);

		logger.info("modifyByXml board: " + board);

		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);

		return entity;
	}

	@RequestMapping(value = "/{boardNo}", method = RequestMethod.GET, produces = "application/xml")
	public ResponseEntity<Board> readToXml(@PathVariable("boardNo") int boardNo) {
		logger.info("readToXml");

		Board board = new Board();

		board.setTitle("제목");
		board.setContent("내용입니다.");
		board.setWriter("홍길동");
		board.setRegDate(new Date());

		ResponseEntity<Board> entity = new ResponseEntity<>(board, HttpStatus.OK);

		return entity;
	}

	@RequestMapping(value = "/{boardNo}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Board> readToJson(@PathVariable("boardNo") int boardNo) {
		logger.info("readToJson");

		Board board = new Board();

		board.setTitle("제목");
		board.setContent("내용입니다.");
		board.setWriter("홍길동");
		board.setRegDate(new Date());

		ResponseEntity<Board> entity = new ResponseEntity<>(board, HttpStatus.OK);

		return entity;
	}

	@RequestMapping(value = "/{boardNo}", method = RequestMethod.GET)
	public ResponseEntity<Board> read(@PathVariable("boardNo") int boardNo) {
		logger.info("read");

		Board board = new Board();

		board.setTitle("제목");
		board.setContent("내용입니다.");
		board.setWriter("홍길동");
		board.setRegDate(new Date());

		ResponseEntity<Board> entity = new ResponseEntity<>(board, HttpStatus.OK);

		return entity;
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerForm(Board board, Model model) throws Exception {
		logger.info("registerForm");
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(Board board, Model model) throws Exception {
		logger.info("register");

		service.register(board);

		model.addAttribute("msg", "등록이 완료되었습니다.");

		return "board/success";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list(Model model) throws Exception {
		logger.info("list");

		model.addAttribute("list", service.list());
	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("boardNo") int boardNo, Model model) throws Exception {
		logger.info("read");

		model.addAttribute(service.read(boardNo));
	}

	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("boardNo") int boardNo, Model model) throws Exception {
		logger.info("remove");

		service.remove(boardNo);

		model.addAttribute("msg", "삭제가 완료되었습니다.");

		return "board/success";
	}

	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyForm(int boardNo, Model model) throws Exception {
		logger.info("modifyForm");

		model.addAttribute(service.read(boardNo));
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modify(Board board, Model model) throws Exception {
		logger.info("modify");

		service.modify(board);

		model.addAttribute("msg", "수정이 완료되었습니다.");

		return "board/success";
	}

}
