package com.winter.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class Client {
	
	
	public void send() throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.165", 8282 );//local host
		
		System.out.println("서버와 접속 성공");
		
		System.out.println("서버로 보낼 메세지 입력");
//		String m = sc.next();
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow =new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
//		bw.write(m+"\r\n");
//		bw.flush();
		
		InputStream is =socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
//		System.out.println("Server : "+br.readLine());
		boolean check = true;
		String m ="";
		String temp= br.readLine();
		while(check) {
			m = sc.next();
			if( m.toLowerCase().equals("exit")) {
				System.out.println("클라이언트 종료");
				check=!true;
			
			}
			bw.write(m+"\r\n");
			bw.flush();
			if(temp.toLowerCase().equals("exit")) {
				System.out.println("서버 프로그램이 종료됨");
				check=!true;
			}
			System.out.println("Server : "+temp);
		
		}
		
		bw.close();
		ow.close();
		os.close();
		socket.close();
		sc.close();
		if (!m.isBlank()||!temp.isBlank()) {
			br.close();
			ir.close();
			is.close();
			sc.close();			
		}
		
	}
	
	
}
