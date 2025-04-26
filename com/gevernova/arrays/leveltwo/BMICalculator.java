package com.gevernova.arrays.leveltwo;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        double[] weights = new double[number];
        double[] heights = new double[number];
        double[] bodyMassIndexes = new double[number];
        String[] statuses = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " (in kg): ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        for (int i = 0; i < number; i++) {
            heights[i] = heights[i] / 100;
            bodyMassIndexes[i] = weights[i] / (heights[i] * heights[i]);

            if (bodyMassIndexes[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bodyMassIndexes[i] < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bodyMassIndexes[i] < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }

        System.out.println("\nPerson Details:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + heights[i] * 100 + " cm, Weight = " + weights[i] + " kg, BMI = " + bodyMassIndexes[i] + ", Status = " + statuses[i]);
        }
    }
}

