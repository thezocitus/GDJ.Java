package com.winter.study3.poly;

public class PolyMain {

	public static void main(String[] args) {
		
		Child1 child1 = new Child1();
		child1.num=20;
		child1.p1();
		child1.c1();
		Child2 child2 = new Child2();
		child2.num=30;
		
		//상속관계
		Parent p = child1;
		p=child2;
		System.out.println(p.num);
		
	}
	
	
}
