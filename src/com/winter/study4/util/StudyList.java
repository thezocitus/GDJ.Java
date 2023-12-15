package com.winter.study4.util;

import java.util.ArrayList;

public class StudyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열과 비슷
		//선어시 따로 샛수를 선언하지 않음
				
		ArrayList ar = new ArrayList();//생성자. constructor;
		//add
		//Arraylist는 reference type 변수만 입력가능
		ar.add("first");// 다형성 poly~~?
		ar.add("second");
		ar.add(3); // int -> Integer 로 오토 박싱
		ar.add('a');
		
		System.out.println(ar.size()+"사이즈");
		//삽입
		ar.add(1, 4);
		ar.set(0, 1);//수정 override;;
		
		//
		ar.remove(1);//삭제
		
		ar.remove("second");//앞쪽 하나만
		
		ar.clear();
		
		for(int i = 0 ; i < ar.size() ; i++) {
			//하나씩 꺼내기 get
			System.out.println(ar.get(i));
			
		}
		
	}

}
