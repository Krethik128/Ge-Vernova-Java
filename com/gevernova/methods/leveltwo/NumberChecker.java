package com.gevernova.methods.leveltwo;

import java.util.Scanner;

public class NumberChecker {

    public static int isPositive(int num) {
        if (num > 0) {
            return 1; // Positive
        } else if (num < 0) {
            return -1; // Negative
        } else {
            return 0;  // Zero (neither positive nor negative)
        }
    }

    public static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            int positiveCheck = isPositive(numbers[i]);
            if (positiveCheck == 1) {
                isEven(numbers[i]);
            } else if (positiveCheck == -1) {
                System.out.println(numbers[i] + " is a negative number.");
            } else {
                System.out.println(numbers[i] + " is zero.");
            }
        }

        System.out.println("\nComparing First and Last Elements:");
        if (numbers.length > 0) {
            int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
            if (comparisonResult == 1) {
                System.out.println("The first element (" + numbers[0] + ") is greater than the last element (" + numbers[numbers.length - 1] + ").");
            } else if (comparisonResult == 0) {
                System.out.println("The first element (" + numbers[0] + ") is equal to the last element (" + numbers[numbers.length - 1] + ").");
            } else {
                System.out.println("The first element (" + numbers[0] + ") is less than the last element (" + numbers[numbers.length - 1] + ").");
            }
        } else {
            System.out.println("The array is empty, cannot compare first and last elements.");
        }

        scanner.close();
    }
}
