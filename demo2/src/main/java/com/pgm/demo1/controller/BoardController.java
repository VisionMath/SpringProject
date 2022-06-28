package com.pgm.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pgm.demo1.domain.JpaBoard;
import com.pgm.demo1.service.BoardService;

@Controller
public class BoardController {
	String filePath;

	@Autowired
	BoardService boardService;

	@GetMapping("list")
	public String list(Model model) {
		model.addAttribute("list", boardService.list());
		return "list";
	}

	@GetMapping("register")
	public void register() {

	}

	@GetMapping("insertForm")
	public String insertForm(Model model) {
		model.addAttribute("msg", "insert 페이지입니다.");
		return ("insertForm");
	}

	@GetMapping("updateForm/{bno}")
	public String updateForm(@PathVariable("bno") int bno, Model model) {
		model.addAttribute("board", boardService.read(bno));
		model.addAttribute("msg", "update 페이지입니다.");
		return ("updateForm");
	}

	@PostMapping("insert")
	public String insert(JpaBoard board) {
		boardService.regisert(board);
		return "redirect:list";
	}

	@PostMapping("update")
	public String update(JpaBoard board) {
		boardService.update(board);
		return "redirect:list";
	}

	@GetMapping("read/{bno}")
	public String read(@PathVariable("bno") int bno, Model model) {
		model.addAttribute("board", boardService.read(bno));
		return "detail";
	}

	@GetMapping("delete")
	public String delete(@RequestParam("bno") int bno) {
		boardService.delete(bno);
		return "redirect:list";
	}
}
