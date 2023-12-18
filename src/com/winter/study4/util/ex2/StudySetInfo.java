package com.winter.study4.util.ex2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class StudySetInfo {
	//로또 번호 생성
	
	//1~45 중 6개
		
	private Random random = new Random();
	

	public void ex0() {
		//배열
		int[] arlotto = new int[6];		
		
		
			
		for (int i = 0 ; i < arlotto.length ; i++ ) {
			int num = random.nextInt(45)+1;
			arlotto[i]=num;
			 for(int j=0 ; j<i ;j++) {				 
				if(arlotto[i]==arlotto[j]) {
					i--;
					break;
				}
			 }
					
				
			}
		System.out.println(Arrays.toString(arlotto)+"for");
				
		}
		
	
	
	public void ex1() {
		//ArrayList
		ArrayList<Integer> arlotto = new ArrayList<>();
		
		int count=0;		
		
		while (arlotto.size()!=6) {
			int num = random.nextInt(45)+1;			
			for(int i = 0; i<arlotto.size();i++) {				
				if(num==arlotto.get(i)) {
					arlotto.remove(i);
					count=-1;						
				}
			}
			arlotto.add(num);			
			count++;			
			
		}		
		
		for(int i = 0 ; i<arlotto.size();i++) {
			int j = i +1;
			System.out.println(arlotto.get(i)+ "  ar "+j);
		}
		
		
	}
	
	
	public void ex1sam() {
	
		ArrayList<Integer> ar = new ArrayList<>();
		
		while(ar.size()==6) {
			int num = random.nextInt(45)+1;	
			if(!ar.contains(num)) {
				ar.add(num);
			}
		}
		for(int i = 0 ; i<ar.size();i++) {
			int j = i +1;
			System.out.println(ar.get(i)+ "  ar "+j);
		}
		
	}
	
	
	public void ex2() {
		//HashSet
		HashSet<Integer> hslotto = new HashSet<>();
		
		boolean check = true;
		
		while(hslotto.size()!=6) {
			int num = random.nextInt(45)+1;
			hslotto.add(num);			
			
		}
		
		System.out.println(hslotto);
		
		int i = 1;
		Iterator<Integer> it = hslotto.iterator();
		while(it.hasNext()) {
			
			int p = it.next();
			System.out.println(p + " Hash"+i);
			i++;
		}
	}
	
}


	
