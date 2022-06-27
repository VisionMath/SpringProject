package com.pgm.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pgm.demo1.domain.BoardVO;
import com.pgm.demo1.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper boardMapper;

	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		return boardMapper.getList();
	}

	@Override
	public void regisert(BoardVO vo) {
		// TODO Auto-generated method stub
		boardMapper.insert(vo);
	}

	@Override
	public void update(BoardVO vo) {
		// TODO Auto-generated method stub
		System.out.println(vo + " " + vo.getBno());
		boardMapper.update(vo);
	}

	@Override
	public BoardVO read(int bno) {
		// TODO Auto-generated method stub
		return boardMapper.read(bno);
	}

	@Override
	public void delete(int bno) {
		// TODO Auto-generated method stub
		boardMapper.delete(bno);
	}
}
