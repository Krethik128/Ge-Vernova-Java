package com.gevernova.constructors.accessmodifiers;
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

class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);   //  public
        System.out.println("Department: " + department);    //  protected
        // System.out.println("Salary: " + salary);          private
        System.out.println("Salary: " + getSalary());       //  use getter
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Manager mgr = new Manager(501, "HR", 75000);
        mgr.updateSalary(80000);
        mgr.displayEmployeeInfo();
    }
}
