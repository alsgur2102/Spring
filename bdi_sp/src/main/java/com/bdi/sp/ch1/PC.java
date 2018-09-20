package com.bdi.sp.ch1;

import org.springframework.stereotype.Component;

@Component("pc")
public class PC {
	private String cpu;
	
	public PC() {
		
	}

	public String getCpu() {
		return cpu;
	}

	public PC(String cpu) {
		super();
		this.cpu = cpu;
	}
	
	@Override
	public String toString() {
		return "PC [cpu=" + cpu + "]";
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

}
