package com.wipro.Java.Exceptions;

/*2. Create a Core Java program to calculate a student’s result and handle invalid inputs using exception handling.
The program should:
Accept marks for 3 subjects
Calculate:
Total marks
Average
Display:
Pass or Fail*/

import java.util.Scanner;

class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

public class StudentResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter 3 subject marks: ");
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();

            // check valid marks
            if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100) {
                throw new InvalidMarksException("Marks must be between 0 and 100");
            }

            int total = m1 + m2 + m3;
            double avg = total / 3.0;

            System.out.println("Total: " + total);
            System.out.println("Average: " + avg);

            if (m1 >= 35 && m2 >= 35 && m3 >= 35)
                System.out.println("Result: PASS");
            else
                System.out.println("Result: FAIL");

        } 
        catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}