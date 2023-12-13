package com.winter.study3.himart;

public class Notebook extends Product {

	private String cpu;
	
	public Notebook() {
		this.setBrand("Lenovo");
		this.setSize(16);
		this.setCpu("amd");
		this.setPrice(1000);
		this.setPoint(10);
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	
	
	
}
