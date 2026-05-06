package com.wipro.Java.Arrays;

import java.util.Scanner;

public class CopyArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // size of array
        int[] arr = new int[n];
        int[] copy = new int[n];

        // taking input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // copying array using iteration
        for (int i = 0; i < n; i++) {
            copy[i] = arr[i];
        }

        // printing copied array
        for (int i = 0; i < n; i++) {
            System.out.print(copy[i] + " ");
        }

        sc.close();
    }
}
