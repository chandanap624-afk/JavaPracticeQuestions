package com.wipro.Java.Javabasics;

public class CountEvenArray {
	    public static void main(String[] args) {

	        int arr[] = {1, 2, 3, 4, 5, 6};

	        int count = 0;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] % 2 == 0) {   
	                count++;
	            }
	        }

	        System.out.println("Count of even numbers: " + count);
	    }
	}


