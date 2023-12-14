package com.winter.study3.himart;

public class Customer extends HimartMain {

	private int money;
	private int point;
	
	public Customer() {
		this.money=2000;
		this.point=10;
	}
	
	public void buy(Product p) {
		
		this.money=this.money-p.getPrice();
		this.point=this.point+p.getPoint();
		
		System.out.println("Money : " + this.money);
		System.out.println("Point : " + this.point);

	}
}
