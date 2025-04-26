package com.gevernova.builtinfunctions.levelone;

import java.time.*;
import java.util.*;
public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first date (yyyy-MM-dd): "); // Example: 2023-01-01
        LocalDate dateOne = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter second date (yyyy-MM-dd): "); // Example: 2024-01-01
        LocalDate dateTwo = LocalDate.parse(scanner.nextLine());

        if (dateOne.isBefore(dateTwo)) {
            System.out.println("The first date is before the second date.");
        } else if (dateOne.isAfter(dateTwo)) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }
    }
}


