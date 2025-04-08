package com.gevernova.arrays.leveltwo;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        double[] weights = new double[number];
        double[] heights = new double[number];
        double[] bmis = new double[number];
        String[] statuses = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " (in kg): ");
            weights[i] = sc.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        for (int i = 0; i < number; i++) {
            heights[i] = heights[i] / 100;
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }

        System.out.println("\nPerson Details:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + heights[i] * 100 + " cm, Weight = " + weights[i] + " kg, BMI = " + bmis[i] + ", Status = " + statuses[i]);
        }
    }
}

