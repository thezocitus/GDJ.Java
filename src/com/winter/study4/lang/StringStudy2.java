package com.winter.study4.lang;

public class StringStudy2 {
	
	public static void main(String[] args) {
		String name = "wintertest";
				
		
		
		int count=0;
		int num = -1;
		while(true){
			 num = name.indexOf('t', num+1);
			if(num==-1) {
				break;
			}
			count++;
		}
		
		System.out.println(count);
		
	}
}
