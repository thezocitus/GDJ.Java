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
			
			System.out.println("1. 학생정보 출려	2.학생정보검색	3.학생정보추가  4.학생정보삭제  5.프로그램종료 ");
			int select = this.sc.nextInt();
			if(select==1) {
				
				this.studentView.view(ar);
				
			}else if(select==2) {
				boolean check2 = true;
				
					
					System.out.println("검색할 학생의 이름을 입력하시오");
					String name = sc.next();
					this.studentService.findbyname(name, ar);
					
				while(check2) {
					System.out.println("1.추가 검색	2.종료");
					int sel = sc.nextInt();
					if(sel==1) {
						continue;
					}else if(sel==2) {
						check2 =! true;
					}else {
						System.out.println("멍멍멍   다시입력하세요");
					}
				}
				
			}else if(select==3) {
				ar=this.studentService.studentadd(ar);
			}else if(select==4) {
				ar=this.studentService.studentdelect(ar);
			}
			else if(select==5){
				check=!true;
			}
			
		}
	}
	
	
}
