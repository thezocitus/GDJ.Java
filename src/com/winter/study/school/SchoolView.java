package com.winter.study.school;

public class SchoolView {
	
	public void view(Student student) {
		
		System.out.println("번호 : "+student.num+
				"	이름 : "+student.name+
				"	점수 : "+student.jumsu);
		
	}
	public void view(Student[] students) {
		
		
		for(int i=0; i<students.length;i++) {
		
			this.view(students[i]);
//			System.out.println("번호 : "+students[i].num+1+"	이름 : "+students[i].name+"	점수 : "+students[i].jumsu);
		}
		
	}
	
}
