package com.gevernova.controlflow.levelone;

import java.util.Scanner;

public class DivisibleBy_5 {
    public static String isDivisibleBy5(int number) {
        return "Is the number " + number + " divisible by 5? " + (number % 5 == 0 ? "Yes" : "No");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isDivisibleBy5(number));
    }
}

