package com.gevernova.control_flow.levelone;
import java.util.Scanner;

public class factorialFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Not a natural number");
        } else {
            int sumByFormula = number * (number + 1) / 2;
            int sumByLoop = 0;

            for (int i = 1; i <= number; i++) {
                sumByLoop += i;
            }

            System.out.println("Sum using formula: " + sumByFormula);
            System.out.println("Sum using loop: " + sumByLoop);
            System.out.println("Both results are " + (sumByFormula == sumByLoop ? "correct" : "incorrect"));
        }
    }
}
