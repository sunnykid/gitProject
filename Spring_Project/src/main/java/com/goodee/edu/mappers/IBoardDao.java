package com.goodee.edu.mappers;

import com.goodee.edu.vo.Board_VO;

public interface IBoardDao {

	public int updateBoard();
	
	public int insertBoard(Board_VO vo);
}
