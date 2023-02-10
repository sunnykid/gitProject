package com.goodee.edu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.goodee.edu.services.IJobsService;
import com.goodee.edu.vo.Jobs_VO;

@Controller
public class JobsController {
	
	@Autowired
	private IJobsService service;
	
	@GetMapping("/getJobsDetail.do")
	public String getJobsDetail(String id, Model model) {
		Jobs_VO vo = service.getJobsDetail(id);
		model.addAttribute("job",vo);
		return "jobDetail";
	}
	
	@GetMapping("/getJobsAll.do")
	public String getJobsAll(Model model) {
		List<Jobs_VO> lists = service.getJobsAll();
		model.addAttribute("lists", lists);
		return "jobList";
	}

}
