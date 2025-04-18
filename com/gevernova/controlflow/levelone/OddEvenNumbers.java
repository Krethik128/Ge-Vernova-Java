package com.gevernova.controlflow.levelone;
import java.util.Scanner;
public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int limit = scanner.nextInt();

        if (limit <= 0) {
            System.out.println("Not a natural number");
        } else {
            for (int i = 1; i <= limit; i++) {
                System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd"));
            }
        }
    }
}
