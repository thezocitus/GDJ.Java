package com.winter.study4.lang.ex2;

import java.util.Scanner;

public class Ex2Controller {
	
	
	public void start(){
		Scanner sc = new Scanner(System.in);
		Ex2Data ex2Data = new Ex2Data();		
		Ex2Service ex2Service = new Ex2Service();		
		System.out.println("주민번호 입력");
		ex2Data.minbun = sc.next();		
		String minbun = ex2Service.minus(ex2Data.minbun);
		

		
		boolean check = true;
		
		while (check) {
			System.out.println("1.성별확인  2.나이  3.태어난 계절  4.주민번호 타당성확인 5.종료" );
			int select=sc.nextInt();
			
			switch (select) {
			case 1:
				System.out.println("성별");
				ex2Service.sexual(minbun);
				break;
			case 2:
				System.out.println("나이");
				ex2Service.age(minbun);
				break;
			case 3:
				System.out.println("계절");
				ex2Service.sesson(minbun);
				break;
			case 4:
				System.out.println("주민번호 타당성");
				ex2Service.checknum(minbun);
				break;
			case 5:
				System.out.println("종료");
				break;	

			default:
				System.out.println("멍멍멍");
			}
			
			
			
		}
		
		
		
//		System.out.println("1.성별확인  2.나이  3.태어난 계절  4.주민번호 타당성확인" );
//		int select=sc.nextInt();
//		
//		ex2Service.sexual(minbun);
//		ex2Service.age(minbun);
//		ex2Service.sesson(minbun);
//		ex2Service.checknum(minbun);
		
		
	}
	
	

}
