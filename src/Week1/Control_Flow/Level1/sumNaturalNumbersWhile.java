package src.Week1.Control_Flow.Level1;

import java.util.Scanner;

public class sumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter the years of service: ");
        int yearsOfService = scanner.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is " + bonus);
        } else {
            System.out.println("No bonus awarded");
        }
    }
}
