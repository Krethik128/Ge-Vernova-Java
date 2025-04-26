package com.gevernova.constructors.accessmodifiers.employeeRecords;

public class EmployeeRecords {
    public static void main(String[] args) {
        Manager manager = new Manager(501, "HR", 75000);
        manager.updateSalary(80000);
        manager.displayEmployeeInfo();
    }
}
