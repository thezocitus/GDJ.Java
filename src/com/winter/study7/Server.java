package com.winter.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public void s() throws IOException {
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("클라이언트가 접속하기를 기다리는 중");
		ServerSocket ss = new ServerSocket(8282);		
		Socket sc = ss.accept();
		System.out.println("Client 연결 성공");
		
		InputStream is =sc.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
//		System.out.println("Client : "+br.readLine());
//		
//		
//		
		OutputStream os = sc.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
//		bw.write(m+"\r\n");
//		bw.flush();
		String m = "";
		boolean check = true;
		String temp= br.readLine();
		
		while(check) {
			System.out.println("Client : "+temp);
			if(temp.toLowerCase().equals("exit")) {
				System.out.println("클라이언트 종료됨");
				check=!true;				
			}
			
//			System.out.println("보낼 메세지 입력");
			m = scan.next();
			bw.write(m+"\r\n");
			bw.flush();			
			if(m.toLowerCase().equals("exit")) {
				System.out.println("서버 프로그램이 종료됨");
				check=!true;
			}
		}
		
		
		
		br.close();
		ir.close();
		is.close();
		sc.close();
		
		if (!m.isBlank()||!temp.isBlank()) {
			bw.close();
			ow.close();
			os.close();			
		}
		
		
		
		
	}
	
}
