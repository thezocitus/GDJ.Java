package com.winter.study5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudyException {

	
	public void t2() throws Exception{
		//유치원생 3살
		//0~99
		int n1 = 56;
		int n2 = 60;
		int r1 = n1+n2;
		int r2 = n1-n2;
		if(r1>99) {
			throw new MyException("그런 숫자 몰루");
		}
		
		if(r2<0) {
			throw new MyException("0보다 작은 숫자는 몰루?");
		}
		System.out.println(r1);
		System.out.println(r2);
		
	}
	
	
	public void t1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		int num  = sc.nextInt();
//		throw new InputMismatchException();
		int num2 = 9;
		
		System.out.println(num2/num);
		
		StudyException2 se2 = new StudyException2();
		se2.t2();
		
		
	}
	
}
