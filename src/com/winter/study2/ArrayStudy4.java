package com.winter.study2;

import java.util.Scanner;

public class ArrayStudy4 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//1.학생수 입력
		//2.학생정보 출력
		//3.학생정보 검색
		//4.학점순으로 정렬
		//5. 종료\
		
		
		boolean on = true; 
		
		int num=0;
		int [] st_num = null;
		String [] st_name = null;
		String [] st_scor = null;
		while(on){
			System.out.println("1.학생 수 입력	2.학생정보 입력	3.학생정보 검색	4.학점순으로 정렬	5.종료");
			int select = sc.nextInt();
			
			if(select==1) {
				boolean on1 = true;
				while(on1==true) {
				System.out.println("학생 수 입력 :");
				num = sc.nextInt();
				st_num = new int[num];
				st_name = new String[num];
				st_scor = new String[num];
				System.out.println("학생정보 입력");
				String data = "";
					
					for(int j = 0; j<num ;j++) {
						System.out.println(j+1+"번 학생이름를 입력하세요 "+j);				
						data = sc.next();
						st_name[j] = data;
						System.out.println(j+1+"번 학생학점을 입력하세요 "+j);				
						data = sc.next();
						st_scor[j] = data;
						
					}
					for(int i = 0; i<num;i++) {
						System.out.println(i+1+"번 "+st_name[i]+" 점수"+st_scor[i]);
					}
					
					System.out.println("1.다시입력  2.종료");
					int n =sc.nextInt();
					for(int i=0;i<5;i++) {
						
						if(n==1) {							
							break;
						}else if(n==2) {
							on1=!on1;						
						}else {
							System.out.println("다시 입력 하세요 1.다시입력  2.종료");
							n=sc.nextInt();
						}
					}
				}
			}
			else if(select==2) {
				System.out.println("학생정보 출력" + num);
				boolean on1 = true;
				while(on1) {
					for(int i = 0; i<num;i++) {
						System.out.println(i+1+"번 "+st_name[i]+" 점수"+st_scor[i]);
					}
					
					System.out.println("1.다시출력  2.종료");
					int n =sc.nextInt();
					for(int i=0;i<5;i++) {
						
						if(n==1) {							
							break;
						}else if(n==2) {
							on1=!on1;						
						}else {
							System.out.println("다시 입력 하세요 1.다시 출력  2.종료");
							n=sc.nextInt();
						}
					}
				}
			}else if(select==3) {
				System.out.println("학생정보 검색");//번호로 검색
				System.out.println("학생정보 입력");
				
				
			}else if(select==4) {
				System.out.println("학점순으로 정렬");
			}else if(select==5) {
				System.out.println("종료");
				on =! on;
			}else {
				System.out.println("다시입력하세요");
			}
			
		}
		
		
	}
}
		
//		int select = 0;
//		int a = 0;
//		int num = 0 ;
//		String [] st_num = null;
//		String [] st_name = null;
//		String [] st_scor = null;
//		String data = "0";
//		while(select==0){
//
//			System.out.println("학생수를 입력하세요");
//			num=sc.nextInt();			
//			st_num = new String[num];
//			st_name = new String[num];
//			st_scor = new String[num];
//			
//			System.out.println("메뉴를 고르세요 2.학생자료 입력 3.학생정보 출력 .4학생정보검색");
//			a=sc.nextInt();	
//			
//			if(a==2) {//학생 자료 입력
//				boolean on = true; 
//				
//				while(on==false) {
//					
//					for(int j = 0; j<num ;j++) {
//						System.out.println(j+1+"번 학생이름를 입력하세요 "+j);				
//						data = sc.next();
//						st_name[j] = data;
//						System.out.println(j+1+"번 학생학점을 입력하세요 "+j);				
//						data = sc.next();
//						st_scor[j] = data;
//						
//					}
//					for(int i = 0; i<num;i++) {
//						System.out.println(i+1+"번 "+st_name[i]+" 점수"+st_scor[i]);
//					}
//					
//					System.out.println("1.다시입력  2.종료");
//					int n =sc.nextInt();
//					for(int i=0;i<5;i++) {
//						
//						if(n==1) {							
//							break;
//						}else if(n==2) {
//							on=!on;						
//						}else {
//							System.out.println("다시 입력 하세요 1.다시입력  2.종료");
//							n=sc.nextInt();
//						}
//					}
//				}
//			}
//			
//		}
//	}
//	
//}
