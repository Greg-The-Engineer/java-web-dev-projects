package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
                int[] integerArray = {1, 1, 2, 3, 5, 8};

                for (int num : integerArray) {
                        System.out.println(num);
                }

                for (int num : integerArray) {
                        if (num % 2 != 0) {
                                System.out.println(num);
                        }
                }

                double result = Divide(10, 5);
                System.out.println("The result is " + result);

                try {
                        result = Divide(10, 0);
                } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                }

                // Test case data
                HashMap<String, String> studentFiles = new HashMap<>();
                studentFiles.put("John Smith", "file1.java");
                studentFiles.put("Jane Doe", "file2.java");
                studentFiles.put("Bob Johnson", "file3.txt");
                studentFiles.put("Sarah Williams", "");

                // Iterate over the students and their files
                for (String student : studentFiles.keySet()) {
                        String fileName = studentFiles.get(student);
                        int points;
                        try {
                                points = CheckFileExtension(fileName);
                                System.out.println(student + " scored " + points + " points.");
                        } catch (IllegalArgumentException e) {
                                System.out.println(student + " error: " + e.getMessage());
                        }
                }
        }

        public static double Divide(int x, int y) throws ArithmeticException {
                if (y == 0) {
                        throw new ArithmeticException("Division by zero");
                }
                return (double) x / y;
        }

        public static int CheckFileExtension(String fileName) {
                if (fileName == null || fileName.isEmpty()) {
                        throw new IllegalArgumentException("File name is null or empty");
                }

                if (fileName.endsWith(".java")) {
                        return 1;
                } else {
                        return 0;
                }
        }
}