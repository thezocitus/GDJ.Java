package com.winter.study7.ex1.client;

public class ClientMain {
	
	public static void main(String[] args) {
		ClientController cc = new ClientController();

		try {
			cc.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
