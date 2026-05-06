package com.wipro.Java.Multithreading;

public class NotifyInterThreadCommunication {

    public static void main(String[] args) {

        Shared s = new Shared();

        // Thread 1 → Waiting thread
        Thread o1 = new Thread(() -> {
            try {
                s.waitForSignal();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        // Thread 2 → Notifying thread
        Thread o2 = new Thread(() -> {
            try {
                Thread.sleep(2000); // delay to show waiting
                s.sendSignal();
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        o1.start();
        o2.start();
    }
}

class Shared1 {

    boolean ready = false;

    // Waiting method
    synchronized void waitForSignal() throws InterruptedException {

        while (!ready) {   // better than if
            System.out.println("Thread is being sent to waiting state");
            wait();
        }

        System.out.println("Thread resumed and doing work...");
    }

    // Notifying method
    synchronized void sendSignal() {

        ready = true;
        System.out.println("Thread is being sent notification for resuming!");
        notify();   // or notifyAll()

    }
}