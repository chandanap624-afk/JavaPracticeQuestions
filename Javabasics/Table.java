package com.wipro.Java.Javabasics;

import java.util.Scanner;
public class Table {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
				System.out.println("Enter a number: ");
				System.out.println("Enter table multiplication number:");
		int n=s.nextInt();
		int n1=s.nextInt();
		int fact=0;
		for(int i=1;i<=n;i++) {
			fact=i;
			System.out.println(n1 +"*" +i+"="+fact);
		}
		
	}
	
}
