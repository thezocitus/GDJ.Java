package com.winter.study6.ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import com.winter.study4.util.ex1.StudentDTO;

public class StudentDAO {
	
	
	public StudentDTO stinput(StringTokenizer st) {
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setName(st.nextToken());
		studentDTO.setNum(Integer.parseInt(st.nextToken()));
		studentDTO.setKuk(Integer.parseInt(st.nextToken()));
		studentDTO.setEng(Integer.parseInt(st.nextToken()));
		studentDTO.setMath(Integer.parseInt(st.nextToken()));
		studentDTO.setTotal(Integer.parseInt(st.nextToken()));
		studentDTO.setAvg(Double.parseDouble(st.nextToken()));
		return studentDTO;
	}
	
	
	
	

	public ArrayList<StudentDTO> getstudent() throws IOException {
		File file = new File("c:\\study\\student.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<StudentDTO> ar = new ArrayList<>();
		
		while(true) {
			String info = br.readLine();
			if(info==null) break;			
			if(!info.isEmpty() && !info.startsWith("#")) {
				StringTokenizer st = new StringTokenizer(info,"-");
				StudentDTO studentDTO =stinput(st);
				ar.add(studentDTO);						
			}
		}
		System.out.println(ar.size());
		return ar;
	}
	
}
