package com.test.edu;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.goodee.edu.vo.Reservation_VO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class ModelTest_JUnit {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Before
	public void test() {
//		fail("Not yet implemented");
		assertNotNull(sqlSession);
	}

	@Test
	public void getReservation() {
		List<Reservation_VO> lists = sqlSession.selectList("com.goodee.edu.reservation.getReservation");
		System.out.println(lists);
		assertNotNull(lists);		
	}

}
