package com.winter.study4.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	private Scanner sc;
	private StudentService studentService;
	private StudentView studentView;
	public StudentController(){
		
		this.sc  = new Scanner(System.in);
		 this.studentService = new StudentService();
	}
	
	public void start() {
		boolean check = true;
		ArrayList<StudentDTO> ar = this.studentService.init();
		studentView = new StudentView();
		
		
		while(check) {
			
			System.out.println("1. 학생정보 출려 	2.학생정보검색	3.학생정보추가  4.학생정보삭제  5.프로그램종료 6.프로그램종료");
			int select = this.sc.nextInt();
			if(select==1) {
							
			}else {
				
			}
			
		}
	}
	
	
}
