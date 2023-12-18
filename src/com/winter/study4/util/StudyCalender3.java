package com.winter.study4.util;

import java.util.Calendar;
import java.util.UUID;

public class StudyCalender3 {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2023, 11,31);
		
		System.out.println(calendar.getTime());
		int d =calendar.get(calendar.DATE);
		d=d+3;
//		calendar.set(Calendar.DATE, d);
		calendar.add(Calendar.DATE, 3);
//		calendar.roll(Calendar.DATE, 3);
				
		System.out.println(d);
		
		
		System.out.println(calendar.getTime());	
		
		//UUID
		 String n= UUID.randomUUID().toString();
		 System.out.println(n);
		 
		 
	}
	
}
