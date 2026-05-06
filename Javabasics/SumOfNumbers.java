package com.wipro.Java.Javabasics;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = S.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
