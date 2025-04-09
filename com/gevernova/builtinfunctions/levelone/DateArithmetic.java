package com.gevernova.builtinfunctions.levelone;

import java.time.*;
import java.util.*;

// Takes a date input and performs arithmetic operations on it
public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): "); // Example: 2022-01-01
        LocalDate date = LocalDate.parse(sc.nextLine());

        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Date after +7 days, +1 month, +2 years, -3 weeks: " + result);
    }
}


