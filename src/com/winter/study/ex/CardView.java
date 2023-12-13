package com.winter.study.ex;

import java.util.Scanner;

public class CardView {		
	Scanner sc = new Scanner(System.in);
	
	public void listCard(CardData[] cardDatas) {
		
		if(cardDatas==null) {
			System.out.println("명함을 추가하십시오.");
			
		}else {
			
			for(int i=0 ; i <cardDatas.length; i++) {
				
				System.out.println(
						"번호 : "+  cardDatas[i].num+
						"	회사명 : "+ cardDatas[i].company+
						"	이름 : "+ cardDatas[i].name
//							"	직책 : "+ cardDatas[i].position+
//							"	전화번호 : "+ cardDatas[i].phone+
//							"	이메일 : "+ cardDatas[i].email+
//							"	주소 : "+cardDatas[i].address					
						);					
				
			}
		}
		
		}		
		
		public void detailCard(CardData[] cardDatas) {
			
			System.out.println("번호를 입력하시오");
			int num=sc.nextInt();
				num=num-1;
			
			System.out.println(
					"번호 : "+  cardDatas[num].num+
					"	회사명 : "+ cardDatas[num].company+
					"	이름 : "+ cardDatas[num].name+
					"	직책 : "+ cardDatas[num].position+
					"	전화번호 : "+ cardDatas[num].phone+
					"	이메일 : "+ cardDatas[num].email+
					"	주소 : "+cardDatas[num].address					
					);					
			
			
			
			
		}

}
