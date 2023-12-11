package com.winter.study.school;

import java.util.Scanner;

public class SchoolController {
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		
		SchoolService ss =null;
		SchoolView sv = null;	
		Student [] students = null;
		ss = new SchoolService();
		sv = new SchoolView();
		boolean check = true;
		
		while(check) {
			
						
			System.out.println("1.학생정보 입력	2.학생정보 출력	3.학생정보 검색	4.학생벙보 추가	5.프로그램 종료");
			
			
			int select = sc.nextInt();
			
			switch (select) {
			case 1:				
				students=ss.makeStudents();
				break;
			case 2:
				sv.view(students);
				break;

			case 3:
				
				break;

			case 4:
				
				break;
				
			default:
			
				break;
			
				
			}
			
			
		}
		
	}

}
