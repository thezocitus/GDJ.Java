package com.winter.study1;

import java.util.Scanner;

public class Study3For {

	public static void main(String[] args) {
		
//		//구구단
//		for (int i=2 ; i <10 ; i++) {
//			for(int j=1; j <10 ; j++) {
//				 System.out.println(i+"*"+j+" = "+i*j);
//			}
//		}
//		
	Scanner sc = new Scanner(System.in);
	//
	// 시계
	// 내가 입력한 시간에 종료
	//분 초 를 입역 
//	System.out.println("분을 입력");
//	int min = sc.nextInt();
//	System.out.println("초을 입력");
//	int sec = sc.nextInt();
//	
//	for (int i=0 ; i<=min ; i++) {
//		
//		if(i==min){
//			
//			for(int j = 0; j<=sec ; j++) {
//				System.out.println(i+"분"+j+"초");
//			}
//		}else {
//			for(int j = 0; j<=59 ; j++) {
//				System.out.println(i+"분"+j+"초");
//			}
//		}
//	}
	int min = 1;
	int sec = 5;
	
	//반복문을 종료 하는 방법
	//break를 만났을때
	//조건이 false일때
	boolean flag=false;
	for(int m=0; m<60 ; m++ ) {
		for(int s=0; s<60 ; s++) {
			System.out.println(m+"분"+s+"초");
			if(min==m && sec==s) {
				flag=!flag;
				break;
			}
		}
		if(flag) {
			break;
			}
		}
	
	}
		

}
