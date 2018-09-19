package com.bdi.sp.anno;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("anno/anno-ioc.xml");
		AnnoTest at = (AnnoTest)bf.getBean("at");
		at.answer();
	}
}
