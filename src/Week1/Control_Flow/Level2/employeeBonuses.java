package src.Week1.Control_Flow.Level2;

import java.util.Scanner;

public class employeeBonuses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee's salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = sc.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus is applicable.");
        }

        sc.close();
    }
}

