package com.joeun.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.joeun.board.dto.Board;

@Mapper
public interface BoardMapper {
	
	public List<Board> list() throws Exception;
	
	public Board select(int boardNo) throws Exception;
	
	public int insert(Board board) throws Exception;
	
	public int update(Board board) throws Exception;
	
	public int delete(int boardNo) throws Exception;
	
}
