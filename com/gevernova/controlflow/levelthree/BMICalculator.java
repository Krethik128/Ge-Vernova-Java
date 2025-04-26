package com.gevernova.controlflow.levelthree;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = scanner.nextDouble();

        height = height / 100; // Convert cm to meters
        double bodyMassIndex = weight / (height * height);

        System.out.println("BMI: " + bodyMassIndex);

        if (bodyMassIndex < 18.5) {
            System.out.println("Underweight");
        } else if (bodyMassIndex < 24.9) {
            System.out.println("Normal weight");
        } else if (bodyMassIndex < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
}

