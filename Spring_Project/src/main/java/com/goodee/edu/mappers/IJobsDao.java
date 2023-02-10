package com.goodee.edu.mappers;

import java.util.List;
import java.util.Map;

import com.goodee.edu.vo.Jobs_VO;

public interface IJobsDao {
	public Jobs_VO getJobsDetail(String job_id);
	public List<Jobs_VO> getJobsAll   ();
	public int setJobsInsert(Jobs_VO vo);
	public int setJobsModify(Map<String,Object> iMap);
	public int setJobsDelete(String job_id);
}
