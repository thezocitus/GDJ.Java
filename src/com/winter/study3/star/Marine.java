package com.winter.study3.star;

public class Marine {

	// 접근지정자 [그외지정자] 데이터타입 변수명;
 	int hp = 100; 
	Gun gun;
	
	//생성자
	//접근지정자 메서드명 (클래스명과 동일하게)([매개변수선언]){}
	public Marine() {
		System.out.println("생성자");
		this.hp=200;
		this.gun = new Gun();
	}
	
	
	//이동
	public void move() {
		System.out.println("이동하세요");
	}
	//공격
	
	//멈춤
	
	//정찰
	
	
}

