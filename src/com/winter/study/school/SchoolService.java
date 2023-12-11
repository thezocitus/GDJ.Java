package com.winter.study.school;

import java.util.Scanner; 

public class SchoolService {

	//메서드 amkeStudent
	//학생수를 입력 받아서 수만큼 학생정보를 입력
	public Student [] makeStudents() {		
		Scanner sc = new Scanner(System.in);		
		System.out.println("학생수를 입력하시오.");
		int count =sc.nextInt();		
		
		Student [] students = new Student[count];
		
		for(int i=0 ; i<count ; i++) {
			Student student = new Student();	
			System.out.println(i+"번 학생 이름을 입력하시오");
			student.name=sc.next();
			System.out.println(i+"번 학생 번호를 입력하시오");
			student.num = sc.nextInt();
			System.out.println(i+"번 학생 점수를 입력하시오");
			student.jumsu = sc.nextInt();
			students[i] = student;
			
		}
		
		return students;
		
	}
	
}
