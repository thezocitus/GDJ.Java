package com.winter.study6.ex1;

import java.io.IOException;
import java.util.ArrayList;

public class WeatherMain {

	public static void main(String[] args) {
		
		WeatherController weatherController= new WeatherController();
		try {
			weatherController.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
