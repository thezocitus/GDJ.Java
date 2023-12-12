package com.winter.study3.Members;

public class Member {

	//비만괄리 회원프로그램
	private String name;
	private double muge;
	private double ki; 
	private int age;
	
	public Member() {
	}
	
	public Member(double muge) {
		this.muge = muge;
	}
	
	//데이터입력 set+변수명
	public void setName(String name) {
		this.name=name;
	}
	public void setMuge(double muge) {
		if(muge>=0 && muge<300.0) {
		this.muge=muge;
		}else {
			this.muge=60.0;
		}
	}
	//데이터조회 get+변수명
	public String getName() {
		return this.name;
	}
	public double getMuge() {
		
		return this.muge;
	}
	

}
