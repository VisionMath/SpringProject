package com.pgm.demo1.service;

import java.util.List;

import com.pgm.demo1.domain.JpaBoard;

public interface BoardService {

	public void delete(int bno);

	public List<JpaBoard> list();

	public void regisert(JpaBoard board);

	public void update(JpaBoard board);

	public JpaBoard read(int bno);

}
