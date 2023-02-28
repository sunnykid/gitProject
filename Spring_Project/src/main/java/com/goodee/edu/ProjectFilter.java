package com.goodee.edu;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class ProjectFilter
 *
 */
//@WebListener
public class ProjectFilter implements ServletContextListener, HttpSessionListener, ServletRequestListener {

    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("~~어플리케이션 종료~~" + sce.getServletContext());
    }

    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO 0001 todo 
    	System.out.println("##어플리케이션 시작##");
    	System.out.println(sce.getServletContext().getServerInfo());
    }

    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("세션 생성 시간");
    	System.out.println(se.getSession().getCreationTime());
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("세션 종료 시간");
    	System.out.println(se.getSession().getAttributeNames());
    }

    public void requestDestroyed(ServletRequestEvent sre)  { 
    	System.out.println(sre.getServletContext().getContextPath());
    }

    public void requestInitialized(ServletRequestEvent sre)  { 
    	System.out.println("requestInitialized 초기화");
    	System.out.println(sre.getServletContext().getContextPath());
    	
    }


	
}
