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
			
			System.out.println("이름 : "+studentDTO.getName()
			+"\t번호 : "	+studentDTO.getNum()
			+"\t국어점수 : "+studentDTO.getKuk()
			+"\t영어점수 : "+studentDTO.getEng()
			+"\t수학점수 : "+studentDTO.getMath()
			+"\t합계 : "+studentDTO.getTotal()
			+"\t평균 : "+studentDTO.getAvg() );
			
		}
		
	}
	
	
}
