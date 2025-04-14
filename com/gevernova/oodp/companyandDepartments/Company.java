package com.gevernova.oodp.companyandDepartments;

import java.util.ArrayList;
import java.util.List;

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public Department getDepartment(String deptName) {
        for (Department d : departments) {
            if (d.getDeptName().equals(deptName)) {
                return d;
            }
        }
        return null;
    }

    public void showCompanyStructure() {
        System.out.println("\nCompany: " + name);
        for (Department d : departments) {
            d.displayDepartment();
        }
    }
}
