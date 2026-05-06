package com.wipro.Java.Arrays;

public class SpecificElement {
	public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int target = 12;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Value found in array");
        } else {
            System.out.println("Value not found in array");
        }
    }
}


