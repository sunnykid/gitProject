package com.goodee.edu.mappers;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.goodee.edu.vo.Board_VO;

@Repository
public class BoardDaoImpl implements IBoardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private final String NS="com.goodee.edu.mappers.BoardDaoImpl.";
	
	@Override
	public int updateBoard() {
		
		return sqlSession.update(NS+"updateBoard");
	}

	@Override
	public int insertBoard(Board_VO vo) {
		return sqlSession.insert(NS+"insertBoard",vo);
	}

}
