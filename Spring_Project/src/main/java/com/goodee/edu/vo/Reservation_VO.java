package com.goodee.edu.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Reservation_VO {
	
	@NonNull
	private String reservno;
	
	private String day;
	private String personcount;
	private String requestcontent;
	private String reservemail;
	private String reservname;
	private String reservphone;
	private String reservationdate;
	private String time;
	private String shop_no;
}
