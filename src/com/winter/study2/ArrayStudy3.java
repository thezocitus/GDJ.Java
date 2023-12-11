package com.winter.study2;

public class ArrayStudy3 {

	public static void main(String[] args) {
		int [] ar = {2,5,4,1,3};
		
		for(int i=0;i<ar.length;i++) {
			
			for(int j=i;j<=ar.length;j++) {
			
				if(ar[i]>ar[j]) {
					int num = ar[i];
					ar[i]=ar[j];
					ar[j]=num;
//					System.out.println(ar[i]);		
				}
//				System.out.println(ar[i]);		
		}
		System.out.println(ar[i]);

	}
		System.out.println(ar);
}
}