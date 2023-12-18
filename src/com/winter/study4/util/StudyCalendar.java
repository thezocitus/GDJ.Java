package com.winter.study4.util;

import java.util.Calendar;

public class StudyCalendar {
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar);
		
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		System.out.println(year);
		System.out.println(month);
		
		calendar.set(Calendar.YEAR, 2200);
		calendar.set(calendar.MONDAY, 0);
		System.out.println(calendar.getTime());
	}
}
