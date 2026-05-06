package com.wipro.Java.Exceptions;

public class FinallyExample {
	    public static void main(String[] args) {

	        try {
	            int a = 10, b = 0;
	            int c = a / b;   // Exception (divide by zero)
	            System.out.println(c);
	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Exception handled");
	        } 
	        finally {
	            System.out.println("Finally block always runs");
	        }

	    }
	}


