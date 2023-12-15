package com.winter.study4.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudySet {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>(); //중복데이터 허용 안함
		
		hs.add("test");
		hs.add("second");
		hs.add("third");
		hs.add("test");
		System.out.println(hs.size());
		System.out.println(hs);
		
		Iterator<String> it = hs.iterator();  
		
		while(it.hasNext()) {
			
			String v = it.next();
			System.out.println(v);
		}
		
		System.out.println(hs.iterator());
		
	}
	
}
