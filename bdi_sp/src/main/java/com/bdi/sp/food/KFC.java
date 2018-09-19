package com.bdi.sp.food;

public class KFC {
	
	private Food f;
	
	public void setFood(Food f) {
		this.f = f;
	}
	
	public void buy() {
		f.buy(1000);
		f.eat();
	}
}
