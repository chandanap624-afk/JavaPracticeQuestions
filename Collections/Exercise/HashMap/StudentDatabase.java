package com.wipro.Java.Collections.Exercise.HashMap;

import java.util.HashMap;

public class StudentDatabase {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        // Adding students (ID → Name)
        students.put(101, "Sakshi");
        students.put(102, "Mohit");
        students.put(103, "Priyanshi");
        students.put(104, "Akash");

        // Fetch name using ID
        int searchId = 102;

        if (students.containsKey(searchId)) {
            System.out.println("Student Name: " + students.get(searchId));
        } else {
            System.out.println("Student ID not found");
        }
    }
}
