package com.wipro.Java.Multithreading;

public class JoinDemo extends Thread {

    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        JoinDemo obj1 = new JoinDemo(); // creating thread1
        obj1.setName("t1");

        JoinDemo obj2 = new JoinDemo(); // creating thread2
        obj2.setName("t2");

        obj1.start(); // starting thread1
        obj1.join();

        obj2.start(); // starting thread2
        obj2.join();
    }

    synchronized void inc() {
        counter++;
    }

    synchronized int get() {
        return counter;
    }

    public void run() {
        if (currentThread().getName().equalsIgnoreCase("t1")) {
            for (int i = 1; i <= 10; i++) {
                inc();
                System.out.println("value is incremented " + i);
            }
        } 
        else if (currentThread().getName().equalsIgnoreCase("t2")) {
            for (int i = 1; i <= 100; i++) {
                System.out.println(get());
            }
        }
    }
}
