package com.wipro.Java.Collections.Exercise.Programs;

///Student Marks System///
///Store marks of students and find highest, lowest, and average marks.///

import java.util.ArrayList;

public class StudentsMarks {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        // Adding marks
        marks.add(85);
        marks.add(90);
        marks.add(78);
        marks.add(92);
        marks.add(88);

        int highest = marks.get(0);
        int lowest = marks.get(0);
        int sum = 0;

        // Loop through ArrayList
        for (int m : marks) {
            if (m > highest) {
                highest = m;
            }

            if (m < lowest) {
                lowest = m;
            }

            sum += m;
        }

        double average = (double) sum / marks.size();

        // Output
        System.out.println("Marks: " + marks);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Average: " + average);
    }
}
