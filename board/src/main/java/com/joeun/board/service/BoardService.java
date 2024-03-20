package com.joeun.board.service;

import java.util.List;

import com.joeun.board.dto.Board;

public interface BoardService {
	
	public List<Board> list() throws Exception;
	
	public Board select(int boardNo) throws Exception;
	
	public int insert(Board board) throws Exception;
	
	public int update(Board board) throws Exception;
	
	public int delete(int boardNo) throws Exception;
	
}
