package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Task3 {

    public static void execute(String filePath) {
        TreeSet<String> employees = new TreeSet<>();

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

        System.out.println("=== TASK 3 ===");
        System.out.println("Collection size (sorted, no duplicates): " + employees.size());
        System.out.println();

        System.out.println("Employees in alphabetical order (A to Z):");
        int counter = 1;
        for (String employee : employees) {
            System.out.println("  " + counter++ + ". " + employee);
        }
        System.out.println();
    }
}

