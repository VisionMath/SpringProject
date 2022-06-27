package com.pgm.demo1.service;

import java.util.List;

import com.pgm.demo1.domain.BoardVO;

public interface BoardService {
	public List<BoardVO> getList();

	public void regisert(BoardVO vo);

	public BoardVO read(int bno);

	public void delete(int bno);

	public void update(BoardVO vo);

}
