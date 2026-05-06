package com.wipro.Java.Arrays;

public class SortArrays {
	    public static void main(String[] args) {

	        // Numeric array
	        int[] numbers = {5, 2, 9, 1, 7};

	        // String array
	        String[] names = {"Ravi", "Amit", "Sita", "Neha"};

	        // 🔹 Sorting numeric array
	        for (int i = 0; i < numbers.length - 1; i++) {
	            for (int j = 0; j < numbers.length - 1 - i; j++) {

	                if (numbers[j] > numbers[j + 1]) {
	                    // swap
	                    int temp = numbers[j];
	                    numbers[j] = numbers[j + 1];
	                    numbers[j + 1] = temp;
	                }
	            }
	        }

	        // 🔹 Sorting string array (alphabetical)
	        for (int i = 0; i < names.length - 1; i++) {
	            for (int j = 0; j < names.length - 1 - i; j++) {

	                if (names[j].compareTo(names[j + 1]) > 0) {
	                    // swap
	                    String temp = names[j];
	                    names[j] = names[j + 1];
	                    names[j + 1] = temp;
	                }
	            }
	        }

	        // 🔹 Print numeric array
	        System.out.println("Sorted Numeric Array:");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }

	        // 🔹 Print string array
	        System.out.println("\n\nSorted String Array:");
	        for (String name : names) {
	            System.out.print(name + " ");
	        }
	    }
	}


