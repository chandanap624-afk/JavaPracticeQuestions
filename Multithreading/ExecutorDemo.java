package com.wipro.Java.Multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(3);
		
		
		for(int i=1;i<=5;i++)
		{
			int num=i;
			service.submit(
		     () -> System.out.println("Task : "+num+" "+Thread.currentThread().getName())
			);
		}
		
		service.shutdown();
	}

}

