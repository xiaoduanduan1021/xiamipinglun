package com;
import java.io.IOException;

import javax.servlet.ServletContextEvent;

import javax.servlet.ServletContextListener;
//服务启动时自动调用

import org.apache.log4j.Logger;
public class Runxiamipinglun implements ServletContextListener{

	
	Logger log = Logger.getLogger(Runxiamipinglun.class);
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("tomcat关闭");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("tomcat启动");
		try {
			new HttpGetPost().qidong();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
