package com.gevernova.controlflow.leveltwo;

import java.util.Scanner;

public class CalculatePowerWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        int result = 1;
        int counter = 0;

        if (power >= 0) {
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(result);
        } else {
            System.out.println("Please enter a non-negative power.");
        }

        scanner.close();
    }
}

