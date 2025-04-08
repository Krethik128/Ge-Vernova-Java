package com.gevernova.methods.levelthree;
import java.util.Scanner;
public class DistanceBetween2points {
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void findLineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            System.out.println("The equation of the line is x = " + x1 + " (vertical line).");
        } else if (y1 == y2) {
            System.out.println("The equation of the line is y = " + y1 + " (horizontal line).");
        } else {
            double slope = (y2 - y1) / (x2 - x1);
            double yIntercept = y1 - slope * x1;
            System.out.printf("The equation of the line is y = %.2fx + %.2f\n", slope, yIntercept);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates of the first point (x1, y1):");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("\nEnter the coordinates of the second point (x2, y2):");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("\nThe Euclidean distance between (%.2f, %.2f) and (%.2f, %.2f) is: %.2f\n",
                x1, y1, x2, y2, distance);

        System.out.println("\nThe equation of the line passing through these two points:");
        findLineEquation(x1, y1, x2, y2);

        scanner.close();
    }
}
