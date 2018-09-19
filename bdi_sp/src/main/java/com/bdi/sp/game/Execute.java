package com.bdi.sp.game;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("game/game-ioc.xml");	// 절대참조
		Computer c = (Computer)bf.getBean("computer");
		System.out.println(c);
		c.load();
		
	}
}
