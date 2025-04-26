package com.gevernova.controlflow.levelthree;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;

        System.out.println("Day of the week: " + d0);
    }
}

