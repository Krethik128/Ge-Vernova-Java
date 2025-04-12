package com.gevernova.oops.polymorphism.employeeMangement;

import java.util.ArrayList;

// Abstract class with shared structure for all employee types
abstract class Employee {
    private final int employeeId;
    private final String name;
    protected double baseSalary;
    private final int yearsOfExp;

    public Employee(int employeeId, String name, double baseSalary, int yearsOfExp) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
        this.yearsOfExp = yearsOfExp;
    }

    // Abstract method to be implemented differently by full-time and part-time employees
    abstract void calculateSalary(int yearsOfExp, double baseSalary);

    // Concrete method shared by all subclasses
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Years of Experience: " + yearsOfExp);
    }

    // Getters for encapsulated fields
    public String getName() { return name; }
    public int getEmployeeId() { return employeeId; }
    public double getBaseSalary() { return baseSalary; }
    public int getYearsOfExp() { return yearsOfExp; }
}

// Interface for assigning and retrieving department info
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

// Full-time employee implements calculateSalary() and Department
class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, int yearsOfExp) {
        super(employeeId, name, baseSalary, yearsOfExp);
    }

    @Override
    void calculateSalary(int yearsOfExp, double baseSalary) {
        int bonus = 10; // 10% bonus
        double salaryIncrement = baseSalary + (baseSalary * bonus / 100.00);
        System.out.println("Salary of the full-time employee is $" + salaryIncrement + " with " + bonus + "% bonus.");
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Part-time employee calculates salary based on work hours
class PartTimeEmployee extends Employee implements Department {
    private int workHoursPerDay;
    private String deptname;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int yearsOfExp, int workHoursPerDay) {
        super(employeeId, name, baseSalary, yearsOfExp);
        this.workHoursPerDay = workHoursPerDay;
    }

    @Override
    void calculateSalary(int yearsOfExp, double baseSalary) {
        int workingDays = 30; // assuming full month
        double hourlyRate = baseSalary / (30 * 8); // base salary is for 8 hours/day
        double partTimeSalary = hourlyRate * workHoursPerDay * workingDays;
        System.out.println("Salary of the part-time employee is: $" + partTimeSalary);
    }

    @Override
    public void assignDepartment(String deptName) {
        this.deptname = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + deptname;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Creating full-time and part-time employees
        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Alice", 50000, 5);
        emp1.assignDepartment("Engineering");

        PartTimeEmployee emp2 = new PartTimeEmployee(102, "Bob", 30000, 2, 4);
        emp2.assignDepartment("Support");

        employees.add(emp1);
        employees.add(emp2);

        // Polymorphism in action: treat all employees via Employee reference
        for (Employee emp : employees) {
            System.out.println("\n--- Employee Details ---");
            emp.displayDetails();
            emp.calculateSalary(emp.getYearsOfExp(), emp.getBaseSalary());

            // instanceof used to safely access interface methods
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }
        }
    }
}
