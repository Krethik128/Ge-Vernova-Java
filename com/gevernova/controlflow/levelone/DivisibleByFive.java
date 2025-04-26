package com.gevernova.controlflow.levelone;

import java.util.Scanner;

public class DivisibleByFive {
    public static String isDivisibleBy5(int number) {
        return "Is the number " + number + " divisible by 5? " + (number % 5 == 0 ? "Yes" : "No");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isDivisibleBy5(number));
    }
}

