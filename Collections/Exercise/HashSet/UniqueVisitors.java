package com.wipro.Java.Collections.Exercise.HashSet;

//Unique Visitor Count
//Count number of unique users visiting a website in a day.

import java.util.HashSet;

public class UniqueVisitors {

    public static void main(String[] args) {

        HashSet<String> visitors = new HashSet<>();

        // Simulating visits
        visitors.add("user1");
        visitors.add("user2");
        visitors.add("user3");
        visitors.add("user1"); // duplicate
        visitors.add("user2"); // duplicate
        visitors.add("user4");

        // Display unique visitors
        System.out.println("Unique Visitors: " + visitors);

        // Count
        System.out.println("Total Unique Visitors: " + visitors.size());
    }
}
