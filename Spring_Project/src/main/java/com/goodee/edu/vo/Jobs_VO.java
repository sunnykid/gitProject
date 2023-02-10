package com.goodee.edu.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Jobs_VO {
	private String job_id   ;
	private String job_title ; 
	private String min_salary;  
	private String max_salary;
}
