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
    public static int findMaximum(int numberOne, int numberTwo, int numberThree) {
        int max = numberOne; // Assume the first number is the maximum initially
        if (numberTwo > max) {
            max = numberTwo;
        }
        if (numberThree > max) {
            max = numberThree;
        }
        return max;
    }

    public static void main(String[] args) {
        // Get the three numbers from the user
        int[] inputs = getUserInputs();
        int numberOne = inputs[0];
        int numberTwo = inputs[1];
        int numberThree = inputs[2];

        // Calculate the maximum value
        int maximum = findMaximum(numberOne, numberTwo, numberThree);

        // Display the result
        System.out.println("The three numbers entered are: " + numberOne + ", " + numberTwo + ", and " + numberThree);
        System.out.println("The maximum of these three numbers is: " + maximum);
    }
}
