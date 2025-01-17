package org.example.week2.d6.e4;

import java.util.Scanner;

public class E4ElseIf {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the operator
        System.out.println("Enter operator (+, -, *, /):");
        String operator = scanner.next();

        // Prompt the user to enter the two numbers
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        // Perform operation using if-else if-else conditions
        if (operator.equals("+")) {
            double result = num1 + num2;
            System.out.println("The sum is: " + result);
        } else if (operator.equals("-")) {
            double result = num1 - num2;
            System.out.println("The difference is: " + result);
        } else if (operator.equals("*")) {
            double result = num1 * num2;
            System.out.println("The product is: " + result);
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                double result = num1 / num2;
                System.out.println("The quotient is: " + result);
            } else {
                System.out.println("Cannot divide by zero");
            }
        } else {
            System.out.println("Invalid operator");
        }

        // Close the scanner
        scanner.close();

    }
}
