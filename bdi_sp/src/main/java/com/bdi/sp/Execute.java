package com.bdi.sp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Execute {

	public static void main(String[] args) {
		FileSystemResource fsr = new FileSystemResource("src/main/resources/ioc.xml");
		BeanFactory bf = new XmlBeanFactory(fsr);
		Test t = (Test) bf.getBean("test");
		t.print();
	}
}
