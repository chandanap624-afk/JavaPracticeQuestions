package com.wipro.Java.Collections.Exercise.HashSet;

//Unique Email Registration
//Ensure no duplicate email is registered in the system.
//Hashset will not  allow duplicates so it will not print duplicate values

import java.util.HashSet;

public class UniqueEmails {

    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();

        // Adding emails
        emails.add("test@gmail.com");
        emails.add("user@gmail.com");
        emails.add("test@gmail.com"); // duplicate
        emails.add("admin@gmail.com");

        // Display emails
        System.out.println("Registered Emails: " + emails);
    }
}
