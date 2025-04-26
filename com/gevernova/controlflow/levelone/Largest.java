package com.gevernova.controlflow.levelone;

import java.util.Scanner;

class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int numberOne = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int numberTwo = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int numberThree = scanner.nextInt();


        System.out.println("Is the first number the largest? " + (numberOne > numberTwo && numberOne > numberThree ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (numberTwo > numberOne && numberTwo > numberThree ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (numberThree > numberOne && numberThree > numberTwo ? "Yes" : "No"));
    }
}
