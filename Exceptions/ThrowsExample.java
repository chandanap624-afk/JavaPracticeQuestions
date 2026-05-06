package com.wipro.Java.Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ThrowsExample {
	public static void main(String[] args) {
		ThrowsExample t=new ThrowsExample();
		try {
			t.check();
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	void check() throws InterruptedException{
		Thread.sleep(2000);
	}

}



///ExampleofInterrupted Exception