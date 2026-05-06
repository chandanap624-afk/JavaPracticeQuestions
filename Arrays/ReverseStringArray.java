package com.wipro.Java.Arrays;
import java.util.Scanner;

public class ReverseStringArray {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // size
        String[] arr = new String[n];

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        // finding duplicates
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.print(arr[i] + " ");
                    break; // avoid repeating
                }
            }
        }

        sc.close();
    }
}


