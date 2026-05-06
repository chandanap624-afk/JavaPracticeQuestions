package com.wipro.Java.Collections.Exercise.HashMap;

//Employee Salary Lookup-Store employee ID and salary, and retrieve salary by ID.

import java.util.HashMap;

public class EmployeeSalaryLookup {

    public static void main(String[] args) {

        HashMap<Integer, Double> employees = new HashMap<>();

        // Adding employee data (ID → Salary)
        employees.put(101, 25000.0);
        employees.put(102, 30000.0);
        employees.put(103, 28000.0);
        employees.put(104, 35000.0);

        // Search employee salary
        int searchId = 103;

        if (employees.containsKey(searchId)) {
            System.out.println("Salary: " + employees.get(searchId));
        } else {
            System.out.println("Employee ID not found");
        }
    }
}
