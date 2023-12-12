package com.winter.study3.card;

public class CardMain {
public static void main(String[] args) {
	
	Card card = new Card(10,1,"Dia","red");
	Card card2 = new Card(10,1,"Heart","red");
	card.info();
	card2.info();
	
	//클래스 변수
	//클래스.변수명
	Card.size=5;
	
	card.info();
	card2.info();
	
}
	
	
}
