package com.wipro.Java.Collections.Exercise.HashSet;

//Lottery System
//Store unique ticket numbers and reject duplicates.


import java.util.HashSet;

public class LotterySystem {

    public static void main(String[] args) {

        HashSet<Integer> tickets = new HashSet<>();

        addTicket(tickets, 101);
        addTicket(tickets, 102);
        addTicket(tickets, 103);
        addTicket(tickets, 101); // duplicate
        addTicket(tickets, 104);
        addTicket(tickets, 102); // duplicate

        System.out.println("Valid Tickets: " + tickets);
    }

    public static void addTicket(HashSet<Integer> set, int ticketNo) {

        if (set.add(ticketNo)) {
            System.out.println("Ticket " + ticketNo + " accepted");
        } else {
            System.out.println("Ticket " + ticketNo + " rejected (duplicate)");
        }
    }
}