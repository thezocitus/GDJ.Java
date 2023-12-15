package com.winter.study4.lang.ex1;

import java.util.Arrays;

public class Ex1Main {

	public static void main(String[] args) {
		
		
		
		WeatherService weatherService = new WeatherService();
		WeatherData[] weatherDatas = null;
		String newdata = weatherService.init();
		
		String[] newDatas=weatherService.splitt(newdata);
		
		weatherDatas = weatherService.com(newDatas);
		
		
		
		
		
	}

}
