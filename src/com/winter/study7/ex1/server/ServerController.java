package com.winter.study7.ex1.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerController {

	public void start() throws Exception {
		ServerDAO sd = new ServerDAO();
		
		System.out.println("클라이언트가 접속하길 기다리는 중");
		ServerSocket ss =new ServerSocket(8282);
		Socket sc = ss.accept();
		System.out.println("Client 연결 성공");
		
		InputStream is = sc.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		Boolean check = true;
		
		while(check) {
			
			File file = sd.getweathers();
			int select =Integer.parseInt(br.readLine());					
			if(select==1) {
				
				System.out.println(select);
				String list =sd.fileToString(file);
				System.out.println(list);
			}
			System.out.println(select);

			
			
		}
		
		br.close();
		ir.close();
		is.close();
		sc.close();	
		
	}
	
}
