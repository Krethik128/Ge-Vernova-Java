package com.gevernova.builtinfunctions.leveltwo;

import java.util.Scanner;
import java.util.Random;
public class GuessingNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = (int) (Math.random() * 90) + 10;
        int ComputerGuess;
        int low=0,high=99;
        int attempts = 0;
        while (true) {
            attempts++;
            ComputerGuess = low + (high - low) / 2; // Binary search approach for efficient guessing

            System.out.println("My guess is: " + ComputerGuess);
            System.out.print("Is your number (h)igher, (l)ower, or (c)orrect? ");
            String response = sc.next().toLowerCase();

            if (response.equals("c")) {
                System.out.println("I guessed it in " + attempts + " attempts! Your number was " + ComputerGuess + ".");
                break;
            } else if (response.equals("h")) {
                low = ComputerGuess + 1;
            } else if (response.equals("l")) {
                high = ComputerGuess - 1;
            } else {
                System.out.println("Invalid input. Please enter 'h', 'l', or 'c'.");
            }

            if (low > high) {
                System.out.println("Something is wrong. Your hints are inconsistent.");
                break;
            }
        }
        sc.close();
    }
}
