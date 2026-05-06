package com.wipro.Java.Exceptions;

import java.util.Scanner;

//Custom Exception (must be defined)
class AgeNotValidException extends Exception {
 AgeNotValidException(String message) {
     super(message);
 }
}

public class Main2 {

 public static void main(String[] args) {

     Main2 m = new Main2();

     try {
         m.ageCheck();
     } 
     catch (AgeNotValidException e) {
         System.out.println(e.getMessage());
     }
 }

 void ageCheck() throws AgeNotValidException {

     Scanner s = new Scanner(System.in);

     int age = s.nextInt();

     if (age > 18) {
         System.out.println("age is valid");
     } 
     else {
         throw new AgeNotValidException("Age is not a valid age(valid age is 18)");
     }
 }
}


////Custom Exception Example