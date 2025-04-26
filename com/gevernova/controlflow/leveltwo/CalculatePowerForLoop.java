package com.gevernova.controlflow.leveltwo;

import java.util.Scanner;

public class CalculatePowerForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        int result = 1;

        if (power >= 0) {
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println(result);
        } else {
            System.out.println("Please enter a non-negative power.");
        }

        scanner.close();
    }
}
