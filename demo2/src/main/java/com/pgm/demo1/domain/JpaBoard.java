package com.pgm.demo1.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_board")
public class JpaBoard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bno;
	private String title;
	private String writer;
	@Column(name = "content", length = 100)
	private String content;
}
