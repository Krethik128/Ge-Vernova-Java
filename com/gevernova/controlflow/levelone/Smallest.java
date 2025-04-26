package com.gevernova.controlflow.levelone;
import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int numberOne = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int numberTwo = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int numberThree = scanner.nextInt();
        System.out.println("Is the first number the smallest? " + (numberOne < numberTwo && numberOne < numberThree ? "Yes" : "No"));
    }
}

