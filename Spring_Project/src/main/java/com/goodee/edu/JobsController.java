package com.goodee.edu;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@GetMapping("/getJobsModify.do")
	public String getJobsModify(String id, Model model) {
		Jobs_VO vo = service.getJobsDetail(id);
		model.addAttribute("job",vo);
		return "jobModify";
	}
	
	@GetMapping("/getJobsAll.do")
	public String getJobsAll(Model model) {
		List<Jobs_VO> lists = service.getJobsAll();
		model.addAttribute("lists", lists);
		return "jobList";
	}
	
	//  forword: 새로운 JSP호출  redirect:호출된 페이지로 값을 전송 비동기식처리방식(XmlHttpRequest)
	// servlet container에서는 redirect 주소에 값을 입력해줌.
	// spring container에서는 redirect container내의 mapping value 찾음.
	@PostMapping("/jobModifyWrite.do")
	public String setJobsModify(
				Jobs_VO vo,
				@RequestParam Map<String, Object> map){
				int n = service.setJobsModify(map);
		return "redirect:/getJobsAll.do";
	}
	
	@GetMapping("/jobsDelete.do")
	public String setJobDelete(@RequestParam("id") String job_id) {
		int n = service.setJobsDelete(job_id);
		return "redirect:/getJobsAll.do";
	}

	@GetMapping("/jobsWriteForm.do")
	public String jobsWriteForm() {
		return "jobsWriteForm";
	}
	
	@PostMapping("jobsWrite.do")
	/* @ResponseBody */
	public String jobsWrite(Jobs_VO vo/* , HttpServletRequest request */) throws Exception {
		/* request.setCharacterEncoding("utf-8"); */
		System.out.println("전달받은 jobsWrite"+vo);
		/*_*/
		service.setJobsInsert(vo);
		return "redirect:/getJobsDetail.do?id="+vo.getJob_id();
	}
}
