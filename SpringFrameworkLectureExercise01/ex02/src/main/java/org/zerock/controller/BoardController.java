package org.zerock.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.PageDTO;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {

	private static Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	private BoardService service;
	
	@GetMapping("/list")
	public String list(Criteria cri, Model model) {
		
		logger.info("list");
		
		List<BoardVO> resultList = service.getList(cri);
		
		model.addAttribute("list", resultList);
		model.addAttribute("pageMaker", new PageDTO(cri, 123));
		
		return "board/list";
	}
	
	@PostMapping("/register")
	public String register(BoardVO board, RedirectAttributes rttr) {
		
		logger.info("register ::: " + board.toString());
		
		service.register(board);
		
		rttr.addFlashAttribute("result", board.getBno());
		
		return "redirect:/board/list";
	}
	
	@GetMapping({"/get"})
	public String get(@RequestParam("bno") Long bno, Model model) {
		
		logger.info("/get");
		
		model.addAttribute("board", service.get(bno));
		
		return "/board/get";
	}
	
	@GetMapping
	public String getModify(@RequestParam("bno") Long bno, Model model) {
		
		logger.info("/modify");
		
		model.addAttribute("board", service.get(bno));
		
		return "/board/modify";
	}
	
	@PostMapping("/modify")
	public String modify(BoardVO board, RedirectAttributes rttr) {
		
		logger.info("modify ::: " + board.toString());
		
		if (service.modify(board)) {
			rttr.addFlashAttribute("result", "success");
		}
		
		return "redirect:/board/list";
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
		
		logger.info("remove......" + bno);
		
		if (service.remove(bno)) {
			rttr.addFlashAttribute("result", "success");
		}
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/register")
	public String register() {
		
		return "board/register";
	}
	
}
