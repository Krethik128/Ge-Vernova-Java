package com.gevernova.objectinspector;
class Employee {
    public static String companyName = "Gevernova Corp";
    private static int totalEmployees = 0;

    public final int id;
    public String name;
    public String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Company: " + companyName);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Alice", "Developer");
        Employee e2 = new Employee(102, "Bob", "Designer");

        if (e1 instanceof Employee) e1.displayDetails();
        if (e2 instanceof Employee) e2.displayDetails();

        Employee.displayTotalEmployees();
    }
}
