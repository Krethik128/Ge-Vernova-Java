package src.Week1.Arrays.Level2;

import java.util.Scanner;

import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " (in kg): ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + " (in cm): ");
            personData[i][1] = sc.nextDouble();
        }

        for (int i = 0; i < number; i++) {
            personData[i][1] = personData[i][1] / 100; // Convert cm to meters
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Displaying the results
        System.out.println("\nPerson Details:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + personData[i][1] * 100 + " cm, Weight = " + personData[i][0] + " kg, BMI = " + personData[i][2] + ", Status = " + weightStatus[i]);
        }
    }
}


