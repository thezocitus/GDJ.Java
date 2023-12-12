package com.winter.study3.star;

public class StarMain {
	
	public static void main(String[] args) {
		
		//클래스명의 첫글자는 재문자
		//변수명의 첫글자 소문자
		//메서드명의 첫 글자는 소문자 + ()
		
		Marine marine = new Marine();// <=메서드명 (생성자 메서드)
		
		marine.hp = 50;
		marine.move();

		Marine marine2 = new Marine();
		
		marine2 = marine;
		
		System.out.println(marine2.hp);
		
	}
	
	
	
}
