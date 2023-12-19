package com.winter.study6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudyFile {
	
	public void f4() throws IOException {
		File file = new File("c:\\study\\test2.txt");
		FileReader fr = new FileReader(file); 
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String s = br.readLine();
			if(!s.isEmpty()) {
				System.out.println(s);		
				
			}
			if(s==null) {
				break;
			}
			
		}
		br.close();
		fr.close();
		//연결된 순서의 역순으로 해제
	}
	
	
	
	public void f3() throws IOException {
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\study\\test.txt");
		FileWriter fw = new FileWriter(file,true);
		boolean check = true;
		
		while(check) {
			String message=sc.next();
			if(message.toLowerCase().equals("exit")) {
				check=!true;
				break;
			}
			fw.write(message+"\n\r");		
			fw.flush();//buffer를 강제로 밀어냄 자바는 buffer가 가득 차야 내보냄		
					
			
		}
		fw.close();
		sc.close();
	
	
	}
	
	public void f2() throws Exception {
		File file = new File("c:\\study");
		
		file.list();
		
		File [] ar = file.listFiles();
		
		
		for(File s : ar) {
//			System.out.println(s.toString());
			System.out.println(s.toString()+"\t"+s.length());
		}
	}

	public void f1() throws Exception{
		File file = new File("c:\\Study\\Test.java");
		
		file =new File("c:\\Study\\test", "sub1");
		
		if(!file.exists()) {
			
			file.mkdirs(); // mkdir은 하나만
		}
		file = new File(file, "t1.txt");
		
		file.createNewFile();
		
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.length());//byte
		
		file = new File("c\\study\\test\\sub1\\t1.txt");
		
		file.delete();
		

	}
	
}
