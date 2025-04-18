package com.gevernova.controlflow.leveltwo;

import java.util.Scanner;

public class GreatestFactorForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        int greatestFactor = 1;

        if (number > 1) {
            for (int i = number - 1; i > 0; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        } else {
            System.out.println("Please enter a positive integer greater than 1.");
        }
    }
}
