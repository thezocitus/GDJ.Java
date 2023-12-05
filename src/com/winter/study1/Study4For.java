package com.winter.study1;

import java.util.Scanner;

public class Study4For {

	public static void main(String[] args) {
		
		//서든 FPS
		//총알 : 30발 * 3
		
		//1.단발
		//2.점사
		Scanner sc = new Scanner(System.in);
		
		int chang = 3;
		System.out.println("단발은 = 1, 점사는 = 2");
		int bal = sc.nextInt(); 
		
		for (int i = 1 ; i <= chang ; i++) {
			for (int j = 1 ; j <=30 ; j++ ) {
				if(bal==1) {
					System.out.println("탕"+j);
				}else if(bal==2){
					j=j+2;
					System.out.println("탕탕탕"+j);
					
				}else {
					System.out.println("다시!! 단발은 = 1, 점사는 = 2");
					bal = sc.nextInt(); 
					j--;
					
				}
				
			}
			if(chang == i) {
				System.out.println("없어요");
			}else {
				System.out.println("재장전 남은 탄창"+(chang-i)+ " 단발은 = 1, 점사는 = 2");
				bal = sc.nextInt(); 
				
			}
		}

	}

}
