package com.winter.study3.himart;

public class Tv extends Product {

	private String color;

	
	public Tv() {
		this.setBrand("LG");
		this.setSize(90);
		this.setColor("red");
		this.setPrice(1000);
		this.setPoint(10);
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
