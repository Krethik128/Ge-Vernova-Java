package com.gevernova.constructors.accessmodifiers.employeeRecords;

public class EmployeeRecords {
    public static void main(String[] args) {
        Manager mgr = new Manager(501, "HR", 75000);
        mgr.updateSalary(80000);
        mgr.displayEmployeeInfo();
    }
}
