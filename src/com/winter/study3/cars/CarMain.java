package com.winter.study3.cars;

public class CarMain {

	public static void main(String[] arges) {
		
//		Car car = new Car();
//	
//		System.out.println(car.engine.fuel);
//		
//		car = null; // 엔진사망
		Engine engine = new Engine();//엔진 살음
		Car car = new Car(engine);
		car=null;
	}
	
}
