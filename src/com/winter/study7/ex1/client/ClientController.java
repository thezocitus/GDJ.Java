package com.winter.study7.ex1.client;


import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientController {	
	public void start() throws Exception {
		//1서버와 소켓 연결 시도
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		String ipadd = "";
		int numport = 0;
		System.out.println("접속할 컴퓨터의 아이피를 입력하시오");
		ipadd=sc.next();
		System.out.println("포트번호를 입력하시오");
		numport=sc.nextInt();
		Socket socket = new Socket(ipadd,numport);
		System.out.println("접속 성공");
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
				
				
		while(check) {
			System.out.println(	"1.날씨정보출력"
					+ "	2.날씨정보검샘"
					+ "	3.프로그램종료");
			int select = sc.nextInt();
			if(select ==1) {
				System.out.println("날씨정보 출력");
			}else if(select==2) {
				System.out.println("날씨정보 검색");
			}else if(select==3) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("멍멍멍");
			}
			if(select>0&&select<4) {
				bw.write(select+"\r\n");
				bw.flush();				
			}
			
			System.out.println(select);
		
		}
		
		bw.close();
		ow.close();
		socket.close();
		sc.close();
				
		
	}
	
}
