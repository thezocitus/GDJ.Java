package com.winter.study3.rpg;

import com.winter.study3.rpg.weapon.Axe;

public abstract class  Character {

	private String name;
	private int hp;
	private Axe axe;
	

	
	
	public abstract void attack();
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
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
