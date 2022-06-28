package com.pgm.demo1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pgm.demo1.domain.BoardVO;

@Mapper
public interface BoardMapper {
	public List<BoardVO> getList();

	public void insert(BoardVO board);

	public void update(BoardVO board);

	public BoardVO read(int bno);

	public void delete(int bno);

}
