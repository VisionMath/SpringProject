package com.pgm.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pgm.demo1.domain.BoardVO;
import com.pgm.demo1.service.BoardService;

@Controller
//@RequestMapping("/board/*")
public class BoardController {
//	@val("${servlet.multipart.location}")
//	@Value("${multipart.location}")
	String filePath;

	@Autowired
	BoardService boardService;

	@GetMapping("list")
	public String list(Model model) {
		model.addAttribute("list", boardService.getList());
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
//	public String updateForm(@RequestParam("bno") int bno, @RequestParam("title") String title,
//			@RequestParam("writer") String writer, @RequestParam("content") String content, Model model) {
//	public String updateForm(@ModelAttribute("board") BoardVO boardVO, Model model) {
	public String updateForm(@PathVariable("bno") int bno, Model model) {
//		BoardVO boardVO = new BoardVO();
//		boardVO.setBno(bno);
//		boardVO.setTitle(title);
//		boardVO.setWriter(writer);
//		boardVO.setContent(content);

		model.addAttribute("board", boardService.read(bno));
		model.addAttribute("msg", "update 페이지입니다.");
//		model.addAttribute("bno", bno);
//		model.addAttribute("board", boardVO);
		return ("updateForm");
	}

	@PostMapping("insert")
	public String insert(BoardVO vo) {

		boardService.regisert(vo);
		return "redirect:list";
	}

	@PostMapping("update")
	public String update(BoardVO vo) {

		System.out.println(vo);
		boardService.update(vo);
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
