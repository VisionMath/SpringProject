package com.pgm.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgm.demo1.domain.JpaBoard;

public interface BoardRepository extends JpaRepository<JpaBoard, Integer> {
	JpaBoard findByBno(int bno);

	void deleteByBno(int bno);
}
