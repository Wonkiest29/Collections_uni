package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

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

        System.out.println("=== TASK 1 ===");
        System.out.println("Collection size: " + employees.size());
        System.out.println();

        System.out.println("1. Using standard for loop:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + employees.get(i));
        }
        System.out.println();

        System.out.println("2. Using for-each loop:");
        int counter = 1;
        for (String employee : employees) {
            System.out.println("  " + counter++ + ". " + employee);
        }
        System.out.println();

        System.out.println("3. Using Iterator:");
        Iterator<String> iterator = employees.iterator();
        counter = 1;
        while (iterator.hasNext()) {
            System.out.println("  " + counter++ + ". " + iterator.next());
        }
        System.out.println();
    }
}

