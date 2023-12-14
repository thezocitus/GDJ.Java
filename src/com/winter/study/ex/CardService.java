package com.winter.study.ex;

import java.util.Scanner;

public class CardService extends CardMain{

	Scanner sc = new Scanner(System.in);	
	
	public CardData inpuCard(){
		CardData card =new CardData();
		System.out.println("번호를 입력하세요");
		card.num=sc.nextInt();
//		System.out.println("회사명을 입력하세요");
//		card.company = sc.next();
//		System.out.println("이름을 입력하세요");
//		card.name = sc.next();
//		System.out.println("직책을 입력하세요");
//		card.position = sc.next();
//		System.out.println("전화번호을 입력하세요");
//		card.phone = sc.nextInt();
//		System.out.println("이메일을 입력하세요");
//		card.email = sc.next();
//		System.out.println("주소를 입력하세요");
//		card.address = sc.next();
		
		return card;
	}
	
	
	public CardData[] addCard(CardData[] cardDatas) {
		
		CardData [] newdatas= null;
		if(cardDatas ==null || cardDatas.length <= 0 ) {
			cardDatas=new CardData[1];
			newdatas= new CardData[cardDatas.length];
		}else {
			newdatas = new CardData [cardDatas.length+1];		
			System.out.println(newdatas.length);
		}
//		System.out.println(newdatas.length);
//		System.out.println(newdatas.length);
		for(int i = 0 ; i<cardDatas.length ; i++ ) {
			newdatas[i]=cardDatas[i];
		}
		
		System.out.println(newdatas.length);
		
		newdatas[newdatas.length-1]=inpuCard();
		
		System.out.println(newdatas.length);
		
		
		return newdatas;		
		
	}
	
	public CardData[] editCard(CardData[] cardDatas) {
		
		System.out.println("수정할 명함 번호를 입력하시오");
		int select = sc.nextInt();
			select = select-1;
//		CardData card = new CardData();
		System.out.println("수정할 항목을 입력하시오");
		System.out.println(	"1.번호  "+
							"2.회사명 "+
							"3.이름 "+
							"4.직책 "+
							"5.전화번호 "+
							"6.이메일 "+
							"7.주소 "+
							"8.전부 "+
							"9.취소");
		
		int select2 = sc.nextInt();
		switch(select2) {
		case 1 :
			System.out.println("번호를 입력하시오");
			cardDatas[select].num=sc.nextInt();
			return cardDatas;
			
		case 2 :
			System.out.println("회사명를 입력하시오");
			cardDatas[select].company=sc.next();
			return cardDatas;
			
		case 3 :
			System.out.println("회사명를 입력하시오");
			cardDatas[select].name=sc.next();
			return cardDatas;
		case 4 :
			System.out.println("직책를 입력하시오");
			cardDatas[select].position=sc.next();
			return cardDatas;
		case 5 :
			System.out.println("회사명를 입력하시오");
			cardDatas[select].phone=sc.nextInt();
			return cardDatas;
		case 6 :
			System.out.println("회사명를 입력하시오");
			cardDatas[select].email=sc.next();
			return cardDatas;
		case 7 :
			System.out.println("주소를 입력하시오");
			cardDatas[select].address=sc.next();
			return cardDatas;
		case 8 :		
			cardDatas[select]=inpuCard();
			return cardDatas;
		case 9 :
			break;
			
		default:
			System.out.println("다시 입력 하세요");
			System.out.println(	"1.번호  "+
					"2.회사명 "+
					"3.이름 "+
					"4.직책 "+
					"5.전화번호 "+
					"6.이메일 "+
					"7.주소 "+
					"8.전부 "+
					"9.취소");
		
		}
		return cardDatas;		
	}
	
	
	
	
	public CardData[] deletecard(CardData[] cardDatas) {
		
		System.out.println("제거할 카드번호를 입력하시오 + " + "	0 : 취소");
		int select = sc.nextInt();
		if(select==0 || select>=cardDatas.length) {
			if(select>=cardDatas.length) {
				System.out.println("다시입력하셈");
			}
			return cardDatas;
		}
		select= select-1;
		
		int j=0;
		CardData[] temp = new CardData[cardDatas.length-1];
		for(int i = 0; i< cardDatas.length; i++) {
			
			if(i!=select) {				
				
				temp[j]=cardDatas[i];					
				j++;
			}
			
		}
		
		return temp;
		
	}
	
}
