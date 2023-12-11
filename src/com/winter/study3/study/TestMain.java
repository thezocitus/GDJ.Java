package com.winter.study3.study;

public class TestMain {

	public static void main(String [] srges) {
		
		Test test = null;
				
		test = new Test();
		
		test.t1();
		int n =10;
		test.t2(10, 20);
		System.out.println(n);
		
		Human human = new Human(); 
		
		human.age=20;
		
		test.t3(human);//i/인자갑
		
		System.out.println(human.age);
		
	}
	
}
