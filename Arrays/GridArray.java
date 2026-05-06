package com.wipro.Java.Arrays;

public class GridArray {
	    public static void main(String[] args) {

	        char[][] grid = new char[10][10];   // 10x10 array

	        // Fill the array with '-'
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	                grid[i][j] = '-';
	            }
	        }

	        // Print the array
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	                System.out.print(grid[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

}
