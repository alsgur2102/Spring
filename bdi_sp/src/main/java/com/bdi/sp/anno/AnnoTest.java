package com.bdi.sp.anno;

import org.springframework.stereotype.Service;

@Service("at")
public class AnnoTest {

	public AnnoTest() {
		System.out.println("정말 내가 생성이 될까?");
	}
	
	public void answer() {
		System.out.println("응 됨");
	}
}
