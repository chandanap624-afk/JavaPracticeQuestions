package com.wipro.Java.Javabasics;

import java.util.Scanner;
public class opeartions {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		boolean choice;
		do {
			System.out.println("enter 2 numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		
		System.out.println("Welcome to Java Calculator");
		System.out.println("1.Addition");
		System.out.println("2.Subscription");
		System.out.println("3.Multiplication");
		System.out.println("Division");
		int operation=s.nextInt();
		if(operation==1)
			System.out.println(num1+num2);
		else if(operation==2)
			System.out.println(num1-num2);
		else if(operation==3)
			System.out.println(num1*num2);
		else if(operation==4)
			System.out.println(num1/num2);
		else
			System.out.println("Invalid Choice");
		System.out.println("do you want to continue?(true/false)");
		choice=s.nextBoolean();
		}
		while(choice);
		
		
			
		}
	}


