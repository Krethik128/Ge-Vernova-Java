package com.gevernova.objectinspector.employeeManagementSystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Alice", "Developer");
        Employee e2 = new Employee(102, "Bob", "Designer");

        if (e1 instanceof Employee) e1.displayDetails();
        if (e2 instanceof Employee) e2.displayDetails();

        Employee.displayTotalEmployees();
    }
}
