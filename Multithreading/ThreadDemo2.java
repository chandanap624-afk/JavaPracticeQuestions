package com.wipro.Java.Multithreading;

public class ThreadDemo2 implements Runnable {

    public static void main(String[] args) {

        ThreadDemo2 d1 = new ThreadDemo2(); // creating thread1
        Thread obj1 = new Thread(d1);

        obj1.setName("t1");
        obj1.start(); // starting thread1

        ThreadDemo2 d2 = new ThreadDemo2(); // creating thread2
        Thread obj2 = new Thread(d2);

        obj2.setName("t2");
        obj2.start(); // starting thread2
    }

    void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i)
                    + " - " + Thread.currentThread().getName());
        }
    }

    void counting() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // you can optionally print error here
            }
            System.out.println(i + "- " + Thread.currentThread().getName());
        }
    }

    public void run() {
        if (Thread.currentThread().getName().equals("t1"))
            printTable(3);
        else if (Thread.currentThread().getName().equalsIgnoreCase("t2"))
            counting();
    }
}