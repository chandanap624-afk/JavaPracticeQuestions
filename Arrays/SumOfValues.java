package com.wipro.Java.Arrays;

public class SumOfValues {
	public static void main(String args[]) {
		int a[]= {4,3,2};
		int sum=0;
	
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			
			
		}
	
		System.out.println("sum of values=" +sum);
		
	}
}
