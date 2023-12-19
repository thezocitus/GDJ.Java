package com.winter.study6.ex1;

import java.util.ArrayList;

public class WeatherView {

	public void view(ArrayList<WeatherDTO> ar) {
		
		for(WeatherDTO weatherDTO:ar) {
			
			System.out.println("도시명 : "+weatherDTO.getName()+"\t 기온 : "+weatherDTO.getTemp()+"\t 습도 : "+weatherDTO.getHum()+"\t 날씨 : "+weatherDTO.getInfo());
//			System.out.println(weatherDTO.getTemp());
//			System.out.println(weatherDTO.getHum());
//			System.out.println(weatherDTO.getInfo());
//			
		}
		
	}
	
}
