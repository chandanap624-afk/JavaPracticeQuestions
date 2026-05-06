package com.wipro.Java.Javabasics;

import java.util.Scanner;
public class SimpleCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Input operator
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                if (num2 != 0)
                    System.out.println(num1 / num2);
                else
                    System.out.println("Cannot divide by zero");
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Invalid operator");
        }

        scanner.close();
    }
}

