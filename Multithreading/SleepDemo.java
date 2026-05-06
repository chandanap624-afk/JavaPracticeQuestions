package com.wipro.Java.Multithreading;

public class SleepDemo implements Runnable {

    public static void main(String[] args) {

        SleepDemo d1 = new SleepDemo(); // creating thread1
        Thread obj1 = new Thread(d1);

        obj1.setName("t1");
        obj1.start(); // starting thread1

        SleepDemo d2 = new SleepDemo(); // creating thread2
        Thread obj2 = new Thread(d2);

        obj2.setName("t2");
        obj2.start(); // starting thread2
    }

    void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i)
                    + " - " + Thread.currentThread().getName());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void counting() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        if (Thread.currentThread().getName().equals("t1"))
            printTable(3);
        else if (Thread.currentThread().getName().equalsIgnoreCase("t2"))
            counting();
    }
}