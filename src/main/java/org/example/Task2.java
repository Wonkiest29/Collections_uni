package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Task2 {

    public static void execute(String filePath) {
        HashSet<String> employees = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    employees.add(line.trim());
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.println("=== TASK 2 ===");
        System.out.println("Collection size (without duplicates): " + employees.size());
        System.out.println();

        System.out.println("Unique employees:");
        int counter = 1;
        for (String employee : employees) {
            System.out.println("  " + counter++ + ". " + employee);
        }
        System.out.println();

        System.out.println("Checking if specific employees exist:");
        String[] checkEmployees = {"John Smith", "Jane Doe", "Bob Williams"};
        for (String name : checkEmployees) {
            if (employees.contains(name)) {
                System.out.println("  ✓ " + name + " is in the collection");
            } else {
                System.out.println("  ✗ " + name + " is NOT in the collection");
            }
        }
        System.out.println();
    }
}

