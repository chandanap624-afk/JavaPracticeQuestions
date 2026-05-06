package com.wipro.Java.Javabasics;

public class maxelement {
	public static void main(String args[]) {
		
		int a[]= {4,3,5,6,7};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
				
		}
		System.out.println(max);
	}

}
