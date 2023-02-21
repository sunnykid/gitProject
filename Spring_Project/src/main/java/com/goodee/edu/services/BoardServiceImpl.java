package com.goodee.edu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goodee.edu.mappers.IBoardDao;
import com.goodee.edu.vo.Board_VO;

@Service
public class BoardServiceImpl implements IBoardService {

	@Autowired
	private IBoardDao dao;
	
	@Override
	@Transactional(readOnly = true)
	public int transactionBoard(Board_VO vo) {
		int n = dao.updateBoard();
		n += dao.insertBoard(vo);
		return n;
	}

}
