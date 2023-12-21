package com.winter.study7;

import java.io.IOException;

public class ServerMain {
	
	public static void main(String[] args) {
	
		try {
			new Server().s();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
