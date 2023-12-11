package com.winter.study3.rpg;

public class Magiction {

	String name;
	int hp;
	int mp;
	int level;
	int INT;
	int STR;
	int AGL;
	String skill;

	public void info() {
		String localName="abc";
//		String name = "abc";
		System.out.println("Name :"+name);
		System.out.println("hp :"+this.hp);
		System.out.println(this);
		this.t1();
//		t1();
	}
	
	public void t1() {
		System.out.println("test메서드 입니다."); 
		this.info();
	}
}
