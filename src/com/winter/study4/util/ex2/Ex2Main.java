package com.winter.study4.util.ex2;

import java.util.Random;

public class Ex2Main {

	public static void main(String[] args) {
		Random random = new Random();
		
		int num = random.nextInt(10);		
		System.out.println(num);
		
		new StudySetInfo().ex2();
		
		new StudySetInfo().ex1();
		
		new StudySetInfo().ex0();
		
		
		
	}
	
}
