package com.wipro.Java.Arrays;

public class AverageOfElements {
	public static void main(String args[]) {
		int a[]= {4,3,2};
		int sum=0;
		int count=0;
		int average;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			count++;
			
		}
		average=sum/count;
		System.out.println("average of Elements=" +average);
		
	}


}
