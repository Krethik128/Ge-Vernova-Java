package com.gevernova.control_flow.levelone;

import java.util.Scanner;

public class Rocket_launch_Forloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double number = scanner.nextDouble();
            if (number <= 0) {
                break;
            }
            total += number;
        }
        System.out.println("Total sum is " + total);
    }
}
