package org.example;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scientific Calculator Menu:");
        System.out.println("1. Square root function (√x)");
        System.out.println("2. Factorial function (x!)");
        System.out.println("3. Natural logarithm (base e) - ln(x)");
        System.out.println("4. Power function (x^b)");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number to find its square root: ");
                double number1 = scanner.nextDouble();
                double result1 = squareRootFunction(number1);
                System.out.println("Square root of " + number1 + " is: " + result1);
                break;


            case 2:
                System.out.print("Enter a number to find its factorial: ");
                int number2 = scanner.nextInt();
                long result2 = factorialFunction(number2);
                System.out.println("Factorial of " + number2 + " is: " + result2);
                break;


            case 3:
                System.out.print("Enter a number to find its natural logarithm: ");
                double number3 = scanner.nextDouble();
                double result3 = naturalLogarithmFunction(number3);
                System.out.println("Natural logarithm of " + number3 + " is: " + result3);
                break;


            case 4:
                System.out.print("Enter the base (x): ");
                double base = scanner.nextDouble();
                System.out.print("Enter the exponent (b): ");
                double exponent = scanner.nextDouble();
                double result4 = powerFunction(base, exponent);
                System.out.println(base + " raised to the power " + exponent + " is: " + result4);
                break;


            default:
                System.out.println("Invalid choice! Please choose between 1 and 4.");
        }

        scanner.close();
    }

    public static double squareRootFunction(double number) {
        return Math.sqrt(number);
    }

    public static long factorialFunction(long number) {
        return calculateFactorial(number);
    }

    public static long calculateFactorial(long n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static double naturalLogarithmFunction(double number) {
        return Math.log(number);
    }

    public static double powerFunction(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
