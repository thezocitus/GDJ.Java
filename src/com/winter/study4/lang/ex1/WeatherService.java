package com.winter.study4.lang.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

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
	
	public WeatherData[] com(String[] newdatas) {

		System.out.println(newdatas[0]);
//		WeatherData[] temp = new WeatherData[newdatas.length/4];
		
		WeatherData wd = new WeatherData();		
		ArrayList<WeatherData> temp = new ArrayList<>();
		
		int j=0;
		while() {
			
		}
		
		
//		for(int i = 0; i<newdatas.length; i=i+4) {
//			System.out.println(newdatas[i]+" 1");
//			wd.setCity(newdatas[i]);
//			System.out.println(newdatas[0]);
//			wd.setGion(newdatas[i+1]);
//			wd.setInfo(newdatas[i+2]);
//			wd.setHum(newdatas[i+3]);
//			 temp[j]=wd;
//			
//			j++;
//			
//			
//		}
//		return temp;
		
	}
	
	

}
