package com.wipro.Java.Multithreading;

public class ThreadDemo extends Thread{

		public static void main(String[] args) {
			
			
			ThreadDemo d1=new ThreadDemo();  //creating a thread1
			  d1.setName("t1");
			  d1.start(); // starting a thread 1
			  ThreadDemo d2=new ThreadDemo();  //creating a thread2
			  d2.setName("t2");
			  d2.start(); // starting a thread 2

		}
		
		void printTable(int num)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(num+" * "+i+" = "+(num*i)+" - "+currentThread().getName());
				
			}
		}
		
		
		
		public void run()   // running the thread
		{
			
			printTable(3);
		}

	}
