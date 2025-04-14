package com.gevernova.oodp.companyandDepartments;

import java.util.ArrayList;
import java.util.List;

class Department {
    private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(int id, String name) {
        employees.add(new Employee(id, name)); // Corrected parameter order
    }

    public String getDeptName() {
        return deptName;
    }


    public void displayDepartment() {
        System.out.println("\nDepartment: " + deptName);
        for (Employee e : employees) {
            e.displayInfo();
        }
    }

}