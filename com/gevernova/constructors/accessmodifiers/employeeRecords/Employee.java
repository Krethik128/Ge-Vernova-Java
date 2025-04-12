package com.gevernova.constructors.accessmodifiers.employeeRecords;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
        }
    }

    // Public method to access salary
    public double getSalary() {
        return salary;
    }
}
