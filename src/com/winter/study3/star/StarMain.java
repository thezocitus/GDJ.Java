package com.winter.study3.star;

public class StarMain {
	
	public static void main(String[] args) {
		
		Marine marine = new Marine();
		
		marine.hp = 50;
		marine.move();

		Marine marine2 = new Marine();
		
		marine2 = marine;
		
		System.out.println(marine2.hp);
		
	}
	
	
	
}
