package com.winter.study3.rpg;

public class Character {

	private String name;
	private int hp;
	
	
	public void attack() {
		System.out.println("마법공격");
	}
	
	
	public void superInfo(String name, int hp) {
		
		System.out.println("Name :"+this.getName());
		System.out.println("hp :"+this.getHp());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	
}
