package com.gevernova.arrays.leveltwo;
import java.util.Scanner;
public class EmpBonus {
    public static void main(String args[]){
        int Employees=10;
        Scanner sc=new Scanner(System.in);
        double salaries[]=new double[Employees];
        double yearsOfService[]=new double[Employees];
        double[] bonuses = new double[Employees];
        double[] newSalaries = new double[Employees];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        for(int i=0;i<salaries.length;i++){
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salaries[i]=sc.nextDouble();
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = sc.nextDouble();
            if (salaries[i] < 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--; // Decrement index to re-enter the values
            }

        }
        for (int i = 0; i < Employees; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }
            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < Employees; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salaries[i] + ", Bonus = " + bonuses[i] + ", New Salary = " + newSalaries[i]);
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

}
