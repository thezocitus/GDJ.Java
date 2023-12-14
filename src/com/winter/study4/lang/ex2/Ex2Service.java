package com.winter.study4.lang.ex2;

import java.time.LocalDate;

public class Ex2Service {	
	
	
	public String minus(String minbun) {
		
		minbun = minbun.replace("-","");	 
				
		return minbun;
		
	}
	
	
	
	
	public void sexual(String minbun) {
		
		 char ch = minbun.charAt(6);
		 
		 
		 if(ch=='1' || ch=='3') {
			 System.out.println("남자입니다.");
		 }else if(ch=='2' || ch=='4') {
			 System.out.println("여자입니다.");
		 }
		
	}
	
	public void age(String minbun) {
		char ch = minbun.charAt(6);		
 		String byr = minbun.substring(0,2);		
		LocalDate nowyr = LocalDate.now();
		
//		System.out.println(byr);
		
		int yr = nowyr.getYear();
		int age = 0;
		int ageyr = 0;
		String a = ""; 
		if(ch=='1' || ch=='2') {			
			a = "19"+byr;			
//			ageyr=Integer.parseInt(a,10);		 
		 }else if(ch=='3' || ch=='4') {			 
			 a = "20"+byr;
//			 ageyr=Integer.parseInt(a,10);
		 }
		
		age = yr-ageyr+1; 
		
		System.out.println(age+"살 입니다.");		
	}
	
	public void sesson(String minbun) {
		
		String month = minbun.substring(2,4);
		int imonth = Integer.parseInt(month);
//		System.out.println(month);
//		System.out.println(imonth);		
		if(imonth==12 || imonth<3) {
			System.out.println("겨울생");
		}else if(imonth<2 && imonth<6) {
			System.out.println("봄생");
		}if(imonth>5 && imonth<8) {
			System.out.println("여름생");
		}if(imonth>7 && imonth<11) {
			System.out.println("가을생");
		}
	}
	public void checknum(String minbun) {
		char[] ch = minbun.toCharArray();
		String cnum ="234567892345";//12자리
		int [] temp = new int[cnum.length()];		
		int j = 0;
		int sum = 0;
		int check=Integer.parseInt(String.valueOf(ch[cnum.length()-1]));
		for(int i = 0 ; i < ch.length ; i++) {
			
			if(i!=cnum.length()) {
				temp[j] = Integer.parseInt(String.valueOf(ch[i]));
				int n = Integer.parseInt(String.valueOf(cnum.charAt(j)));
				int tempsum = temp[j]*n;
				sum = tempsum + sum;
				j++;				
			}
			
		}
		int namugi = sum % 11;
		
		namugi = 11 - namugi;		
		
		if(namugi>9) {
		
			namugi= namugi/10;			
		
		}	
		
		System.out.println(namugi==check);
	}
			
			
			
	
}
