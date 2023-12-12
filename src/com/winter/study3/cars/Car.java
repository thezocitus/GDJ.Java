package com.winter.study3.cars;

public class Car {
	
	String company;
	String name;	
	String color;
	int price;
	Engine engine;
	
	
	public Car() {
		this(new Engine());
	
//		this.company="Kia";
//		this.name="K5";	
//		this.color="Black";
//		this.price=3000;
//		this.engine=new engine();
		
//	this.engine=new Engine();
	
	}
	public Car(Engine engine) {
		this.company="Kia";
		this.name="K5";	
		this.color="Black";
		this.price=3000;
		this.engine=engine;
	}
	
	
//	//기본생성자, 디폹 생성자, 빈생성자
//	public Car() {
//		//생성자 내에서 다른 생성자를 호출할경우
//		this("balck");	
//		
//		
////		this.company="Kia";
////		this.name="K5";
////		this.fuel="GAS";
////		this.color="Black";
////		this.price=3000;
////		this.cc=2000;
//	}
//	public Car(String c) {
//		//this()는 맨 위에 있어야함
//		this("K5", c);
//		
//		
////		this.company="Kia";
////		this.name="K5";
////		this.fuel="GAS";
////		this.color=c;
////		this.price=3000;
////		this.cc=2000;
//	}
//	public Car(String name , String color) {
//		this.company="Kia";
//		this.name=name;
//		this.fuel="GAS";
//		this.color=color;
//		this.price=3000;
//		this.cc=2000;
//	}
//	
//	
//	public void info() {
//		System.out.println("Company : "+this.company);
//		System.out.println("Name : "+this.name);
//		System.out.println("Fuel : "+this.fuel);
//		System.out.println("Coloer : " + this.color);
//		System.out.println("Price : "+this.price);
//		System.out.println("CC : "+this.cc);
//	}
}
