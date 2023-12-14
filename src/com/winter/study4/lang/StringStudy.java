package com.winter.study4.lang;

import java.util.Scanner;

public class StringStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String name = "winter";
		String name2 = "winter";
		System.out.println(name==name2);
		System.out.println("이름입력");
		String name3=sc.next();
		System.out.println(name==name3);
		
		char ch = name.charAt(1);
		System.out.println(ch);
		
		for(int i = 0 ; i < name.length(); i++ ) {
			System.out.println(name.charAt(i));
		}
		
	}

}
