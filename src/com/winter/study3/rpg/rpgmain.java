package com.winter.study3.rpg;

public class RpgMain {

	public static void main(String[] arges) {
	
		Magiction magiction = new Magiction();
		magiction.level = 99;
		magiction.INT = 255;
		magiction.STR = 255;
		magiction.AGL = 255;
		
		
			
		Magiction magiction2 = new Magiction();
		magiction.info();
		System.out.println(magiction2);
		magiction2.name="iu";
		magiction2.info();
		System.out.println(magiction);
	}

	
//	String id;
//	int level;
//	int INT;
//	int STR;
//	int AGL;
//	String skill;
	
	
}
