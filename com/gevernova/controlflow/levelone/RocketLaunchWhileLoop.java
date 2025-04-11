package com.gevernova.controlflow.levelone;

import java.util.Scanner;

public class RocketLaunchWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the countdown starting number: ");
        int counter = scanner.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Blast off!");
    }
}

