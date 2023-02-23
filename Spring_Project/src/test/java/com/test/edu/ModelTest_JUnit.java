package com.test.edu;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.goodee.edu.services.IJobsService;
import com.goodee.edu.vo.Board_VO;
import com.goodee.edu.vo.Jobs_VO;
import com.goodee.edu.vo.Reservation_VO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class ModelTest_JUnit {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private IJobsService service;
	
	@Before
	public void test() {
//		fail("Not yet implemented");
		assertNotNull(sqlSession);
	}

//	@Test
	public void getReservation() {
		List<Reservation_VO> lists = sqlSession.selectList("com.goodee.edu.reservation.getReservation");
		System.out.println(lists);
		assertNotNull(lists);		
	}

	public void getJobsDetail() {
		Jobs_VO vo = service.getJobsDetail("IT_PROG");
		assertNotNull(vo);
	}
	
	public void getJobsAll() {
		List<Jobs_VO> lists = service.getJobsAll();
		assertNotSame(lists.size(), 0);
	}
	
	public void setJobsInsert() {
		int n = service.setJobsInsert(new Jobs_VO("IT_DEV10","Developer","2000","5000"));
		assertSame(n,1);
	}

//	@Test	
	public void setJobsModify() {
//		Map<String,Object> iMap = new HashMap<String,Object>();
//		iMap.put("title", "DEV");
//		iMap.put("id", "IT_DEV10");
		Jobs_VO vo = new Jobs_VO("IT_PROG","Developer","2000","5000");
//		int n = service.setJobsModify(iMap);
//		assertSame(n, 1);
	}
	

	public void setJobsDelete() {
		int n = service.setJobsDelete("IT_DEV10");
		assertSame(n,1);
	}

	@Test
	public void selectKeyTest() {
		Board_VO vo = new Board_VO(0,"테스트제목","테스트 글 내용",null);
		System.out.println("입력 전 VO : " + vo);
		sqlSession.insert("com.goodee.edu.mappers.BoardDaoImpl.insertBoard",vo);
		System.out.println("입력 후 VO : " + vo);
		
		Board_VO rVo = sqlSession.selectOne("com.goodee.edu.mappers.BoardDaoImpl.detailBoard",vo);
		System.out.println("상세조회 : " + rVo);
	}
}
