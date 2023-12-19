package com.winter.study6.ex1;

import java.io.IOException;
import java.util.ArrayList;

public class WeatherController {
	
	
	WeatherDAO weatherDAO = new WeatherDAO();
	WeatherView weatherView = new WeatherView();
	ArrayList<WeatherDTO> ar = new ArrayList<>();
	
	public void start() {
		try {
			ar = weatherDAO.getweather();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		weatherView.view(ar);
	}
	
	
	

	
}
