package com.winter.study1;

import java.util.Scanner;

public class Study2For {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);	
	
	
		int id = 1234;
		int pw = 5678;
		boolean  check = false;
		String result = "로그인 실패";
		for (int i = 0; i<=5 ; i++) {
			System.out.println("아이디");
			int yourId = sc.nextInt();
			System.out.println("비번");
			int yourPw = sc.nextInt();
			
			if(pw == yourPw && id == yourId) {
				
				check =! check;
				System.out.println("로그린 되었습니미다.");				
				break;
			}
		}
		
	}
	
}
