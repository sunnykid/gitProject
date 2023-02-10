package com.goodee.edu.mappers;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.goodee.edu.vo.Jobs_VO;

@Repository
public class JobsDaoImpl implements IJobsDao {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private final String NS = "com.goodee.edu.mappers.JobsDaoImpl.";
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public Jobs_VO getJobsDetail(String job_id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NS+"getJobsDetail",job_id);
	}

	@Override
	public List<Jobs_VO> getJobsAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NS+"getJobsAll");
	}

	@Override
	public int setJobsInsert(Jobs_VO vo) {
		// TODO Auto-generated method stub
		return sqlSession.insert(NS+"setJobsInsert", vo);
	}

	@Override
	public int setJobsModify(Map<String, Object> iMap) {
		// TODO Auto-generated method stub
		return sqlSession.update(NS+"setJobsModify", iMap);
	}

	@Override
	public int setJobsDelete(String job_id) {
		// TODO Auto-generated method stub
		return sqlSession.delete(NS+"setJobsDelete", job_id);
	}

}
