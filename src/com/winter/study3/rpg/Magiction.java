package com.winter.study3.rpg;

public class Magiction extends Character {

	
	private int mp;
	

		public void info() {		
			
			super.superInfo("mbub", 50);
			System.out.println(this.getName());
			System.out.println(this.mp);
	

	}

	public void attack(){
		
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	
	
	public void t1() {
		System.out.println("test메서드 입니다."); 
		this.info();
	}
}
