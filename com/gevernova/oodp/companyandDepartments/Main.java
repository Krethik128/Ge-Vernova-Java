package com.gevernova.oodp.companyandDepartments;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("TechNova Solutions");

        company.addDepartment("Engineering");
        company.addDepartment("HR");

        Department eng = company.getDepartment("Engineering");
        if (eng != null) {
            eng.addEmployee(101, "Krethik");
            eng.addEmployee(203, "Ayush");
        }

        Department hr = company.getDepartment("HR");
        if (hr != null) {
            hr.addEmployee(402, "Raghu");
        }

        company.showCompanyStructure();

        // Once 'company' is destroyed (goes out of scope), so do departments and employees
    }
}
