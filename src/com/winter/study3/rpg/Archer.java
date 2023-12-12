package com.winter.study3.rpg;

public class Archer extends Character{
	
	public Archer() {
		
	}

	//메서드 오버로딩 -> new
	//메서드 오버라이딩 -> 수정
	//상속받은 메서드를 자기자긴에 맞게 내용을 재 저의 하는것
	//메서 선언부는 종일하게,ㅡ 내용만 변경
	
	public void attack() {
		System.out.println("화살쏘기");
	}
}
