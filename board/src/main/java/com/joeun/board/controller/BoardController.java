package com.joeun.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joeun.board.dto.Board;
import com.joeun.board.service.BoardService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestParam;





@Slf4j
@Controller
/* @RequestMapping("/board") */ 
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping(value="/list")
	public String list(Model model) throws Exception {
		
		// 데이터 요청
		List<Board> boardList = boardService.list();
		// 모델 등록
		model.addAttribute("boardList", boardList);
		// 뷰 페이지 지정
		return "board/list";
	}
	
	// 게시글 조회
	@GetMapping(value="/read")
	public String read(Model model, int boardNo) throws Exception {
		// 데이터 요청
		Board board = boardService.select(boardNo);
		// 모델 등록
		model.addAttribute("board", board);
		// 뷰 페이지 지정
		return "board/read";
	}
	
	
	
	@GetMapping(value="/insert")
	public String insert(@ModelAttribute Board board) {
		return "board/insert";
	}
	
	@PostMapping(value="/insert")
	public String insertPro(@ModelAttribute Board board) throws Exception {
		int result = boardService.insert(board);
		if (result == 0) return "board/insert";
		return "redirect:/board/list";
	}
	
	@GetMapping("furni/shop")
	public void shop() throws Exception {		
	}
	
	@GetMapping("board/blog")
	public void blog() throws Exception {		
	}
	
	}
	
	

