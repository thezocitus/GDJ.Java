package com.winter.study6.ex1;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class WeatherDAO {
	// DAO : Data Access Object
	
	//getWeathers 
	
	public WeatherDTO input(StringTokenizer st) {
		WeatherDTO temp = new WeatherDTO();
		temp.setName(st.nextToken());
		temp.setTemp(Integer.parseInt(st.nextToken()));
		temp.setHum(Integer.parseInt(st.nextToken()));
		temp.setInfo(st.nextToken());
//		System.out.println(temp.getName()+temp.getTemp()+temp.getHum()+temp.getInfo());
		return temp;
		
	}
	
	public ArrayList<WeatherDTO> getweather() throws IOException {
		File file =new File("c:\\study\\weather.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<WeatherDTO> ar = new ArrayList<>();
		Boolean check = true;
		
		
		while(true) {
			String info = br.readLine();
//			System.out.println(info);
			if(info == null) break;
				
			if(!info.isEmpty() && !info.startsWith("#")) {
				
				StringTokenizer st = new StringTokenizer(info,"-");
				WeatherDTO weatherDTO = input(st);
				ar.add(weatherDTO);
			}
			
		}
		br.close();
		fr.close();
		return ar;
		
	}
	
	
	//file에서 내용을 읽어오는 역활
	
	//1.파일의 내용을 한줄씩 읽어 오기
	//2.한줄의 내용을 파싱
	//3.파싱한 토큰을 DTO를 생성하고 맴버변수에 대입;
	//4.DTO를 list에 추가하는 작업
	//5.list 리턴
	
	
}
