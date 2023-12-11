package com.winter.study.school;

public class SchoolView {
	
	public void view(Student[] students) {
		
		
		for(int i=0; i<students.length;i++) {
			
			System.out.println("번호 : "+students[i].num+"	이름 : "+students[i].name+"	점수 : "+students[i].jumsu);
		}
		
	}

	
}
