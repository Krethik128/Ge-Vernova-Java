package com.gevernova.controlflow.leveltwo;

import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The factors of " + number + " are:");
            int i = 1;
            while (i <= number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        scanner.close();
    }
}

