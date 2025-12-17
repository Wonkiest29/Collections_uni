package org.example;

public class Main {
    public static void main(String[] args) {
        String filePath = "employees.txt";

        System.out.println("========================================");
        System.out.println("Employee File Processing - All Tasks");
        System.out.println("========================================");
        System.out.println();

        Task1.execute(filePath);

        Task2.execute(filePath);

        Task3.execute(filePath);

        Task4.execute(filePath);

        System.out.println("========================================");
        System.out.println("All tasks completed!");
        System.out.println("========================================");
    }
}
