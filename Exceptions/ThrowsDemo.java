package com.wipro.Java.Exceptions;

public class ThrowsDemo {

	    // Method that declares exception using 'throws'
	    void divide(int a, int b) throws ArithmeticException {
	        int result = a / b;   // may cause exception
	        System.out.println("Result: " + result);
	    }

	    public static void main(String[] args) {

	        ThrowsDemo obj = new ThrowsDemo();

	        try {
	            obj.divide(10, 0);   // calling method
	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Exception handled: " + e);
	        }
	    }
	}


