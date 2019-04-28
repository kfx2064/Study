package org.zerock.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		
		logger.info("cri ::: " + cri.toString());
		
		int total = service.getTotal(cri);
		logger.info("total : " + total);
		
		cri.setAmount(total);
		
		List<BoardVO> resultList = service.getList(cri);
		
		logger.info("pageMaker ::: " + new PageDTO(cri, total).toString());
		
		model.addAttribute("list", resultList);
		model.addAttribute("pageMaker", new PageDTO(cri, total));
		
		return "board/list";
	}
	
	@PostMapping("/register")
	public String register(BoardVO board, RedirectAttributes rttr) {
		
		logger.info("=================================");
		
		logger.info("register ::: " + board.toString());
		
		if(board.getAttachList() != null) {
			board.getAttachList().forEach(attach -> logger.info(attach.toString()));
		}
		
		logger.info("=================================");
		
		BoardVO tmpAttachVO = new BoardVO();;
		
		tmpAttachVO = service.register(board);
		Long getBno = tmpAttachVO.getBno();
		board.setBno(getBno);
		System.out.println("controllerGetBno ::: " + getBno);
		
		service.registerAttach(board);
		
		rttr.addFlashAttribute("result", board.getBno());
		
		return "redirect:/board/list";
	}
	
	@GetMapping({"/get"})
	public String get(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		
		logger.info("/get");
		
		model.addAttribute("board", service.get(bno));
		
		return "/board/get";
	}
	
	@GetMapping("/modify")
	public String getModify(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		
		logger.info("/modify");
		
		model.addAttribute("board", service.get(bno));
		
		return "/board/modify";
	}
	
	@PostMapping("/modify")
	public String modify(BoardVO board, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
		
		logger.info("modify ::: " + board.toString());
		
		if (service.modify(board)) {
			rttr.addFlashAttribute("result", "success");
		}
		
		/*
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		rttr.addAttribute("type", cri.getType());
		rttr.addAttribute("keyword", cri.getKeyword());
		*/
		
		String strGetLink = cri.getListLink();
		
		return "redirect:/board/list" + strGetLink;
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
		
		logger.info("remove......" + bno);
		
		if (service.remove(bno)) {
			rttr.addFlashAttribute("result", "success");
		}
		
		/*
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		rttr.addAttribute("type", cri.getType());
		rttr.addAttribute("keyword", cri.getKeyword());
		*/
		
		String strListLink = cri.getListLink();
		
		return "redirect:/board/list" + strListLink;
	}
	
	@GetMapping("/register")
	public String register() {
		
		return "board/register";
	}
	
}
