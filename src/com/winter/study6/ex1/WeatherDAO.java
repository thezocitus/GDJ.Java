package com.winter.study6.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;



public class WeatherDAO {
	private static int count;
	
	static {//초기화 블럭
		WeatherDAO.count=0;
	}
	
	// DAO : Data Access Object
	
	//getWeathers 
	
	public WeatherDTO input(StringTokenizer st) {
		WeatherDTO temp = new WeatherDTO();
		temp.setCity(st.nextToken());
		temp.setGion(Integer.parseInt(st.nextToken()));
		temp.setInfo(st.nextToken());
		temp.setHum(Integer.parseInt(st.nextToken()));
//		System.out.println(temp.getName()+temp.getTemp()+temp.getHum()+temp.getInfo());
		return temp;
		
	}
	
	public long listFile(File file) {//걍  Arrays.sort를 쓰셈 //// List<string> a = Arays.aslist(test);
				
		String[] files = file.list();
		long temp = 0;
//		System.out.println(Arrays.toString(files));
		for(int i = 0; i<files.length;i++) {
			String filename = files[i].substring(0, files[i].length()-4);//lastIndexof(".")뒤에서부터 "."까지 날려라
			long fm=Long.parseLong(filename);
//			System.out.println(fm);
			if(temp<fm) {
				temp=fm;
			}			
		}
		return temp;
	}
	
	
	public ArrayList<WeatherDTO> getWeather() throws IOException {
		
		
		File file =new File("c:\\study\\weather");
		file=new File(file,listFile(file)+".txt");
		
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
	//검색
		public WeatherDTO getDetail(List<WeatherDTO> ar, Scanner sc) {
			System.out.println("도시명 입력");
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(sc.next());
			for(WeatherDTO w:ar) {
				if(w.getCity().equals(weatherDTO.getCity())) {
					return w;
					
				}
			}
			return null;
		}
		
		//추가
		public boolean add(List<WeatherDTO> ar, Scanner sc) {
			WeatherDTO weatherDTO = new WeatherDTO();
			System.out.println("도시명입력");
			weatherDTO.setCity(sc.next());
			System.out.println("기온 입력");
			weatherDTO.setGion(sc.nextInt());
			System.out.println("정보 입력");
			weatherDTO.setInfo(sc.next());
			System.out.println("습도 입력");
			weatherDTO.setHum(sc.nextInt());
			return ar.add(weatherDTO);
		}
		
		//삭제
		public boolean delete(List<WeatherDTO> ar, Scanner sc) {
			boolean result = false;
			System.out.println("도시명 입력");
			String city = sc.next();
			for(WeatherDTO weatherDTO:ar) {
				if(weatherDTO.getCity().equals(city)) {
					result = ar.remove(weatherDTO);
					break;
				}
			}
			return result;
			
		}
		
		//저장
		public void save(List<WeatherDTO> ar) throws IOException {
			WeatherDAO.count++;
			Calendar cal = Calendar.getInstance();
//			SimpleDateFormat sim = new SimpleDateFormat("yyyyMMdd");	
//			String filename = sim.format(cal.getTime());
//			filename = filename+WeatherDAO.count;
			
			long fileName = cal.getTimeInMillis();
			File file =new File("c:\\Study\\weather");	
			file = new File(file,fileName+".txt");
			FileWriter fw = new FileWriter(file,true);

			for(WeatherDTO weatherDTO:ar) {
				
				fw.write(weatherDTO.getCity()+"-"+weatherDTO.getGion()
				+"-"+weatherDTO.getInfo()+"-"+weatherDTO.getHum()+"\r");				
				fw.flush();
			}
			
			
			
			fw.close();
//			sc.close();
			//1. 파일에 작성
			//파일명은 save.txt
			//##날씨정보
			//도시명-기온-정보-습도
			//도시명-기온-정보-습도
			
		}
}
