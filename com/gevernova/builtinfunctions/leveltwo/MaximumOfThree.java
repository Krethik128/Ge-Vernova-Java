package com.gevernova.builtinfunctions.leveltwo;

import java.util.Scanner;

public class MaximumOfThree {

    /**
     * Takes three integer inputs from the user.
     */
    public static int[] getUserInputs() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.println("Enter three integer numbers:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        return numbers;
    }
    public static int findMaximum(int num1, int num2, int num3) {
        int max = num1; // Assume the first number is the maximum initially
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    public static void main(String[] args) {
        // Get the three numbers from the user
        int[] inputs = getUserInputs();
        int number1 = inputs[0];
        int number2 = inputs[1];
        int number3 = inputs[2];

        // Calculate the maximum value
        int maximum = findMaximum(number1, number2, number3);

        // Display the result
        System.out.println("The three numbers entered are: " + number1 + ", " + number2 + ", and " + number3);
        System.out.println("The maximum of these three numbers is: " + maximum);
    }
}
