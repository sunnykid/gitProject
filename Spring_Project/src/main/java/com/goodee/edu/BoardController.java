package com.goodee.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.goodee.edu.services.IBoardService;
import com.goodee.edu.vo.Board_VO;

@Controller
public class BoardController {
	
	@Autowired
	private IBoardService service;

	@RequestMapping(value="/boardInsertForm.do",method= {RequestMethod.GET,RequestMethod.POST})

	public ModelAndView insertBoardForm() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name","kakao");
		mav.setViewName("boardInsert");
		System.out.println(mav);
		return mav;
	}
	
	@PostMapping("/insertBoard.do")
	public String insertBoard(Board_VO vo) {
		service.transactionBoard(vo);
		System.out.println("전달받은 요청값 :" + vo);
		return "boardInsert";
	}
}
