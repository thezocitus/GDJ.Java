package com.winter.study6.ex1;

import java.util.ArrayList;
import java.util.List;

public class WeatherView {

//	public void view(List<WeatherDTO> ar) {
//		
//		for(WeatherDTO weatherDTO:ar) {
//			
////			System.out.println("도시명 : "+weatherDTO.getName()+"\t 기온 : "+weatherDTO.getTemp()+"\t 습도 : "+weatherDTO.getHum()+"\t 날씨 : "+weatherDTO.getInfo());
////			System.out.println(weatherDTO.getTemp());
////			System.out.println(weatherDTO.getHum());
////			System.out.println(weatherDTO.getInfo());
////			
//		}
//		
//			
//		
//	}
	public void view(WeatherDTO weatherDTO) {
		if(weatherDTO == null) {
			System.out.println("못찾았다");
			return;
		}
		
		System.out.println("도시명\t기온\t날씨\t습도");
		System.out.print(weatherDTO.getCity()+"\t");
		System.out.print(weatherDTO.getGion()+"\t");
		System.out.print(weatherDTO.getInfo()+"\t");
		System.out.println(weatherDTO.getHum()+"%");
		System.out.println("========================");
	}
	
	public void view(List<WeatherDTO> ar) {
		System.out.println("도시명\t기온\t날씨\t습도");
		for(WeatherDTO weatherDTO:ar) {
			System.out.print(weatherDTO.getCity()+"\t");
			System.out.print(weatherDTO.getGion()+"\t");
			System.out.print(weatherDTO.getInfo()+"\t");
			System.out.println(weatherDTO.getHum()+"%");
			System.out.println("========================");
			
		}
		
	}
	
}
