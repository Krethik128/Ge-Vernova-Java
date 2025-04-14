package com.gevernova.oodp.companyandDepartments;

 public class Employee {
    private final String name;
     private int id;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}
