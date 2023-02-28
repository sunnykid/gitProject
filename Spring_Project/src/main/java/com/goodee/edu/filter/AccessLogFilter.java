package com.goodee.edu.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet Filter implementation class AccessLogFilter
 */
//@WebFilter("/AccessLogFilter")
public class AccessLogFilter extends HttpFilter implements Filter {
       
    // 인터페이스를 구현한 곳, DTO/VO 생성시 serialize 직렬화
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(AccessLogFilter.class);

	public void destroy() {
		// TODO Auto-generated method stub
		logger.debug("필터 종료");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		logger.debug("필터 들어옴");
		//요청에 queryString lang=kor 이면 내국인 페이지, lang=eng 외부인페이지
		HttpServletRequest req = (HttpServletRequest) request;
		
		// HttpServletRequest 객체에 있는 값
		// HttpServletRequest 객체안에 있는 Header에 있는 값
		
		String url = req.getRequestURI().toString();
		logger.debug("URL 정보 {}",url);
		
		String queryString = req.getQueryString();
		logger.debug("쿼리스트링 정보 {}",queryString);		
		
		String remoteAddr = req.getRemoteAddr();
		logger.debug("리모트 정보 {}",remoteAddr);
		
		String userAgent = req.getHeader("User-Agent");
		logger.debug("접속 유저 정보 {}",userAgent);
		
		
		String referer = req.getHeader("referer");
		logger.debug("접속 유저 정보 {}",referer);
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * String lang = req.getParameter("lang"); logger.debug("요청된 request값 : " +
		 * lang);
		 * 
		 * lang = (lang == null) ? "kor" : lang;
		 * 
		 * if(lang.equals("kor")) { RequestDispatcher dispatcher =
		 * req.getRequestDispatcher("/secondPage.jsp"); dispatcher.forward(request,
		 * response); }else { req.getRequestDispatcher("/Page.jsp").forward(request,
		 * response); }
		 */
		
		chain.doFilter(request, response); //가로채기를 한 후에 처리해주는 Class FilterChain
	}

	public void init(FilterConfig fConfig) throws ServletException {
		logger.debug("필터 시작");
	}

}
