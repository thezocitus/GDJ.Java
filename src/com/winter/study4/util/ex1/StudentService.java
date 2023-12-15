package com.winter.study4.util.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentService {

	private String info;
	
	public  StudentService() {
		// TODO Auto-generated constructor stub
		//이름 번호  국 영 수 
		this.info="winter-1-50-60-80";
		this.info=this.info+"-iu-2-85-94-74";
		this.info=this.info+"-karina-3-78-78-98";
				
	}

	
	
	public ArrayList<StudentDTO> init() {
		
		StringTokenizer st =new StringTokenizer(this.info,"-");
		
		ArrayList<StudentDTO> ar = new ArrayList<>();
		
		while(st.hasMoreElements()) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKuk(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getNum()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3);
			ar.add(studentDTO);
		}
			return ar;
		
	}
	
	//학생정보검색 findbyname
	
	//학생정보삭제 studentADD
	
	//학생정보삭제 studentdelect 이름으로 검색해서 삭제
	
	
	
	
	
	
}
