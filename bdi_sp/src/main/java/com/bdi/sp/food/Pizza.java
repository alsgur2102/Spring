package com.bdi.sp.food;

public class Pizza implements Food {

	public void eat() {
		System.out.println("피자를 맛있게 먹었어요.");
	}

	public Food buy(int money) {
		System.out.println(money + "원으로 피자를 삽니다.");
		return this;
	}
}
