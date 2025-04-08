package com.gevernova.controlflow.levelone;

import java.util.Scanner;

class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        System.out.println("Is the first number the largest? " + (num1 > num2 && num1 > num3 ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (num2 > num1 && num2 > num3 ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (num3 > num1 && num3 > num2 ? "Yes" : "No"));
    }
}
