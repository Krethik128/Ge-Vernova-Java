package com.gevernova.methods.levelone;

import java.util.Scanner;

public class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any angle between 0 to 360");
        double angle = scanner.nextDouble(); // Example angle in degrees
        double[] results = calculateTrigonometricFunctions(angle);

        System.out.printf("For angle %.2f degrees:%n", angle);
        System.out.printf("Sine: %.4f%n", results[0]);
        System.out.printf("Cosine: %.4f%n", results[1]);
        System.out.printf("Tangent: %.4f%n", results[2]);
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double[] results = new double[3];
        double radians = Math.toRadians(angle); // Convert angle to radians

        results[0] = Math.sin(radians); // Calculate sine
        results[1] = Math.cos(radians); // Calculate cosine
        results[2] = Math.tan(radians); // Calculate tangent

        return results;
    }
}

