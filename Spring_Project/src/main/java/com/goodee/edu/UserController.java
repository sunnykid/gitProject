package com.goodee.edu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/sessionCreate.do")
	public String login(HttpSession session,Model model) {
		session.setAttribute("name", "goodee");
		session.setMaxInactiveInterval(30);
		
	    model.addAttribute("name","km_tower");
		return "login";
	}
	
	/**
	 * 
	 */
	@GetMapping("/login.do")
	public String commonLogin(HttpServletRequest request) {
		System.out.println("Application Scope를 통한 session 공유");
		request.getSession().getServletContext().setAttribute("LoginVo", "값을 담다");
		return "login";
	}
}
