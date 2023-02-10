package com.goodee.edu.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goodee.edu.mappers.IJobsDao;
import com.goodee.edu.vo.Jobs_VO;

@Service
public class JobsServiceImpl implements IJobsService {
	@Autowired
	private IJobsDao dao;

	@Override
	public Jobs_VO getJobsDetail(String job_id) {
		// TODO Auto-generated method stub
		return dao.getJobsDetail(job_id);
	}

	@Override
	public List<Jobs_VO> getJobsAll() {
		// TODO Auto-generated method stub
		return dao.getJobsAll();
	}

	@Override
	public int setJobsInsert(Jobs_VO vo) {
		// TODO Auto-generated method stub
		return dao.setJobsInsert(vo);
	}

	@Override
	public int setJobsModify(Map<String, Object> iMap) {
		// TODO Auto-generated method stub
		return dao.setJobsModify(iMap);
	}

	@Override
	public int setJobsDelete(String job_id) {
		// TODO Auto-generated method stub
		return dao.setJobsDelete(job_id);
	}
}
