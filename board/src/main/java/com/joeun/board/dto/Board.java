package com.joeun.board.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Board {
	private int boardNo;
	private String title;
	private String writer;
	private String content;
	private Date regdate;
	private Date update;
	private int views;	
}
