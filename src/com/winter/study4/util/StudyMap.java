package com.winter.study4.util;

import java.util.HashMap;

public class StudyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("k1", 1);
		map.put("k2", 2);
		System.out.println(map);
		
		Integer num = map.get("k2");
		
		System.out.println(num);
		
		
	
		
	}

}
