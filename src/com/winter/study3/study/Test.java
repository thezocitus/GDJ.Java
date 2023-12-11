package com.winter.study3.study;

public class Test {

	public void t1() {	
		System.out.println("t1 Method");
	}
	
	public void t2(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}
	
	public void t3(Human human) {
		if(human.age>19) {
			System.out.println("성인입니다.");
		}else{
			System.out.println("미성년 입니다.");
		}
		human = new Human(); 
		human.age = 500; 
	}
	
	public void t4(int [] ar) {
		for(int i = 0 ; i < ar.length ; i++ ) {
			System.out.println(ar[i]);
		}
	}
	
}


