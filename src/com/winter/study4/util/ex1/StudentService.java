package com.winter.study4.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.net.ssl.SSLContext;

import com.winter.study.school.Student;

public class StudentService {

	private String info;
	Scanner sc = new Scanner(System.in);
	
	
	public  StudentService() {
		// TODO Auto-generated constructor stub
		//이름 번호  국 영 수 
		this.info="winter-1-50-60-80";
		this.info=this.info+"-iu-2-85-94-74";
		this.info=this.info+"-karina-3-78-78-98";
//		this.info=this.info+"-itz-4-80-90-60";
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
	
	public void findbyname(String name, ArrayList<StudentDTO>  studentsar) {
		
		for(int i = 0 ; i<studentsar.size();i++) {
//			System.out.println(ar.get(i).getName());
			
			if(studentsar.get(i).getName().equals(name)) { //equals는 데이터 값을 비교(힙안의 데ㅇ커끼리 비교, == 주소값만 비교 
//			System.out.println(ar.get(i).getName()+"in if");
			StudentDTO studentDTO = new StudentDTO();
			studentDTO = studentsar.get(i);
				System.out.println("이름 : "+studentDTO.getName()+"	번호 : "+studentDTO.getNum()+
						"	국어점수 : "+studentDTO.getKuk()+"		영어점수 : "+studentDTO.getEng()+
						"	수학점수 : "+studentDTO.getMath()+"	총점 : "+studentDTO.getMath()+
						"	평균 : "+studentDTO.getAvg());	
//				System.out.println(ar.get(i)+"in if");
				break;
				
			}
			
		}
	}	
	
	//학생정보추가 studentADD
	
	public ArrayList<StudentDTO> studentadd(ArrayList<StudentDTO> ar) {
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("학생정보를 입력하시오");
		System.out.println("이름");
		String name = sc.next();
		System.out.println("번호를 입력하시오");		
		
		int num = 0;
		boolean check = true;
		int j = 0;
		while(check) {
			num = sc.nextInt();	
			for(int i = 0  ; i < ar.size(); i++) {
				if(ar.get(i).getNum()==(num)) {
					System.out.println("이미 사용중인 번호입니다. 다시 입력하세요");
					j++;
					break;
				}else if(ar.get(i).getNum()!=(num) && i==ar.size()-1) {
					System.out.println(i);
					check=false;
				}else if(j==2) {
					System.out.println("확인하고 오셈");
					return ar;
				}
			}
		}	
		
		System.out.println("국여점수를 입력하시오");
		String kuk = sc.next();
		System.out.println("영어점수를 입력하시오");
		String eng = sc.next();
		System.out.println("수학점수를 입력하시오");
		String math = sc.next();
		String temp = name+"-"+Integer.toString(num)+"-"+kuk+"-"+eng+"-"+math;
		
		StringTokenizer st =new StringTokenizer(temp,"-");		
		
		while(st.hasMoreElements()) {			
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKuk(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getNum()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3);
		}
			ar.add(studentDTO);
			return ar;	
		
	}
	
	
	
	
	
	//학생정보삭제 studentdelect 이름으로 검색해서 삭제
	
	public ArrayList<StudentDTO> studentdelect(ArrayList<StudentDTO> ar) {
		//학생 이름을 입력받아
		// 찾아서 해당 학생 제거
		System.out.println("삭제할 학생의 이름을 입력하시오");
		String inputName = sc.next();
		for(int i=0 ; i < ar.size(); i++) {
			
			if(ar.get(i).getName().equals(inputName)==true) {
				ar.remove(i);
				System.out.println(inputName+"	학생정보를 삭제하였습니다.");
				break;
			}else if(ar.get(i).getName().equals(inputName)==false && i==ar.size()-1) {
				System.out.println(inputName+"	해당학생은 없습니다.");
			}
		}
		return ar;
		
	}
	
	
	
	
}
