package com.gevernova.oops.inheritance.basicProblems.employeeManagement;

public class Main {
    public static void main(String[] args) {
        // Employee System Demo
        System.out.println("--- Employee Management ---");
        Employee emp1 = new Manager("krehtik", 101, 80000, 5);
        Employee emp2 = new Developer("Stuti", 102, 60000, "Java");
        Employee emp3 = new Intern("Ayaan", 103, 15000, 6);

        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();
        System.out.println();
        emp3.displayDetails();
    }
}
