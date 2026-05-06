package com.wipro.Java.Multithreading;

public class Exercise {

    public static void main(String[] args) {

        ReverseThread t1 = new ReverseThread();
        CountingThread t2 = new CountingThread();

        t1.setName("ReverseThread");
        t2.setName("CountingThread");

        t1.start();
        t2.start();
    }
}

// Thread 1 - Reverse Counting
class ReverseThread extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Thread 2 - Normal Counting
class CountingThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
