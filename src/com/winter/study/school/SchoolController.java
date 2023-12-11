package com.winter.study.school;

import java.util.Scanner;

public class SchoolController {
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		
		SchoolService schoolService =null;
		SchoolView schoolView = null;	
		Student [] students = null;
		schoolService = new SchoolService();
		schoolView = new SchoolView();
		boolean check = true;
		
		while(check) {
			
						
			System.out.println("1.학생정보 입력	2.학생정보 출력	3.학생정보 검색	4.학생벙보 추가	5.프로그램 종료");
			
			
			int select = sc.nextInt();
			
			switch (select) {
			case 1:				
				students=schoolService.makeStudents();
				break;
			case 2:
				schoolView.view(students);
				break;

			case 3:
				Student s =	schoolService.findByNum(students);
				if(s != null) {
					schoolView.view(students);
				}else {
					System.out.println("학생이 없다");
				}
				break;

			case 4:
				students=schoolService.addstudent(students);
				break;
				
			default:
			
				break;
			
				
			}
			
			
		}
		
	}

}
