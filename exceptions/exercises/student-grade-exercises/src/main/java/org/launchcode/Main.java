package org.launchcode;

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
        }

        public static double Divide(int x, int y) throws ArithmeticException {
                if (y == 0) {
                        throw new ArithmeticException("Division by zero");
                }
                return (double) x / y;
        }
}