package com.winter.study4.lang.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		
		
		
		WeatherService weatherService = new WeatherService();
		
		String newdatas = weatherService.init();
		
		String[] newDatas=weatherService.splitt(newdatas);
		
		
		System.out.println(newDatas);
		
	}

}
