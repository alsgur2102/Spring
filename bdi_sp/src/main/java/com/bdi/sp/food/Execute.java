package com.bdi.sp.food;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.bdi.sp.game.Computer;

public class Execute {

	public static void main(String[] args) {
		FileSystemResource fsr = new FileSystemResource("src/main/resources/food/food-ioc.xml");	// 상대참조
		BeanFactory bf = new XmlBeanFactory(fsr);
		KFC kfc = (KFC) bf.getBean("kfc");
		kfc.buy();
	}
}
