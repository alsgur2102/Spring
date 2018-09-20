package com.bdi.sp.ch1;

import org.springframework.stereotype.Component;

@Component("money")
public class Money {
	private int amount;

	public Money() {}
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Money [amount=" + amount + "]";
	}

	public Money(int amount) {
		super();
		this.amount = amount;
	}
}
