package com.wipro.Java.Multithreading;

public class Exercise1 {

    public static void main(String[] args) {

        ReverseRunnable r1 = new ReverseRunnable();
        CountingRunnable r2 = new CountingRunnable();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.setName("ReverseThread");
        t2.setName("CountingThread");

        t1.start();
        t2.start();
    }
}

class ReverseRunnable implements Runnable {
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

class CountingRunnable implements Runnable {
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