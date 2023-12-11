package com.winter.study.school;

import java.util.Scanner; 

public class SchoolService {

	//addstudent
	//이름, 번호, 점수를 입력받아 기존배열에 추가.
	//findByNum
	//학생번호를 입력받아, 일치하는 학생을 검색
	//해당학생을 리턴 없으면 null
	public Student[] addstudent(Student[] students) {
		Scanner sc = new Scanner(System.in);
		int num = students.length+1;
		Student [] temp = new Student[num];		
		for(int i = 0 ; i<num;i++) {
			
			if(i<students.length){				
				temp[i]=students[i];
			}else if(i>=students.length) {
				
				Student student = new Student();	
				System.out.println(i+1+"번 학생 이름을 입력하시오");
				student.name=sc.next();
				System.out.println(i+1+"번 학생 번호를 입력하시오");
				student.num = sc.nextInt();
				System.out.println(i+1+"번 학생 점수를 입력하시오");
				student.jumsu = sc.nextInt();
				temp[i] = student;
				
			}
						
		}		
		
		return temp	;
	}
	
	
	public Student findByNum(Student[] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 학생 번호를 입력하시오");
		int num = sc.nextInt();	
		Student student = null;		
		for (int i=0 ; i<students.length;i++) {
			
			if(students[i].num==num) {
				student = students[i] ;
			}else {
				return null;
			}
			
		}
		return student;
		
	}
	
	
	
	
	//메서드 amkeStudent
	//학생수를 입력 받아서 수만큼 학생정보를 입력
	public Student [] makeStudents() {		
		Scanner sc = new Scanner(System.in);		
		System.out.println("학생수를 입력하시오.");
		int count =sc.nextInt();		
		
		Student [] students = new Student[count];
		
		for(int i=0 ; i<count ; i++) {
			Student student = new Student();	
			System.out.println(i+1+"번 학생 이름을 입력하시오");
			student.name=sc.next();
			System.out.println(i+1+"번 학생 번호를 입력하시오");
			student.num = sc.nextInt();
			System.out.println(i+1+"번 학생 점수를 입력하시오");
			student.jumsu = sc.nextInt();
			students[i] = student;
			
		}
		
		return students;
		
	}
	
}
