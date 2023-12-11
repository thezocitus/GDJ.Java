package com.winter.study2;

import java.util.Scanner;

public class ArrayStudy1 {

	public static void main(String[] args) {
		
		//배열
		//변수는 값을 하나를 사용
		//하나의 변수로 여러개의 값을 사용
		//한번 선언한 배열의 크기는 조정 X
		//배열 선언
		//변수 선언공식 => 데이터타입 변수명
		//모으려고 하는 데이터 타입 [] 변수명;
		
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int [] ar = new int[3];
		
		//배열의 접근(사용) => 배열의 변수명[인덱스번호]
		
		ar[0]=5;
		ar[1]=7;
		ar[2]=9;
		ar[3]=10;		
		ar[4]=9;
		
		String [] names = new String[4];
	
		
		for(int i=0;i<names.length;i++) {
			
		}
		
		
		System.out.println(num);
			
	}

}
