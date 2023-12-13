package com.winter.study.ex;

import java.util.Scanner;

public class CardController extends CardMain{

	CardData[] cardDatas = null;
	CardService cardService = new CardService();
	CardView cardView = new CardView();
	public void start() {	 
		 Scanner sc = new Scanner(System.in);
		 boolean check = true;
		 
		 while(check) {
			 System.out.println("1.목록보기 2.상세보기 3.목록추가 4.목록수정 5.목록삭제 6.종료");
			 
			 
			 int select = sc.nextInt();

			 if(select==1) {
				 System.out.println("목록");	
				 cardView.listCard(cardDatas);
			 }else if(select==2) {
				 cardView.detailCard(cardDatas);
				 System.out.println("상세");	
			 }else if(select==3) {
				 System.out.println("추가");	
				 cardDatas=cardService.addCard(cardDatas);
			 }else if(select==4) {
				 System.out.println("수정");	
				 cardDatas=cardService.editCard(cardDatas);
			 }else if(select==5) {
				 System.out.println("삭제");	
				 cardDatas=cardService.deletecard(cardDatas);
			 }else if(select==6) {
				 System.out.println("종료");	
				 break;
			 }else {
				 System.out.println("멍멍멍");	
			 }
			 
			 
			 
			 
			 
//			 switch(select){
//			 
//			 case 1 :
//				 System.out.println("추가");		
//				 break;
//			 case 2 :
//				 System.out.println("수정");
//				 break;
//			 case 3 :
//				 System.out.println("삭제");
//				 break;
//			 case 4 :
//				 System.out.println("목록");
//				 break;
//			 case 5 :
//				 System.out.println("디테일");
//				 break;
//			 case 6 :
//				 System.out.println("종료");
//				 check=false;
//			 default:
//				 break;
//			 
//			 }
//			 
		 }
		
		//회사명 이름 직책 번호 이메일 주소
		
		
		
		
	}
	
}
