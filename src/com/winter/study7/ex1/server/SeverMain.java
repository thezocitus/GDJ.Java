package com.winter.study7.ex1.server;

import com.winter.study7.ex1.client.ClientController;

public class SeverMain {
	 
	public static void main(String[] args) throws Exception {
		ServerController serverController = new ServerController();
		serverController.start();
	}
}
