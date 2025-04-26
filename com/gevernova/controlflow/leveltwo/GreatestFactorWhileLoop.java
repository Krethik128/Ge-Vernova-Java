package com.gevernova.controlflow.leveltwo;

import java.util.Scanner;

public class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        int greatestFactor = 1;

        if (number > 1) {
            int counter = number - 1;
            while (counter > 0) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        } else {
            System.out.println("Please enter a positive integer greater than 1.");
        }
    }
}
