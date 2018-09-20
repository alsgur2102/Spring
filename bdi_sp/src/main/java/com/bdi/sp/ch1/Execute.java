package com.bdi.sp.ch1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("ch1/ch1-ioc.xml");	// ClassPathXmlApplicationContext : 읽어드리고 분석하는일을 다함(프리로딩)
																				// BeanFactory : 하나하나의 인스턴스(PC, Money...)
		PC pc = (PC) bf.getBean("pc");
		Money money = (Money) bf.getBean("money");
		System.out.println(pc);
		System.out.println(money);
	}
}
