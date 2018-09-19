package com.bdi.sp.food;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.bdi.sp.game.Computer;

public class Execute {

	public static void main(String[] args) {
		FileSystemResource fsr = new FileSystemResource("src/main/resources/food/food-ioc.xml");	// FileSystemResource : 읽어드리는 일만 함
		BeanFactory bf = new XmlBeanFactory(fsr);	// XmlBeanFactory : 위에서 읽어드린 것들을 분석해서 밑으로 넘겨줌
													// BeanFactory : 하나하나의 인스턴스(bugger, pizza...)
		KFC kfc = (KFC) bf.getBean("kfc");
		kfc.buy();
	}
}
