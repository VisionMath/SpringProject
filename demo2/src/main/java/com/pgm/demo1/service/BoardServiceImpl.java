package com.pgm.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pgm.demo1.domain.JpaBoard;
import com.pgm.demo1.repository.BoardRepository;

import lombok.extern.java.Log;

@Log
@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardRepository boardRepository;

	@Override
	public List<JpaBoard> list() {
		// TODO Auto-generated method stub
		return boardRepository.findAll();
	}

	@Override
	public void regisert(JpaBoard board) {
		// TODO Auto-generated method stub
		boardRepository.save(board);
	}

	@Transactional
	@Override
	public void update(JpaBoard board) {
		// TODO Auto-generated method stub
		JpaBoard b = boardRepository.findByBno(board.getBno());
		b.setContent(board.getContent());
		b.setTitle(board.getTitle());
		b.setWriter(board.getWriter());
	}

	@Override
	public JpaBoard read(int bno) {
		// TODO Auto-generated method stub
		return boardRepository.findByBno(bno);
	}

	@Override
	public void delete(int bno) {
		// TODO Auto-generated method stub
		boardRepository.deleteByBno(bno);
	}
}
