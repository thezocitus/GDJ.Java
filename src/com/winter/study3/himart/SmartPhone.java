package com.winter.study3.himart;

public class SmartPhone extends Product {

	private int pixel;
	private String model;
	
	
	public SmartPhone(){
		this.setBrand("Samsung");
		this.setSize(6);
		this.setPixel(1000);
		this.setModel("s23");
		this.setPrice(1000);
		this.setPoint(10);
		
	}
	
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
}
