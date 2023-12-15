package com.winter.study4.util.ex1;

import java.util.ArrayList;

public class StudentView {

	
	public void view(String m) {
		
	}
	
	
	public void view(StudentDTO studentDTO) {
		
		
		
	}
	
	
	
	
	public void  view(ArrayList<StudentDTO> ar) {
		
//		for(int i =0 ; i < ar.size() ; i++) {
//			
//			System.out.println(ar.get(i).getName());
//			System.out.println(ar.get(i).getNum());
//			System.out.println(ar.get(i).getKuk());
//			System.out.println(ar.get(i).getEng());
//			System.out.println(ar.get(i).getMath());
//			System.out.println(ar.get(i).getTotal());
//			System.out.println(ar.get(i).getAvg());
//			
//		}
//		
		
		//향상된 for 문
		//for(모은데이터 타입명 변수명 : collection 변수명){}
		
		for(StudentDTO studentDTO:ar) {
			
			System.out.println("이름 : "+studentDTO.getName());
			System.out.println("번호 : "+studentDTO.getNum());
			
		}
		
	}
	
	
}
