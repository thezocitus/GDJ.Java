package com.winter.study1;

import java.util.Scanner;

public class Study4For {

	public static void main(String[] args) {
		//1.로그인 처리
		// 1.로그인 2.종료
		// -id -pw
		Scanner sc = new Scanner(System.in);
		
		
		
		int level = 1;
		int manlev = 15;
		int gold = 0;
		int exp = 3;
		int k = 0;
		int select;
		int id = 1234;
		int pw = 5678;
		
		
		boolean check=true;
		while(check) {
			System.out.println("1.로그인 2.종료");
			select=sc.nextInt();
			if(select == 1) {
				System.out.println("ID 입력");
				int yId=sc.nextInt();
				System.out.println("PW 입력");
				int yPw = sc.nextInt();
				if(yId==id && yPw==pw) {
					System.out.println("로그인 성공");						
					break;
				}else {
				
				System.out.println("로그인 실패");
				
				}

				}else if(select == 2) {
					System.out.println("게임종료.");
					manlev = 0;
					check =! check;
				}else {
					System.out.println("다시입력하세요.");
				}
		}
		
		
//		int level = 1;
//		int manlev = 15;
//		int gold = 0;
//		int exp = 3;
//		int k = 0;
//		int select;
		
		for(level = 1; level <= manlev; level++) {
			
			for (int j=0 ; j<= exp ; j++) { //exp를 level*3 으로 가능
				k++;
			}
			exp = exp+3;		
				if(level%5==0) {
					System.out.println(level+"렙"+gold+"골드가 지급되었씁니다.");
					gold=gold+1000*level/5;
				}else {
				System.out.println(level+"레벨 "+gold+"골드 "+k+"킬");
				}
				while(level==manlev) {				
					System.out.println(level+"만랩 "+gold+"골드 "+k+"킬");
					System.out.println("1.사냥더 2.게임종료");
					select=sc.nextInt();
					if(select == 1) {
						manlev = manlev +15;				
					}else if(select == 2) {
						System.out.println("게임종료");		
						break;
					}else {
						System.out.println("다시입력");				
					}
				}
		}
			
			
		}

}
