package com.winter.study.school;

import java.util.Scanner;

public class Schoolmain {

	
	public static void main(String[] arges) {
		//객체생성
		//클래스명 변수명 = new 클래스명();
		//학생의 수를 입역받아서
		//학생의 정보를 입력 받기
		Scanner sc = new Scanner(System.in);
		int num=0;
		
		Student[] students = null;
			
		boolean on = true;
		
		
		while(on) {
			System.out.println("1.학생정보 입력	2.학생정보 출력");
			int select = 0;
			select = sc.nextInt();
			if(select==1) {
				System.out.println("학생수 입력");
				num = sc.nextInt();
				students = new Student[num];
				for(int i = 0; i < students.length ; i++) {
					students[i] = new Student();
					System.out.println(i+1+"학생");
					System.out.println("학생 이름입력");
					students[i].name = sc.next();
					students[i].num = i+1;
					System.out.println("학생 점수입력");
					students[i].jumsu = sc.nextDouble();
				}
				
			}else if(select==2) {
				for (int i=0;i<students.length;i++) {
					System.out.println(students[i].num +"번 학생");
					System.out.println("이름 :"+ students[i].name);
					System.out.println("점수 :"+ students[i].jumsu);
				}
			}
			
			
		}
		
	}
}

//		Student stu = new Student();
//		stu.name="winter";
//		stu.num=1;
//		stu.jumsu=3.12;
//		
//		Student stu2 = new Student();
//		stu.name="winter";
//		stu.num=1;
//		stu.jumsu=3.12;
//		
//		Student stu3 = new Student();
//		System.out.println(stu3.name);
//		System.out.println(stu3.num);
//		
//		Student [] students = new Student[2];
//		students[0]=stu;
//		students[1]=new Student();		
//		System.out.println(students[0]);
//		
//		