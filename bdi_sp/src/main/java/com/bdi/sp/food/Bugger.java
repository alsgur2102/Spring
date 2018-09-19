package com.bdi.sp.food;

public class Bugger implements Food {

	public void eat() {
		System.out.println("햄버거를 먹습니다.");

	}

	public Food buy(int money) {
		System.out.println(money + "원으로 햄버거를 삽니다.");
		return this;
	}

}
