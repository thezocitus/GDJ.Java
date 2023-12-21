package com.winter.study7.ex1.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import com.winter.study6.ex1.WeatherDTO;

public class ServerDAO {
	//getWeathers
	

		
	
	public  File getweathers() throws Exception {
		
		File file =new File("c:\\study\\weather");
		String[] files = file.list();
		long temp =0;
		for(int i = 0; i<files.length;i++) {
			String filename = files[i].substring(0, files[i].length()-4);//lastIndexof(".")뒤에서부터 "."까지 날려라
			long fm=Long.parseLong(filename);
//			System.out.println(fm);
			if(temp<fm) {
				temp=fm;
			}			
		}				
		file=new File(file,temp+".txt");
		
				
		return file;
	}
	
	public String fileToString(File file) throws Exception {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);		
		String temp = "";
		Boolean check = true;
		while(check) {
			String info = br.readLine();
			if(info == null) break;
				
			if(!info.isEmpty() && !info.startsWith("#")) {
				
				temp = temp.concat("-"+info);
			}
			
			
		}
		return temp;
	}
	
	
	
	
	
	
	
}
