package com.wipro.Java.Exceptions;

import java.util.Scanner;

//Custom Exception
class InsufficientBalanceException extends Exception {
 InsufficientBalanceException(String message) {
     super(message);
 }
}

public class Main {

 public static void main(String[] args) {

     Main m = new Main();

     try {
         m.withdraw();
     } 
     catch (InsufficientBalanceException e) {
         System.out.println(e.getMessage());
     }
 }

 void withdraw() throws InsufficientBalanceException {

     Scanner s = new Scanner(System.in);

     int balance = 5000;

     System.out.print("Enter amount: ");
     int amount = s.nextInt();

     if (amount <= balance) {
         System.out.println("Withdrawal successful");
         balance = balance - amount;
         System.out.println("Remaining balance: " + balance);
     } 
     else {
         throw new InsufficientBalanceException("Insufficient balance");
     }

     s.close();
 }
}
