package com.wipro.Java.Multithreading;


public class Demo implements Runnable{

	public static void main(String[] args) {

		Demo d1 = new Demo(); // creating a thread1
		Thread obj1=new Thread(d1);
		
		obj1.setName("t1");
		obj1.start(); // starting a thread 1
		
		
		Demo d2 = new Demo(); // creating a thread2
		Thread obj2=new Thread(d2);
		
		
		obj2.setName("t2");
		obj2.start(); // starting a thread 2

	}

	void printTable(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i) + " - " +Thread.currentThread().getName());

		}
	}
	
	
	void counting()
	{
		for(int i=1;i<=10;i++)
			System.out.println(i+"- "+Thread.currentThread().getName());
	}

	public void run() // running the thread
	{
		if(Thread.currentThread().getName().equals("t1"))
			printTable(3);
	   
		else if (Thread.currentThread().getName().equalsIgnoreCase("t2"))
			counting();
		
		
	}

}
