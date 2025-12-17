package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Task4 {

    public static void execute(String filePath) {
        ArrayList<String> employees = new ArrayList<>();

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

        System.out.println("=== TASK 4 ===");
        System.out.println("Collection size (with duplicates): " + employees.size());
        System.out.println();

        Collections.sort(employees);
        System.out.println("Employees sorted A to Z (with duplicates):");
        int counter = 1;
        for (String employee : employees) {
            System.out.println("  " + counter++ + ". " + employee);
        }
        System.out.println();

        Collections.sort(employees, Collections.reverseOrder());
        System.out.println("Employees sorted Z to A (with duplicates):");
        counter = 1;
        for (String employee : employees) {
            System.out.println("  " + counter++ + ". " + employee);
        }
        System.out.println();
    }
}

