package com.bdi.sp.anno;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("anno/anno-ioc.xml");	// ClassPathXmlApplicationContext : 읽어드리고 분석하는일을 다함
																					// BeanFactory : 하나하나의 인스턴스(bugger, pizza...)
		AnnoTest at = (AnnoTest)bf.getBean("at");
		at.answer();
	}
}
