package com.winter.study1;

import java.util.Scanner;

public class Study1For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수하나를 입력하세요");
		
		int num = sc.nextInt();
		int j = 0;
//		입력받은 정수의 약수를 출력하시오
		for(int i = 1; i<=num; i++) {
			if(num%i == 0) {
				System.out.println(i);
				 j++ ;
			}
		}
		System.out.println(num+"의 약수 갯수는 총  "+j+"개 입니다.");
		
	}

}
