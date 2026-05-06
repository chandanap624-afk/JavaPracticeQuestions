package com.wipro.Java.Collections.Exercise.Programs;

///Employee Salary List
//Store salaries and increase all salaries by 10%.


import java.util.ArrayList;

public class EmployeeSalary {

    public static void main(String[] args) {

        ArrayList<Double> salaries = new ArrayList<>();

        // Add salaries
        salaries.add(10000.0);
        salaries.add(15000.0);
        salaries.add(20000.0);
        salaries.add(25000.0);

        System.out.println("Original Salaries: " + salaries);

        // Increase each salary by 10%
        for (int i = 0; i < salaries.size(); i++) {
            double updatedSalary = salaries.get(i) * 1.10; // 10% increase
            salaries.set(i, updatedSalary);
        }

        System.out.println("Updated Salaries: " + salaries);
    }
}
