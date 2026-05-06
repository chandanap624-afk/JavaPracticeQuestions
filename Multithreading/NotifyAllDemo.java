package com.wipro.Java.Multithreading;

public class NotifyAllDemo {

    public static void main(String[] args) {

        Shared s = new Shared();

        // Thread 1
        Thread t1 = new Thread(() -> {
            try {
                s.waitForSignal();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }, "Thread-1");

        // Thread 2
        Thread t2 = new Thread(() -> {
            try {
                s.waitForSignal();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }, "Thread-2");

        // Thread 3
        Thread t3 = new Thread(() -> {
            try {
                s.waitForSignal();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }, "Thread-3");

        // Notifier thread
        Thread notifier = new Thread(() -> {
            try {
                Thread.sleep(2000); // delay
                s.sendSignal();
            } catch (Exception e) {
                System.out.println(e);
            }
        }, "Notifier");

        t1.start();
        t2.start();
        t3.start();
        notifier.start();
    }
}

class Shared {

    boolean ready = false;

    synchronized void waitForSignal() throws InterruptedException {

        while (!ready) {
            System.out.println(Thread.currentThread().getName() + " is waiting...");
            wait();
        }

        System.out.println(Thread.currentThread().getName() + " resumed!");
    }

    synchronized void sendSignal() {
        ready = true;
        System.out.println("Notifier thread is calling notifyAll()");
        notifyAll(); // wakes ALL waiting threads
    }
}
