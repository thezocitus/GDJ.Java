package com.winter.study4.lang.ex1;

import java.util.Arrays;

public class WeatherService {
	
	private String datas;
	
	public WeatherService() {
		// TODO Auto-generated constructor stub
		this.datas="서울-10-비-80-부산-25-맑음-50,대구-82-눈-12,제주.25,태풍.75";
	
		

	}
	
	
	public String init() {
		System.out.println(this.datas);
		String newdatas = this.datas.replace(",","-");
		newdatas=newdatas.replace(".","-");
		
		System.out.println(newdatas);
		
		return newdatas;

	}
	
	public String[] splitt(String newdatas) {
		
		String[] temp = newdatas.split("-");
		
		System.out.println(Arrays.toString(temp));	
						
		return temp;
			
		
		
	}
	
	

}
