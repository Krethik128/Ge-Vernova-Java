package com.gevernova.objectinspector.employeeManagementSystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee employeeOne = new Employee(101, "Alice", "Developer");
        Employee employeeTwo = new Employee(102, "Bob", "Designer");

        if (employeeOne instanceof Employee) employeeOne.displayDetails();
        if (employeeTwo instanceof Employee) employeeTwo.displayDetails();

        Employee.displayTotalEmployees();
    }
}
