package com.bdi.sp.game;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("game/game-ioc.xml");	// ClassPathXmlApplicationContext : 읽어드리고 분석하는일을 다함
																					// BeanFactory : 하나하나의 인스턴스(bugger, pizza...)
		Computer c = (Computer)bf.getBean("computer");
		System.out.println(c);
		c.load();
		
	}
}
