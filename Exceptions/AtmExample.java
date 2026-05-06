package com.wipro.Java.Exceptions;

/*Design a simple ATM system in Core Java that performs basic banking 
  operations and uses exception handling to manage errors.*/

import java.util.Scanner;

//Custom Exception for Invalid PIN
class InvalidPinException extends Exception {
 InvalidPinException(String message) {
     super(message);
 }
}

//Custom Exception for Low Balance
class InsufficientBalanceException extends Exception {
 InsufficientBalanceException(String message) {
     super(message);
 }
}

//ATM Class
class ATM {

 double balance = 5000;
 int correctPin = 1234;

 // PIN Validation
 void validatePin(int pin) throws InvalidPinException {
     if (pin != correctPin) {
         throw new InvalidPinException("Invalid PIN!");
     } else {
         System.out.println("PIN verified successfully");
     }
 }

 // Deposit
 void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: " + amount);
     System.out.println("Balance: " + balance);
 }

 // Withdraw
 void withdraw(double amount) throws InsufficientBalanceException {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
         System.out.println("Remaining Balance: " + balance);
     } else {
         throw new InsufficientBalanceException("Insufficient Balance!");
     }
 }

 // Check Balance
 void checkBalance() {
     System.out.println("Current Balance: " + balance);
 }
}

//Main Class
public class AtmExample {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     ATM atm = new ATM();

     try {
         // Step 1: Enter PIN
         System.out.print("Enter PIN: ");
         int pin = sc.nextInt();

         atm.validatePin(pin);

         int choice;

         // Step 2: ATM Menu
         do {
             System.out.println("\n--- ATM MENU ---");
             System.out.println("1. Deposit");
             System.out.println("2. Withdraw");
             System.out.println("3. Check Balance");
             System.out.println("4. Exit");
             System.out.print("Enter choice: ");

             choice = sc.nextInt();

             try {
                 switch (choice) {

                     case 1:
                         System.out.print("Enter amount to deposit: ");
                         double dep = sc.nextDouble();
                         atm.deposit(dep);
                         break;

                     case 2:
                         System.out.print("Enter amount to withdraw: ");
                         double wit = sc.nextDouble();
                         atm.withdraw(wit);
                         break;

                     case 3:
                         atm.checkBalance();
                         break;

                     case 4:
                         System.out.println("Thank you!");
                         break;

                     default:
                         System.out.println("Invalid choice");
                 }
             } 
             catch (InsufficientBalanceException e) {
                 System.out.println(e.getMessage());
             }

         } while (choice != 4);

     } 
     catch (InvalidPinException e) {
         System.out.println(e.getMessage());
     }

     sc.close();
 }
}
