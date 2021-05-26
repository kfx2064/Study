package org.hdcd.devproject.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hdcd.devproject.domain.Board;
import org.hdcd.devproject.dto.PaginationDTO;
import org.hdcd.devproject.service.BoardService;
import org.hdcd.devproject.vo.PageRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("/board")
public class BoardController {

    private final BoardService service;

    @GetMapping("/register")
    public void registerForm(Board board, Model model) throws Exception {

    }

    @PostMapping("/register")
    public String register(Board board, RedirectAttributes rttr) throws Exception {
        service.register(board);

        rttr.addFlashAttribute("msg", "등록이 완료되었습니다.");

        return "redirect:/board/list";
    }

    @GetMapping("/list")
    public void list(@ModelAttribute("pgrq") PageRequestVO pageRequestVO, Model model) throws Exception {
        Page<Board> page = service.list(pageRequestVO);

        model.addAttribute("pgntn", new PaginationDTO<Board>(page));
    }

    @GetMapping("/read")
    public void read(Long boardNo, @ModelAttribute("pgrq") PageRequestVO pageRequestVO, Model model) throws Exception {
        model.addAttribute(service.read(boardNo));
    }

    @PostMapping("/remove")
    public String remove(Long boardNo, PageRequestVO pageRequestVO, RedirectAttributes rttr) throws Exception {
        service.remove(boardNo);

        rttr.addAttribute("page", pageRequestVO.getPage());
        rttr.addAttribute("sizePerPage", pageRequestVO.getSizePerPage());

        rttr.addFlashAttribute("msg", "삭제가 완료되었습니다.");

        return "redirect:/board/list";
    }

    @GetMapping("/modify")
    public void modifyForm(Long boardNo,
                           @ModelAttribute("pgrq") PageRequestVO pageRequestVO, Model model) throws Exception {
        model.addAttribute(service.read(boardNo));
    }

    @PostMapping("/modify")
    public String modify(Board board, PageRequestVO pageRequestVO, RedirectAttributes rttr) throws Exception {
        service.modify(board);

        rttr.addFlashAttribute("page", pageRequestVO.getPage());
        rttr.addFlashAttribute("sizePerPage", pageRequestVO.getSizePerPage());

        rttr.addFlashAttribute("msg", "수정이 완료되었습니다.");

        return "redirect:/board/list";
    }

}
